import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	private JTextField inputSpace; //JTextField�� ȭ�� ����
	private String num =""; //������ ���ڸ� ���� ���� 
	private ArrayList<String> equation = new ArrayList<String>();
	
	public Calculator() {
		setLayout(null); //���̾ƿ� ������ ����
		
		inputSpace = new JTextField();
		inputSpace.setEditable(false);//���� �Ұ������� ����
		inputSpace.setBackground(Color.WHITE); //���� ����
		inputSpace.setHorizontalAlignment(JTextField.RIGHT); //���� ��ġ
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50)); //�۾�ü ����
		inputSpace.setBounds(8, 10, 270, 70); //x:8, y:10 ��ġ�� 270x70 ũ��
		
		
		JPanel buttonPanel = new JPanel();//��ư�� ���� �г�
		buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); //���� ���·� ��ġ. ����ĭ�� 4, ����ĭ��4, �¿찣��10, ���ϰ���10
		buttonPanel.setBounds(8, 90, 270, 235); //��ġ ũ�� ����
		
		String button_names[] = {"C", "��", "��", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0"}; //���� ��ư�� ����
		JButton buttons[] = new JButton[button_names.length]; //��ư���� �迭
		
		//for������ ��ư �����
		for(int i=0; i<button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 20)); //�۾�ü ����
			//���� ���� ��ư �� �ٸ��� ����
			if(button_names[i] =="C") buttons[i].setBackground(Color.RED); //"C"�� ������
			else if((i>=4 && i<=6) || (i>=8 && i<=10) || (i>=12 && i<=14)) buttons[i].setBackground(Color.black);
			else buttons[i].setBackground(Color.gray);
			buttons[i].setBackground(Color.white);
			buttons[i].setBorderPainted(false); //�׵θ� ���ֱ�
			buttons[i].addActionListener(new PadActionListener()); //�׼Ǹ����ʸ� ��ư�� �߰�
			buttonPanel.add(buttons[i]); //�гο� ��ư �߰�
		}
		
		add(inputSpace);
		add(buttonPanel);
		
		
		setTitle("����"); //â�� ����
		setVisible(true); //���̱� ����
		setSize(300, 370); //������
		setLocationRelativeTo(null); //ȭ�� ����� ����
		setResizable(false); //���������� �Ұ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ���� �� �������� ���α׷��� ���� ���� 
	}
	
	//��ɱ���//
	class PadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			if(operation.equals("C")) {
				inputSpace.setText("");
			} else if(operation.equals("=")) {
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText("" + result);
				num = "";
			} else {
				inputSpace.setText(inputSpace.getText() + e.getActionCommand()); //������ ��� ���Ŀ� �߰�
			}
		}
	}
	
	private void fullTextParsing(String inputText) {
		equation.clear();
		
		//for���� �̿��Ͽ� ���� �ϳ��ϳ��� ���İ��� �Ѵ�
		for(int i=0; i<inputText.length(); i++) {
			char ch = inputText.charAt(i);
			
			if (ch == '-' || ch == '+' || ch == '��' || ch == '��') {
				equation.add(num); //���ڸ� ���� ArrayList�� �߰�
				num = "";
				equation.add(ch + "");
			} else {
				num = num + ch; //������(����)�� ��� num ���ڿ� �����ش� 
			}
				
		}
	}
	
	public double calculate(String inputText) {
		fullTextParsing(inputText); //�޼ҵ带 �����Ͽ� ArrayList�� ���ڿ� �����ȣ ���
		double prev = 0;
		double current = 0;
		String mode = ""; //������ �����ȣ ����
		
		for(String s : equation) {
			if(s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("��")) {
				mode = "mul";
			} else if (s.equals("��")) {
				mode = "div";
			} else {
				current = Double.parseDouble(s);
				//mode�� ���� ����ó��
				if(mode == "add") {
					prev += current;
				} else if (mode == "sub") {
					prev -= current;
				} else if (mode == "mul") {
					prev *= current;
				} else if (mode == "div") {
					prev /= current;
				} else {
					prev = current;
				}
									
			}
		}
		return prev; //��갪 ��ȯ
	}
	
	public static void main(String []args) {
		new Calculator();
		
	}
	
	
}