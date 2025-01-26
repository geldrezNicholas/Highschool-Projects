package assignments;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A4_RollerCoaster {

	private JFrame frame;
	private JTextField textHeight;
	private JTextField textBack;
	private JTextField textHeart;
	private JTextField textResult;
	int height = 0;
	String back = "";
	String heart = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A4_RollerCoaster window = new U1A4_RollerCoaster();
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
	public U1A4_RollerCoaster() {
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

		JLabel lblNewLabel = new JLabel("RollerCoaster Ride");
		lblNewLabel.setBounds(165, 11, 122, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Height in cm?");
		lblNewLabel_1.setBounds(86, 74, 93, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Back Trouble (Y/N)?");
		lblNewLabel_1_1.setBounds(86, 125, 140, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Heart Trouble (Y/N)?");
		lblNewLabel_1_1_1.setBounds(86, 171, 130, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		textHeight = new JTextField();
		textHeight.setBounds(278, 71, 86, 20);
		frame.getContentPane().add(textHeight);
		textHeight.setColumns(10);

		textBack = new JTextField();
		textBack.setColumns(10);
		textBack.setBounds(278, 122, 86, 20);
		frame.getContentPane().add(textBack);

		textHeart = new JTextField();
		textHeart.setColumns(10);
		textHeart.setBounds(278, 168, 86, 20);
		frame.getContentPane().add(textHeart);

		textResult = new JTextField();
		textResult.setColumns(10);
		textResult.setBounds(46, 201, 357, 20);
		frame.getContentPane().add(textResult);

		JButton btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					height = Integer.parseInt(textHeight.getText());
					back = textBack.getText();
					heart = textHeart.getText();

				} catch (Exception c) {

					JOptionPane.showMessageDialog(null, "Invalid entry!");
					textResult.setText("");

				}

				if ((back.equals("N") || back.equals("Y")) && (heart.equals("Y") || heart.equals("N"))) {

					if (height(height) == false || back(back) == false || heart(heart) == false) {

						textResult.setText("You are not able to get on the ride");

					}

					else if (height(height) == true && back(back) == true   && heart(heart) == true) {

						textResult.setText("You are able to get on the ride");

					}

				}

				else {

					textResult.setText("Invalid Input!");

				}

			}
		});
		btnCalc.setBounds(90, 227, 89, 23);
		frame.getContentPane().add(btnCalc);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setBounds(275, 227, 89, 23);
		frame.getContentPane().add(btnExit);
	}
	// DESCRIPTION: Determines if height is a safe height
	// PARAMETER LIST: int 
	// RETURN TYPE: boolean
	public boolean height(int h) {

		boolean r = false;

		if (h < 188 && h > 122) {

			r = true;

		}

		else {

			r = false;

		}

		return r;

	}

	// DESCRIPTION: Determines if there are back issues
	// PARAMETER LIST: String 
	// RETURN TYPE: boolean
	public boolean back(String b) {

		boolean r = false;

		if (b.equals("N")) {

			r = true;

		}

		else if (b.equals("Y")) {

			r = false;

		}

		return r;

	}

	// DESCRIPTION: Determines if there are heart issues
	// PARAMETER LIST: String 
	// RETURN TYPE: boolean
	public boolean heart(String he) {

		boolean r = false;

		if (he.equals("N")) {

			r = true;

		}

		else if (he.equals("Y")) {

			r = false;

		}

		return r;

	}

}
