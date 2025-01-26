package lessons;

import java.io.*;

public class FileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] product = {"milk", "bread", "butter", "cheese", "yogurt"};
		int[] quantity = {4, 7, 3, 5, 6};
		double[] price = {4.99, 3.99, 5.99, 10.99, 13.99};
		
		try {
			
			// create output file
		
			FileOutputStream fout = new FileOutputStream("foodInventory.dat");
			
			// create buffer to write data 
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			// specify ISo character set to write to file
			OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
			
			// write contents to file
			for(int i=0; i<product.length; i++) {
				
				out.write(product[i] + "\n" + quantity[i] + "\n" + price[i]);
				
			}
			
			// force data to be written to file, even if program crashes
			out.flush();
			
			//clear memory
			out.close();
			
			
		}
		
		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
