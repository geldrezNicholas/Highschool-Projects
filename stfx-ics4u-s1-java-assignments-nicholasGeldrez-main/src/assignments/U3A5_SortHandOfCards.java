package assignments;

public class U3A5_SortHandOfCards {

	public static void main(String[] args) {

		// variables
		int[] intArray = { 6, 4, 7, 0, 1, 2, 9, 8, 5 };
		String[] stringArray = { "cat", "horse", "mouse", "chicken", "dog", "fish", "snake", "cow" };

		// sort integers ascending
		sortHandOfInts(intArray, true);
		printIntArray(intArray);

		// sort integers descending
		sortHandOfInts(intArray, false);
		printIntArray(intArray);

		// sort Strings ascending
		sortHandOfStrings(stringArray, true);
		printStringArray(stringArray);

		// sort Strings descending
		sortHandOfStrings(stringArray, false);
		printStringArray(stringArray);

		/*
		 * EXPECTED OUTPUT:
		 * 
		 * 0 1 2 4 5 6 7 8 9 9 8 7 6 5 4 2 1 0 cat chicken cow dog fish horse mouse
		 * snake snake mouse horse fish dog cow chicken cat
		 * 
		 */

	}

	// DESCRIPTION - Sorts integer array ascending (true) or descending (false)
	// directions.
	// PARAMETERS - int[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortHandOfInts(int[] a, boolean ascending) {

		for (int i = 1; i < a.length; i++) {

			int j = i;

			while (j > 0) {

				if (ascending == true) {

					while (a[j] < a[j - 1]) {

						swapInt(a, j, j - 1);

					}
					j--;
				} else {

					while (a[j] > a[j - 1]) {

						swapInt(a, j, j - 1);

					}
					j--;
				}
			}
		}

	}

	// DESCRIPTION - Sorts String array ascending (true) or descending (false)
	// directions.
	// PARAMETERS - String[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortHandOfStrings(String[] a, boolean ascending) {

		for (int i = 1; i < a.length; i++) {

			int j = i;

			while (j > 0) {

				if (ascending == true) {

					while (a[j].compareTo(a[j - 1]) < 0) {

						swapString(a, j, j - 1);

					}
					j--;
				} else {

					while (a[j].compareTo(a[j - 1]) > 0) {

						swapString(a, j, j - 1);

					}
					j--;
				}
			}
		}

	}

	// DESCRIPTION - Prints contents of integer array.
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void printIntArray(int[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

		System.out.println("");
	}

	// DESCRIPTION - Prints contents of String array.
	// PARAMETERS - String[] a
	// RETURN TYPE - void
	public static void printStringArray(String[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

		System.out.println("");
	}

	// DESCRIPTION - Swaps int array elements x with y.
	// PARAMETERS - int[] a, int x, int y
	// RETURN TYPE - void
	public static void swapInt(int[] a, int x, int y) {

		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

		// TO BE COMPLETED
	}

	// DESCRIPTION - Swaps String array elements x with y.
	// PARAMETERS - String[] a, int x, int y
	// RETURN TYPE - void
	public static void swapString(String[] a, int x, int y) {

		String temp = a[x];
		a[x] = a[y];
		a[y] = temp;

		// TO BE COMPLETED
	}

}
