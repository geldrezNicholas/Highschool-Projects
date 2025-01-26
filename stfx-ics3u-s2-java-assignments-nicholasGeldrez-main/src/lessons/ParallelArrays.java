package lessons;

public class ParallelArrays {

	public static void main(String[] args) {

		// 3 arrays which are related
		//names and money owed are in the same order, so arrays are related
		//EXAMPLE: Index 2, Evan owes $300
		String[] names = {"Jude", "Anthony", "Evan", "Carson", "Ayden"};
		int[] debt = {75, 500, 300, 10000, 230};
		String[] reason = {"textbook", "computer", "school fees", "windows", "vandalism"};
		
		//Output Carson's information
		System.out.println(names[3] + " owes $" + debt[3] + " reason: " + reason[3]);
		
		
	}

}
