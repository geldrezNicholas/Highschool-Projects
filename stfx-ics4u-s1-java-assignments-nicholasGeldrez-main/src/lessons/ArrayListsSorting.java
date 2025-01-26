package lessons;

import java.util.ArrayList; // needed for ArrayLists
import java.util.Comparator; // needed to sort ArrayLists

public class ArrayListsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> row1 = new ArrayList();

		row1.add("B");
		row1.add("A");
		row1.add("C");
		row1.add("E");
		row1.add("D");
		System.out.println(row1);

		row1.add("1, F");
		System.out.println(row1);

		row1.set(0, "X");
		System.out.println(row1);

		System.out.println(row1.get(0));
		System.out.println(row1.get(5));

		System.out.println(row1.contains("C"));
		System.out.println(row1.contains("Z"));
		System.out.println(row1.indexOf("D"));
		
		row1.add(1, "A");
		System.out.println(row1);
		System.out.println(row1.indexOf("A"));
		System.out.println(row1.lastIndexOf("A"));

		// Sort ArrayList from smallest to Largest or aplhabetically
		
		row1.sort(Comparator.naturalOrder());
		System.out.println(row1);
		
		row1.sort(Comparator.reverseOrder());
		System.out.println(row1);
		
	}

}
