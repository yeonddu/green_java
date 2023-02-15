package sec03.exam02;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int i = 2 ; i <= 9 ; i++) {
			if(i == 3) {
				System.out.println("*** " + i + "´Ü ***");
				for(int z = 1 ; z <= 9 ; z++) {
					System.out.println(i + " X " + z + " = " + (i*z));
				}
			}
		}
	}

}
