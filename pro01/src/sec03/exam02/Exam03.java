package sec03.exam02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("개인정보입력서");
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 나이: ");
		String age = scanner.nextLine();
		
		System.out.print("3. 생년월일 6자리: ");
		String ssn = scanner.nextLine();
		
		System.out.print("4. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		System.out.println("[입력하신 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 나이: " + age);
		System.out.println("3. 생년월일6자리 : " + ssn);
		System.out.println("4. 전화번호 : " + tel);
	}

}
