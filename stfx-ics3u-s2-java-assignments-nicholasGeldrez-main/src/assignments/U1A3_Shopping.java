package assignments;

//input Scanner
import java.util.Scanner;

public class U1A3_Shopping {

	public static void main(String[] args) {
		//Variable Declaration
		final double PRCUSB = 19.99;
		final double PRCKYB = 49.99;
		final double PRCMS = 25.99;
		int varUSB;
		int varKeyboard;
		int varMouse;
		double varTotal;
		
		Scanner sc = new Scanner(System.in);
		
		//Initial Message
		System.out.println("Hi! Welcome to the Tech Shop!");
		System.out.println("We sell USB's, keyboards, and mice!");
		
		//USB
		System.out.println("How many USBs would you like to buy?");
		varUSB = sc.nextInt();

		//Keyboard
		System.out.println("How many keyboards would you like to buy?");
		varKeyboard = sc.nextInt();
		
		//Mice
		System.out.println("How many mice would you like to buy?");
		varMouse = sc.nextInt();
		
		//Calculation for total price
		varTotal = varUSB*PRCUSB + varKeyboard*PRCKYB + varMouse*PRCMS;
		System.out.println("Your total comes out to " + varTotal + " dollars!");
		
		
		

	}

}
