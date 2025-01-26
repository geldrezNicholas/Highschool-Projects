package lessons;

import java.util.Scanner;

public class IfElse {

	//Program will determine if user is old enough to drive
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable Declarations
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		//Input
		System.out.println("Enter your age: ");
		
		age = sc.nextInt();
		
		// if (age <= 15) the same but arguably harder to read
		
		if (age < 16) {
			
			System.out.println("You're too young to drive.");
			
		}
		
		else {
			System.out.println("You're old enough to drive.");
		}
		
		
	}

}
