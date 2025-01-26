package assignments;

import java.util.Scanner;

public class U2A2_AdventureGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String userInput;
		
		System.out.println("YOU WON THE LOTTERY OF 1 MILLION DOLLARS!!!");
		System.out.println("CONGRATULATIONS!");
		System.out.println("What would you like to spend your money on!");
		System.out.println("Car!(C)");
		System.out.println("House!(H)");
		System.out.println("Vacation!(V)");
		
		userInput = sc.next();
		
		if (userInput.equals("C") || userInput.equals("c")) {
			
			System.out.println("Options:");
			System.out.println("Honda!(H)");
			System.out.println("BMW!(B)");
			System.out.println("Ferrari!(F)");
			userInput = sc.next();
			
			switch(userInput) {
			
			
				case "H","h":
					System.out.println("Wonderful! Red(R) or Blue(B)?");
				
					userInput = sc.next();
				
					if (userInput.equals("R") || userInput.equals("r")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a red Honda!");
						
					}
					
					else if (userInput.equals("B") || userInput.equals("b")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a blue Honda!");
					
					}
				
					break;
					
				case "B","b":
					System.out.println("Amazing! Black(B) or White(W)?");
				
					userInput = sc.next();
					
					if (userInput.equals("B") || userInput.equals("b")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a black BMW!");
						
					}
					
					else if (userInput.equals("W") || userInput.equals("w")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a white BMW!");
					
					}
				
					break;
					
				case "F","f":
					System.out.println("Super! Green(G) or Pink(P)?");
				
					userInput = sc.next();
					
					if (userInput.equals("G") || userInput.equals("g")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a green Ferrari!");
						
					}
					
					else if (userInput.equals("P") || userInput.equals("p")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a pink Ferrari!");
					
					}
				
					break;
					
			}
			
			
				
		}
		
		else if (userInput.equals("H") || userInput.equals("h")) {
			
			System.out.println("Options:");
			System.out.println("Beach House(B)");
			System.out.println("Old Oak Mansion(O)");
			System.out.println("Modern Mansion(M)");
			userInput = sc.next();
			
			switch(userInput) {
			
			
				case "B","b":
					System.out.println("Wonderful! Red sand(R) or yellow sand(Y)?");
				
				
					if (userInput.equals("R") || userInput.equals("r")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a Beach house with red sand!");
						
					}
					
					else if (userInput.equals("Y") || userInput.equals("y")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a Beach House with yellow sand!");
					
					}
				
					break;
					
				case "O","o":
					System.out.println("Amazing! In the forest(F) or in a neighboorhood(N)?");
				
					userInput = sc.next();
					
					if (userInput.equals("F") || userInput.equals("f")) {
						
						System.out.println("Congratulations, with your lottery win you purchased an Old Oak Mansion in the forest!");
						
					}
					
					else if (userInput.equals("N") || userInput.equals("n")) {
						
						System.out.println("Congratulations, with your lottery win you purchased an Old Oak Mansion in a neighboorhood!");
					
					}
				
					break;
					
				case "M","m":
					System.out.println("Super! With an amazing view(V) or with and Infinity pool(I)?");
				
					userInput = sc.next();
					
					if (userInput.equals("V") || userInput.equals("v")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a Modern Mansion with an spectacular view!");
						
					}
					
					else if (userInput.equals("I") || userInput.equals("i")) {
						
						System.out.println("Congratulations, with your lottery win you Modern Mansion with an Infinity pool!");
					
					}
				
					break;
					
			}
			
			
				
		}
		
		else if (userInput.equals("V") || userInput.equals("v")) {
			
			System.out.println("Options:");
			System.out.println("Caribbean Cruise(C)!");
			System.out.println("Trip to Europe(E)!");
			System.out.println("Australia(A)!");
			userInput = sc.next();
			
			switch(userInput) {
			
			
				case "C","c":
					System.out.println("Wonderful! With island adventures(I) or all time cruise(C)?");
				
					userInput = sc.next();
					
					if (userInput.equals("I") || userInput.equals("i")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a cruise with assorted islands!");
						
					}
					
					else if (userInput.equals("C") || userInput.equals("c")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a cruise with all the time to relax!");
						
					}
					
					break;
					
				case "E","e":
					System.out.println("Amazing! France(F) or Italy(I)");
				
					userInput = sc.next();
				
					if (userInput.equals("F") || userInput.equals("f")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a trip to France!");
						
					}
					
					else if (userInput.equals("I") || userInput.equals("i")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a trip to Italy!");
						
					}
				
					break;
					
				case "A","a":
					System.out.println("Super! Sydney(S) or Melbourne(M)?");
				
					userInput = sc.next();
				
					if (userInput.equals("S") || userInput.equals("s")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a trip to Sydney!");
						
					}
					
					else if (userInput.equals("M") || userInput.equals("m")) {
						
						System.out.println("Congratulations, with your lottery win you purchased a trip to Melbourne!");
						
					}
					break;
					
					
					
			}
			
			
				
		}


	}	

}
