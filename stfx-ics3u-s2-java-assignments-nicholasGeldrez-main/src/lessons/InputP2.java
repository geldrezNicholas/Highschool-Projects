package lessons;

//import Scanner library for user input
import java.util.Scanner;

public class InputP2 {
	
	public static void main(String[] args) {
		
		int myInteger;
		//creating a scanner object called "sc" for user input
		Scanner sc = new Scanner(System.in);	
	
		System.out.println("Enter any integer: ");
		
		//get use input
		myInteger = sc.nextInt();
		
		//print out
		System.out.println("The value entered was: " + myInteger);
	}
	
	
	
}
