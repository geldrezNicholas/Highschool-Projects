package lessons;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int choice;
		
		do {
			
			System.out.println("Menu");
			System.out.println("1. Say Hello.");
			System.out.println("2. Say Goodbye");
			System.out.println("3. Exit");
			System.out.println("Enter Choice: ");
				
			choice = sc.nextInt();
			
			switch (choice)  {
			case 1:
				System.out.println("Hello");
				break;
			case 2: 
				System.out.println("Goodbye!");
				break;
			case 3:
				System.out.println("Exiting...");
				break; 
				
				
			
			
			}
			
		} while (choice !=3);
		
		
		

	}

}
