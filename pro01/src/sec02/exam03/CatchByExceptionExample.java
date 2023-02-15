package sec02.exam03;

public class CatchByExceptionExample {
	public static void main(String[] args) {
		try {
			String data1 = args [0];
			String data2 = args [1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��Ȱ�� �� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
