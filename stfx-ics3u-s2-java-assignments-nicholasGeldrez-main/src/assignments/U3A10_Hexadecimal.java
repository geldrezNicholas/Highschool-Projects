package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A10_Hexadecimal {

	private JFrame frame;
	private JLabel lblDecimalTo;
	private JTextField txtB1;
	private JTextField txtB2;
	private JTextField txtA1;
	String input = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A10_Hexadecimal window = new U3A10_Hexadecimal();
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
	public U3A10_Hexadecimal() {
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
		
		JLabel lblHeader = new JLabel("Hexadecimal-Decimal Converter");
		lblHeader.setBounds(123, 25, 238, 14);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblHex = new JLabel("Hex (4 nibbles)");
		lblHex.setBounds(49, 69, 130, 14);
		frame.getContentPane().add(lblHex);
		
		JLabel lblDec = new JLabel("Decimal");
		lblDec.setBounds(272, 69, 113, 14);
		frame.getContentPane().add(lblDec);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal");
		lblHexadecimal.setBounds(282, 165, 113, 14);
		frame.getContentPane().add(lblHexadecimal);
		
		lblDecimalTo = new JLabel("Decimal (0 to 65,535)");
		lblDecimalTo.setBounds(37, 165, 142, 14);
		frame.getContentPane().add(lblDecimalTo);
		
		txtB1 = new JTextField();
		txtB1.setBounds(59, 190, 86, 20);
		frame.getContentPane().add(txtB1);
		txtB1.setColumns(10);
		
		txtB2 = new JTextField();
		txtB2.setColumns(10);
		txtB2.setBounds(275, 190, 86, 20);
		frame.getContentPane().add(txtB2);
		
		JTextField txtA2 = new JTextField();
		txtA2.setColumns(10);
		txtA2.setBounds(275, 94, 86, 20);
		frame.getContentPane().add(txtA2);
		
		txtA1 = new JTextField();
		txtA1.setColumns(10);
		txtA1.setBounds(49, 94, 86, 20);
		frame.getContentPane().add(txtA1);
		
		JButton btnToHex = new JButton("To Hex");
		btnToHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text = "";
				
				try {
					
					text = txtB1.getText();
					
					txtB2.setText(toHexadecimal(text));
					
				}
				
				catch (Exception e1) {
					
					txtB2.setText("Error!");
					
				}
				
			}
		});
		btnToHex.setBounds(172, 189, 89, 23);
		frame.getContentPane().add(btnToHex);
		
		JButton btnToDec = new JButton("To Decimal");
		btnToDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					input = txtA1.getText();
					
					txtA2.setText(toDecimal(input));
					
				}
				
				catch (Exception e1) {
					
					txtA2.setText("Error!");
					
				}
				
			}
				
			
		});
		btnToDec.setBounds(145, 94, 120, 23);
		frame.getContentPane().add(btnToDec);
	}
	
	// DESCRIPTION - converts hexadecimals to decimals
	// PARAMETERS - String
	// RETURN - String
	public static String toDecimal(String x) {
		
		try {
			
			if (x.length() > 4) {
				throw new Exception();
				
			}
			
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i) != '0' && x.charAt(i) != '1' && x.charAt(i) != '2' && x.charAt(i) != '3' && x.charAt(i) != '4' && 
					x.charAt(i) != '5' && x.charAt(i) != '6' && x.charAt(i) != '7' && x.charAt(i) != '8' && x.charAt(i) != '9' && 
					x.charAt(i) != 'A' && x.charAt(i) != 'B' && x.charAt(i) != 'C' && x.charAt(i) != 'D' && 
					x.charAt(i) != 'E' && x.charAt(i) != 'F') {
					throw new Exception();
					
				}

			}
			
			return String.valueOf(Integer.parseInt(x, 16));
			
		}
		
		catch (Exception e1) {
			
			return "Error!";
			
		}
		
	}
	
	// DESCRIPTION - converts decimals to hexadecimals
	// PARAMETERS - String
	// RETURN - String
	public static String toHexadecimal(String x) {
		
		int dec = 0;

			if (0 < dec || 65535 > dec) {
			
			dec = Integer.parseInt(x);
			
			}
			
			else {
				
				return "Error!";
				
			}

		
		return Integer.toHexString(dec).toUpperCase();
		
	}
	
}
