package assignments;

//import Scanner
import java.util.Scanner;

public class U1A_IncomeTax {

	public static void main(String[] args) {
		
		//Variable Declaration
		double fIncome = 0;//Federal Income also the same as provincial
		double pIncome = 0;//Provincial Income also the same as federal
		double netIncome = 0;//Income after tax
		final double TXR1 = 0.15;//Tax rate for tax bracket 1
		final double TXR2 = 0.205;//Tax rate for tax bracket 2
		final double TXR3 = 0.26;//Tax rate for tax bracket 3
		final double TXR4 = 0.29;//Tax rate for tax bracket 4
		final double TXR5 = 0.33;//Tax rate for tax bracket 5
		final double PTXR1 = 0.0505;//Provincial tax rate bracket 1
		final double PTXR2 = 0.0915;//Provincial tax rate bracket 2
		final double PTXR3 = 0.1116;//Provincial tax rate bracket 3
		final double PTXR4 = 0.1216;//Provincial tax rate bracket 4
		final double PTXR5 = 0.1316;//Provincial tax rate bracket 5
		double totalFederalTax = 0;
		double totalProvincialTax = 0;
		double taxDifference = 0;
		
		
	
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		//First prompt
		System.out.println("Tax Time!");
		System.out.println("Enter your yearly income to calculate your yearly federal tax.");
		//User enters income
		fIncome = sc.nextDouble();
		pIncome = fIncome;
		netIncome = fIncome;
	
		//Conditions for tax Federal rate
		
		if (fIncome > 235675) { 
			//federal tax bracket 5
			totalFederalTax += (fIncome - 235675)*TXR5;
			fIncome = 235675;
	
		}
		
		if (fIncome <= 235675 && fIncome > 165430) {
			//federal tax bracket 4
			totalFederalTax += (fIncome - 165430)*TXR4;
			fIncome = 165430;
	
		}
		
		if (fIncome <= 165430 && fIncome > 106717) {
			//federal tax bracket 3
			totalFederalTax += (fIncome - 106717)*TXR3;
			fIncome = 106717;
			
		}
		
		if (fIncome <= 106717 && fIncome > 53359) {
			//federal tax bracket 2
			totalFederalTax += (fIncome - 53359)*TXR2;
			fIncome = 53359;
		}
		
		if (fIncome <= 53359) {
			//federal tax bracket 1
			totalFederalTax += fIncome*TXR1;
			
		}
		
		if (pIncome > 220000){ 
			//provincial tax bracket 5
			totalProvincialTax += (pIncome - 220000)*PTXR5;
			pIncome = 220000;
			
			}
		
		if (pIncome <= 220000 && pIncome > 150000) { 
			//provincial tax bracket 4
			totalProvincialTax += (pIncome - 150000)*PTXR4;
			pIncome = 150000;
		}
		
		if (pIncome <= 150000 && pIncome > 98463) { 
			//provincial tax bracket 3
			totalProvincialTax += (pIncome - 98463)*PTXR3;
			pIncome = 98463;
			
		}
		
		if (pIncome <= 98463 && pIncome > 49231) { 
			//provincial tax bracket 2
			totalProvincialTax += (pIncome - 49231)*PTXR2;
			pIncome = 49231;
			
		}
		
		if (pIncome <= 49231) { 
			//provincial tax bracket 1
			totalProvincialTax += pIncome*PTXR1;
		}
		
		System.out.println("Your yearly federal tax is $" + totalFederalTax + "!");
		System.out.println("Your yearly Provincial tax is $" + totalProvincialTax + "!");
		
		netIncome = netIncome - (totalFederalTax + totalProvincialTax);
		System.out.println("Your net salary comes out to be $" + netIncome + "!");
		
	}

}
