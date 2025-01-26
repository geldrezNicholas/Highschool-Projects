package assignments;
import java.util.ArrayList;
import java.io.*;

public class VegetableSort {

	public static void main(String[] args) {
				
		Vegetable[] vegArray = loadVeggiesFromFile();

		System.out.println("\nUNSORTED: ");
		printVeggies(vegArray);
		
		sortVeggiesByName(vegArray, true);
		System.out.println("\nSORTED ASCENDING BY NAME: ");
		printVeggies(vegArray);
		
		sortVeggiesByName(vegArray, false);
		System.out.println("\nSORTED DESCENDING BY NAME: ");
		printVeggies(vegArray);
		
		sortVeggiesByType(vegArray, true);
		System.out.println("\nSORTED ASCENDING BY TYPE: ");
		printVeggies(vegArray);
		
		sortVeggiesByType(vegArray, false);
		System.out.println("\nSORTED DESCENDING BY TYPE: ");
		printVeggies(vegArray);
		
		sortVeggiesByColour(vegArray, true);
		System.out.println("\nSORTED ASCENDING BY COLOUR: ");
		printVeggies(vegArray);
		
		sortVeggiesByColour(vegArray, false);
		System.out.println("\nSORTED DESCENDING BY COLOUR: ");
		printVeggies(vegArray);
	}


	// DESCRIPTION - Loads Vegetable data from file
	// PARAMETERS - Requires "vegetables.txt" data file
	// RETURN TYPE - Vegetable[]
	public static Vegetable[] loadVeggiesFromFile()  {
		BufferedReader br = null;
		ArrayList<Vegetable> vegetableList = new ArrayList(); 
		String name = new String();
		String type = new String();
		String colour = new String();
		String line = new String();
		Vegetable[] vegetableArray = new Vegetable[18];
		String[] fullLine = new String[3];
		
		try {
			br = new BufferedReader(new FileReader("vegetables.txt"));
		} catch (Exception e2) {

			e2.printStackTrace();

		}

		try {

			while ((line = br.readLine()) != null) {

				fullLine = line.split(", ");

				name = fullLine[0];
				type = fullLine[1];
				colour = fullLine[2];

				vegetableList.add(new Vegetable(name, type, colour));

			}
		} catch (Exception e2) {

			e2.printStackTrace();

		}
		
		vegetableList.toArray(vegetableArray);
		
		return vegetableArray;
	}

	
	// DESCRIPTION - Sorts Vegetable array ascending (true) or descending (false) directions by name datamember.
	// PARAMETERS - Vegetable[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortVeggiesByName(Vegetable[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getName().compareTo(a[i + 1].getName()) > 0) {

						swap(a, i, i + 1);

						ascending = true;

					}

				}

			}

		}

		else {

			while (ascending == false) {

				ascending = true;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getName().compareTo(a[i + 1].getName()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}

		
	}
	
	
	// DESCRIPTION - Sorts Vegetable array ascending (true) or descending (false) directions by type datamember.
	// PARAMETERS - Vegetable[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortVeggiesByType(Vegetable[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getType().compareTo(a[i + 1].getType()) > 0) {

						swap(a, i, i + 1);

						ascending = true;

					}

				}

			}

		}

		else {

			while (ascending == false) {

				ascending = true;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getType().compareTo(a[i + 1].getType()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	
	
	// DESCRIPTION - Sorts Vegetable array ascending (true) or descending (false) directions by colour datamember.
	// PARAMETERS - Vegetable[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortVeggiesByColour(Vegetable[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getColour().compareTo(a[i + 1].getColour()) > 0) {

						swap(a, i, i + 1);

						ascending = true;

					}

				}

			}

		}

		else {

			while (ascending == false) {

				ascending = true;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getColour().compareTo(a[i + 1].getColour()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	
	
	// DESCRIPTION - Swaps Vegetable array elements x with y.
	// PARAMETERS - Vegetable[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(Vegetable[] a, int x, int y)  {
		
		Vegetable temp;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		
	}
	
	
	// DESCRIPTION - Prints array of Vegetable objects.
	// PARAMETERS - Vegetable[] a
	// RETURN TYPE - void
	public static void printVeggies(Vegetable[] a)  {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);	
			
		}
	}
	
}


/* EXPECTED OUTPUT (Hashcodes will vary, for example "@4926097b").

UNSORTED: 
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@3fb4f649.shallot.allium.green

SORTED ASCENDING BY NAME: 
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@7d6f77cc.zucchini.marrow.green

SORTED DESCENDING BY NAME: 
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@606d8acf.asparagus.aromatic.green

SORTED ASCENDING BY TYPE: 
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@6f75e721.yam.pink.root

SORTED DESCENDING BY TYPE: 
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@470e2030.garlic.allium.white

SORTED ASCENDING BY COLOUR: 
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@3fb4f649.shallot.allium.green
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@782830e.onion.allium.yellow

SORTED DESCENDING BY COLOUR: 
assignments.Vegetable@782830e.onion.allium.yellow
assignments.Vegetable@3830f1c0.cauliflower.cruciferous.white
assignments.Vegetable@470e2030.garlic.allium.white
assignments.Vegetable@6f75e721.yam.pink.root
assignments.Vegetable@73a28541.sweet potato.orange.root
assignments.Vegetable@5aaa6d82.potato.brown.root
assignments.Vegetable@123772c4.pumpkin.marrow.orange
assignments.Vegetable@69222c14.celery.perennial.green 
assignments.Vegetable@7d6f77cc.zucchini.marrow.green
assignments.Vegetable@2d363fb3.cucumber.marrow.green
assignments.Vegetable@762efe5d.spinach.leafy green.green
assignments.Vegetable@5d22bbb7.silverbeet.leafy green.green
assignments.Vegetable@4926097b.lettuce.leafy green.green
assignments.Vegetable@41a4555e.cabbage.cruciferous.green
assignments.Vegetable@39ed3c8d.brussels sprouts.cruciferous.green
assignments.Vegetable@71dac704.broccoli.cruciferous.green
assignments.Vegetable@606d8acf.asparagus.aromatic.green
assignments.Vegetable@3fb4f649.shallot.allium.green

*/
