package lessons;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer to String
		String myString1 = "";
		int myInteger1 = 13;
		myString1 = Integer.toString(myInteger1);
		System.out.println(myString1);
		/*Cannot do this (mix matching)
		myString1 = myInteger1;
		trying to  achieve the following:
		myString1 = "13";
		*/
		
		//String to Integer
		
		String myString2 = "18";
		int myInteger2;
		myInteger2 = Integer.parseInt(myString2);
		System.out.println(myInteger2);
		
		/*myInteger2 = myString2;
		 Will not work(Mix match)
		*/
		
		
		//Double to String
		String myString3 = "";
		double myDouble1 = 13.3;
		myString3 = Double.toString(myDouble1);
		System.out.println(myString3);
		
		//String to Double
		String myString4 = "6.8";
		double myDouble2;
		myDouble2 = Double.parseDouble(myString4);
		System.out.println(myDouble2);
		
		//Integer to double
		int myInteger3 = 42;
		double myDouble3;
		//explicit cast from integer to double is optional
		//myDouble3 = (double)myInteger3;
		
		//"promotion:
		myDouble3 = myInteger3;
	
		System.out.println(myDouble3);
		
		//Double to integer
		double myDouble4 = 13.3;
		int myInteger4;
		//"demotion":
		myInteger4 = (int)myDouble4;
		System.out.println(myInteger4);
		
		/*
		 * Must explicitly cast from double to int.
		 * This is called a "demotion".
		 * Any decimals are TRUNCATED, not rounded.
		 */
		
		
		
		
		

	}

}
