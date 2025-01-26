package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A5_AverageCalculatorGUI {

	private JFrame frame;
	private JTextField textMark1;
	private JTextField textMark2;
	private JTextField textMark3;
	private JTextField textMark4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A5_AverageCalculatorGUI window = new U1A5_AverageCalculatorGUI();
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
	public U1A5_AverageCalculatorGUI() {
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
		
		JLabel label1 = new JLabel("Enter in your four course mark and click Calculate Average.");
		label1.setBounds(58, 55, 376, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Course Mark Average Calculator");
		label2.setForeground(new Color(220, 20, 60));
		label2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		label2.setBackground(new Color(220, 20, 60));
		label2.setBounds(98, 30, 230, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Course Mark 1:");
		label3.setBounds(85, 80, 103, 14);
		frame.getContentPane().add(label3);
		
		JLabel label4 = new JLabel("Course Mark 2:");
		label4.setBounds(85, 105, 103, 14);
		frame.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("Course Mark 3:");
		label5.setBounds(85, 130, 103, 14);
		frame.getContentPane().add(label5);
		
		JLabel label6 = new JLabel("Course Mark 4:");
		label6.setBounds(85, 157, 103, 14);
		frame.getContentPane().add(label6);
		
		JLabel labelAverage = new JLabel("Average");
		labelAverage.setBounds(164, 216, 77, 14);
		frame.getContentPane().add(labelAverage);
		
		JButton buttonAverage = new JButton("Calculate Average");
		buttonAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//Variable Declaration
			double courseMark1 = 0;
			double courseMark2 = 0;
			double courseMark3 = 0;
			double courseMark4 = 0;
			double courseAverage = 0;
			
			//Mark from texts
			courseMark1 = Double.parseDouble(textMark1.getText());
			courseMark2 = Double.parseDouble(textMark2.getText());
			courseMark3 = Double.parseDouble(textMark3.getText());
			courseMark4 = Double.parseDouble(textMark4.getText());
			
			//Course Average Calculations
			courseAverage = (courseMark1 + courseMark2 + courseMark3 + courseMark4)/4;
			courseAverage = Math.round(courseAverage);
			
			//Course average output
			labelAverage.setText(String.valueOf(courseAverage + "%"));
			
			
			
			
			}
		});
		buttonAverage.setBounds(125, 182, 147, 23);
		frame.getContentPane().add(buttonAverage);
		
		textMark1 = new JTextField();
		textMark1.setBounds(204, 77, 86, 20);
		frame.getContentPane().add(textMark1);
		textMark1.setColumns(10);
		
		textMark2 = new JTextField();
		textMark2.setBounds(204, 102, 86, 20);
		frame.getContentPane().add(textMark2);
		textMark2.setColumns(10);
		
		textMark3 = new JTextField();
		textMark3.setBounds(204, 127, 86, 20);
		frame.getContentPane().add(textMark3);
		textMark3.setColumns(10);
		
		textMark4 = new JTextField();
		textMark4.setBounds(204, 152, 86, 20);
		frame.getContentPane().add(textMark4);
		textMark4.setColumns(10);
		
	
	}
}
