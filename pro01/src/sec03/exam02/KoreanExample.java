package sec03.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("���Ѽ�" , "960111-1111111" , 27);
		System.out.println("k1 name : " + k1.name);
		System.out.println("k1 ssn : " + k1.ssn);
		System.out.println("k1 age : " + k1.age);
		
		Korean k2 = new Korean("���� ", "960111-1111111" , 27);
		System.out.println("\nk2 name : " + k2.name);
		System.out.println("k2 ssn : " + k2.ssn);
		System.out.println("k2 age : " + k2.age);
	}
}
