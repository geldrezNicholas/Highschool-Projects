package lessons.vehicle;

public class Bicycle extends Vehicle {

	// data members
	private boolean eBike;

	
	// DESCRIPTION: Default Constructor
	// PARAMETER LIST: N/A
	// RETURN TYPE: Bicycle
	public Bicycle() {
	
		super();
		eBike = false;
	}

	// DESCRIPTION: Default Constructor
	// PARAMETER LIST: String fuelType, String colour, int maxPass, boolean hasMotor, boolean eBike
	// RETURN TYPE: Bicycle
	public Bicycle(String ft, String c, int mp, boolean hm, boolean eb) {
	
		super(ft, c, mp, hm);
		this.eBike = eb;
		
	}
	
	// get methods
	
	public boolean getEBike() {
		
		return this.eBike;
		
	}
	
	public void setEBike(boolean eb) {
		
		
		this.eBike = eb;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.eBike;
		
	}
	
}
