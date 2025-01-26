package lessons;

public class Arrays {

	public static void main(String[] args) {
	
		//Java Arrays use a single identifier (variable name)
		//Indexed starting at 0 to n-1
		//NOT dynamic, can't grow after creation
		
		//SYNTAX:
		// dataType[] arrayIdentifier = new dataType[arraySize];
		
		// EXAMPLE:
		
		int[] myIntArray = new int[10];
		myIntArray[0] = 10;// adding element to array
		myIntArray[1] = 13;
		myIntArray[2] = 24;
		
		System.out.println(myIntArray[2]); //accessing first element
		System.out.println(myIntArray.length); //size of array
		
		//ArrayIndexOutOfBounds Exception is thrown if you attempt
		// to access an element beyond size of array. Can handle using
		// try-catch block. Program terminates otherwise.
		
		String[] myStringArray = {"dog", "cat", "mouse", "hippopotamus"};
		
		for (int i=0; i<myStringArray.length; i++) {
			
			System.out.println(myStringArray[i]); 
			
		}
		
	}

}
