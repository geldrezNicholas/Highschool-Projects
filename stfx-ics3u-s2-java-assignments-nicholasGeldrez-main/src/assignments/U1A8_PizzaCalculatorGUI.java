package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A8_PizzaCalculatorGUI {

	private JFrame frame;
	private JTextField textDiameter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A8_PizzaCalculatorGUI window = new U1A8_PizzaCalculatorGUI();
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
	public U1A8_PizzaCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 422, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Putrid Pizza");
		label1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
		label1.setBounds(141, 27, 178, 14);
		frame.getContentPane().add(label1);
		
		JLabel diameterLabel = new JLabel("Diameter of Pizza (CM):");
		diameterLabel.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 15));
		diameterLabel.setBounds(26, 65, 245, 14);
		frame.getContentPane().add(diameterLabel);
		
		textDiameter = new JTextField();
		textDiameter.setBounds(281, 62, 86, 20);
		frame.getContentPane().add(textDiameter);
		textDiameter.setColumns(10);
		
		JLabel subTotalPlace = new JLabel(" ");
		subTotalPlace.setBounds(262, 123, 46, 14);
		frame.getContentPane().add(subTotalPlace);
		
		JLabel taxesPlace = new JLabel(" ");
		taxesPlace.setBounds(262, 148, 46, 14);
		frame.getContentPane().add(taxesPlace);
		
		JLabel grandTotalPlace = new JLabel(" ");
		grandTotalPlace.setBounds(262, 173, 46, 14);
		frame.getContentPane().add(grandTotalPlace);
		
		JLabel promptLabel = new JLabel(" ");
		promptLabel.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 15));
		promptLabel.setBounds(10, 198, 424, 20);
		frame.getContentPane().add(promptLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Variable Declaration
				final double LABOUR = 0.75;
				final double RENT = 0.99;
				final double INGREDIENTS = 0.50;
				final double TAX = 0.13;
				double diameter = 0;
				double subTotal = 0;
				double taxes = 0;
				double grandTotal = 0;
				
				
				
				diameter = Double.parseDouble(textDiameter.getText());
				
				if ( 1 > diameter) {
					
					promptLabel.setText("Your pizza is too small, please try again!");
					subTotalPlace.setText(String.valueOf("N/A"));
					grandTotalPlace.setText(String.valueOf("N/A"));
					taxesPlace.setText(String.valueOf("N/A"));
					
				}
				
				
				else if ( 1 <= diameter && diameter <= 15) {
					
					subTotal = LABOUR + RENT + diameter*INGREDIENTS;
					taxes = subTotal*TAX;
					grandTotal = subTotal + taxes;
					
					
					subTotalPlace.setText("$" + String.format("%.2f", subTotal));
					grandTotalPlace.setText("$" + String.format("%.2f", grandTotal));
					taxesPlace.setText("$" + String.format("%.2f", taxes));
					promptLabel.setText("We are going to make you a cute little pizza!");
					
				}
				
				else if ( 15 < diameter && diameter < 40) {
					
					subTotal = LABOUR + RENT + diameter*INGREDIENTS;
					taxes = subTotal*TAX;
					grandTotal = subTotal + taxes;

					
					subTotalPlace.setText("$" + String.format("%.2f", subTotal));
					grandTotalPlace.setText("$" + String.format("%.2f", grandTotal));
					taxesPlace.setText("$" + String.format("%.2f", taxes));
					promptLabel.setText("This will be delicious!");
					
				}
				
				else  {
					
					subTotal = LABOUR + RENT + diameter*INGREDIENTS;
					taxes = subTotal*TAX;
					grandTotal = subTotal + taxes;
					
					
					subTotalPlace.setText("$" + String.format("%.2f", subTotal));
					grandTotalPlace.setText("$" + String.format("%.2f", grandTotal));
					taxesPlace.setText("$" + String.format("%.2f", taxes));
					promptLabel.setText("Whoa, big pizza! You might need a truck to get this home!");
					
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(162, 90, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel subTotalLabel = new JLabel("SubTotal($):");
		subTotalLabel.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 12));
		subTotalLabel.setBounds(66, 123, 140, 14);
		frame.getContentPane().add(subTotalLabel);
		
		JLabel taxesLabel = new JLabel("Taxes($):");
		taxesLabel.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 12));
		taxesLabel.setBounds(66, 148, 140, 14);
		frame.getContentPane().add(taxesLabel);
		
		JLabel grandTotalLabel = new JLabel("Grand Total($):");
		grandTotalLabel.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 12));
		grandTotalLabel.setBounds(66, 173, 162, 14);
		frame.getContentPane().add(grandTotalLabel);
		
		JButton bttnExit = new JButton("Exit");
		bttnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		bttnExit.setBounds(162, 227, 89, 23);
		frame.getContentPane().add(bttnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textDiameter.setText(String.valueOf(""));
				subTotalPlace.setText(String.valueOf(""));
				grandTotalPlace.setText(String.valueOf(""));
				taxesPlace.setText(String.valueOf(""));
				promptLabel.setText(String.valueOf(""));
				
			}
		});
		btnClear.setBounds(278, 89, 89, 23);
		frame.getContentPane().add(btnClear);
		
	}
}
