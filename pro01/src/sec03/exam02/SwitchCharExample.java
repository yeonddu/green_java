package sec03.exam02;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'a':
			case 'A':
				System.out.println("���ȸ�� �Դϴ�.");
				break;
			case 'b':
			case 'B':
				System.out.println("�Ϲ�ȸ�� �Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}
	}

}
