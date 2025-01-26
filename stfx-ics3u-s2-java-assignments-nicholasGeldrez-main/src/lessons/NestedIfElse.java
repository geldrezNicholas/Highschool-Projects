package lessons;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A nested if-else statement is an if-else statement
		//inside of another if-else statement. Must be indented appropriately
		
		//Variable Declarations
		Scanner sc = new Scanner (System.in);
		String foodChoice = "";
		String meatChoice = "";
		String vegChoice = "";
		
		//Menu and input
		System.out.println("Food Meny:");
		System.out.println("Do you eat Meat (M), or are you a Vegetarian (V)");
		
		//Assume use enters "K" or "V" (no error checking for this lesson"
		foodChoice =  sc.next();
		
		//Processing
		
		// They picked meat
		if (foodChoice.equals("M")) {
			
			System.out.println("Chicken (C) or Fish (F)?");
			meatChoice = sc.next();
			
			//This is a nested if/else
			if(meatChoice.equals("C")) {
				
				System.out.println("KFC it is!");
			}
			
			else {
				
				System.out.println("Fillet-O-Fish it is!");
				
			}
			
		}
		
		//They picked vegetarian
		else {
			
			System.out.println("Tofu will be served!");
			
			
		}
		
	}
	

}
