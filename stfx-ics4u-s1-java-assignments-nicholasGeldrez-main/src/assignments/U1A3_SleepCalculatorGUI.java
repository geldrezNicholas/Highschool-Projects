package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A3_SleepCalculatorGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField4;
	private JTextField textField2;
	private JTextField textField5;
	private JTextField textField3;
	private JTextField textField6;
	private JTextField textFieldAlive;
	private JTextField textFieldSleep;
	int day1 = 0;
	int month1 = 0;
	int year1 = 0;
	int day2 = 0;
	int month2 = 0;
	int year2 = 0;
	int alive = 0;
	int sleep = 0;
	int dayDay = 0;
	int monthMonth = 0;
	int yearYear = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A3_SleepCalculatorGUI window = new U1A3_SleepCalculatorGUI();
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
	public U1A3_SleepCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setForeground(Color.PINK);
		frame.setBackground(Color.PINK);
		frame.getContentPane().setForeground(Color.PINK);
		frame.setBounds(100, 100, 450, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel header1 = new JLabel("Sleep Calculator");
		header1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 19));
		header1.setForeground(new Color(0, 0, 255));
		header1.setBounds(130, 0, 171, 74);
		frame.getContentPane().add(header1);
		
		JLabel lblNewLabel = new JLabel("Day");
		lblNewLabel.setBounds(10, 131, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterTodaysDate = new JLabel("Enter Today's Date");
		lblEnterTodaysDate.setBounds(240, 71, 123, 14);
		frame.getContentPane().add(lblEnterTodaysDate);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Birthdate");
		lblNewLabel_1.setBounds(32, 71, 123, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(10, 198, 48, 14);
		frame.getContentPane().add(lblMonth);
		
		JLabel lblNewLabel_2_1 = new JLabel("Year");
		lblNewLabel_2_1.setBounds(10, 262, 48, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Day");
		lblNewLabel_2.setBounds(215, 131, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblMonth_1 = new JLabel("Month");
		lblMonth_1.setBounds(212, 198, 48, 14);
		frame.getContentPane().add(lblMonth_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Year");
		lblNewLabel_2_1_1.setBounds(212, 262, 48, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		textField1 = new JTextField();
		textField1.setBounds(68, 128, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(291, 128, 86, 20);
		frame.getContentPane().add(textField4);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(68, 195, 86, 20);
		frame.getContentPane().add(textField2);
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(291, 195, 86, 20);
		frame.getContentPane().add(textField5);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(68, 259, 86, 20);
		frame.getContentPane().add(textField3);
		
		textField6 = new JTextField();
		textField6.setColumns(10);
		textField6.setBounds(291, 259, 86, 20);
		frame.getContentPane().add(textField6);
		
		textFieldAlive = new JTextField();
		textFieldAlive.setBounds(159, 335, 218, 20);
		frame.getContentPane().add(textFieldAlive);
		textFieldAlive.setColumns(10);
		
		textFieldSleep = new JTextField();
		textFieldSleep.setColumns(10);
		textFieldSleep.setBounds(159, 366, 218, 20);
		frame.getContentPane().add(textFieldSleep);
		
		JButton button1 = new JButton("Calculate");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// try - catch inputs
				
				try {
					
				day1 = Integer.parseInt(textField1.getText());
				month1 = Integer.parseInt(textField2.getText());
				year1 = Integer.parseInt(textField3.getText());
				
				day2 = Integer.parseInt(textField4.getText());
				month2 = Integer.parseInt(textField5.getText());
				year2 = Integer.parseInt(textField6.getText());

				} catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
				
				// error checking
				
				if (day1 <= 30 && day1 > 0 || day2 <= 30 && day2 > 0) {
					
					dayDay = (day2 - day1);
					
				}
				
				else { 
					
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				
					
				}
				
				if (month1 <= 12 && month1 > 0 || month2 <= 12 && month2 > 0) {
					
					monthMonth = (month2 - month1) * 30;
					
				}
				
				else { 
					
					JOptionPane.showMessageDialog(null, "Invalid entry!");

					
				}
				
				if (year2 > year1) {
					
					yearYear = (year2 - year1) * 365;

					
				}
				
				else { 
					 
					JOptionPane.showMessageDialog(null, "Invalid entry!");
	
				}
				
				// calculations
				
				alive = yearYear + monthMonth +dayDay;
				sleep = alive*8;
				
				// output

				textFieldAlive.setText("You have been alive for " + alive + " days.");
				textFieldSleep.setText("You have slept for " + sleep + " hours.");
				
				// Testing with Mr. Wong's Code
				/*
				 * Testing 1:
				 * My code - Birthdate: Day: 6 Month: 12 Year: 2006
				 * My code - Today's Date: Day: 15 Month: 9 Year: 2023
				 * Answer: 6124 days alive and 48992 hours asleep
				 * 
				 * Birthdate: Day: 13 Month: 10 Year: 2006
				 * Today's Date: Day: 15 Month: 9 Year: 2023
				 * Answer: 6177 days alive and 49416 hours asleep
				 * 
				 * Birthdate: Day: 17 Month: 3 Year: 2006
				 * Today's Date: Day: 15 Month: 9 Year: 2023
				 * Answer: 6383 days alive and 51064 hours asleep
				 * 
				 * 
				 */
				
				
				
			}
		});
		button1.setBounds(32, 334, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Exit");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		button2.setBounds(34, 365, 89, 23);
		frame.getContentPane().add(button2);
	}

}
