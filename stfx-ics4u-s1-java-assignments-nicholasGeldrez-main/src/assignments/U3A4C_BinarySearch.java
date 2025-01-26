package assignments;

public class U3A4C_BinarySearch {

	public static void main(String[] args) {

		int[] sortedIntArray = { 0, 2, 3, 4, 7, 13, 17, 22 };
		String[] sortedStringArray = { "black", "blue", "brown", "green", "orange", "peach", "purple", "red", "salmon",
				"white" };

		// processing
		System.out.println(binaryIntSearch(sortedIntArray, 13));
		System.out.println(binaryIntSearch(sortedIntArray, 73));
		System.out.println(binaryStringSearch(sortedStringArray, "green"));
		System.out.println(binaryStringSearch(sortedStringArray, "pink"));
		System.out.println(binaryIntSearchRecursive(sortedIntArray, 17, 0, sortedIntArray.length - 1));
		System.out.println(binaryIntSearchRecursive(sortedIntArray, 73, 0, sortedIntArray.length - 1));
		System.out.println(binaryStringSearchRecursive(sortedStringArray, "black", 0, sortedStringArray.length - 1));
		System.out.println(binaryStringSearchRecursive(sortedStringArray, "pink", 0, sortedStringArray.length - 1));

	}

	// DESCRIPTION - Returns first instance of pattern if found, else returns -1.
	// PARAMETERS - int[] sortedIntArray, int intPattern
	// RETURN TYPE - int
	public static int binaryIntSearch(int[] sortedIntArray, int intPattern) {

		int left = 0;
		int right = sortedIntArray.length - 1;
		int middle = (left + right) / 2;
		int index = 0;

		for (int i = 0; i < sortedIntArray.length; i++) {

			if (sortedIntArray[middle] == intPattern) {

				index = middle;

				return index;

			} else if (sortedIntArray[middle] < intPattern) {

				left = middle + 1;
				middle = (left + right) / 2;

			} else if (sortedIntArray[i] > intPattern) {

				right = middle - 1;
				middle = (left + right) / 2;

			}
		}

		return -1;

	}

	// DESCRIPTION - Returns array index of pattern if found, else -1. Duplicates
	// not handled.
	// PARAMETERS - String[] sortedStringArray, String stringPattern
	// RETURN TYPE - int
	public static int binaryStringSearch(String[] sortedStringArray, String stringPattern) {

		int left = 0;
		int right = sortedStringArray.length - 1;
		int middle = (left + right) / 2;
		int index = 0;

		for (int i = 0; i < sortedStringArray.length; i++) {

			middle = i;
			
			if (sortedStringArray[middle].equals(stringPattern)) {

				index = middle;

				return index;

			} else if (sortedStringArray[middle].compareTo(stringPattern) < 0) {

				left = middle + 1;
				middle = (left + right) / 2;

			} else if (sortedStringArray[middle].compareTo(stringPattern) < 0) {

				right = middle - 1;
				middle = (left + right) / 2;

			}
		}

		return -1;

	}

	// DESCRIPTION - Returns array index of pattern if found, else -1. Duplicates
	// not handled.
	// PARAMETERS - int[] sortedIntArray, int intPattern, int left, int right
	// RETURN TYPE - int
	public static int binaryIntSearchRecursive(int[] sortedIntArray, int intPattern, int left, int right) {

		int middle = (left + right) / 2;

		// error case (if right is bigger than array, if left is bigger than right, and if left if smaller than 0(all of these cases would be impossible))
		if (right > sortedIntArray.length || left > right || left < 0) {

			return -1;

		// stop case
		} else if (sortedIntArray[middle] - intPattern == 0) {

			return middle;

		// recursion
		} else {

			if (sortedIntArray[middle] - intPattern > 0) {

				return binaryIntSearchRecursive(sortedIntArray, intPattern, left, middle - 1);

			}

			else {

				return binaryIntSearchRecursive(sortedIntArray, intPattern, middle + 1, right);

			}
		}

	}

	// DESCRIPTION - Returns array index of pattern if found, else -1. Duplicates
	// not handled.
	// PARAMETERS - String[] sortedStringArray, String stringPattern, int left, int
	// right
	// RETURN TYPE - int
	public static int binaryStringSearchRecursive(String[] sortedStringArray, String stringPattern, int left,
			int right) {

		int middle = (left + right) / 2;

		// error case (if right is bigger than array, if left is bigger than right, and if left if smaller than 0(all of these cases would be impossible))
		if (right > sortedStringArray.length || left > right || left < 0) {

			return -1;

		// stop case
		} else if (sortedStringArray[middle].compareTo(stringPattern) == 0) {

			return middle;

		// recursion
		} else {

			if (sortedStringArray[middle].compareTo(stringPattern) > 0) {

				return binaryStringSearchRecursive(sortedStringArray, stringPattern, left, middle - 1);

			}

			else {

				return binaryStringSearchRecursive(sortedStringArray, stringPattern, middle + 1, right);

			}
		}
	}

}