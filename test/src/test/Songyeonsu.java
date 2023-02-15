package test;

public class Songyeonsu {

	public static void main(String[] args) {

		System.out.println("--------------1번--------------");
		
		for(int i=1;i<10;i++) {
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
//////////////////////////////////////////////////////////////////		
		System.out.println("--------------2번--------------");
		
		for(int i=1;i<10;i++) {
			
		for(int j=1;j<=i;j++){
			System.out.print(" ");
		}
		
		for(int k=9;k>=i;k--) {
			System.out.print("*");
		}
		System.out.println();
	}
//////////////////////////////////////////////////////////////////	
		System.out.println("--------------3번--------------");
		
		for(int i=1;i<15;i++){
			for(int j=15;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
//////////////////////////////////////////////////////////////////
		System.out.println("--------------4번--------------");
		
		for(int i=1;i<15;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=28;k>2*i-1;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
