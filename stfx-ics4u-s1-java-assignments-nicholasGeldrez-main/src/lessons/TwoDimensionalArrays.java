package lessons;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array of arrays
		// like a spreadsheet (rows and columns)
		// 2 identifiers, first is "rows", second is "columns"

		/*
		 * SYNTAX: dataType[][] arrayIdentifier = new dataType[rowSize][columnSize];
		 */

		// Examples
		
		String[][] myStringArray = new String[3][3];
		int[][] myIntegerArray = new int[7][7];
		Employee[][] myEmployeeArray = new Employee[4][4];
		
		// Alternative method to create 2-D Array in 2 steps:
		// May use this method in Object Oriented Programming
		double[][] myDoubleArray;
		myDoubleArray = new double[3][3];
		
		myDoubleArray[0][0] = 17.1;
		myDoubleArray[1][0] = 12.1;
		myDoubleArray[2][0] = 13.1;
		myDoubleArray[0][1] = 5.1;
		myDoubleArray[1][1] = -5.1;
		myDoubleArray[2][1] = 10.1;
		myDoubleArray[0][2] = 6.1;
		myDoubleArray[1][2] = 7.1;
		myDoubleArray[2][2] = 8.1;
		
		// To access contents of 2D Array:
		//System.out.println(myDoubleArray[1][1]);
		
		
		
		
		for (int i = 0; i < myDoubleArray.length; i++) {
			
			for (int j = 0; j < myDoubleArray[0].length; j++) {
			
			System.out.println(myDoubleArray[j][i]);
			
			}
			
		}
		
		System.out.println("\n");
		
		for (int k = 2; k >= 0; k = k-1) {
			
			for (int l = 2; l >= 0; l = l-1) {
			
			System.out.println(myDoubleArray[l][k]);
			
			}
			
		}
		
	}

}
