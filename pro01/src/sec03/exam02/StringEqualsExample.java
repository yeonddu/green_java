package sec03.exam02;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strvar1 = "신민철";
		String strvar2 = "신민철";
		
		if(strvar1 == strvar2) {
			System.out.println("strvar1과 strvar2의 참조가 같음");
		}
		else {
			System.out.println("strvar1과 strvar2의 참조가 다름");
		}
		if(strvar1.equals(strvar2)) {
			System.out.println("strvar1과 strvar2의 문자열이 같음");
		}
		
		String str3 = new String("신민철");
		String str4 = new String("신민철");
		
		if(str3 == str4) {
			System.out.println("str3와 str4의 참조가 같음");
		}
		else {
			System.out.println("str3와 str4의 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3와 str4의 문자열이 같음.");
		}
	}

}
