package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
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
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Variable Declaration
				double firstNumber = 0;
				double secondNumber = 0;
				double answer = 0;
				
				firstNumber = Double.parseDouble(textField1.getText());
				secondNumber = Double.parseDouble(textField2.getText());
				
				answer = firstNumber + secondNumber;
				
				textField3.setText(Double.toString(answer));


				
			}
		});
		button1.setBounds(27, 27, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Subtract");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Variable Declaration
				double firstNumber = 0;
				double secondNumber = 0;
				double answer = 0;
				
				firstNumber = Double.parseDouble(textField1.getText());
				secondNumber = Double.parseDouble(textField2.getText());
				
				answer = firstNumber - secondNumber;
				
				textField3.setText(Double.toString(answer));
				
				
			}
		});
		button2.setBounds(27, 60, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Multiply");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Variable Declaration
				double firstNumber = 0;
				double secondNumber = 0;
				double answer = 0;
				
				firstNumber = Double.parseDouble(textField1.getText());
				secondNumber = Double.parseDouble(textField2.getText());
				
				answer = firstNumber * secondNumber;
				
				textField3.setText(Double.toString(answer));
				
				
			}
		});
		button3.setBounds(27, 94, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Divide");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Variable Declaration
				double firstNumber = 0;
				double secondNumber = 0;
				double answer = 0;
				
				firstNumber = Double.parseDouble(textField1.getText());
				secondNumber = Double.parseDouble(textField2.getText());
				
				answer = firstNumber / secondNumber;
				
				textField3.setText(Double.toString(answer));
				
				
			}
		});
		button4.setBounds(27, 128, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("Clear");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Clear Button Code
				
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				
			}
		});
		button5.setBounds(27, 162, 89, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("Exit");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		button6.setBounds(27, 195, 89, 23);
		frame.getContentPane().add(button6);
		
		JLabel calculate = new JLabel("Calculator");
		calculate.setFont(new Font("Tahoma", Font.BOLD, 13));
		calculate.setBounds(174, 11, 76, 14);
		frame.getContentPane().add(calculate);
		
		JLabel label2 = new JLabel("Answer");
		label2.setBounds(174, 148, 46, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Second Number");
		label3.setBounds(174, 103, 114, 14);
		frame.getContentPane().add(label3);
		
		JLabel label1 = new JLabel("First Number");
		label1.setBounds(174, 60, 129, 14);
		frame.getContentPane().add(label1);
		
		textField1 = new JTextField();
		textField1.setBounds(273, 61, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(273, 100, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(273, 145, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
	}
}
