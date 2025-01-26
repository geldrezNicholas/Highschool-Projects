package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A3c_RecursiveFractionReducer {

	private JFrame frame;
	private JTextField textN;
	private JTextField textD;
	private JTextField textAnswer;
	int num = 0;
	int den = 0;
	int finalNum = 0;
	int finalDen = 0;
	int gcf = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3c_RecursiveFractionReducer window = new U3A3c_RecursiveFractionReducer();
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
	public U3A3c_RecursiveFractionReducer() {
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

		JLabel lblNewLabel = new JLabel("Fraction Reducer");
		lblNewLabel.setBounds(161, 11, 128, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblThisProgramWill = new JLabel("This program will reduce a fraction to lowest terms");
		lblThisProgramWill.setBounds(54, 36, 312, 14);
		frame.getContentPane().add(lblThisProgramWill);

		JLabel lblEnterTheNumerator = new JLabel("Enter the numerator");
		lblEnterTheNumerator.setBounds(99, 99, 134, 14);
		frame.getContentPane().add(lblEnterTheNumerator);

		JLabel lblEnterTheDenominator = new JLabel("Enter the denominator:");
		lblEnterTheDenominator.setBounds(99, 147, 134, 14);
		frame.getContentPane().add(lblEnterTheDenominator);

		textN = new JTextField();
		textN.setBounds(243, 96, 86, 20);
		frame.getContentPane().add(textN);
		textN.setColumns(10);

		textD = new JTextField();
		textD.setColumns(10);
		textD.setBounds(243, 144, 86, 20);
		frame.getContentPane().add(textD);

		textAnswer = new JTextField();
		textAnswer.setColumns(10);
		textAnswer.setBounds(80, 217, 286, 20);
		frame.getContentPane().add(textAnswer);

		JButton btnCalculate = new JButton("Reduce Fraction to Lowest Terms");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				num = Integer.parseInt(textN.getText());
				den = Integer.parseInt(textD.getText());
				gcf = fractionRecursive(num, den);
				
				finalNum = answer(num, gcf);
				finalDen = answer(den, gcf);
				
				textAnswer.setText(num + "/" + den + " in lowest terms is " + finalNum + "/" + finalDen + ".");
				

			}
		});
		btnCalculate.setBounds(111, 183, 242, 23);
		frame.getContentPane().add(btnCalculate);
	}

	// DESCRIPTION - Finds the gcf between the numerator and the denominator
	// PARAMETERS - fractionRecursive(int n, int d)
	// RETURN TYPE - int
	public int fractionRecursive(int n, int d) {

		if (d != 0) {

			return fractionRecursive(d, n % d);

		} else {

			return n;

		}

	}

	// DESCRIPTION - Determines final numerator and denominator
	// PARAMETERS - answer(int x, int y)
	// RETURN TYPE - int
	public int answer(int x, int y) {

		int fn;
		fn = x / y;
		return fn;

	}

}
