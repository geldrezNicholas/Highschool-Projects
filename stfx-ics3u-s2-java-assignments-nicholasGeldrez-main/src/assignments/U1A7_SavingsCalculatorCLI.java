package assignments;

import java.util.Scanner;

public class U1A7_SavingsCalculatorCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable Declaration
		final double PER1 = 0.10;
		final double PER2 = 0.20;
		final double PER3 = 0.30;
		final double PER4 = 0.40;
		double amountSpent = 0;
		double grandTotal = 0;
		double amountSaving = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter the amount spent: ");
		amountSpent = sc.nextDouble();
		
		if ( amountSpent <= 0 ) {
			
			System.out.println("This is not a valid amount.");
				
		}
		
		
		
		else if ( 0.01 <= amountSpent && amountSpent <= 40.00) {
			
			amountSaving = amountSpent*PER1;
			grandTotal = amountSpent - amountSaving;
		
			System.out.println("You spent: $" + String.format("%.2f", amountSpent));
			System.out.println("You are saving: " + PER1*100 + "%");
			System.out.println("You are saving: $" + String.format("%.2f", amountSaving));
			System.out.println("Your grand total is: $" + String.format("%.2f", grandTotal));
		}
			
		else if ( 40.01 <= amountSpent && amountSpent <= 80.00) {
					
			amountSaving = amountSpent*PER2;
			grandTotal = amountSpent - amountSaving;		
							
			System.out.println("You spent: $" + String.format("%.2f", amountSpent));
			System.out.println("You are saving: " + PER2*100 + "%");
			System.out.println("You are saving: $" + String.format("%.2f", amountSaving));
			System.out.println("Your grand total is: $" + String.format("%.2f", grandTotal));
		}

		else if ( 80.01 <= amountSpent && amountSpent <= 120.00) {
			
			amountSaving = amountSpent*PER3;
			grandTotal = amountSpent - amountSaving;
			
			System.out.println("You spent: $" + String.format("%.2f", amountSpent));
			System.out.println("You are saving: " + PER3*100 + "%");
			System.out.println("You are saving: $" + String.format("%.2f", amountSaving));
			System.out.println("Your grand total is: $" + String.format("%.2f", grandTotal));
		}

		else {
			
			amountSaving = amountSpent*PER4;
			grandTotal = amountSpent - amountSaving;
			
			System.out.println("You spent: $" + String.format("%.2f", amountSpent));
			System.out.println("You are saving: " + PER4*100 + "%");
			System.out.println("You are saving: $" + String.format("%.2f", amountSaving));
			System.out.println("Your grand total is: $" + String.format("%.2f", grandTotal));
		}
		

	}

}
