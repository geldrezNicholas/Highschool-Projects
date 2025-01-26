package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A8_Encryption {

	private JFrame frame;
	private JTextField txtE1;
	private JTextField txtE2;
	private JTextField txtD1;
	private JTextField txtD2;
	private JButton btnD;
	String encrypt;
	String decrypt;
	final int SHIFT = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A8_Encryption window = new U3A8_Encryption();
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
	public U3A8_Encryption() {
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
		
		JLabel lblHeader = new JLabel("Caesar Cipher");
		lblHeader.setBounds(196, 40, 106, 14);
		frame.getContentPane().add(lblHeader);
		
		txtE1 = new JTextField();
		txtE1.setText("Enter message to encrypt.");
		txtE1.setBounds(125, 83, 270, 20);
		frame.getContentPane().add(txtE1);
		txtE1.setColumns(10);
		
		txtE2 = new JTextField();
		txtE2.setText("Encrypted message will appear here.");
		txtE2.setColumns(10);
		txtE2.setBounds(125, 114, 270, 20);
		frame.getContentPane().add(txtE2);
		
		txtD1 = new JTextField();
		txtD1.setText("Enter message to decrypt.");
		txtD1.setColumns(10);
		txtD1.setBounds(125, 163, 270, 20);
		frame.getContentPane().add(txtD1);
		
		txtD2 = new JTextField();
		txtD2.setText("Decrypted message will appear here.");
		txtD2.setColumns(10);
		txtD2.setBounds(125, 194, 270, 20);
		frame.getContentPane().add(txtD2);
		
		JButton btnE = new JButton("Encrypt");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			try {	
				
				encrypt = txtE1.getText();
				
				String text = encryptString(encrypt, SHIFT);
				
				txtE2.setText(text);
				
			} catch(Exception e) {
				
				txtE2.setText("Error!");
				
				}
			
			}
		});
		btnE.setBounds(26, 95, 89, 23);
		frame.getContentPane().add(btnE);
		
		JButton btnC = new JButton("Clear All");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    txtE1.setText("Enter message to encrypt.");
			    txtE2.setText("Encrypted message will appear here.");
			    txtD1.setText("Enter message to decrypt.");
			    txtD2.setText("Decrypted message will appear here.");
				
			}
		});
		btnC.setBounds(177, 225, 89, 23);
		frame.getContentPane().add(btnC);
		
		btnD = new JButton("Decrypt");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {	
					encrypt = txtD1.getText();

					String text = decryptString(encrypt, SHIFT);
					
					txtD2.setText(text);
					
				} 
				catch(Exception e) {
					
					txtD2.setText("Error!");
						
				}
		
			}
		});
		btnD.setBounds(26, 177, 89, 23);
		frame.getContentPane().add(btnD);
	}
	
	// DESCRIPTION - decrypts string given
	// PARAMETERS - String, int
	// RETURN - String
	public static String decryptString(String x, int y) {
		
	    String decryptedString = "";
	    
	    try {
	    
	    for (int i = 0; i < x.length(); i++) {
	    	
	        int tA = x.charAt(i) - y;

		      if (tA > 90 && tA < 97) {
		    	  
			        tA -= 26; 
			        
			       }
			      
			      if (tA > 122) {
			    	  
			        tA -= 26; 
			        
			      }

	        decryptedString = String.valueOf(decryptedString) + (char)tA;
	        
	    }
	    
	    return decryptedString;
	    
	    }
	    
	    catch(Exception e) {
	    	
	    	return "Error!";
	    	
	    }
	    
	}

	// DESCRIPTION - encrypts string given
	// PARAMETERS - String, int
	// RETURN - String
	public static String encryptString(String x, int y) {
		
		String encryptedString = "";
		
		try {
		
		for (int i = 0; i < x.length(); i++) {
			
		      int tA = x.charAt(i) + y;
		      
		      if (tA > 90 && tA < 97) {
		    	  
		        tA -= 26; 
		        
		       }
		      
		      if (tA > 122) {
		    	  
		        tA -= 26; 
		        
		      }
		      
		      encryptedString = String.valueOf(encryptedString) + (char)tA;
		      
		    } 
		
		    return encryptedString;
		    
		}
		catch(Exception e) {
			
			return "Error!";
			
		}
		
	}
	
	
}
