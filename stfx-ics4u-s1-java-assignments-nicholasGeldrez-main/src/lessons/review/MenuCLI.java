package lessons.review;

import java.util.Scanner;

public class MenuCLI {

	public static void main(String[] args) {

		int choice = 0;
		Scanner sc = new Scanner(System.in);
					
		while (choice != 3) {
		System.out.println("CLI Menu Example: ");
		System.out.println("1. Hello World!");
		System.out.println("2. Say fubar");
		System.out.println("3. Exit.");
		System.out.print("Enter your choice: ");
			
		choice = sc.nextInt();	
		
			if (choice == 1) {
				
				System.out.println("Hello World!");
			}
			
			else if (choice == 2) {
				
				System.out.println("Fubar!");
			}
			
			else if (choice == 3) {
				
				System.out.println("Exiting program ...");
			}
			
			else {
				
				System.out.println("Invalid menu option. Try Again!");

				
			}
			
		}
		
	}
	
	

}
