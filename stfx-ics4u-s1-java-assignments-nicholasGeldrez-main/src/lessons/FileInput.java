package lessons;

import java.util.ArrayList;
import java.io.*;

public class FileInput {

	public static void main(String[] args) {

		ArrayList<String> colours = new ArrayList();
		String word = "";
		BufferedReader br = null;
		
		// forced to use try-catch
		// open file located under src folder
		try {
			br = new BufferedReader(new FileReader("colours.txt.txt"));

			// add contents to ArrayList, 
			// read contents of text file, lie-by-line until end of file
			while ((word = br.readLine()) != null) {

				colours.add(word);

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		for (int i = 0; i < colours.size(); i++) {

			System.out.println(colours.get(i));

		}

	}

}
