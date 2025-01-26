package assignments;

public class SwapMethod {

	public static void main(String[] args) {

		// variables 
		int x = 13;
		int y = 7;
		
		int temp = 0;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		int[] array = {13, 7};
		
		swapElements(array, 0, 1);
		
		System.out.println("a: " + array[0]);
		System.out.println("b: " + array[1]);
		
	}
	// DESCRIPTION - swaps array elements x and y
	// PARAMETERS - int[] a, int x, int y
	// RETURN TYPE - void
	public static void swapElements(int[] a, int x, int y) {
		
		int temp = 0;
		
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		
	}

}
