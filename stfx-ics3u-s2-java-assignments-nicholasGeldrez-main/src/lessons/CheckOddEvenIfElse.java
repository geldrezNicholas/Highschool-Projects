package lessons;

import java.util.Scanner;

public class CheckOddEvenIfElse {

	//Program checks if number is odd or even
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
				
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		if ( (number % 2) == 0)
			
			System.out.println("Number is even.");
		
		else {
			
			System.out.println("Number is odd.");
			
		}
		

	}

}
