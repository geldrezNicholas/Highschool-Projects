package assignments;

import java.util.Scanner;

public class U2A10_VoidMethods {

	public static void main(String[] args) {
		
		int userInput = 0;
		double x;
		double y;
		double x2;
		double y2;
		double x3;
		double y3;
		double x4;
		double y4;
		double x5;
		
		Scanner sc = new Scanner(System.in); 
		
		do {
		System.out.println("Choose options 1 to 5");
		System.out.println("1. Calculating Perimeter of Rectangle.");
		System.out.println("2. Finding Average of Two Numbers");
		System.out.println("3. Finding Speed of an Object.");
		System.out.println("4. Finding the Area of a triangle");
		System.out.println("5. Finding the volume of a square.");
		
		userInput = sc.nextInt();
		
		} while (userInput > 5 || userInput < 1);
		
		if (userInput == 1) {
			
			System.out.println("Enter 1 side length and then another.");
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			perimeterOfRectangle(x, y);
			
		}
		
		else if (userInput == 2) {
			
			System.out.println("Enter 1 number and then another.");
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			
			calculateAverageOfTwoNumbers(x2, y2);
			
		}
		
		
		else if (userInput == 3) {
			
			System.out.println("Enter your distance and then your time.");
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			
			findingSpeed(x3, y3);
			
			
		}
		
		else if (userInput == 4) {
			
			System.out.println("Enter base and then your height.");
			x4 = sc.nextDouble();
			y4 = sc.nextDouble();
			
			findingAreaOfTriangle(x4, y4);
			
		}
		
		else if (userInput == 5) {
			
			System.out.println("Enter side length.");
			x5 = sc.nextDouble();
			
			volumeOfSquare(x5);
			
		}

	}
	
	/* DESCRIPTION: Calculate the perimeter of a rectangle
	 * PAREMETER LIST: double, double
	 * RETURN TYPE: void
	*/
	public static void perimeterOfRectangle (double x, double y) {
		
		
		
		System.out.println(2*x + 2*y);
		
	}
	
	/* DESCRIPTION: Calculate the average of two numbers
	 * PAREMETER LIST: double, double
	 * RETURN TYPE: void
	*/
	public static void calculateAverageOfTwoNumbers (double x2, double y2) {
		
		final double DIVIDER = 2;
		
		System.out.println((x2+y2)/DIVIDER);
		
	}
	
	/* DESCRIPTION: Calculating speed given time and distance
	 * PAREMETER LIST: double, double
	 * RETURN TYPE: void
	*/
	public static void findingSpeed (double x3, double y3) {
		
		
		
		System.out.println(x3/y3);
		
	}
	
	/* DESCRIPTION: Calculating the area of a triangle
	 * PAREMETER LIST: double, double
	 * RETURN TYPE: void
	*/
	public static void findingAreaOfTriangle (double x4, double y4) {
		
		final double DIVIDER = 2;
		
		System.out.println((x4*y4)/DIVIDER);
		
	}

	/* DESCRIPTION: Calculating the volume of a square
	 * PAREMETER LIST: double
	 * RETURN TYPE: void
	*/
	public static void volumeOfSquare (double x5) {
		
		System.out.println(x5*x5*x5);
		
	}

	
	
}
