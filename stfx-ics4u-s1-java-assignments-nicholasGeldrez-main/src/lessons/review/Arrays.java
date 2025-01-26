package lessons.review;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java arrays use single indexes, beginning with zero.
		// The ELEMENTS of any SINGLE TYPE (primitives, objects).
		// They are NOT dynamic (do not grow after creation).

		// Syntax:
		// datatype[] arrayIdentifier = new datatype[arraySize];

		// examples:
		String[] myStringArray = new String[3];

		double[] myDoubleArray = new double[3];

		int[] myIntArray = new int[3];

		myStringArray[0] = "foo";
		myStringArray[1] = "bar";
		myStringArray[2] = "fubar";

		myDoubleArray[0] = 13.3;
		myDoubleArray[1] = 1.3;
		myDoubleArray[2] = 3.3;
		
		myIntArray[0] = 12;
		myIntArray[1] = 2;
		myIntArray[2] = 5;

		for (int i=0; i<myStringArray.length; i++) {
			
			System.out.println(myStringArray[i]);
			
		}
		
		
	}

}
