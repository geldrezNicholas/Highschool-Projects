package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A7_Arrays {

	//Variable Delcaration
	private JFrame frame;
	private JTextField txtMark1;
	private JTextField txtMark2;
	private JTextField txtMark3;
	private JTextField txtMark4;
	private JTextField txtMark5;
	double courseMark1 = 0;
	double courseMark2 = 0;
	double courseMark3 = 0;
	double courseMark4 = 0;
	double courseMark5 = 0;
	double total = 0;
	double average = 0;
	final int MARK_DIVIDER = 5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A7_Arrays window = new U2A7_Arrays();
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
	public U2A7_Arrays() {
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
		
		JLabel lblHeader = new JLabel("Average Calculator!");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHeader.setBounds(145, 23, 154, 28);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblMark1 = new JLabel("Mark 1:");
		lblMark1.setBounds(67, 69, 46, 14);
		frame.getContentPane().add(lblMark1);
		
		JLabel lblMark2 = new JLabel("Mark 2:");
		lblMark2.setBounds(67, 94, 46, 14);
		frame.getContentPane().add(lblMark2);
		
		JLabel lblMark3 = new JLabel("Mark 3:");
		lblMark3.setBounds(67, 119, 46, 14);
		frame.getContentPane().add(lblMark3);
		
		JLabel lblMark4 = new JLabel("Mark 4:");
		lblMark4.setBounds(67, 144, 46, 14);
		frame.getContentPane().add(lblMark4);
		
		JLabel lblMark1_1_1_2 = new JLabel("Mark 5:");
		lblMark1_1_1_2.setBounds(67, 169, 46, 14);
		frame.getContentPane().add(lblMark1_1_1_2);
		
		txtMark1 = new JTextField();
		txtMark1.setBounds(166, 66, 86, 20);
		frame.getContentPane().add(txtMark1);
		txtMark1.setColumns(10);
		
		txtMark2 = new JTextField();
		txtMark2.setColumns(10);
		txtMark2.setBounds(166, 91, 86, 20);
		frame.getContentPane().add(txtMark2);
		
		txtMark3 = new JTextField();
		txtMark3.setColumns(10);
		txtMark3.setBounds(166, 116, 86, 20);
		frame.getContentPane().add(txtMark3);
		
		txtMark4 = new JTextField();
		txtMark4.setColumns(10);
		txtMark4.setBounds(166, 141, 86, 20);
		frame.getContentPane().add(txtMark4);
		
		txtMark5 = new JTextField();
		txtMark5.setColumns(10);
		txtMark5.setBounds(166, 166, 86, 20);
		frame.getContentPane().add(txtMark5);
		
		JLabel lblAverage = new JLabel("");
		lblAverage.setBounds(186, 218, 66, 14);
		frame.getContentPane().add(lblAverage);
		
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Get marks
				courseMark1 = Double.parseDouble(txtMark1.getText());
				courseMark2 = Double.parseDouble(txtMark2.getText());
				courseMark3 = Double.parseDouble(txtMark3.getText());
				courseMark4 = Double.parseDouble(txtMark4.getText());
				courseMark5 = Double.parseDouble(txtMark5.getText());
				
				double [ ] marks = {courseMark1, courseMark2, courseMark3, courseMark4, courseMark5};
				
				//Loop to add marks
		        for (int i = 0; i<=4; i= i + 1)
		        {
		            total = total + marks[i];
		        }
		        //Create percentage
		        average = total/MARK_DIVIDER;
		        //Rounding
		        average = average * 100;
		        average = Math.round(average);
		        average = average/100;
		        //Output
		        lblAverage.setText(String.valueOf(average + "%")); 
				

			}
		});
		btnCalculate.setBounds(60, 214, 116, 23);
		frame.getContentPane().add(btnCalculate);

	}
}
