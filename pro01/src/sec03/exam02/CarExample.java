package sec03.exam02;

public class CarExample {
	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		System.out.println("����ȸ�� : " + mycar.company);
		System.out.println("�𵨸� : " + mycar.model);
		System.out.println("���� : " + mycar.color);
		System.out.println("�ְ�ӵ� : " + mycar.maxspeed);
		System.out.println("����ӵ� : " + mycar.speed);
		
		mycar.speed = 60;
		
		System.out.println("����� ����ӵ� : " + mycar.speed);
	}
}
