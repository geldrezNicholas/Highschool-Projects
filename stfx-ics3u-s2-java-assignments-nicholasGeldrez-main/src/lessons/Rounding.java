package lessons;

public class Rounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price = 19.983;
		
		//Step 1 - move decimal to right of position you wish to round
		price = price * 100;
		
		//Step 2 - round to nearest integer
		price = Math.round(price);
		
		//Step 3 - move decimal back to original position
		price = price / 100;
		
		System.out.println(price);
		
	}

}
