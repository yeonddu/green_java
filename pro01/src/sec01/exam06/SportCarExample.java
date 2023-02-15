package sec01.exam06;

public class SportCarExample {

	public static void main(String[] args) {
		SportsCar sportscar = new SportsCar();
		
		sportscar.speed = 5;
		System.out.println(sportscar.speed);
		
		sportscar.speedUp(); 
		System.out.println(sportscar.speed);		
		
		sportscar.stop();
		System.out.println(sportscar.speed);
		
		
		

	}

}
