package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A3_Factorial {

	private JFrame frame;
	private JTextField txtN;
	private JTextField txtNF;
	int nFac;
	int n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3_Factorial window = new U3A3_Factorial();
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
	public U3A3_Factorial() {
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
		
		JLabel lblHeader = new JLabel("Factorial");
		lblHeader.setBounds(194, 32, 66, 14);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblN = new JLabel("n");
		lblN.setBounds(106, 95, 66, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblN2 = new JLabel("n!");
		lblN2.setBounds(301, 95, 66, 14);
		frame.getContentPane().add(lblN2);
		
		txtN = new JTextField();
		txtN.setBounds(63, 144, 86, 20);
		frame.getContentPane().add(txtN);
		txtN.setColumns(10);
		
		txtNF = new JTextField();
		txtNF.setBounds(301, 144, 86, 20);
		frame.getContentPane().add(txtNF);
		txtNF.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {	
					
					n = Integer.parseInt(txtN.getText());
						
				}catch (Exception e) {
						
					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
					}
	
				if (n > 0)	{
					
					nFac = Factorial(n);
					txtNF.setText(String.valueOf(nFac));
				
				}
				
				else {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");

				}
				
			}
		});
		btnCalculate.setBounds(180, 143, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}

	// DESCRIPTION - determines the factorial of number
	// PARAMETERS - int
	// RETURN - int
	public static int Factorial(int x) {
		
		for (int i = (x-1); i >= 1; i--) {
		
			x *= i;
			
		}
		
		return x;

	}

}
