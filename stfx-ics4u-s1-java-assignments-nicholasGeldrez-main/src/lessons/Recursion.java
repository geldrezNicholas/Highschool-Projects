package lessons;

public class Recursion {

	public static void main(String[] args) {

		// Recursion is a method which calls itself.
		// "pass the buck"
		// Problem is broken down into smaller versions of itself.
		// Results are combined.
		// Infinite case must be prevented with a condition which stops it.

		System.out.println(factorialRecursive(4));

	}

	// DESCRIPTION - Calculates factorial for n>=0
	// returns - 1 (sentinal value) for negative numbers
	// PARAMETERS - int n
	// RETURN TYPE - int
	public static int factorialRecursive(int n) {

		// error case
		if (n < 0) {

			return -1;

		}
		
		// "stop" case - must be included, else infinite recursion
		// this is the smallest problem for the task
		
		else if ((n == 0) || (n == 1)){
			
			return 1;
			
		}
		
		else {
			
			return n * factorialRecursive(n-1);
			
		}

	}

	// DESCRIPTION - Calculates factorial for n>=0
	// returns - 1 (sentinal value) for negative numbers
	// PARAMETERS - int n
	// RETURN TYPE - int
	public static int factorialProcedural(int n) {

		int answer = 1;

		// error case
		if (n < 0) {

			answer = -1;

		}

		if (n == 0) {

			return answer;

		}

		while (n > 0) {

			answer = answer * n--;

		}

		return answer; // temporary

	}

}
