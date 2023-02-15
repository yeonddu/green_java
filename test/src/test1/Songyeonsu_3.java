package test1;

public class Songyeonsu_3 {

	public static void main(String[] args) {
		
		int[] arr = {83, 90, 87};
		
		int sum = 0;
		
		for(int i=0;i<arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}

