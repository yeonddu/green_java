package sec03.exam02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��°��:");
		String strnum1 = scanner.nextLine();
		System.out.print("�ι�°��:");
		String strnum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		int result = num1 + num2;
		
		System.out.println("�������: " + result);
		System.out.println("�����մϴ�.");
	}

}
