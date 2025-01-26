package lessons;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String
		String myString = "hippopotamus";
		
		// third "p" from "hippopotamus"
		char myChar = myString.charAt(5);
		System.out.println(myChar);
		
		// change third "p" to ASCII
		int asciiThirdPInHippopotamus = (int)myChar;
		System.out.println(asciiThirdPInHippopotamus);
		
		//shift ASCII "o" by 9 characters to get the right
		int shift = 9;
		asciiThirdPInHippopotamus = asciiThirdPInHippopotamus + shift;
		
		char shiftedChar = (char)asciiThirdPInHippopotamus;
		
		System.out.println(shiftedChar);
		
		// append new character to existing String
		String existingString = "This is my day... ";
		existingString = existingString + shiftedChar;
		System.out.println(existingString);
		
	}

}
