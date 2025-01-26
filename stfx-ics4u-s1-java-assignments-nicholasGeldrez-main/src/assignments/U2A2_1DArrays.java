package assignments;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class U2A2_1DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Hello enter 1-3 to pick an option!");
			System.out.println("1. Sum of all integers.");
			System.out.println("2. List of all even integers.");
			System.out.println("3. List of all odd integers.");
			System.out.println("4. Exit!");

			int[] intArray = new int[12];
			int sumOfInts = 0;

			try {

				choice = sc.nextInt();

			} catch (Exception c) {

				JOptionPane.showMessageDialog(null, "Invalid Entry");

			}

			switch (choice) {

			case 1:

				System.out.println("\n");
				System.out.println("Enter your integers!");

				intArray = getArray();

				sumOfInts = getSum(intArray);

				System.out.println("Your integers are: ");

				displayArray(intArray);

				System.out.println("Sum of your integers: " + sumOfInts);

				break;

			case 2:

				System.out.println("\n");
				System.out.println("Enter your integers!");

				intArray = getArray();

				System.out.println("Your integers are: ");

				sumOfInts = getEvenSum(intArray);

				displayEven(intArray);

				System.out.println("Sum of your integers: " + sumOfInts);

				break;

			case 3:

				System.out.println("\n");
				System.out.println("Enter your integers!");

				intArray = getArray();

				System.out.println("Your integers are: ");

				sumOfInts = getOddSum(intArray);

				displayOdd(intArray);

				System.out.println("Sum of your integers: " + sumOfInts);

				break;

			}

		} while (choice != 4);

		System.out.println("Exiting...");

	}

	// DESCRIPTION: Returns sum of even integers in the array
	// PARAMETER LIST: getEvenSum(int[] a)
	// RETURN TYPE: int
	public static int getEvenSum(int[] a) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			if ((a[i] % 2) == 0) {

				sum = sum + a[i];

			}

		}
		return sum;

	}

	// DESCRIPTION: Returns sum of odd integers in the array
	// PARAMETER LIST: getOddSum(int[] a)
	// RETURN TYPE: int
	public static int getOddSum(int[] a) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			if ((a[i] % 2) != 0) {

				sum = sum + a[i];

			}

		}
		return sum;

	}
	
	// DESCRIPTION: Returns sum of entire array
	// PARAMETER LIST: getSum(int[] a)
	// RETURN TYPE: int
	public static int getSum(int[] a) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		return sum;

	}

	// DESCRIPTION: Displays all even values from an array
	// PARAMETER LIST: displayEven(int[] e)
	// RETURN TYPE: N/A
	public static void displayEven(int[] e) {

		for (int i = 0; i < e.length; i++) {

			if (e[i] > 0 && ((e[i] % 2) == 0)) {

				System.out.println(e[i]);

			}

		}

	}
	
	// DESCRIPTION: Displays entire array
	// PARAMETER LIST: displayArray(int[] e)
	// RETURN TYPE: N/A
	public static void displayArray(int[] e) {

		for (int i = 0; i < e.length; i++) {

			System.out.println(e[i]);

		}

	}

	// DESCRIPTION: Displays all the odd values from the array
	// PARAMETER LIST: displayOdd(int[] e)
	// RETURN TYPE: N/A
	public static void displayOdd(int[] e) {

		for (int i = 0; i < e.length; i++) {

			if (e[i] > 0 && ((e[i] % 2) != 0)) {

				System.out.println(e[i]);

			}

		}

	}

	// DESCRIPTION: Returns users integers through an array
	// PARAMETER LIST: N/A
	// RETURN TYPE: int[]
	public static int[] getArray() {

		int[] intArray = new int[12];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < intArray.length; i++) {

			try {

				intArray[i] = sc.nextInt();

			} catch (Exception c) {

				JOptionPane.showMessageDialog(null, "Invalid Entry");

			}

		}

		return intArray;

	}

}
