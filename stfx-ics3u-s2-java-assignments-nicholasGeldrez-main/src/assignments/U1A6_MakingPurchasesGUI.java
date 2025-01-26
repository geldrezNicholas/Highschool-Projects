package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A6_MakingPurchasesGUI  {

	private JFrame frame;
	private JTextField textChocolate;
	private JTextField textVanilla;
	private JTextField textIce;
	private JTextField textRed;
	private JTextField textCheese;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A6_MakingPurchasesGUI  window = new U1A6_MakingPurchasesGUI ();
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
	public U1A6_MakingPurchasesGUI () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 603, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Nicholas'  Shop");
		label1.setBounds(122, 11, 499, 55);
		label1.setFont(new Font("Edwardian Script ITC", Font.BOLD | Font.ITALIC, 44));
		label1.setForeground(new Color(139, 0, 139));
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Enter the number of each macaroon that you would like to");
		label2.setBounds(98, 40, 421, 55);
		label2.setForeground(new Color(128, 0, 128));
		label2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("purchase and click. Calculate.");
		label3.setBounds(181, 77, 289, 25);
		label3.setForeground(new Color(128, 0, 128));
		label3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		frame.getContentPane().add(label3);
		
		JLabel label4 = new JLabel("Lemon Macaroons ($1.99)");
		label4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label4.setBackground(Color.CYAN);
		label4.setBounds(27, 137, 164, 14);
		frame.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("Blueberry Macaroons ($1.79)");
		label5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label5.setBounds(27, 181, 164, 14);
		frame.getContentPane().add(label5);
		
		JLabel label7 = new JLabel("Lime Macaroons ($1.79)");
		label7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label7.setBounds(27, 281, 176, 14);
		frame.getContentPane().add(label7);
		
		JLabel label8 = new JLabel("Banana Macaroons ($2.29)");
		label8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label8.setBounds(27, 330, 176, 14);
		frame.getContentPane().add(label8);
		
		JLabel label6 = new JLabel("Raspberry Macaroons ($1.99)");
		label6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label6.setBackground(Color.CYAN);
		label6.setForeground(Color.BLACK);
		label6.setBounds(27, 231, 176, 14);
		frame.getContentPane().add(label6);
		
		textChocolate = new JTextField();
		textChocolate.setBounds(201, 134, 86, 20);
		frame.getContentPane().add(textChocolate);
		textChocolate.setColumns(10);
		
		JLabel label9 = new JLabel("How many of each macaroons would you like to purchase?");
		label9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label9.setForeground(Color.BLACK);
		label9.setBounds(27, 112, 377, 14);
		frame.getContentPane().add(label9);
		
		textVanilla = new JTextField();
		textVanilla.setBounds(201, 178, 86, 20);
		frame.getContentPane().add(textVanilla);
		textVanilla.setColumns(10);
		
		textIce = new JTextField();
		textIce.setBounds(201, 228, 86, 20);
		frame.getContentPane().add(textIce);
		textIce.setColumns(10);
		
		textRed = new JTextField();
		textRed.setBounds(201, 278, 86, 20);
		frame.getContentPane().add(textRed);
		textRed.setColumns(10);
		
		textCheese = new JTextField();
		textCheese.setBounds(201, 327, 86, 20);
		frame.getContentPane().add(textCheese);
		textCheese.setColumns(10);
		
		JLabel label10 = new JLabel("Subtotal:");
		label10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label10.setBounds(329, 169, 141, 31);
		frame.getContentPane().add(label10);
		
		JLabel label11 = new JLabel("Tax Total(13%):");
		label11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label11.setBounds(329, 252, 166, 31);
		frame.getContentPane().add(label11);
		
		JLabel label12 = new JLabel("Grand Total:");
		label12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label12.setBounds(329, 330, 166, 31);
		frame.getContentPane().add(label12);
		
		JLabel subTotal = new JLabel("0");
		subTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		subTotal.setBounds(484, 173, 95, 25);
		frame.getContentPane().add(subTotal);
		
		JLabel taxTotal = new JLabel("0");
		taxTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		taxTotal.setBounds(484, 256, 95, 25);
		frame.getContentPane().add(taxTotal);
		
		JLabel grandTotal = new JLabel("0");
		grandTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		grandTotal.setBounds(484, 334, 95, 25);
		frame.getContentPane().add(grandTotal);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Variable Declaration
				final double LEMON = 1.99;
				final double BLUEBERRY = 1.79;
				final double RASPBERRY = 1.99;
				final double LIME = 1.79;
				final double BANANA = 2.29;
				int lemonAmount = 0;
				int blueberryAmount = 0;
				int raspberryAmount = 0;
				int limeAmount = 0;
				int bananaAmount = 0;
				double varSubTotal = 0;
				double varGrandTotal = 0;
				double varTaxTotal = 0;
				final double Taxes = 0.13;
				
				//Amount of Cake purchased(input from user)
				lemonAmount = Integer.parseInt(textChocolate.getText());
				blueberryAmount = Integer.parseInt(textVanilla.getText());
				raspberryAmount = Integer.parseInt(textIce.getText());
				limeAmount = Integer.parseInt(textRed.getText());
				bananaAmount = Integer.parseInt(textCheese.getText());
				
				//Calculate Sub total and output in label
				varSubTotal = (lemonAmount*LEMON) + (blueberryAmount*BLUEBERRY) + (raspberryAmount*RASPBERRY) + (limeAmount*LIME) + (bananaAmount*BANANA); 
				varSubTotal = varSubTotal*100;
				varSubTotal = Math.round(varSubTotal);
				varSubTotal = varSubTotal/100;
				subTotal.setText(String.valueOf("$" + varSubTotal));
				
				
				//Calculate Tax Total and output in label
				varTaxTotal = varSubTotal*Taxes;
				varTaxTotal = varTaxTotal*100;
				varTaxTotal = Math.round(varTaxTotal);
				varTaxTotal = varTaxTotal/100;
				taxTotal.setText(String.valueOf("$" + varTaxTotal));
				
				
				//Calculate Grand Total and output in label
				varGrandTotal = varSubTotal + varTaxTotal;
				varGrandTotal = varGrandTotal*100;
				varGrandTotal = Math.round(varGrandTotal);
				varGrandTotal = varGrandTotal/100;
				grandTotal.setText(String.valueOf("$" + varGrandTotal));

				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
		btnNewButton.setBounds(365, 120, 164, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton buttonClear = new JButton("Clear");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Clear
				textChocolate.setText("");
				textVanilla.setText("");
				textIce.setText("");
				textRed.setText("");
				textCheese.setText("");
				subTotal.setText("");
				taxTotal.setText("");
				grandTotal.setText("");
				
				
			}
		});
		buttonClear.setBounds(198, 374, 89, 23);
		frame.getContentPane().add(buttonClear);
		
		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		buttonExit.setBounds(329, 374, 89, 23);
		frame.getContentPane().add(buttonExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/macaroons.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(0, 0, 996, 428);
		frame.getContentPane().add(lblNewLabel);
	}
}
