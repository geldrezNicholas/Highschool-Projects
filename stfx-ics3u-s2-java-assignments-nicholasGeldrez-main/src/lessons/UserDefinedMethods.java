package lessons;

// Methods are sometimes called subroutines, modules or functions

public class UserDefinedMethods {

	// Main Method
	public static void main(String[] args) {
		
		printHello("Jude");
		
		int myInteger = 7;
		addTwoIntegers(13, myInteger);
		//Must print, assign to variable or use in calculation
		
		
		// EXAMPLE OF PRINTING
		System.out.println(addTwoIntegers(3, 4));
		
		// EXAMPLE OF ASSIGNING TO VARIABLE:
		int mySum = addTwoIntegers(5, 7);
		System.out.println("mySum = " + mySum);
		
		// EXAMPLE OF USING IN CALCULATIONS
		int mySumOfThreeIntegers = addTwoIntegers (4, 8) + 2;
		System.out.println("mySumOfThreeIntegers = " + mySumOfThreeIntegers);
		
	}

	
	// Methods are inside the class and outside the main method.
	// Can be above or below main()
	// Methods should be documented in the header:
	
	// DESCRIPTION:
	// PARAMETER LIST:
	// RETURN TYPE:
	
	
	// 							or
	
	/* DESCRIPTION:
	 * PAREMETER LIST:
	 * RETURN TYPE:
	 */
	
	
	// There are 2 types of methods
	// a) "Procedure" doesn't mean return data
	// b) "Function" returns data
	
	// EXAMPLE 1 - "procedure"
	
	/* DESCRIPTION: Prints hello with name provided.
	 * PAREMETER LIST: String
	 * RETURN TYPE: void
	*/
	public static void printHello(String n) {
		
		System.out.println("Hello " + n);
		
	}
	
	// public - permission of methods visible from anywhere
	// 			inside file and package
	// static - don't have to create instance of class to use method
	//		  - always make methods static for ICS3C
	// void   - return type means no data is returned
	// 		  - this usually means that the method prints only
	// printHello - method name, follow camelCase convention
	//    		  - make a name as descriptive as possible
	// String n - short/descriptive name for parameter
	// 			- parameter will only be visible inside method
	// 			- this is referred to as the "scope" of variable
	
	// EXAMPLE 2 - "function"
	//           - ** only 1 return statement allowed **
	
	/* DESCRIPTION: Returns sum of 2 integers
	 * PAREMETER LIST: int, int
	 * RETURN TYPE: int
	*/
	public static int addTwoIntegers (int x, int y) {
		
		return x + y;
		
	}
	
	
}

