package sec03.exam02;

public class Car3 {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	
	Car3(){
		
	}
	Car3(String model){
		this(model, null , 0);
	}
	Car3(String model , String color){
		this(model, color , 0);
	}
	Car3(String model , String color , int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
