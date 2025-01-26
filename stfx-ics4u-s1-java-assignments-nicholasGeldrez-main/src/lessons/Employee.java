package lessons;

public class Employee {

	//Data Member
	String birthDate = "";
	String name = "";
	String position = "";
	
	// Default constructors
	public Employee () {
		
		this.name = "Apple.";
		this.birthDate = "Birthdate TBD.";
		this.position = "Position TBD.";
		
	}
	
	// Parameterized Constructor
	
	public Employee(String n, String bd, String p) {
		
		this.name = n;
		this.birthDate = bd;
		this.position = p;
		
	}
	
	// get methods
	
	// get name, birth date, and position
	
	public String getName() {
		return this.name;
	}
	
	public String getBirthDate() {
		return this.birthDate;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	// set methods
	public void setName(String n) {
		this.name = n;
	}
	
	public void setBirthDate(String b) {
		this.birthDate = b;
	}
	
	public void setPosition(String p) {
		
		this.position = p;
		
	}
	
	// Over-ride .toString() method
	@Override
	public String toString() {
		
		return super.toString() + this.name + "." + this.birthDate + "." + this.position;
		
	}
	
}
