package lessons.review;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  variables
		
		Scanner sc = new Scanner(System.in);
		
		int myInt = 0;
		
		// input
		System.out.println("Enter an Integer: ");
		

		try {
			
			myInt = sc.nextInt();

			
		} catch (Exception e) {
			
			System.out.println("Hello World!");
			
		}
		
		// output
		
		System.out.println("You eneterd: " + myInt);
		
		
	}

}
