package lessons;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we need to know how to convert an ArrayList to an Array
		// I'll tell you why later...
		
		// ArrayList
		ArrayList<String> myArrayList = new ArrayList();
		myArrayList.add("dog");
		myArrayList.add("cat");
		myArrayList.add("mouse");
		
		// Array
		String[] myArray = new String[myArrayList.size()];
		
		// copy all elements from ArrayList to Array:
		myArrayList.toArray(myArray);
		
		// print contents of Array to check:
		
		for (int i = 0; i< myArray.length; i++) {
			
			System.out.println(myArray[i]);
			
		}
		
		
	}

}
