package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class U3A2_CoinExchange {

	private JFrame frame;
	private JTextField txtQuarters;
	private JTextField txtDimes;
	private JTextField txtPennies;
	private JTextField txtNickles;
	private JTextField txtLoonies;
	private JTextField txtToonies;
	private JTextField txtAmount;
	double userAmount = 0;
	int qAm = 0;
	int nAm = 0;
	int lAm = 0;
	int dAm = 0;
	int pAm = 0;
	int tAm = 0;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A2_CoinExchange window = new U3A2_CoinExchange();
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
	public U3A2_CoinExchange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Change Exchange");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(150, 35, 198, 28);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblSub = new JLabel("Enter Currency");
		lblSub.setBounds(62, 74, 111, 14);
		frame.getContentPane().add(lblSub);
		
		JLabel lblSub2 = new JLabel("Amount (xxxx.xx)");
		lblSub2.setBounds(62, 97, 111, 14);
		frame.getContentPane().add(lblSub2);
		
		JLabel lblQuarters = new JLabel("Quarters");
		lblQuarters.setBounds(28, 256, 71, 14);
		frame.getContentPane().add(lblQuarters);
		
		JLabel lblDimes = new JLabel("Dimes");
		lblDimes.setBounds(42, 306, 71, 14);
		frame.getContentPane().add(lblDimes);
		
		JLabel lblNickles = new JLabel("Nickles");
		lblNickles.setBounds(187, 256, 71, 14);
		frame.getContentPane().add(lblNickles);
		
		JLabel lblPennies = new JLabel("Pennies");
		lblPennies.setBounds(187, 306, 71, 14);
		frame.getContentPane().add(lblPennies);
		
		JLabel lblToonies = new JLabel("Toonies");
		lblToonies.setBounds(327, 306, 71, 14);
		frame.getContentPane().add(lblToonies);
		
		JLabel lblLoonies = new JLabel("Loonies");
		lblLoonies.setBounds(327, 256, 71, 14);
		frame.getContentPane().add(lblLoonies);
		
		txtQuarters = new JTextField();
		txtQuarters.setBounds(87, 253, 86, 20);
		frame.getContentPane().add(txtQuarters);
		txtQuarters.setColumns(10);
		
		txtDimes = new JTextField();
		txtDimes.setColumns(10);
		txtDimes.setBounds(87, 303, 86, 20);
		frame.getContentPane().add(txtDimes);
		
		txtPennies = new JTextField();
		txtPennies.setColumns(10);
		txtPennies.setBounds(231, 303, 86, 20);
		frame.getContentPane().add(txtPennies);
		
		txtNickles = new JTextField();
		txtNickles.setColumns(10);
		txtNickles.setBounds(231, 253, 86, 20);
		frame.getContentPane().add(txtNickles);
		
		txtLoonies = new JTextField();
		txtLoonies.setColumns(10);
		txtLoonies.setBounds(384, 253, 86, 20);
		frame.getContentPane().add(txtLoonies);
		
		txtToonies = new JTextField();
		txtToonies.setColumns(10);
		txtToonies.setBounds(384, 303, 86, 20);
		frame.getContentPane().add(txtToonies);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(247, 74, 86, 20);
		frame.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {	
					
					userAmount = Double.parseDouble(txtAmount.getText());

				}catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				
				}

				if (userAmount > 0)	{
					
					tAm = toonies(userAmount);
					txtToonies.setText(Integer.toString(tAm));
					
					lAm = loonies(userAmount, tAm);
					txtLoonies.setText(Integer.toString(lAm));
					
					qAm = quarters(userAmount, tAm, lAm);
					txtQuarters.setText(Integer.toString(qAm));
					
					dAm = dimes(userAmount, tAm, lAm, qAm);
					txtDimes.setText(Integer.toString(dAm));
					
					nAm = nickles(userAmount, tAm, lAm, qAm, dAm);
					txtNickles.setText(Integer.toString(nAm));

					pAm = pennies(userAmount, tAm, lAm, qAm, dAm, nAm);
					txtPennies.setText(Integer.toString(pAm));
					
				
				}
				
				else {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
	
			}
		});
		btnCalculate.setBounds(113, 149, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		btnExit.setBounds(259, 149, 89, 23);
		frame.getContentPane().add(btnExit);
	}
	
	// DESCRIPTION - determines the amount of toonies
	// PARAMETERS - double
	// RETURN - int
	public static int toonies(double a) {
		
		int toonies = 0;
	
		toonies = (int)(a / 2);
				
		return toonies;
	
	}
	// DESCRIPTION - determines the amount of loonies
	// PARAMETERS - double, int
	// RETURN - int
	public static int loonies(double a, int t) {
		
		int loonies = 0;
		int toonies = t * 2;
	
		loonies = (int)(a - toonies);
				
		return loonies;
	
	}
	// DESCRIPTION - determines the amount of quarters
	// PARAMETERS - double, int, int
	// RETURN - int
	public static int quarters(double a, int t, int l) {
		
		int quarters = 0;
		int toonies = t*2;
		double amount = a - toonies - l;
	
		quarters = (int)(amount / 0.25);
				
		return quarters;
	
	}
	// DESCRIPTION - determines the amount of dimes
	// PARAMETERS - double, int, int, int
	// RETURN - int
	public static int dimes(double a, int t, int l, int q) {
		
		int dimes = 0;
		int toonies = t*2;
		double quarters = q*0.25;
		
		double amount = a - toonies - l - quarters;
	
		dimes = (int)(amount / 0.10);
				
		return dimes;
	
	}
	// DESCRIPTION - determines the amount of nickles
	// PARAMETERS - double, int, int, int, int
	// RETURN - int
	public static int nickles(double a, int t, int l, int q, int d) {
		
		int nickles = 0;
		int toonies = t*2;
		double dimes = d * 0.10;
		double quarters = q*0.25;
		
		double amount = a - toonies - l - quarters - dimes;
	
		nickles = (int)(amount / 0.05);
				
		return nickles;
	
	}
	// DESCRIPTION - determines the amount of pennies
	// PARAMETERS - double, int, int, int, int, int
	// RETURN - int
	public static int pennies(double a, int t, int l, int q, int d, int n) {
		
		int pennies = 0;
		int toonies = t*2;
		double dimes = d * 0.10;
		double quarters = q*0.25;
		double nickles = n * 0.05;
		 
		double amount = a - toonies - l - quarters - dimes - nickles;
	
		pennies = (int)(amount / 0.01);
				
		return pennies;
	
	}
	
}

