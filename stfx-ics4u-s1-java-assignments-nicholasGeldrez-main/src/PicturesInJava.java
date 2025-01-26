import java.awt.EventQueue;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PicturesInJava {

	// Variables
	ImageIcon broThinkEverythingAGame = new ImageIcon(getClass().getResource("/resources/sillydog.jpg"));
	ImageIcon fattyDog = new ImageIcon(getClass().getResource("/resources/fattydog.jpg"));


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PicturesInJava window = new PicturesInJava();
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
	public PicturesInJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1763, 831);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("New label");
		label1.setBounds(10, 0, 1750, 800);
		frame.getContentPane().add(label1);
		
		// set label to display image upon application launch
		label1.setIcon(broThinkEverythingAGame);
		
		JButton btnChange = new JButton("Change Pic");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label1.setIcon(fattyDog);

				
			}
		});
		btnChange.setBounds(352, 427, 89, 23);
		frame.getContentPane().add(btnChange);
	}
}
