package sec03.exam02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputdata;
		String exit = "exit";
		
		while(true) {
			inputdata = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputdata + "\"");
			if(inputdata.equals(exit)){
				break;
			}
		}
		System.out.println("����...");
	}

}
