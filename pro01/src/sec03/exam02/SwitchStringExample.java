package sec03.exam02;

import java.util.Scanner;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String position = scanner.nextLine();
		
		
		switch(position) {
			case "부장":
				System.out.println("700만원입니다 캬..");
				break;
			case "과장":
				System.out.println("500만원입니다 흠..");
				break;
			case "사원":
				System.out.println("300만원입니다");
				break;
			default:
				System.out.println("?");
		}
	}

}
