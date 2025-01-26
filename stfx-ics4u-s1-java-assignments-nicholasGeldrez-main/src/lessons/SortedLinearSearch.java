package lessons;

public class SortedLinearSearch {

	// global variable
	static int counter = 0;

	public static void main(String[] args) {

		String[] unsortedArray = { "black", "blue", "brown", "green", "orange", " peach", "purple", "red", "salmon",
				"white" };

		System.out.println(sortedLinearSearch(unsortedArray, "coral"));
		System.out.println(counter);

	}

	// DESCRIPTION
	// PARAMETERS - String[] sortedArray, String pattern
	// RETURN TYPE - boolean
	public static boolean sortedLinearSearch(String[] sortedArray, String pattern) {

		for (int i = 0; i < sortedArray.length; i++) {

			counter++;

			if (sortedArray[i].compareTo(pattern) == 0) {

				return true;

			}

			if (sortedArray[i].compareTo(pattern) > 0) {

				return false;

			}

		}

		return false;

	}

}
