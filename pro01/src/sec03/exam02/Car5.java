package sec03.exam02;

public class Car5 {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�. (�ü�: " + speed + "km/h)");
		}
	}
}
