package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checFare(); (x)
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
