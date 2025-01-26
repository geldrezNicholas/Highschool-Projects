package assignments;

import java.util.Scanner;

public class U2A3_ForLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Variable Declaration 
		int choice;
		

		
		System.out.println("---Cool Counting Program---");
		System.out.println("");
		//Initial prompts
		System.out.println("1... Count from 0 to 10 by 1");
		System.out.println("2... Count from 100 to 0 by 10");
		System.out.println("3... Count from 50 to 500 by 50");
		System.out.println("4... Count from 6000 to 1000 by 1000");
		System.out.println("Please enter your choice:");
		
		//Makes sure user picks 1, 2, 3 or, 4
		do {
			choice = sc.nextInt();
		} while (choice != 1 && choice != 2 && choice != 3 && choice != 4);
			//Spaces
			System.out.println("");
			System.out.println("������������������������������������");
		
		
		
		switch (choice) {
			//If user picks 1
			case 1:
				System.out.println("You have chosen to count from 0 to 10 by 1:");
				//for loop
				for (int i = 0; i <= 10; i++)	{
					System.out.println(i);
				}
				//Spaces
				System.out.println("������������������������������������");
				break;
			//If user picks 2
			case 2:
				System.out.println("You have chosen to count from 100 to 0 by 10:");
				//for loop
				for (int i = 100; i >= 0; i -= 10)	{
					System.out.println(i);
				}
				//Spaces
				System.out.println("������������������������������������");
				break;
			//If user picks 3
			case 3:
				System.out.println("You have chosen to count from 50 to 500 by 50:");
				//for loop
				for (int i = 50; i <= 500; i += 50){
					System.out.println(i);
				}
				break;
			//If user picks 4
			default:
				System.out.println("You have chosen to count from 6000 to 1000 by 1000:");
				//for loop
				for (int i = 6000; i >= 1000; i -= 1000)
				{
					System.out.println(i);
				}
				//Spaces
				System.out.println("������������������������������������");
				break;

		
		}
		
		
	}

}
