package sec03.exam02;

public class CalculatorExample3 {
	public static void main(String[] args) {
		Calculator3 myCalu = new Calculator3();
		
		double result1 = myCalu.areaRectangle(10);
		
		double result2 = myCalu.areaRectangle(10, 20);
		
		System.out.println("���簢���� ���� = " + result1);
		System.out.println("���簢���� ���� = " + result2);
	}
}
