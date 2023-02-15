package sec03.exam02;

public class CalculatorExample3 {
	public static void main(String[] args) {
		Calculator3 myCalu = new Calculator3();
		
		double result1 = myCalu.areaRectangle(10);
		
		double result2 = myCalu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 = " + result1);
		System.out.println("직사각형의 넓이 = " + result2);
	}
}
