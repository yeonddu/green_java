package sec03.exam02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������Է¼�");
		System.out.println("[�ʼ� ���� �Է�]");
		
		System.out.print("1. �̸�: ");
		String name = scanner.nextLine();
		
		System.out.print("2. ����: ");
		String age = scanner.nextLine();
		
		System.out.print("3. ������� 6�ڸ�: ");
		String ssn = scanner.nextLine();
		
		System.out.print("4. ��ȭ��ȣ: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		System.out.println("[�Է��Ͻ� ����]");
		System.out.println("1. �̸�: " + name);
		System.out.println("2. ����: " + age);
		System.out.println("3. �������6�ڸ� : " + ssn);
		System.out.println("4. ��ȭ��ȣ : " + tel);
	}

}
