package assignments.BowlingFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BowlingTest {

// create instance of Bowling object
	Bowling bowlingGame = new Bowling();

	private JFrame frame;
	private JTextField textFrame;
	private JTextField textScore;
	private JTextField textRoll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BowlingTest window = new BowlingTest();
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
public BowlingTest() {
initialize();
}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Bowling");
		lblNewLabel.setBounds(232, 11, 78, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblRoll_1_1_1 = new JLabel("Frames Played: ");
		lblRoll_1_1_1.setBounds(123, 206, 150, 14);
		frame.getContentPane().add(lblRoll_1_1_1);

		JLabel lblRoll_1_1_2 = new JLabel("Current Score: ");
		lblRoll_1_1_2.setBounds(123, 267, 150, 14);
		frame.getContentPane().add(lblRoll_1_1_2);

		textFrame = new JTextField();
		textFrame.setColumns(10);
		textFrame.setBounds(299, 203, 86, 20);
		frame.getContentPane().add(textFrame);

		textScore = new JTextField();
		textScore.setColumns(10);
		textScore.setBounds(299, 264, 86, 20);
		frame.getContentPane().add(textScore);

		textRoll = new JTextField();
		textRoll.setColumns(10);
		textRoll.setBounds(299, 143, 86, 20);
		frame.getContentPane().add(textRoll);

		JLabel lblRoll = new JLabel("Current Roll: ");
		lblRoll.setBounds(123, 146, 78, 14);
		frame.getContentPane().add(lblRoll);

		JLabel lblHeader = new JLabel(
				"Welcome to bowling! Each frame you will get two rolls! Click the button to get started!");
		lblHeader.setBounds(10, 36, 500, 14);
		frame.getContentPane().add(lblHeader);

		JButton btnFrame = new JButton("Roll!");
		btnFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bowlingGame.roll(textRoll, textFrame, textScore, btnFrame);
				
			}
		});

		btnFrame.setBounds(209, 61, 89, 23);
		frame.getContentPane().add(btnFrame);

	}
}
