
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6, 3, 1, 4, 0, 5, 2, 7};

		boolean shloka = true;

		while (shloka = true) {

			shloka = false;

			// code to keep passing, comparing and swapping

			for (int i = 0; i < myArray.length - 2; i++) {

				if (myArray[i] > myArray[i + 1]) {

					swap(myArray, myArray[i], myArray[i + 1]);
					shloka = true;

				}

			}

		}
		for (int i = 0; i < myArray.length; i++) {

			System.out.print(myArray[i] + " ");

		}
	}

	public static void swap(int[] a, int x, int y) {

		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}

}
