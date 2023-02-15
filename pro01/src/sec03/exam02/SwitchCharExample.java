package sec03.exam02;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'a':
			case 'A':
				System.out.println("우수회원 입니다.");
				break;
			case 'b':
			case 'B':
				System.out.println("일반회원 입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
	}

}
