package sec01.exam06;

public class Television implements RemoteControl {
	
	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ���� �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	//turnOff() �߻� �޼ҵ��� ���� �޼ҵ�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	//setVolume() �߻� �޼ҵ��� ���� �޼ҵ�
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUNE) {
			this.volume = RemoteControl.MIN_VOLUNE;			
		} else {
			this.volume = volume;
		}
		
		System.out.println("���� TV ����: " + this.volume);
	}
}
