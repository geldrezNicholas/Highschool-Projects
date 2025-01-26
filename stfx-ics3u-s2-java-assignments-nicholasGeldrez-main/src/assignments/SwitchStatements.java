package assignments;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Switch Statements are an alternative to if/else statements
		
		int userChoice = 4;
		
		switch(userChoice)  {
		
			case 1:
				System.out.println("You entered 1!");
				break;
				
			case 2:
				System.out.println("You entered 2");
				break;
				
			case 3:
				System.out.println("You entered 3");
				break;
			
			default:
				System.out.println("Invalid Entry");
		
		}
		
		String userChoice2 = "A";
		
		switch(userChoice2)  {
		
			case "A", "a":
				System.out.println("You entered A or a");
				break;
				
			case "B", "b":
				System.out.println("You entered B or b");
				break;
				
			case "C", "c":
				System.out.println("You entered C or c");
				break;
			
			default:
				System.out.println("Invalid Entry");
		
		}

	}

}
