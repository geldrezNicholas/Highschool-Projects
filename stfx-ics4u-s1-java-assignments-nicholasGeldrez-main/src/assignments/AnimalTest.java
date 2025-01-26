package assignments;

public class AnimalTest {

	public static void main(String[] args) {
		
		// create new animal object	
		Animal animal1 = new Animal();
		
		animal1.species = "Mr. Monkey.";
		animal1.gender = "Mal.e";
		animal1.diet = "Omnivore.";
		
		System.out.println("Animal 1:");
		System.out.println(animal1.getSpecies());
		System.out.println(animal1.getGender());
		System.out.println(animal1.getDiet());
		System.out.println("\n");


		// Create another animal Object
		Animal animal2 = new Animal();
		
		// get data from second Employee
		System.out.println("Animal 2:");
		System.out.println(animal2.getSpecies());
		System.out.println(animal2.getGender());
		System.out.println(animal2.getDiet());
		System.out.println("\n");
		
		
		// Create a third animal Object
		Animal animal3 = new Animal("Maya - Dog.","Female.", "Omnivore.");
		
		// get data from third animal
		
		System.out.println("Animal 3:");
		System.out.println(animal3.getSpecies());
		System.out.println(animal3.getGender());
		System.out.println(animal3.getDiet());

		
	}

}
