package sec03.exam02;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strvar1 = "�Ź�ö";
		String strvar2 = "�Ź�ö";
		
		if(strvar1 == strvar2) {
			System.out.println("strvar1�� strvar2�� ������ ����");
		}
		else {
			System.out.println("strvar1�� strvar2�� ������ �ٸ�");
		}
		if(strvar1.equals(strvar2)) {
			System.out.println("strvar1�� strvar2�� ���ڿ��� ����");
		}
		
		String str3 = new String("�Ź�ö");
		String str4 = new String("�Ź�ö");
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������ ����");
		}
		else {
			System.out.println("str3�� str4�� ������ �ٸ�");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3�� str4�� ���ڿ��� ����.");
		}
	}

}
