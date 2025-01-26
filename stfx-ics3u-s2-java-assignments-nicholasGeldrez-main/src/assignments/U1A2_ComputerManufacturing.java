package assignments;

//import Scanner
import java.util.Scanner;

public class U1A2_ComputerManufacturing {

	public static void main(String[] args) {
		
		//Variable Declaration
		int totalComputer; //Amount of computer person has
		final double WaterPerComp = 1.5; //Water it takes to make 1 computer
		double totalWater; //Water used to make amount totalComputer
		
		Scanner sc = new Scanner(System.in);
		
		//Initial Prompt
		System.out.println("Did you know it takes 1.5 tons of water to manufacture one computer?");
		
		//Where they enter amount of computers
		System.out.println("Enter how many computers you own: ");
		totalComputer = sc.nextInt();
		
		//Calculation to calculate amount of water used
		totalWater = totalComputer*WaterPerComp;
		System.out.println("It took " + totalWater + " tons to manufacture your computers.");
		
	}

}
