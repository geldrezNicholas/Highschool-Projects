package lessons;

import java.util.Scanner;

public class IfElseIfElse {

	//Program will determine if grade meets minimum
	//requirement of 75% for entry into program
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Structure looks like this:
		 * 
		 * if (boolean) {
		 * 	//Code block
		 * }
		 * 
		 * else if (boolean) {
		 * 	//Code block
		 * }
		 * 
		 * else {
		 * 	//Code block
		 * }
		 * 
		 * Order of execution is from top-down.
		 * if any condition is true, code block will be executed
		 * and following checks will be skipped.
		 * 
		 */
		
		//Variable declarations
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		final int MIN_GRADE = 75;
		
		System.out.print("Enter your grade: ");
		
		//input
		grade = sc. nextInt();
		
		if (grade < MIN_GRADE) {
			
			System.out.println("You cannot enter the program.");
		}
		
		else if (grade == MIN_GRADE) {
		
		System.out.println("You just got in the program!");
	
		}
		
		else {
			
		System.out.println("You have been accepted with flying colours!");
			
		}
		
	}

}
