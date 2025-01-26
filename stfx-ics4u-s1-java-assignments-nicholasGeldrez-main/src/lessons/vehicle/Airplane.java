package lessons.vehicle;

public class Airplane extends Vehicle {

	// data members
	private int numEngines;

	
	// DESCRIPTION: Default Constructor
	// PARAMETER LIST: N/A
	// RETURN TYPE: Airplane
	public Airplane() {
	
		super();
		numEngines = 0;
	}

	// DESCRIPTION: Default Constructor
	// PARAMETER LIST: String fuelType, String colour, int maxPass, boolean hasMotor, int numEngines
	// RETURN TYPE: Airplane
	public Airplane(String ft, String c, int mp, boolean hm, int ne) {
	
		super(ft, c, mp, hm);
		this.numEngines = ne;
		
	}
	
	// get methods
	
	public int getEngines() {
		
		return this.numEngines;
		
	}
	
	public void setEngines(int ne) {
		
		
		this.numEngines = ne;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.numEngines;
		
	}
	
}
