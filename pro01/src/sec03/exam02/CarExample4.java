package sec03.exam02;

public class CarExample4 {
	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(6);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()){
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
