import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LogIn {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int pass = 0;
		System.out.println("LogIn�� ���� ID�� ��й�ȣ�� �Է��ϼ���.");
		System.out.println("ID �Է� : ");
		String id = scan.nextLine();
		System.out.println("��й�ȣ �Է� : ");
		String pw = scan.nextLine();
		//���� ����� ����
		File file = new File("C:\\song\\MemberDB.txt");
		//file�� �ִ� ���� �б�
		try {
			FileReader filereader = new FileReader(file);
			//�о���� ������ Buffer�� ����
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			//BufferReader�� ���پ� �о line�� �־��ش�. ����������
			try {
				while((line = bufReader.readLine()) != null) {
					//id�� pw�� �ε����� �о��. ���ٸ� -1
					System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw));
					//�α����� �Ǿ����� Ȯ���ϱ� ���� ���� ����
					int passId = line.indexOf(id);
					int passPw = line.indexOf(pw);
					//�α����� �Ǹ� pass 1
					if(passId != -1 && passPw != -1) {
						System.out.println("�α��� ����");
						pass = 1;	}
					}
				if(pass == 0) { System.out.println("�α��� ����");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
