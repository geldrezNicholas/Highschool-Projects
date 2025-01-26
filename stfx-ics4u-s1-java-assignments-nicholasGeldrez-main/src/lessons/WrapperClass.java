package lessons;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * primitive WRAPPER CLASS byte Byte short Short int Integer long Long float
		 * Double double Double char Character boolean Boolean
		 */

		int age = 17; // primitive variable
		Integer age2 = 16; // Object variable (integer)

		// AutoBoxing and Unboxing
		// Java performs automatic conversion of primitives to their wrapper classes
		// and vice versa:

		Double score = 18.58; // converting double to Double "boxing"
		double score2 = score; // converting Double to double "unboxing"

		// CONCLUSION
		// Wrapper classes allow ArrayLists to store primitive values

		// STATIC CLASSES
		// All wrapper classes are "static".
		// This means you don't have to create an instance of that class
		// to use their methods.
		// use their methods. Examples include:

		Integer.parseInt("13");
		Double.parseDouble("34.2");
		System.out.println(Math.PI);
		
		Math fubar = null;
		
		System.out.println(fubar.PI);

	}

}
