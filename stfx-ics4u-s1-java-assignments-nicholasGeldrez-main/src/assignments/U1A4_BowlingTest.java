package assignments;

import java.util.Scanner;

public class U1A4_BowlingTest {

	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// create new instance of U1A4_Bowling using default constructor
		U1A4_Bowling u  = new U1A4_Bowling(); 
		
		// prompt
		System.out.println("Hello! Hope you have some good fun on the bowling alley!");
		System.out.println("\n");
		System.out.println("You get 10 frames with each frame having two rolls! Goodluck!");
		
		// for loop for every frame
		for (int i = 0; i != 10; i++) {
			
			System.out.println("\n");
			
			System.out.println("Enter anything to play!");
			
			sc.next();
	
			u.roll();
			
		}
		
	}
	
}
