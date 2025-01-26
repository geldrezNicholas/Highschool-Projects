package assignments;

import java.util.Scanner;

public class U2A5_Powers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Variable Declaration
		int choice;
		int number;
		int power;
		int answer;
		
		//Do the code 
		do {
			//Initial prompt
			System.out.println("1. Find the value of a number squared: ");
			System.out.println("2. Find the value of a number cubed: ");
			System.out.println("3. Find the value of a number squared: ");
			System.out.println("4. Exit");
			
			choice = sc.nextInt();
			//Different cases based on the choice the user picks
			switch (choice)  {
				case 1:
					System.out.println("Enter your number: ");
					number = sc.nextInt();
					//Power
					answer = (int) Math.pow(number, 2);
					System.out.println(answer);
					
					break;
				case 2: 
					System.out.println("Enter your number: ");
					number = sc.nextInt();
					//Power
					answer = (int) Math.pow(number, 3);
					System.out.println(answer);
					
					break;
				case 3:
					System.out.println("Enter your base: ");
					number = sc.nextInt();
					System.out.println("Enter your exponent: ");
					power = sc.nextInt();
					//Power
					answer = (int) Math.pow(number, power);
					System.out.println(answer);
					break; 
				default: 
					System.out.println("Exiting...");
					
			}
			//if the choice is not 4 it restarts
		} while (choice != 4);
			
		

	}

}
