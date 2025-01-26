package sandbox;

public class MyOneToHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = -100000;
		int min = 100000;
		int tempMax = 0;
		int tempMin = 0;
		int[] oneToHundredArray = new int[10];
		
		for (int i=0; i<10; i++) {
			
			oneToHundredArray[i] = (int) (Math.random()*100 + 1);
			
			System.out.println(oneToHundredArray[i]);
			
		}
	
		for (int i=0; i<9; i++) {
			
			tempMax = (int)(Math.max(oneToHundredArray[i], oneToHundredArray[i+1]));
			tempMin = (int)(Math.min(oneToHundredArray[i], oneToHundredArray[i+1]));
			max = Math.max(tempMax, max);
			min = Math.min(tempMin, min);

		} 
		
		
		
		
		System.out.println(max);
		System.out.println(min);
		
		
		
		

		
		
	}

}
