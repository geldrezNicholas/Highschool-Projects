package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A9_Binary {

	private JFrame frame;
	private JTextField txtA1;
	private JTextField txtA2;
	private JTextField txtB1;
	private JTextField txtB2;
	String input;
	String output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A9_Binary window = new U3A9_Binary();
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
	public U3A9_Binary() {
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
		
		JLabel lblHeader = new JLabel("Binary-Decimal Converter");
		lblHeader.setBounds(143, 29, 175, 14);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblSub = new JLabel("Binary (8-bits)");
		lblSub.setBounds(67, 65, 79, 14);
		frame.getContentPane().add(lblSub);
		
		JLabel lblDecimal = new JLabel("Decimal");
		lblDecimal.setBounds(309, 65, 79, 14);
		frame.getContentPane().add(lblDecimal);
		
		JLabel lblDecimal_1 = new JLabel("Decimal (127 to -128)");
		lblDecimal_1.setBounds(43, 167, 175, 14);
		frame.getContentPane().add(lblDecimal_1);
		
		JLabel lblDecimal_1_1 = new JLabel("Binary ");
		lblDecimal_1_1.setBounds(309, 167, 79, 14);
		frame.getContentPane().add(lblDecimal_1_1);
		
		txtA1 = new JTextField();
		txtA1.setBounds(60, 92, 86, 20);
		frame.getContentPane().add(txtA1);
		txtA1.setColumns(10);
		
		txtA2 = new JTextField();
		txtA2.setColumns(10);
		txtA2.setBounds(288, 90, 86, 20);
		frame.getContentPane().add(txtA2);
		
		txtB1 = new JTextField();
		txtB1.setColumns(10);
		txtB1.setBounds(60, 192, 86, 20);
		frame.getContentPane().add(txtB1);
		
		txtB2 = new JTextField();
		txtB2.setColumns(10);
		txtB2.setBounds(288, 192, 86, 20);
		frame.getContentPane().add(txtB2);
		
		JButton btnTD = new JButton("To Decimal");
		btnTD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					input = txtA1.getText();
					
					if (input.length() != 8) {
						
						txtA2.setText("Error, try again!");
						
					}
					else {
						
						txtA2.setText(bToD(input));
					
					}
				}
				catch (Exception e1) {
					txtA2.setText("Error, try again!");
				}	
				
			}
		});
		btnTD.setBounds(156, 91, 122, 23);
		frame.getContentPane().add(btnTD);
		
		JButton btnDT = new JButton("To Binary");
		btnDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = txtB1.getText();
				
				if (Integer.parseInt(input) > 127 || Integer.parseInt(input) < -128) {
					
					txtB2.setText("Error, try again!");
					
				}
				else {
					
				output = dToB(input);
				txtB2.setText(output);
				
				}
				
			}
		});
		btnDT.setBounds(167, 191, 111, 23);
		frame.getContentPane().add(btnDT);
	}
	
		// DESCRIPTION - converts binary to decimals
		// PARAMETERS - String
		// RETURN - String
		public static String bToD(String x) {
			
		    int decimal = 0;
		    int ex = 6;
		    boolean zeros = true;
		    
		    for (int i = 1; i < x.length(); i++) {
		    	
		    	if (x.charAt(i) == '1') {
		    	  
		    	  zeros = false; 
		    	  
		    	}
		    } 
		    
		    if (x.charAt(0) == '0' && zeros) {
		    	
		      return "0"; 
		      
		    }
		      
		    if (x.charAt(0) == '1' && zeros) {
		    	
		      return "-128";   
		    }
		  
		    for (int bit = 1; bit < x.length(); bit++) {
		    	
		      if (x.charAt(bit) == '1') {
		    	  
		        decimal += (int)Math.pow(2.0, ex); 
		        
		      }
		        
		      ex--;

		      
		    } 
		    
		    if (x.charAt(0) == '1') {
		    	
		      decimal = -decimal; 
		      
		    }
		    
		    return Integer.toString(decimal);
		 
	    }
		
		// DESCRIPTION - converts decimals to binary
		// PARAMETERS - String
		// RETURN - String
		public static String dToB(String d) {
			  
			   int decimal = Integer.parseInt(d);
			   String binary = "";
			    
			    
			   if (decimal == -128) {
			    	
			     return "10000000"; 
			      
			   }
			      
			   if (decimal < 0) {
			    	
			     binary = String.valueOf(binary) + "1";
			     decimal =- decimal;
			      
			   } 
			    
			   else {
			    	
			     binary = String.valueOf(binary) + "0";
			      
			   } 
			    
			   for (int i = 64; i > 0; i = i/2) {
			    	
				if (decimal / i >= 1) {
					decimal %= i;
					binary = String.valueOf(binary) + "1";
						
				} 
					
				else {
						
					binary = String.valueOf(binary) + "0";
						  
				} 
				
			   }
			    
		    return binary; 
		    
		  } 

}

