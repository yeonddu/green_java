package sec03.exam02;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;
		boolean start = false;
		boolean move = stop;
		
		if(move) {
			System.out.println("중지합니다");
		}
		else if(move){
			System.out.println("시작합니다");
		}
		else {
			System.out.println("에러발생");
		}

	}

}
