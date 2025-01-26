package assignments;

public class Animal {

	// Date Members
	String species = "";
	String gender = "";
	String diet = "";


	
	public String getSpecies() {
		return this.species;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getDiet() {
		return this.diet;
	}
	
	// set methods
	public void setSpecies(String s) {
		this.species = s;
	}
	
	public void setGender(String g) {
		this.gender = g;
	}
	
	public void setDiet(String d) {
		
		this.diet = d;
		

	}
	
	
	public Animal () {
		
		this.species = "Lainey - Human.";
		this.gender = "Female.";
		this.diet = "Omnivore.";
		
	}
	
	
	public Animal(String s, String g, String d) {
		
		this.species = s;
		this.gender = g;
		this.diet = d;
		
	}
	
	// Over-ride .toString() method
	@Override
	public String toString() {
		
		return super.toString() + this.species + "." + this.gender + "." + this.diet;
		
	}
	
}
