package assignments;

public class Vegetable {

	// data members
	String name = "";
	String type = "";
	String colour = "";
	
	// Default Constructor
	public Vegetable() {
			
		this.name = "";
		this.type = "";
		this.colour = "";
		
	}
	
	// Parameterized Constructor
	public Vegetable(String n, String t, String c) {
			
		this.name = n;
		this.type = t;
		this.colour = c;
		
	}
	
	// Get
	public String getName() {
		
		return this.name;
		
	}
	
	public String getType() {
		
		return this.type;
		
	}
	
	public String getColour() {
		
		return this.colour;
		
	}
	
	
	// Sets
	public void setName(String r) {
		
		this.name = r;
		
	}
	
	public void setType(String t) {
		
		this.type = t;
		
	}
	
	public void setColour(String a) {
		
		this.colour = a;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.name + "." + this.type + "." + this.colour;
				
	}
}
