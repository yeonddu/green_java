package sec01.exam04;

public class Audio implements RemoteControl {
	
	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ���� �޼ҵ�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	//turnOff() �߻� �޼ҵ��� ���� �޼ҵ�
	public void turnOff() {
		System.out.println("AudioTV�� ���ϴ�.");
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
		
		System.out.println("���� Audio ����: " + this.volume);
	}
}
