package lessons;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		// used to store OBJECTS(String) of the same type
		// can't store PRIMITIVES(int, double, char)
		// access ArrayList elements using methods, not bracket notation
		// indexing is the same as arrays (0 to n-1)
		// dynamic (grows and shrinks)
		// includes predefined methods

		// Syntax to create new ArrayList (different variations):

		int size = 13;

		ArrayList<String> myStringArrayList1 = new ArrayList(); // simplest method
		ArrayList<String> mystringArrayList2 = new ArrayList<>();
		ArrayList<String> mystringArrayList3 = new ArrayList<String>();
		ArrayList<String> mystringArrayList4 = new ArrayList<String>(size);

		ArrayList<String> students = new ArrayList();

		students.add("Sleepy Lainey");
		students.add("Youannas");
		students.add("Late David");
		students.add("Sara");

		System.out.println(students.get(0));
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		System.out.println(students.get(3));
		System.out.println(students.size());

		System.out.println(students.indexOf("Late David"));

		students.remove(1);
		
		System.out.println(students.get(0));
		
		students.set(0, "Lainey");
		
		students.add(2, "Adam");
		for (int i = 0; i < students.size(); i++) {

			System.out.println(students.get(i));

		}

		System.out.println(students.toString());

		students.clear();

	}

}
