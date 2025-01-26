package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A1_RandomQuoteGenerator {

	private JFrame frame;
	int randomNumber = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A1_RandomQuoteGenerator window = new U2A1_RandomQuoteGenerator();
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
	public U2A1_RandomQuoteGenerator() {
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
		
		Label lblHeader = new Label("Positive Practice!");
		lblHeader.setFont(new Font("RomanT", Font.BOLD, 18));
		lblHeader.setBounds(128, 10, 189, 22);
		frame.getContentPane().add(lblHeader);
		
		Label lblSub = new Label("Click the Generate Quote button in order to be insipired!");
		lblSub.setBounds(79, 85, 279, 22);
		frame.getContentPane().add(lblSub);
		
		Label lblQuote = new Label("");
		lblQuote.setBounds(41, 191, 332, 22);
		frame.getContentPane().add(lblQuote);
		
		Button btnGenerate = new Button("Generate Quote");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				randomNumber = ((int)(Math.random()*8)+1);
					
					
				switch(randomNumber) {
				
					case 1: 
						lblQuote.setText(String.valueOf("Adversity is temporary"));
						break;
					
					case 2:
						lblQuote.setText(String.valueOf("I walk slowly, but I never walk backward."));
						break;
					
					case 3:
						lblQuote.setText(String.valueOf("Find the things you love and do them everyday, even if it means failing."));
						break;
						
					case 4:
						lblQuote.setText(String.valueOf("Make peace with your broken pieces"));
						break;
					
					case 5:
						lblQuote.setText(String.valueOf("If people aren't having fun, they seldom produce good work."));
						break;
				
					case 6:
						lblQuote.setText(String.valueOf("Make yourself a priority."));
						break;
						
					case 7:
						lblQuote.setText(String.valueOf("It's the will, not the skill."));
						break;
						
					case 8:
						lblQuote.setText(String.valueOf("Just because you're taking longer than others does not mean you're a failure. Keep going!"));
						break;
				
				}
			
				
			}
		});
		btnGenerate.setBounds(142, 141, 139, 22);
		frame.getContentPane().add(btnGenerate);
	}
}
