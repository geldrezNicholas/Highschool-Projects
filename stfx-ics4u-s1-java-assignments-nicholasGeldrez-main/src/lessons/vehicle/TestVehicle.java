package lessons.vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car
		
		// create new instance of car using default constructor:
		
		Car car1 = new Car();
		
		// create new instance of car using default constructor:
		
		Car car2 = new Car("gas", "blue", 4, true, "standard");
		
		car1.setFuelType("diesel");
		car1.setColour("red");
		car1.setMaxPass(4);
		car1.setHasMotor(true);
		car1.setTransmission("automatic");
		
		System.out.println(car1);
		
		System.out.println(car1.getFuelType());
		System.out.println(car1.getColour());
		System.out.println(car1.getMaxPass());
		System.out.println(car1.getHasMotor());
		System.out.println(car1.getTransmission());

		System.out.println(car2);
		System.out.println("\n");
		
		// Airplane
		
		// create new instance of car using default constructor:
		
		Airplane airplane1 = new Airplane();
		
		// create new instance of car using default constructor:
		
		Airplane airplane2 = new Airplane("diesel", "yellow", 300, true, 6);
		
		airplane1.setFuelType("Jet Fuel");
		airplane1.setColour("white");
		airplane1.setMaxPass(200);
		airplane1.setHasMotor(true);
		airplane1.setEngines(4);
		
		System.out.println(airplane1);
		
		System.out.println(airplane1.getFuelType());
		System.out.println(airplane1.getColour());
		System.out.println(airplane1.getMaxPass());
		System.out.println(airplane1.getHasMotor());
		System.out.println(airplane1.getEngines());

		System.out.println(airplane2);
		System.out.println("\n");
		
		// Bicycle
		
		// create new instance of car using default constructor:
		
		Bicycle bicycle1 = new Bicycle();
		
		// create new instance of car using default constructor:
		
		Bicycle bicycle2 = new Bicycle("electric", "white", 1, false, true);
		
		bicycle1.setFuelType("human");
		bicycle1.setColour("black");
		bicycle1.setMaxPass(1);
		bicycle1.setHasMotor(false);
		bicycle1.setEBike(false);
		
		System.out.println(bicycle1);
		
		System.out.println(bicycle1.getFuelType());
		System.out.println(bicycle1.getColour());
		System.out.println(bicycle1.getMaxPass());
		System.out.println(bicycle1.getHasMotor());
		System.out.println(bicycle1.getEBike());

		System.out.println(bicycle2);
		
		
	}

}
