package sec03.exam02;

public class CarExample2 {
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		
		Car2 car2 = new Car2("�ڰ���");
		System.out.println("\ncar2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		
		Car2 car3 = new Car2("�ڰ���" , "����");
		System.out.println("\ncar3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		
		Car2 car4 = new Car2("�ý�" , "����" , 200);
		System.out.println("\ncar4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
