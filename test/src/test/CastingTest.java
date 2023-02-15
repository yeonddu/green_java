package test;

public class CastingTest {

	public static void main(String[] args) {
		byte value1 = 10;
		short value2 = 100;
		int value3 = 1000;
		long value4 = 10000L;
		double value5 = 100.0;
		
		long valuetest = value1 + value2 + value3 + value4;
		//int valuetest2 = value1 + value2 + value3 + value4; 컴파일에러
		//다른 자료형끼리 산술연산을 시도하면 가장큰 자료형으로 결과값이나옴.
		
		System.out.println(value1 + value2 + value3 + value4);
		/*
		int intValue = Integer.parseInt("100");
		
		String str1 = String.valueOf(value3);
		
		System.out.println(str1);
		System.out.println(intValue);
		*/
	}

}
