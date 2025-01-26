package lessons;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myIntArray = { 39, 42, 73, 88, 12, 1, 24, 21, 13 };

		boolean ascending = true;

		sortHandsOfInts(myIntArray, ascending);
		printIntArray(myIntArray);

		sortHandsOfInts(myIntArray, false);
		printIntArray(myIntArray);
	}

	public static void sortHandsOfInts(int[] a, boolean ascending) {

			for (int i = 1; i < a.length; i++) {

				int j = i;

				while (j > 0) {

					if (ascending == true) {

						while (a[j] < a[j - 1]) {

							swap(a, j, j - 1);

						}
						j--;
					} else {

						while (a[j] > a[j - 1]) {

							swap(a, j, j - 1);

						}
						j--;
					}
				}
			}
		}

	public static void swap(int[] a, int x, int y) {

		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}

	public static void printIntArray(int[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		System.out.println(" ");

	}

}
