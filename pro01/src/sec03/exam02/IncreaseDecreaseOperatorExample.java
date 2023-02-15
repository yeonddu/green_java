package sec03.exam02;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++;
		++x;
		System.out.println("x = " + x);
		//11
		System.out.println("----------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		//9
		System.out.println("----------------------");
		z = x++;
		System.out.println("z= " + z);
		//11
		System.out.println("x= " + x);
		//11
		System.out.println("----------------------");
		z = ++x;
		System.out.println("z= " + z);
		//13
		System.out.println("x= " + x);
		//14
		System.out.println("----------------------");
		z= ++x + y++;
		
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		

		
	}
}
