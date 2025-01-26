package assignments;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class U3A6_ParallelArrays {
	
	public static void main(String[] args) {
		String[] info = new String[24];
		info = info("grades.dat");
		choice(info);

	}
	
	public static String[] info(String file) {
		
		final int ARRAY_SIZE = 8;
		String[] subject = new String[ARRAY_SIZE];
		int[] grade = new int[ARRAY_SIZE];
		String[] teacher = new String[ARRAY_SIZE];
		String[] all = new String[ARRAY_SIZE*3];
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			for (int i = 0; i < subject.length; i++) {
				subject[i] = br.readLine();
				grade[i] = Integer.parseInt(br.readLine());
				teacher[i] = br.readLine();
			}
			br.close();
		}
		catch (Exception e) {
		}
		for (int i = 0; i < 24; i++) {
			if (i < 8) {
				all[i] = subject[i];
			}
			else if (i < 16) {
				all[i] = String.valueOf(grade[(i-8)]);
			}
			else if (i >= 16) {
				all[i] = teacher[(i-16)];
			}
		}
		return all;
	}
	
	public static void choice(String[]s) {
		Scanner sc = new Scanner(System.in);
		boolean redo = true;
		String cs;
		int userInput = 0;
		while (redo == true) {
			try {
				System.out.println("Enter a number from 1-8 to see the class name, grade, and teacher: ");
				System.out.println("Or 9 to see your average: ");
				cs = sc.nextLine();
				userInput = Integer.parseInt(cs);
				
				if (0 >= userInput || userInput > 10) {
					throw new Exception();
				}
				redo = false;
			}
			catch (Exception e) {
				System.out.println("Invalid entry.");
			}
		}
		userInput--;
		
		if (userInput > -1 && userInput < 8) {
		System.out.println("Your teacher " +s[userInput] + " grade is " + s[userInput + 8] + "% with the amazing teacher " + s[userInput + 16]);
		}
		if (userInput == 8) {
			int a = 0;
			a += Integer.parseInt(s[8]);
			a += Integer.parseInt(s[9]);
			a += Integer.parseInt(s[10]);
			a += Integer.parseInt(s[11]);
			a += Integer.parseInt(s[12]);
			a += Integer.parseInt(s[13]);
			a += Integer.parseInt(s[14]);
			a += Integer.parseInt(s[15]);
			
			System.out.println("Your average is: " + (a/8));

			
		} 
		
	}
	

	
}

