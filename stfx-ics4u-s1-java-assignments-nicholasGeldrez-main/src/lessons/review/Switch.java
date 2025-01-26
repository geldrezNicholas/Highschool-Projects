package lessons.review;

public class Switch {

	public static void main(String[] args) {
		
		int number = 13;

		switch (number) {

		case 1:
			System.out.println("Case 1 matched!");
			break; // USED TO AVOID "SWITCH FALL-THROUGH"

		case 2:
			System.out.println("Case 2 matched!");
			break;

		case 3:
			System.out.println("Case 3 matched!");
			break;

		default:
			System.out.println("Default case!");

		}

		System.out.println("End of switch demonstration.");

	}

}
