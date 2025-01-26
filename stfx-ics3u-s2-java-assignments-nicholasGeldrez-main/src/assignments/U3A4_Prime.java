package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A4_Prime {

	private JFrame frame;
	private JTextField txtInt;
	private JTextField txtBoo;
	int n;
	boolean prime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A4_Prime window = new U3A4_Prime();
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
	public U3A4_Prime() {
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
		
		JLabel lblHeader = new JLabel("Prime Numbers");
		lblHeader.setBounds(211, 32, 147, 14);
		frame.getContentPane().add(lblHeader);
		
		txtInt = new JTextField();
		txtInt.setBounds(60, 136, 86, 20);
		frame.getContentPane().add(txtInt);
		txtInt.setColumns(10);
		
		txtBoo = new JTextField();
		txtBoo.setColumns(10);
		txtBoo.setBounds(325, 136, 86, 20);
		frame.getContentPane().add(txtBoo);
		
		JLabel lblInt = new JLabel("Integer");
		lblInt.setBounds(82, 107, 64, 14);
		frame.getContentPane().add(lblInt);
		
		JLabel lblBoo = new JLabel("Is Prime");
		lblBoo.setBounds(360, 107, 64, 14);
		frame.getContentPane().add(lblBoo);
		
		JButton btnNewButton = new JButton("Determine");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {	
					
					n = Integer.parseInt(txtInt.getText());

				}catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				
				}
			
				if (n > 0)	{
					
				prime = prime(n);
				txtBoo.setText(String.valueOf(prime));
				
				}
				
				else {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
	
				}
					
			}
		});
		btnNewButton.setBounds(178, 135, 110, 23);
		frame.getContentPane().add(btnNewButton);
	}

	// DESCRIPTION - determines whether number is prime
	// PARAMETERS - int
	// RETURN - boolean
	public static boolean prime(int x) {
		
		if (x == 1) {
			
			return false;
		}
		
	     for(int i=2; i<=(x/2); i++) {
	    	 
	    	 if((x%i)==0) {
	               
	    		return  false;
	    	 }
	    	 
	     }

	     return true;
	    
	}
}
