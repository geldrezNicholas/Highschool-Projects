package lessons.review;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables 
		
		Scanner sc = new Scanner(System.in);
		
		int numHellos;
		
		System.out.println("Enter number of times to say hello: ");
		
		numHellos = sc.nextInt();
		
		for (int i=0; i<numHellos; i++)  {
			
			System.out.println("Hello!");
		}
		
	}

}
