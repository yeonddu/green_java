package sec03.exam02;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		String strPassWord = scanner.nextLine();
		
		int password = Integer.parseInt(strPassWord);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공!");
			}
			else {
				System.out.println("로그인 실패: 패스워드가 틀렸습니다.");
			}
		}
		else {
			System.out.println("로그인실패 : 아이디가 존재하지않음..");
		}
	}

}
