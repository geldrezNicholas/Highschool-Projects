package lessons.review;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorGUI {

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
		frame.setBounds(100, 100, 450, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(281, 51, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(281, 106, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(281, 168, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel label4 = new JLabel("First Number");
		label4.setBounds(275, 38, 92, 14);
		frame.getContentPane().add(label4);
		
		JLabel label1 = new JLabel("Calculator");
		label1.setBounds(159, 28, 92, 14);
		frame.getContentPane().add(label1);
		
		JLabel label3 = new JLabel("Second Number");
		label3.setBounds(275, 94, 106, 14);
		frame.getContentPane().add(label3);
		
		JLabel label2 = new JLabel("Answer");
		label2.setBounds(275, 155, 92, 14);
		frame.getContentPane().add(label2);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				num1 = Integer.parseInt(textField1.getText());
				num2 = Integer.parseInt(textField2.getText());

				} catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
				
				answer = num1 + num2;
				textField3.setText(Integer.toString(answer));
				
			}
		});
		button1.setBounds(65, 50, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Subtract");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				num1 = Integer.parseInt(textField1.getText());
				num2 = Integer.parseInt(textField2.getText());

				} catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
				
				answer = num1 - num2;
				textField3.setText(Integer.toString(answer));
				
			}
		});
		button2.setBounds(65, 90, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Multiply");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				num1 = Integer.parseInt(textField1.getText());
				num2 = Integer.parseInt(textField2.getText());

				} catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
				
				answer = num1*num2;
				textField3.setText(Integer.toString(answer));
				
			}
		});
		button3.setBounds(65, 134, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Divide");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				num1 = Integer.parseInt(textField1.getText());
				num2 = Integer.parseInt(textField2.getText());

				} catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
				
				answer = num1/num2;
				textField3.setText(Integer.toString(answer));
				
			}
		});
		button4.setBounds(65, 177, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("Clear");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");

				
			}
		});
		button5.setBounds(65, 221, 89, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("Exit");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		button6.setBounds(65, 264, 89, 23);
		frame.getContentPane().add(button6);
	}
}
