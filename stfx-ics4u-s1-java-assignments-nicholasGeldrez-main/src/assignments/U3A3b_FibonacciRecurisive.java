package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A3b_FibonacciRecurisive {

	private JFrame frame;
	private JTextField textN;
	private JTextField textAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3b_FibonacciRecurisive window = new U3A3b_FibonacciRecurisive();
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
	public U3A3b_FibonacciRecurisive() {
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

		JLabel lblHeader = new JLabel("Fibonacci Numbers");
		lblHeader.setBounds(171, 23, 109, 14);
		frame.getContentPane().add(lblHeader);

		JLabel lblNewLabel = new JLabel("The first nine Fibonacci Numbers are: 0, 1, 1, 2, 3, 5, 8, 13, 21");
		lblNewLabel.setBounds(45, 48, 365, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter the Fibonacci term that you would like:");
		lblNewLabel_1.setBounds(10, 85, 270, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textN = new JTextField();
		textN.setBounds(290, 82, 86, 20);
		frame.getContentPane().add(textN);
		textN.setColumns(10);

		textAnswer = new JTextField();
		textAnswer.setBounds(90, 199, 252, 20);
		frame.getContentPane().add(textAnswer);
		textAnswer.setColumns(10);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textAnswer.setText("Fibonacci term " + Integer.parseInt(textN.getText()) + " is "
						+ (fibonacciRecursive(Integer.parseInt(textN.getText()))) + ".");

			}
		});
		btnCalculate.setBounds(171, 142, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}

	// DESCRIPTION - Determines the term of Fibonacci given n>0
	// PARAMETERS - fibonacciRecursive(int n)
	// RETURN TYPE - int
	public static int fibonacciRecursive(int n) {

		if (n < 0) {

			return -1;

		}

		else if (n == 1) {

			return 0;

		}

		else if ((n == 2) || (n == 3)) {

			return 1;

		}

		else {

			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

		}
	}

}
