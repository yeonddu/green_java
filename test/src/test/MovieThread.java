package test;

public class MovieThread extends Thread {

	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			
			
		}
	}
}
