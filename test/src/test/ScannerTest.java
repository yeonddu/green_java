package test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String exit = "Exit";
		
		while(true) {
			System.out.println("�����ϽǷ���\"Exit\"�� �Է����ּ���.");
			System.out.println("1.���ϱ�\n2.����\n3.���ϱ�\n4.������\n5.������");
			String inputdata = scanner.nextLine();
			System.out.println("�Է��Ͻų�����: " + inputdata + "�Դϴ�.");
				/*switch(inputdata){
				case 1: ��....
				*/ 
			
			
			
				if(inputdata.equals(exit)) {
					System.out.println("�����մϴ�.");
					break;
				
			}
			
		}
		
		
	}
}
