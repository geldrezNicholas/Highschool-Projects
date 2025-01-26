package lessons;

public class AndOrOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && - "and" operator
		// || - "or" operator
		
		//Both comparisons must be true for
		//Comparison to be true
		if (10 > 100 && 10 > 2) {
			
			System.out.println("Hello World!");
			
		}
		
		//One or both comparisons must be true for
		//Comparison to be true
		if (10 > 100 || 10 > 200) {
			
			System.out.println("Goodbye World!");
			
		}

	}

}
