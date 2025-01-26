package lessons;

public class CompareToMethod {

	public static void main(String[] args) {
		// Single Letter Comparisons
		System.out.println("a".compareTo("a"));
		System.out.println("b".compareTo("a"));
		System.out.println("a".compareTo("b"));
		System.out.println("a".compareTo("c"));
		System.out.println("c".compareTo("a"));
		System.out.println("s".compareTo("s"));
		
		// DISCLAIMER
		// change letters to all upper or all lower case before comparing
		System.out.println("a".toUpperCase().compareTo("A"));

		// Multiple Letter Comparisons (first mis-match compared)
		System.out.println("xax".compareTo("xbx"));
		System.out.println("abc".compareTo("abc"));
		System.out.println("xyxya".compareTo("xyxya"));
		System.out.println("xyxya".compareTo("xyxyc"));
		System.out.println("xyxyxaxyxy".compareTo("xyxydxyxyassdffg"));
		System.out.println("a".compareTo("aaaaaaaaaaa"));
		System.out.println("aasfs".compareTo("fsfsa"));
		System.out.println("tesfs".compareTo("tafsasver"));

		
	}

}
