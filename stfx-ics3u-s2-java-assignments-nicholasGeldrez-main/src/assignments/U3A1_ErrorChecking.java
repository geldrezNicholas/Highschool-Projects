package assignments;

import java.util.Scanner;
public class U3A1_ErrorChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variable Declaration
		String userInput1 = "";
		int userInput2 = 0;
		boolean a = false;
		boolean redo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("In this game you must complete the first level to go on to the next");

		do {
			
			System.out.println("Enter a string that contains more than 6 characters");

			userInput1 = sc.nextLine();
			
			a = levelOne(userInput1);
		
			
		} while (a == false);
		
		System.out.println("Proceeding to level 2...");
		
		do {
			
			System.out.println("Enter a string that contains at least one lowercase 'a'");

			userInput1 = sc.nextLine();
			
			a = levelTwo(userInput1);
		
			
		} while (a == false);
	
		System.out.println("Proceeding to level 3...");
		
		do {
			
			System.out.println("Enter a string that is between 5 and 15 characters long, and does not contain the letter 'z'");
	
			userInput1 = sc.nextLine();
			
			a = levelThree(userInput1);
		
			
		} while (a == false);
		
		System.out.println("Proceeding to level 4...");
		
		do {
			
			System.out.println("Enter an integer between 5 and 500");
		
			do {
			
				redo = false;
				userInput1 = sc.nextLine();
			
				try {
					
					userInput2 = Integer.parseInt(userInput1);
					
				}
				
				catch (Exception e) {
					
					System.out.println("Enter an integer between 5 and 500");
					redo = true;
					
				}
				
			} while (redo);
					
			a = levelFour(userInput2);
		
			
		} while (a == false);
		
	
		
		System.out.println("Proceeding to level 5...");
		
		do {
			
			System.out.println("Enter a negative integer.");
	
			do {
				
				redo = false;
				userInput1 = sc.nextLine();
			
				try {
					
					userInput2 = Integer.parseInt(userInput1);
					
				}
				
				catch (Exception e) {
					
					System.out.println("Enter a negative integer.");
					redo = true;
					
				}
				
			} while (redo);
			
			a = levelFive(userInput2);
		
			
		} while (a == false);
		
		System.out.println("Proceeding to level 6...");
		
		do {
			
			System.out.println("Enter a positive, odd integer.");
	
			do {
				
				redo = false;
				userInput1 = sc.nextLine();
			
				try {
					
					userInput2 = Integer.parseInt(userInput1);
					
				}
				
				catch (Exception e) {
					
					System.out.println("Enter a positive, odd integer.");
					redo = true;
					
				}
				
			} while (redo);
			
			a = levelSix(userInput2);
		
			
		} while (a == false);
	
		System.out.println("Congratulations you have won!");
}
		
		// DESCRIPTION - determines length of string
		// PARAMETERS - string
		// RETURN - boolean
		public static boolean levelOne(String c) {
			
			if (c.length() > 6) {
				
				return true;
			}
			
			return false;

		}
		
		// DESCRIPTION - determines if string contains a lowercase a
		// PARAMETERS - string
		// RETURN - boolean
		public static boolean levelTwo(String c) {
			
			if (c.contains("a")) {
				
				return true;
			}
			
			return false;

		}
		
		// DESCRIPTION - determines if string contains the letter Zz and if it is in between 5 and 15 inclusive
		// PARAMETERS - string
		// RETURN - boolean
		public static boolean levelThree(String c) {

			if (c.contains("z") || c.contains("Z")) {
				
				return false;
				
			}
			
			if (c.length() > 4 && c.length() < 16) {
				
				return true;
			}
			
			return false;

		}
			
		// DESCRIPTION - determines whether the integer is between 5 and 500 inclusive
		// PARAMETERS - int
		// RETURN - boolean
		public static boolean levelFour(int c) {
			
			if (c > 4 && c < 501) {
				
				return true;
			}
		
			
			return false;

		}
		
		// DESCRIPTION - determines whether the integer is negative
		// PARAMETERS - int
		// RETURN - boolean
		public static boolean levelFive(int c) {
			
			if (c < 0) {
				
				return true;
			}
		
			return false;

		}
		
		// DESCRIPTION - determines whether the integer is positive and odd
		// PARAMETERS - int
		// RETURN - boolean
		public static boolean levelSix(int c) {
			
			if (c > 0 && (c % 2) == 1) {
				
				return true;
			}
			
		
			return false;

		}
			 
		
		
	
	
	

}
