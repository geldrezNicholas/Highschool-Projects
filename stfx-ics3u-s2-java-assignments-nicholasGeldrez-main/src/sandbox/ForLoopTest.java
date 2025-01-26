package sandbox;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  // Create the scanner object to read input from the user

        Scanner keyedInput = new Scanner(System.in);

        // Declare variables        

        int endVal;

        // Get end value from user

        System.out.println("Please enter an ending value:");
        endVal = keyedInput.nextInt();

        System.out.println("----------------");

        // Print values from 1 until end value, one per line

        for (int i = 1; i <= endVal; i = i + 1)
        {
            System.out.println(i);
        }
		
	}

}
