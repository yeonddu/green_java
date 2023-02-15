package generics.code231;

class Data<T extends Number> { //Number Ŭ������ ���� Ŭ���� Ÿ��
	T obj;
	Data(T ob){
		obj = ob;
	}
	int calcMultiple(int n) {
		return obj.intValue() * n;				
	}
}
	public class Code231 {
		public static void main(String[] args) {
			Data<Integer> d = new Data<Integer>(100); //Integer�� Number�� ���� Ŭ����
			int result = d.calcMultiple(5);
			System.out.println(result);
			
			Data<Double> e = new Data<Double>(17.5); //Double�� Number�� ���� Ŭ����
			int result2 = e.calcMultiple(5);
			System.out.println(result2);
		}
	}
