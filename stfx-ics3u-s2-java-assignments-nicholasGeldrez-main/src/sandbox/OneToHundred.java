package sandbox;

public class OneToHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int max = 0;
		int min = 0;
		int[] oneToHundredArray = new int[10];
		
		for (int i=0; i<10; i++) {
			
			oneToHundredArray[i] = (int)(Math.random()*100 + 1);
			
			System.out.println(oneToHundredArray[i]);
			
		}
		
		max = oneToHundredArray[1];
		min = oneToHundredArray[1];
		
		for (int i=1; i < oneToHundredArray.length; i++) {
			
			if (oneToHundredArray[i] > max) {
				
				max = oneToHundredArray[i];
			}
		}
		for (int i=1; i < oneToHundredArray.length; i++) {
			
			if (oneToHundredArray[i] < min) {
				
				min = oneToHundredArray[i];
			}
		}
			
	
		
		System.out.println(max);
		System.out.println(min);

		
		
	} 
	


}
