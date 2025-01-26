package assignments;

public class Dogs {

	public String name;
	public String breed;
	public String colour;
	public String trait;

	// Default Constructor
	public Dogs() {

		this.name = "";
		this.breed = "";
		this.colour = "";
		this.trait = "";

	}

	// Parameterized Constructor
	public Dogs(String n, String b, String c, String t) {

		this.name = n;
		this.breed = b;
		this.colour = c;
		this.trait = t;

	}

	public String getName() {

		return this.name;

	}

	public String getBreed() {

		return this.breed;

	}

	public String getColour() {

		return this.colour;

	}

	public String getTrait() {

		return this.trait;

	}

	public void setName(String n) {

		this.name = n;

	}

	public void setBreed(String b) {

		this.breed = b;

	}

	public void setAge(String c) {

		this.colour = c;

	}

	public void setTrait(String t) {

		this.trait = t;

	}

	@Override
	public String toString() {

		return super.toString() + "." + this.name + "." + this.breed + "." + this.colour + "." + this.trait;

	}

}
