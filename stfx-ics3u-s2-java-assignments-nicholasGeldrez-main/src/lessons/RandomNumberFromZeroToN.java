package lessons;

public class RandomNumberFromZeroToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generates decimal number, less than 1
		//System.out.println(Math.random());
		
		//Casting double to int will TRUNCATE
		//System.out.println((int)14.732454325435); //Displays 14
		
		// Use variable for n
		//One formula to generate random number from 0 to n
		int n = 3;
		System.out.println((int)(Math.random()*(n+1)));
		
		//One formula to generate random number from 1 to m
		int m = 3;
		System.out.println((int)(Math.random()*m)+1);

	}

}
