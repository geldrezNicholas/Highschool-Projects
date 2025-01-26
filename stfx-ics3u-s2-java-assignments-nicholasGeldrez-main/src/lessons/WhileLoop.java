package lessons;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);	
		int number = 1;
		int countUpTo = 0;
		
		System.out.println("What would you like the program to count up to: ");
		
		countUpTo = sc.nextInt();
		
		while (number <= countUpTo) {
			System.out.println(number);
			number++;

		
		
		}
		
		
		
	}

}
