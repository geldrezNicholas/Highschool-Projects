package assignments;

import java.util.Scanner;

public class U2A6_Arrays_2 {

	public static void main(String[] args) {
		
        Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5];
        
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The second, third, fourth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);  
        System.out.println("Fourth: " + friends[3]);  
		

	}

}
