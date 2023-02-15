package sec03.exam02;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n" , value);
		System.out.printf("상품의 가격: %6d원\n" , value);
		System.out.printf("상품의 가격: %-6d원\n" , value);
		System.out.printf("상품의 가격: %06d원\n" , value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n" , 10 ,area);
		
		String name = "홍길동";
		String jop = "도적";
		String age = "25";
		System.out.printf("%6d %-10s %10s\n %s", 1 , name , jop , age);
	}

}
