package lessons;

import java.util.Scanner;

// PROGRAM DESCRIPTION:
// Program will ask user for 6 best marks, calculate average, then will
// determine if user meets minimum requirements for a given program
 
public class ModularProgramming {

	public static void main(String[] args) {
		
		// Variables
		final int NUM_MARKS = 6;  // number of grades to calculate, change this value 
								  // to change the number of grades
		
		final int MIN_GRADE = 70; // minimum grade for acceptance, change this value
		                          // to change minimum requirement
		
		int[] grades = new int[NUM_MARKS];
		double average = 0;
		boolean acceptance;
		
		// STEP 1 - get marks from user
		grades = getMarks(NUM_MARKS);

		// STEP 2 - calculate average
		average = calcAvg(grades);
		
		// STEP 3 - determine if minimum requirements met
		acceptance = chckRqrmnts(average, MIN_GRADE);
		
		// STEP 4 - tell user the results
		outputResult(acceptance);
		
	}
	
	
	// DESCRIPTION - obtains marks from user
	// PARAMETERS - int
	// RETURN - int[]
	public static int[] getMarks(int m)  {
		
		Scanner sc = new Scanner(System.in);
		
		int[] userMarks = new int[m];
		
		for (int i=0; i<m; i++)  {
			
			System.out.println("Enter " + (i+1) + " grade: ");
			userMarks[i] = sc.nextInt();
		}
		
		return userMarks;
	}
	
	
	// DESCRIPTION - calculates average from array
	// PARAMETERS - int[]
	// RETURN - double
	public static double calcAvg(int[] mrks)  {
		
		double avg = 0;
		
		for (int i=0; i<mrks.length; i++)  {
			
			avg = avg + mrks[i];
		}
		
		return avg / mrks.length;
	}
	
	
	// DESCRIPTION - returns true if average meets acceptance
	// PARAMETERS - double avrg, double accptnc
	// RETURN - boolean
	public static boolean chckRqrmnts(double avrg, double accptnc)  {
		
		if (avrg >= accptnc)  {
			
			return true;
		}
		
		else  {
		
			return false;
		}
	}
	
	
	// DESCRIPTION - displays acceptance
	// PARAMETERS - boolean
	// RETURN - void
	public static void outputResult(boolean r)  {
		
		if (r == true)  {
			
			System.out.println("Accepted!");
		}
		
		else  {
			
			System.out.println("Not accepted.");
		}
	}
	
}