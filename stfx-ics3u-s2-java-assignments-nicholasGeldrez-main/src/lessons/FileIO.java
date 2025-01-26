package lessons;

import java.io.*;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arraySize = 5;
		
		// Create 3 parallel arrays:
		String[] product = new String [arraySize];
		int[] quantity = new int [arraySize];
		double[] price = new double [arraySize];
		
		try {
			//Read file from repository folder, outside src
			FileReader file = new FileReader("inventory.dat");
			
			//Put contents of file into a buffer to read/parse
			BufferedReader buffer = new BufferedReader(file);
			
			for (int i=0; i<product.length; i++) {
				
				
				// buffer.readline(), reads 1 line in buffer, up to carriage
				// return, returns as a String
				product[i] = buffer.readLine();
				quantity[i] = Integer.parseInt(buffer.readLine());
				price[i] = Double.parseDouble(buffer.readLine());

			}
			
			//clear buffer
			buffer.close();
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		for ( int i=0; i<product.length; i++)
			
			System.out.println("PRODUCT:" + product[i] + " QUANTITY: " + quantity[i] + " PRICE: " + price[i]);
	}

}
