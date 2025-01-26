package lessons;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(5));
		System.out.println(fibonacciR(10));

	}

	public static int fibonacciR(int n) {

		if (n < 1)

			return -1;

		else if (n == 1)

			return 0;
		else if (n == 2)

			return 1;
		else

			return fibonacciR(n - 1) + fibonacciR(n - 2);

	}

	public static int fibonacci(int n) {

		// variables
		int first = 0;
		int second = 1;
		int last = 0;

		if (n < 1) {

			return -1;
		}

		else if (n == 1) {

			return first;
		} else if (n == 2) {

			return second;
		} else {
			for (int i = 0; i < (n - 1); i++) {
				last = first + second;
				first = second;
				second = last;

			}
		}

		return last;

	}

}
