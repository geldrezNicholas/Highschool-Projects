package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class U2A12_Summative {
	
	//Variable Declaration
	private JFrame frame;
	int[] oneToHundredArray = new int[10];
	int min = 0;
	int max = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A12_Summative window = new U2A12_Summative();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public U2A12_Summative() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Max & Min Game!!!");
		lblHeader.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		lblHeader.setBounds(141, 11, 195, 36);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblTitle1 = new JLabel("Click this button to get 10 random numbers from 1 to 100!");
		lblTitle1.setBounds(77, 48, 330, 14);
		frame.getContentPane().add(lblTitle1);
		
		JLabel lblNum1 = new JLabel("");
		lblNum1.setBounds(10, 107, 64, 14);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("");
		lblNum2.setBounds(84, 107, 64, 14);
		frame.getContentPane().add(lblNum2);
		
		JLabel lblNum3 = new JLabel("");
		lblNum3.setBounds(158, 107, 64, 14);
		frame.getContentPane().add(lblNum3);
		
		JLabel lblNum4 = new JLabel("");
		lblNum4.setBounds(232, 107, 64, 14);
		frame.getContentPane().add(lblNum4);
		
		JLabel lblNum5 = new JLabel("");
		lblNum5.setBounds(306, 107, 64, 14);
		frame.getContentPane().add(lblNum5);
		
		JLabel lblNum6 = new JLabel("");
		lblNum6.setBounds(10, 142, 64, 14);
		frame.getContentPane().add(lblNum6);
		
		JLabel lblNum7 = new JLabel("");
		lblNum7.setBounds(94, 142, 64, 14);
		frame.getContentPane().add(lblNum7);
		
		JLabel lblNum8 = new JLabel("");
		lblNum8.setBounds(168, 142, 64, 14);
		frame.getContentPane().add(lblNum8);
		
		JLabel lblNum9 = new JLabel("");
		lblNum9.setBounds(242, 142, 64, 14);
		frame.getContentPane().add(lblNum9);
		
		JLabel lblNum10 = new JLabel("");
		lblNum10.setBounds(316, 142, 64, 14);
		frame.getContentPane().add(lblNum10);
		
		JLabel lblTitle2 = new JLabel("Click this button to get the highest and lowest out of these numbers!");
		lblTitle2.setBounds(39, 176, 395, 14);
		frame.getContentPane().add(lblTitle2);
		
		JLabel lblMax = new JLabel("");
		lblMax.setBounds(116, 223, 52, 14);
		frame.getContentPane().add(lblMax);
		
		JLabel lblMin = new JLabel("");
		lblMin.setBounds(244, 223, 52, 14);
		frame.getContentPane().add(lblMin);
		
		JButton buttonA = new JButton("Generate");
		buttonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				oneToHundredArray = getNumbers(oneToHundredArray);
				
				lblNum1.setText(String.valueOf(oneToHundredArray[0]));
				lblNum2.setText(String.valueOf(oneToHundredArray[1]));
				lblNum3.setText(String.valueOf(oneToHundredArray[2]));
				lblNum4.setText(String.valueOf(oneToHundredArray[3]));
				lblNum5.setText(String.valueOf(oneToHundredArray[4]));
				lblNum6.setText(String.valueOf(oneToHundredArray[5]));
				lblNum7.setText(String.valueOf(oneToHundredArray[6]));
				lblNum8.setText(String.valueOf(oneToHundredArray[7]));
				lblNum9.setText(String.valueOf(oneToHundredArray[8]));
				lblNum10.setText(String.valueOf(oneToHundredArray[9]));
				
				
			}
		});
		buttonA.setBounds(173, 73, 89, 23);
		frame.getContentPane().add(buttonA);
		
		JButton btnB = new JButton("Max & Min");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				max = getMax(oneToHundredArray);
				lblMax.setText(String.valueOf(max));
				
				min = getMin(oneToHundredArray);
				lblMin.setText(String.valueOf(min));
				
				
			}
		});
		btnB.setBounds(173, 199, 101, 23);
		frame.getContentPane().add(btnB);
	}
		/* DESCRIPTION: Generate 10 random numbers from 1 to 100
		 * PAREMETER LIST: int []
		 * RETURN TYPE: int []
		*/
		public static int[] getNumbers(int[] oneToHundredArray)  {
				
			for (int i=0; i<oneToHundredArray.length; i++) {
				
				oneToHundredArray[i] = (int)(Math.random()*100 + 1);
					
			}
			int numbers[] = oneToHundredArray;
				
			return numbers;
		}
	
		/* DESCRIPTION: Determines highest value of the 10 random numbers
		 * PAREMETER LIST: int []
		 * RETURN TYPE: int
		*/
		public static int getMax(int[] oneToHundredArray)  {
			
			int max = oneToHundredArray[1];

			for (int i=0; i < oneToHundredArray.length; i++) {
				
				if (oneToHundredArray[i] > max) {
					
					max = oneToHundredArray[i];
				}
			}
			return max;
		}	
	
		/* DESCRIPTION: Determines lowest value of the 10 random numbers
		 * PAREMETER LIST: int []
		 * RETURN TYPE: int
		*/
		public static int getMin(int[] oneToHundredArray)  {

			int min = oneToHundredArray[1];
			
			for (int i=0; i < oneToHundredArray.length; i++) {
				
				if (oneToHundredArray[i] < min) {
					
					min = oneToHundredArray[i];
				}
	
			}
			return min;
		}	

	}
	
	

