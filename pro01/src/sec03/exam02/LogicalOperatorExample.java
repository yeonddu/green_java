package sec03.exam02;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charcode = 'A';
		
		if( (charcode>= 65) & (charcode<=90)){
			System.out.println("�빮�� �̱���");
		}
		
		if( (charcode>= 97) && (charcode<=122)){
			System.out.println("�ҹ��� �̱���");
		}
		if( !(charcode>= 48) && !(charcode<=57)){
			System.out.println("0~9���� �̱���");
		}
		
		int value = 6;
		
		if( (value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���");
		}
		if( (value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���");
		}

	}

}
