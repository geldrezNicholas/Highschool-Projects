package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Need to import for Error Window
import javax.swing.JOptionPane;

public class Period2TryCatch {

	
	//Variable Declarations
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	int num1 = 0;
	int num2 = 0;
	int answer = 0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Period2TryCatch window = new Period2TryCatch();
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
	public Period2TryCatch() {
		initialize();
		
		textField1.setText(Integer.toString(num1));
		textField2.setText(Integer.toString(num2));
		textField3.setText(Integer.toString(answer));
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(122, 118, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(230, 118, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(338, 118, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel label1 = new JLabel("First Number");
		label1.setBounds(138, 93, 70, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Second Number");
		label2.setBounds(230, 93, 86, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Answer");
		label3.setBounds(343, 93, 70, 14);
		frame.getContentPane().add(label3);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());				
					answer = num1 + num2;
					
					textField3.setText(Integer.toString(answer));
				}
				
				catch (Exception e) {
					
					System.out.println("Hello World!");
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		button1.setBounds(10, 117, 89, 23);
		frame.getContentPane().add(button1);
		

	}
}
