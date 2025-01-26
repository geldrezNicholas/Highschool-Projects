package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DecrementCounter {

	//Variable Declaration
	private JFrame frame;
	private JTextField textField1;
	int counter = 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecrementCounter window = new DecrementCounter();
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
	public DecrementCounter() {
		initialize();
		
		//Set text field to display initial counter value
		textField1.setText(Integer.toString(counter));
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Count Down");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Counter - 1;
				counter--;
				
				textField1.setText(Integer.toString(counter));
				
			}
		});
		button1.setBounds(39, 121, 151, 23);
		frame.getContentPane().add(button1);
		
		textField1 = new JTextField();
		textField1.setBounds(244, 122, 162, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
	}

}
