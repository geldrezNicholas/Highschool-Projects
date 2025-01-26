package assignments;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A5_Algorithms {

	private JFrame frame;
	private JTextField txtSeq;
	private JTextField txtFib;
	int n;
	int fib;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A5_Algorithms window = new U3A5_Algorithms();
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
	public U3A5_Algorithms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Fibonacci");
		lblHeader.setBounds(184, 45, 89, 14);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblSeq = new JLabel("Sequence Number");
		lblSeq.setBounds(57, 85, 118, 14);
		frame.getContentPane().add(lblSeq);
		
		JLabel lblFib = new JLabel("Fibonacci Number");
		lblFib.setBounds(276, 85, 118, 14);
		frame.getContentPane().add(lblFib);
		
		txtSeq = new JTextField();
		txtSeq.setBounds(67, 115, 86, 20);
		frame.getContentPane().add(txtSeq);
		txtSeq.setColumns(10);
		
		txtFib = new JTextField();
		txtFib.setBounds(286, 115, 86, 20);
		frame.getContentPane().add(txtFib);
		txtFib.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {	
					
					n = Integer.parseInt(txtSeq.getText());

				}catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				
				}

				if (n > 0)	{
					
				fib = Fibonacci(n, fib);
				txtFib.setText(String.valueOf(fib));
				
				}
				
				else {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
				
			}
		});
		btnCalculate.setBounds(169, 114, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}
	
	// DESCRIPTION - determines the fibonacci number
	// PARAMETERS - int, int
	// RETURN - int
	public static int Fibonacci(int x, int y) {
		
		int num1 = 0;
		int num2 = 1;
		
		if (x == 0 || x == 1) {
			
			y = 0;
			
		}
		if (x == 2 || x == 3) {
			
			y = 1;
			
		}
		
		else {
			
			for (int i = 3; i <= x; i++) {
				
				y = num1 + num2;
				num1 = num2;
				num2 = y;

			}
		}
		return y;
	}
	
}
