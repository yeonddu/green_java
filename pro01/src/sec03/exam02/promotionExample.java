package sec03.exam02;

public class promotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�: " + intValue);
		
		long longValue = intValue;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

	}

}
