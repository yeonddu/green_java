package sec03.exam02;

import java.util.Scanner;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String position = scanner.nextLine();
		
		
		switch(position) {
			case "����":
				System.out.println("700�����Դϴ� ļ..");
				break;
			case "����":
				System.out.println("500�����Դϴ� ��..");
				break;
			case "���":
				System.out.println("300�����Դϴ�");
				break;
			default:
				System.out.println("?");
		}
	}

}
