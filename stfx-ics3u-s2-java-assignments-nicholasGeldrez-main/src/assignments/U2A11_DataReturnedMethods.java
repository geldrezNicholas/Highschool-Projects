package assignments;

import java.util.Scanner;

public class U2A11_DataReturnedMethods {

	public static void main(String[] args) {
				
			int userInput = 0;
			double x;
			double y;
			
			Scanner sc = new Scanner(System.in); 
				
			do {
			System.out.println("Choose options 1 to 10");
			System.out.println("1. Calculating Perimeter of Rectangle.");
			System.out.println("2. Finding Average of Two Numbers");
			System.out.println("3. Finding Speed of an Object.");
			System.out.println("4. Finding the Area of a triangle");
			System.out.println("5. Finding the volume of a square.");
			System.out.println("6. Finding the Hypotneuse of a triangle.");
			System.out.println("7. Finding the Square Root of a Number.");
			System.out.println("8. Finding the smallest number out of two.");
			System.out.println("9. Finding the largest number out of two.");
			System.out.println("10. Finding the result of a number squared.");
			
				
			userInput = sc.nextInt();
				
			} while (userInput > 10 || userInput < 1);
				
			if (userInput == 1) {
					
				System.out.println("Enter 1st side length");
				x = sc.nextDouble();
				System.out.println("Enter 2nd side length");
				y = sc.nextDouble();
					
				System.out.println(perimeterOfRectangle(x, y));
					
			}
				
			else if (userInput == 2) {
					
				System.out.println("Enter 1st number");
				x = sc.nextDouble();
				System.out.println("Enter 2nd number");
				y = sc.nextDouble();
					
				System.out.println(calculateAverageOfTwoNumbers(x, y));
					
			}
				
				
			else if (userInput == 3) {
					
				System.out.println("Enter your distance");
				x = sc.nextDouble();
				System.out.println("Enter your time");
				y = sc.nextDouble();
				
				System.out.println(findingSpeed(x, y));
					
					
			}
				
			else if (userInput == 4) {
					
				System.out.println("Enter base");
				x = sc.nextDouble();
				System.out.println("Enter height");
				y = sc.nextDouble();
					
				System.out.println(findingAreaOfTriangle(x, y));
					
			}
				
			else if (userInput == 5) {
					
				System.out.println("Enter side length.");
				x = sc.nextDouble();
					
				System.out.println(volumeOfSquare(x));
					
			}
			
			else if (userInput == 6) {
				
				System.out.println("Enter side length 1:");
				x = sc.nextDouble();
				System.out.println("Enter side length 2:");
				y = sc.nextDouble();
					
				System.out.println(findingHypotenuse(x, y));
					
			}
			
			else if (userInput == 7) {
				
				System.out.println("Enter your number");
				x = sc.nextDouble();
					
				System.out.println(findingSquareRoot(x));
					
			}
			
			else if (userInput == 8) {
				
				System.out.println("Enter 1st number");
				x = sc.nextDouble();
				System.out.println("Enter 2nd number");
				y = sc.nextDouble();
					
				System.out.println(findingSmallest(x, y));
					
			}
			
			else if (userInput == 9) {
				
				System.out.println("Enter 1st number");
				x = sc.nextDouble();
				System.out.println("Enter 2nd number");
				y = sc.nextDouble();
					
				System.out.println(findingLargest(x, y));
					
			}
			
			else if (userInput == 10) {
				
				System.out.println("Enter your number");
				x = sc.nextDouble();
					
				System.out.println(findingSquaredOfNumber(x));
					
			}

		}
			
		/* DESCRIPTION: Calculate the perimeter of a rectangle
		 * PAREMETER LIST: double, double
		 * RETURN TYPE: double
		*/
		public static double perimeterOfRectangle (double x, double y) {
			
			double ans;
			
			ans = 2*x + 2*y;
			
			return ans;
				
		}
			
		/* DESCRIPTION: Calculate the average of two numbers
		* PAREMETER LIST: double, double
		 * RETURN TYPE: double
		*/
		public static double calculateAverageOfTwoNumbers (double x, double y) {
			
			double ans;
			
			final double DIVIDER = 2;
			
			ans = (x+y)/DIVIDER;	
			
			return ans;
				
		}
			
		/* DESCRIPTION: Calculating speed given time and distance
		 * PAREMETER LIST: double, double
		 * RETURN TYPE: double
		*/
		public static double findingSpeed (double x, double y) {
				
			double ans;
			
			ans = (x/y);
			
			return ans;
				
		}
			
		/* DESCRIPTION: Calculating the area of a triangle
		 * PAREMETER LIST: double, double
		 * RETURN TYPE: double
		*/
		public static double findingAreaOfTriangle (double x, double y) {
				
			double ans;
			
			final double DIVIDER = 2;
			
			ans = ((x*y)/DIVIDER);
				
			return ans;
				
		}

		/* DESCRIPTION: Calculating the volume of a square
		 * PAREMETER LIST: double
		 * RETURN TYPE: double
		*/
		public static double volumeOfSquare (double x) {
				
			double ans;
			
			ans = (x*x*x);
			
			return ans;
				
		}

		/* DESCRIPTION: Finding the hypotenuse of a triangle
		 * PAREMETER LIST: double, double
		 * RETURN TYPE: double
		*/
		public static double findingHypotenuse (double x, double y) {
				
			double ans;
			
			ans = Math.hypot(x, y);
			
			return ans;
				
		}
		
		/* DESCRIPTION: Finding the square root of a number
		 * PAREMETER LIST: double
		 * RETURN TYPE: double
		*/
		public static double findingSquareRoot (double x) {
				
			double ans;
			
			ans = Math.sqrt(x);
			
			return ans;
				
		}
			
		/* DESCRIPTION: Finding the smallest given two numbers
		 * PAREMETER LIST: double, double
		 * RETURN TYPE: double
		*/
		public static double findingSmallest (double x, double y) {
				
			double ans;
			
			ans = Math.min(x, y);
			
			return ans;
				
		}
		
		/* DESCRIPTION: Finding the largest given two numbers
		 * PAREMETER LIST: double, double
		 * RETURN TYPE: double
		*/
		public static double findingLargest (double x, double y) {
				
			double ans;
			
			ans = Math.max(x, y);
			
			return ans;
				
		}
		
		/* DESCRIPTION: Finding the result of a squared number
		 * PAREMETER LIST: double
		 * RETURN TYPE: double
		*/
		public static double findingSquaredOfNumber (double x) {
				
			double ans;
			
			ans = Math.pow(x, 2);
			
			return ans;
				
		}
			
	

	

	}


