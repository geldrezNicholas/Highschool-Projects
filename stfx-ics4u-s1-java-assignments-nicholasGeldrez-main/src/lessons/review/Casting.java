package lessons.review;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int to String
		String myString1 = "";
		int myInteger1 = 13;
				
		myString1 = Integer.toString(myInteger1);
		System.out.println(myInteger1);
		
		
		// String to int
		
		String myString2 = "17"; // String must resolve to an integer
		int myInteger2;			 // or java runtime exception error
		myInteger2 = Integer.parseInt(myString2);
		System.out.println(myString2);

		// double to String
		String myString3 = "";
		double myDouble1 = 13.3;
		myString3 = Double.toString(myDouble1);
		System.out.println(myString3);

		// String to double
		
		String myString4 = "6.8";
		double myDouble2;
		myDouble2 = Double.parseDouble(myString4);
		System.out.println(myDouble2);
		
		// Integer to Double
		int myInteger3 = 43;
		double myDouble3 = (double)myInteger3;
		System.out.println(myDouble3);

		// Double to Integer
		double myDouble4 = 13.3;
		int myInteger4 = (int)myDouble4;
		System.out.println(myInteger4);
		
	}

}
 