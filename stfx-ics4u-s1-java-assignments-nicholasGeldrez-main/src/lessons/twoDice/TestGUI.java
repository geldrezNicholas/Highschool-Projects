package lessons.twoDice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestGUI {

	// create instance of TwoDice object
	TwoDice myGame = new TwoDice();
	
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
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
	public TestGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Dice 1");
		lblNewLabel.setBounds(283, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDice = new JLabel("Dice 2");
		lblDice.setBounds(283, 151, 46, 14);
		frame.getContentPane().add(lblDice);
		
		textField1 = new JTextField();
		textField1.setBounds(265, 83, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(265, 176, 86, 20);
		frame.getContentPane().add(textField2);
		
		JButton btn1 = new JButton("Roll di!");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myGame.rollDi();
				
				textField1.setText(Integer.toString(myGame.getDice1()));
				textField2.setText(Integer.toString(myGame.getDice2()));
	
			}
		});
		btn1.setBounds(104, 124, 89, 23);
		frame.getContentPane().add(btn1);
	}

}
