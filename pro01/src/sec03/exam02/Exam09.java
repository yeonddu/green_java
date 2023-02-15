package sec03.exam02;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째수 : ");
		double num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("두번째수 : ");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("------------------");
		if(num2 != 0.0) {
			System.out.println("결과: " + (num1/num2));
		}
		else {
			System.out.println("결과: 무한대");
		}
	}
}
