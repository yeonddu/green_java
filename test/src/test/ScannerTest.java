package test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String exit = "Exit";
		
		while(true) {
			System.out.println("종료하실려면\"Exit\"를 입력해주세요.");
			System.out.println("1.더하기\n2.빼기\n3.곱하기\n4.나누기\n5.나머지");
			String inputdata = scanner.nextLine();
			System.out.println("입력하신내용은: " + inputdata + "입니다.");
				/*switch(inputdata){
				case 1: 음....
				*/ 
			
			
			
				if(inputdata.equals(exit)) {
					System.out.println("종료합니다.");
					break;
				
			}
			
		}
		
		
	}
}
