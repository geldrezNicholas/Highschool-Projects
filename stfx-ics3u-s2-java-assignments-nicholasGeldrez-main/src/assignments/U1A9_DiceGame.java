package assignments;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class U1A9_DiceGame {

	//Variable Declaration
	private JFrame frame;
	private JTextField txtUserGuess;
	int totalRolls = 0;
	int totalCorrect = 0;
	int totalIncorrect = 0;
	int userGuess;
	int diceRoll;
	double percCorrect = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A9_DiceGame window = new U1A9_DiceGame();
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
	public U1A9_DiceGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("SUPER DICE GUESSING GAME");
		lblHeader.setFont(new Font("Verdana", Font.BOLD, 20));
		lblHeader.setBounds(52, 23, 360, 34);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblInst1 = new JLabel("Enter a number, from 1 to 6, \r\n");
		lblInst1.setBounds(172, 48, 170, 39);
		frame.getContentPane().add(lblInst1);
		
		JLabel lblInst2 = new JLabel("and click roll to roll the dice!");
		lblInst2.setBounds(172, 68, 170, 39);
		frame.getContentPane().add(lblInst2);
		
		JLabel lblUserGuess = new JLabel("YOUR GUESS");
		lblUserGuess.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblUserGuess.setBounds(52, 98, 133, 25);
		frame.getContentPane().add(lblUserGuess);
		
		txtUserGuess = new JTextField();
		txtUserGuess.setBounds(62, 118, 86, 20);
		frame.getContentPane().add(txtUserGuess);
		txtUserGuess.setColumns(10);
		
		JLabel lblDiceRoll = new JLabel("DICE ROLL");
		lblDiceRoll.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblDiceRoll.setBounds(312, 98, 100, 25);
		frame.getContentPane().add(lblDiceRoll);
		
		JLabel lblRollValue = new JLabel("");
		lblRollValue.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblRollValue.setBounds(322, 118, 66, 20);
		frame.getContentPane().add(lblRollValue);
		
		JLabel lblRolls = new JLabel("NUMBER OF ROLLS:");
		lblRolls.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblRolls.setBounds(52, 169, 178, 25);
		frame.getContentPane().add(lblRolls);
		
		JLabel lblCorrect = new JLabel("NUMBER  OF CORRECT GUESSES:");
		lblCorrect.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblCorrect.setBounds(52, 224, 280, 25);
		frame.getContentPane().add(lblCorrect);
		
		JLabel lblIncorrect = new JLabel("NUMBER OF INCORRECT GUESSES:");
		lblIncorrect.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblIncorrect.setBounds(52, 276, 280, 25);
		frame.getContentPane().add(lblIncorrect);
		
		JLabel lblPercent = new JLabel("PERCENTAGE OF CORRECT GUESSES:");
		lblPercent.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblPercent.setBounds(52, 325, 297, 25);
		frame.getContentPane().add(lblPercent);
		
		JLabel lblRollsValue = new JLabel("0");
		lblRollsValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRollsValue.setBounds(252, 170, 46, 14);
		frame.getContentPane().add(lblRollsValue);
		
		JLabel lblCorrectValue = new JLabel("0");
		lblCorrectValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCorrectValue.setBounds(332, 225, 46, 14);
		frame.getContentPane().add(lblCorrectValue);
		
		JLabel lblIncorrectValue = new JLabel("0");
		lblIncorrectValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIncorrectValue.setBounds(342, 279, 46, 14);
		frame.getContentPane().add(lblIncorrectValue);
		
		JLabel lblPercentValue = new JLabel("0");
		lblPercentValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPercentValue.setBounds(359, 328, 65, 14);
		frame.getContentPane().add(lblPercentValue);
		
		JButton btnRollDice = new JButton("ROLL DICE");
		btnRollDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				diceRoll = (int)Math.round(Math.random() * 5+1);
				lblRollValue.setText(String.valueOf(diceRoll));
				
				try {
					userGuess = Integer.parseInt(txtUserGuess.getText());
					
					if (1 <= userGuess && userGuess <= 6) {
					
						totalRolls ++;
	
						percCorrect = ((double)totalCorrect/(double)totalRolls)*100;
						
						percCorrect = percCorrect * 100;
						percCorrect = Math.round(percCorrect);
						percCorrect = percCorrect / 100;
						
						lblRollsValue.setText(String.valueOf(totalRolls));
						lblCorrectValue.setText(String.valueOf(totalCorrect));
						lblIncorrectValue.setText(String.valueOf(totalIncorrect));
						lblPercentValue.setText(String.valueOf(percCorrect + "%"));
					
					
						if (diceRoll == userGuess) {
							
							totalCorrect ++;
							
							
							
							}
						
						else {
							
							totalIncorrect ++;
							
							}
						
						}
						
					else {
							
						JOptionPane.showMessageDialog(null, "Invalid Entry");
							
						}
						
					}
				
				catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnRollDice.setBounds(184, 117, 114, 23);
		frame.getContentPane().add(btnRollDice);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		btnExit.setBounds(178, 361, 89, 23);
		frame.getContentPane().add(btnExit);
		
	}
}
