package lessons;

public class Period2StringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Do not use <,<=,>,>=, == and != to compare Strings
		
		String string1 = "granola";
		String string2 = "granola";
		String string3 = "yogurt";
		
		//use . equals() method to compare strings
		if (string1.equals(string2)) {
			
			System.out.println("Hello World!");	
		}
		
		else {
			
			System.out.println("Goodbye!");	
		}
		
		
	}

}
