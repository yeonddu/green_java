package sec03.exam02;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : "+ x +"\ny : "+ y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : "+ x + "\ny : "+ y);

	}

}
