package lessons.vehicle;

public class Vehicle {
	
	// data members
	protected String fuelType;
	protected String colour;
	protected int maxPass;
	protected boolean hasMotor;
	
	// DESCRIPTION: Default Constructor
	// PARAMETER LIST: N/A
	// RETURN TYPE: Vehicle
	public Vehicle() {
		
		fuelType = "";
		colour = "";
		maxPass = 0;
		hasMotor = false;
		
		
	}
	
	// DESCRIPTION: Parameterized Constructor
	// PARAMETER LIST: (String fuelType, String colour, int maxPass, boolean hasMotor)
	// RETURN TYPE: Vehicle
	public Vehicle(String ft, String c, int mp, boolean hm) {
		
		this.fuelType = ft;
		this.colour = c;
		this.maxPass = mp;
		this.hasMotor = hm;
		
	}
	
	// Get methods
	
	public String getFuelType() {
		
		return this.fuelType;
		
	}
	
	public String getColour() {
		
		return this.colour;
		
	}

	public int getMaxPass() {
		
		return this.maxPass;
		
	}
	
	public boolean getHasMotor() {
		
		return this.hasMotor;
		
	}
	
	// set methods
	
	public void setFuelType(String ft) {
		
		this.fuelType = ft;
		
	}
	
	public void setColour (String c) {
		
		this.colour = c;
		
	}
	
	public void setMaxPass (int mp) {
		
		this.maxPass = mp;
		
	}
	
	public void setHasMotor (boolean hm) {
		
		this.hasMotor = hm;
		
	}
	
	@Override

	public String toString() {
		
		String str = "";
		
		str = super.toString() + "." + this.fuelType + "." + this.colour + "." + this.maxPass + "." + this.hasMotor;
		
		return str;
		
	}
	
}
