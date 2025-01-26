package assignments.bowling;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import lessons.twoDice.TwoDice;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BowlingTest {

	// create instance of Bowling object
	Bowling bowlingGame = new Bowling();
	
	int clicks = 0;
	int pins;
	
	private JFrame frame;
	private JTextField textRoll1;
	private JTextField textFrame;
	private JTextField textScore;
	private JTextField textRoll2;
	private JTextField textFS;

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
		
		JLabel lblRoll = new JLabel("Roll 1:");
		lblRoll.setBounds(91, 106, 78, 14);
		frame.getContentPane().add(lblRoll);
		
		JLabel lblRoll_1_1_1 = new JLabel("Frames Played: ");
		lblRoll_1_1_1.setBounds(123, 206, 150, 14);
		frame.getContentPane().add(lblRoll_1_1_1);
		
		JLabel lblRoll_1_1_2 = new JLabel("Current Score: ");
		lblRoll_1_1_2.setBounds(123, 267, 150, 14);
		frame.getContentPane().add(lblRoll_1_1_2);
		
		textRoll1 = new JTextField();
		textRoll1.setBounds(83, 131, 86, 20);
		frame.getContentPane().add(textRoll1);
		textRoll1.setColumns(10);
		
		textFrame = new JTextField();
		textFrame.setColumns(10);
		textFrame.setBounds(299, 203, 86, 20);
		frame.getContentPane().add(textFrame);
		
		textScore = new JTextField();
		textScore.setColumns(10);
		textScore.setBounds(299, 264, 86, 20);
		frame.getContentPane().add(textScore);
		
		JLabel lblRoll_2 = new JLabel("Roll 2:");
		lblRoll_2.setBounds(307, 106, 78, 14);
		frame.getContentPane().add(lblRoll_2);
		
		textRoll2 = new JTextField();
		textRoll2.setColumns(10);
		textRoll2.setBounds(278, 131, 86, 20);
		frame.getContentPane().add(textRoll2);
		
		JLabel lblFrameScore = new JLabel("Frame Score");
		lblFrameScore.setBounds(124, 162, 78, 14);
		frame.getContentPane().add(lblFrameScore);
		
		textFS = new JTextField();
		textFS.setColumns(10);
		textFS.setBounds(232, 162, 86, 20);
		frame.getContentPane().add(textFS);
		
		JLabel lblHeader = new JLabel("Welcome to bowling! Each frame you will get two rolls! Click the button to get started!");
		lblHeader.setBounds(10, 36, 500, 14);
		frame.getContentPane().add(lblHeader);
		
		JButton btnFrame = new JButton("Roll!");
		btnFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if (bowlingGame.frame != 20) {
					
					if ((bowlingGame.frame % 2 )== 0) {
						
						textFrame.setText(Integer.toString((bowlingGame.frame / 2) + 1));
						textFS.setText(Integer.toString(0));
						textRoll1.setText(Integer.toString(0));
						textRoll2.setText(Integer.toString(0));

						pins = 10;
					}
					
					bowlingGame.roll(pins);
					pins -= bowlingGame.roll1;
					
					textFS.setText(Integer.toString((bowlingGame.roll1 + bowlingGame.roll2)));
					textRoll1.setText(Integer.toString(bowlingGame.roll1));
					textRoll2.setText(Integer.toString(bowlingGame.roll2));
					textScore.setText(Integer.toString(bowlingGame.score));					
				}
				
				
			}
		});
		btnFrame.setBounds(209, 61, 89, 23);
		frame.getContentPane().add(btnFrame);
		

	}
}
