package lessons;

public class LinearSearch {

	// global variable
	static int counter = 0;
	
	public static void main(String[] args) {

		String[] unSortedArray = { "peach", "blue", "salmon", "brown", "green", "orange", "purple", "red", "black",
				"white" };

		System.out.println(unsortedLinearSearch(unSortedArray, "peach"));
		System.out.println("Looked at this many things: " + counter);
		
	}

	// DESCRIPTION - Returns true if search pattern is found at least once
	// inside array
	// PARAMETERS - String[] a, String p
	// RETURN TYPE - boolean
	public static boolean unsortedLinearSearch(String[] a, String p) {

		boolean real = false;
		
		for (int i = 0; i < a.length; i++) {

			counter++;
			
			if (p.equals(a[i])) {
				real = true;

			}

		}

		return real;
		
		// Problem - entire list has to be searched if element is not inside

	}

}
