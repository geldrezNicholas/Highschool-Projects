package lessons.vehicle;

public class Car extends Vehicle {
	
	// data members
	private String transmission;

	
	// DESCRIPTION: Default Constructor
	// PARAMETER LIST: N/A
	// RETURN TYPE: Car
	public Car() {
	
		super();
		transmission = "";
	}

	// DESCRIPTION: Default Constructor
	// PARAMETER LIST: String fuelType, String colour, int maxPass, boolean hasMotor, String trans
	// RETURN TYPE: Car
	public Car(String ft, String c, int mp, boolean hm, String t) {
	
		super(ft, c, mp, hm);
		this.transmission = t;
		
	}
	
	// get methods
	
	public String getTransmission() {
		
		return this.transmission;
		
	}
	
	public void setTransmission(String t) {
		
		
		this.transmission = t;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.transmission;
		
	}
	
	
}
