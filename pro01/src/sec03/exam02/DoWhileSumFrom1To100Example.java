package sec03.exam02;

public class DoWhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
			//System.out.println("╬ф" + i);
		}while(i <= 100);
		
		System.out.println("1~ " + (i-1) + "гу : " + sum);
	}

}
