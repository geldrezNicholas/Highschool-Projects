package assignments;

import java.util.Scanner;

public class U2A6_Arrays_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner keyedInput = new Scanner (System.in);
        
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
        double total=0;
        double average;
        
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        
        average = total/9;
        
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        System.out.println("The average mark is:");
        System.out.println(average);
        
	}

}
