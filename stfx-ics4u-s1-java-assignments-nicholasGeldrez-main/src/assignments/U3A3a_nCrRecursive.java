package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A3a_nCrRecursive {

	private JFrame frame;
	private JTextField textN;
	private JTextField textR;
	private JTextField textAnswer;

	int n = 0;
	int r = 0;
	int l = 0;
	int total = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3a_nCrRecursive window = new U3A3a_nCrRecursive();
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
	public U3A3a_nCrRecursive() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("n Choose r");
		lblNewLabel.setBounds(254, 15, 101, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("This program calculates the number of ways r different objects can be chosen from a set of n objects");
		lblNewLabel_1.setBounds(10, 40, 580, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter the number of objects to choose:");
		lblNewLabel_2.setBounds(60, 91, 227, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textR = new JTextField();
		textR.setBounds(352, 91, 86, 20);
		frame.getContentPane().add(textR);
		textR.setColumns(10);
		
		textN = new JTextField();
		textN.setColumns(10);
		textN.setBounds(352, 144, 86, 20);
		frame.getContentPane().add(textN);
		
		JLabel lblNewLabel_2_1 = new JLabel("Enter the number of objects there are to choose from:");
		lblNewLabel_2_1.setBounds(24, 147, 331, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textAnswer = new JTextField();
		textAnswer.setBounds(184, 209, 227, 20);
		frame.getContentPane().add(textAnswer);
		textAnswer.setColumns(10);
		
		JButton btnAnswer = new JButton("Calculate the Number of Ways");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				n = factorialRecursive(Integer.parseInt(textN.getText()));
				r = factorialRecursive(Integer.parseInt(textR.getText()));
				l = factorialRecursive(Integer.parseInt(textN.getText()) - Integer.parseInt(textR.getText()));
				
				total = (n/(r*l));
				
				textAnswer.setText("There are " + total + " ways.");
				
				
				
			}
		});
		btnAnswer.setBounds(184, 175, 227, 23);
		frame.getContentPane().add(btnAnswer);
	}
	// DESCRIPTION - Calculates factorial for n>=0
	// PARAMETERS - factorialRecursive(int n)
	// RETURN TYPE - int
	public int factorialRecursive(int n) {

		if (n < 0) {

			return -1;

		}
		
		
		else if ((n == 0) || (n == 1)){
			
			return 1;
			
		}
		
		else {
			
			return n * factorialRecursive(n-1);
			
		}

	}
	
}
