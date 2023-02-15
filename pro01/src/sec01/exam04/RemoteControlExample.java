package sec01.exam04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.setVolume(11);
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.setVolume(-1);
		rc.turnOn();
		rc.turnOff();
}
}
