package assignments;

//import Scanner
import java.util.Scanner;

public class U1A5_AverageCalculatorCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variable Declaration
		double CM1;
		double CM2;
		double CM3;
		double CM4;
		double CA;
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Initial Prompt
		System.out.println("Enter in your four course marks");
		
		//mark 1
		System.out.println("Mark #1");
		CM1 = sc.nextDouble();
		
		//mark 2
		System.out.println("Mark #2");
		CM2 = sc.nextDouble();
		
		//mark 3
		System.out.println("Mark #3");
		CM3 = sc.nextDouble();
		
		//mark 4
		System.out.println("Mark #4");
		CM4 = sc.nextDouble();
		
		//Calculations
		CA = (CM1 + CM2 + CM3 + CM4)/4;
		CA = Math.round(CA);
		System.out.println("Your mark average mark is: " + CA + "!");
		
	}

}
