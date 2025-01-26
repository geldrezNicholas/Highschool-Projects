package assignments;

//import Scanner library
import java.util.Scanner;

public class U1A1_MathProblem {

	public static void main(String[] args) {
	
	//Variable Declaration
	double varDisplacement; //Displacement Given
	double varTime; //Time Given
	double varVelocity; //Calculated Velocity
	
	Scanner sc = new Scanner(System.in);

	//Displacement Prompt
	System.out.println("Enter any displacement in meters: "); 
	varDisplacement = sc.nextDouble();
	
	//Time Prompt
	System.out.println("Enter any time in seconds: ");
	varTime = sc.nextDouble();
	
	//Calculated Velocity
	varVelocity = varDisplacement/varTime;
	System.out.println("The velocity is " + varVelocity + "m/s");
	
	}

}
