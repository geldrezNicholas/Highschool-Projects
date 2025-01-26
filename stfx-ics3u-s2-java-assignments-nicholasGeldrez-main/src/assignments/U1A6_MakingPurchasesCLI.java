package assignments;

//import Scanner
import java.util.Scanner;
public class U1A6_MakingPurchasesCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable Declaration
		final double LEMON = 1.99;
		final double BLUEBERRY = 1.79;
		final double RASPBERRY = 1.99;
		final double LIME = 1.79;
		final double BANANA = 2.29;
		int lemonAmount = 0;
		int blueberryAmount = 0;
		int raspberryAmount = 0;
		int limeAmount = 0;
		int bananaAmount = 0;
		double subTotal = 0;
		double grandTotal = 0;
		double taxTotal = 0;
		final double Taxes = 0.13;

		//Scanner
		Scanner sc = new Scanner(System.in); 

		//Initial Prompt
		System.out.println("Welcome to Nicholas' Macaroon Shop");
		System.out.println("We sell all sorts of Macaroons!");
		System.out.println("Lemon Macaroons for $1.99");
		System.out.println("Blueberry Macaroons for $1.79");
		System.out.println("Raspberry Macaroons for $1.99");
		System.out.println("Lime Macaroons for $1.79");
		System.out.println("Banana Macaroons for $2.29");
		System.out.println("+Tax!");
		
		//Asks how many cakes from each section
		System.out.println("How many Lemon Macaroons would you like?");
		lemonAmount = sc.nextInt();
		
		System.out.println("How many Blueberry Macaroons would you like?");
		blueberryAmount = sc.nextInt();
		
		System.out.println("How many Raspberry Macaroons would you like?");
		raspberryAmount = sc.nextInt();
		
		System.out.println("How many Lime Macaroons would you like?");
		limeAmount = sc.nextInt();
		
		System.out.println("How many Banana Macaroons would you like?");
		bananaAmount = sc.nextInt();
		
		//Sub Total Calculations
		subTotal = (lemonAmount*LEMON) + (blueberryAmount*BLUEBERRY) + (raspberryAmount*RASPBERRY) + (limeAmount*LIME) + (bananaAmount*BANANA);
		subTotal = subTotal*100;
		subTotal = Math.round(subTotal);
		subTotal = subTotal/100;
		
		//Tax Total Calculations
		taxTotal = subTotal*Taxes;
		taxTotal = taxTotal*100;
		taxTotal = Math.round(taxTotal);
		taxTotal = taxTotal/100;
		
		//Grand Total Calculations
		grandTotal = subTotal+taxTotal;
		grandTotal = grandTotal*100;
		grandTotal = Math.round(grandTotal);
		grandTotal = grandTotal/100;
		
		//Calculations in console
		System.out.println("Your Sub Total is: $" + subTotal);
		System.out.println("Your Tax Total is: $" + taxTotal);
		System.out.println("Your Grand Total is: $" + grandTotal);

		
	}

}
