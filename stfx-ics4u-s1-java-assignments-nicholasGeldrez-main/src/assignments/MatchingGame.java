package assignments;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MatchingGame {

	// Variable Declarations

	// To hold values: 0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7
	ArrayList<Integer> orderedCards = new ArrayList();

	int l = 0;
	int counter = 0;
	int trys = 0;
	boolean poo = false;

	// To hold orderedCards after randomizing
	ArrayList<Integer> gameBoard = new ArrayList();

	ArrayList<Integer> buttons = new ArrayList();
	ArrayList<Integer> numberButn = new ArrayList();

	// Image Variables, located in resource folder
	ImageIcon pic1 = new ImageIcon(getClass().getResource("/resources/ram.jpg"));
	ImageIcon pic2 = new ImageIcon(getClass().getResource("/resources/case.jpg"));
	ImageIcon pic3 = new ImageIcon(getClass().getResource("/resources/dvd.jpg"));
	ImageIcon pic4 = new ImageIcon(getClass().getResource("/resources/harddrive.jpg"));
	ImageIcon pic5 = new ImageIcon(getClass().getResource("/resources/keyboard.jpg"));
	ImageIcon pic6 = new ImageIcon(getClass().getResource("/resources/mice.jpg"));
	ImageIcon pic7 = new ImageIcon(getClass().getResource("/resources/monitor.jpg"));
	ImageIcon pic8 = new ImageIcon(getClass().getResource("/resources/printer.jpg"));
	ImageIcon back = new ImageIcon(getClass().getResource("/resources/cardback.jpg"));
	ImageIcon done = new ImageIcon(getClass().getResource("/resources/done.jpg"));

	ImageIcon[] pictures = new ImageIcon[10];
	{

		pictures[0] = pic1;
		pictures[1] = pic2;
		pictures[2] = pic3;
		pictures[3] = pic4;
		pictures[4] = pic5;
		pictures[5] = pic6;
		pictures[6] = pic7;
		pictures[7] = pic8;
		pictures[8] = done;
		pictures[9] = back;

	}

	private JFrame frame;
	private JTextField textTry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchingGame window = new MatchingGame();
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
	public MatchingGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 429, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Matching Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(170, 11, 119, 38);
		frame.getContentPane().add(lblNewLabel);

		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn1.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(1);

					btn1.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(1);
				}

			}
		});
		btn1.setBounds(10, 48, 90, 100);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn2.getIcon().toString().contains("bin/resources/cardback.jpg")) {
					counter++;

					l = checkButtons(2);

					btn2.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(2);
				}
			}
		});
		btn2.setBounds(112, 49, 90, 100);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn3.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(3);

					btn3.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(3);
				}
			}
		});
		btn3.setBounds(212, 49, 90, 100);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn4.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(4);

					btn4.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(4);
				}
			}
		});
		btn4.setBounds(312, 48, 90, 100);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn5.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(5);

					btn5.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(5);
				}

			}
		});
		btn5.setBounds(10, 160, 90, 100);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn6.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(6);

					btn6.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(6);
				}

			}
		});
		btn6.setBounds(112, 160, 90, 100);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn7.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(7);

					btn7.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(7);
				}
			}
		});
		btn7.setBounds(212, 160, 90, 100);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn8.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(8);

					btn8.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(8);
				}
			}
		});
		btn8.setBounds(312, 160, 90, 100);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn9.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(9);

					btn9.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(9);
				}
			}
		});
		btn9.setBounds(10, 271, 90, 100);
		frame.getContentPane().add(btn9);

		JButton btn10 = new JButton("");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn10.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(10);

					btn10.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(10);
				}
			}
		});
		btn10.setBounds(112, 271, 90, 100);
		frame.getContentPane().add(btn10);

		JButton btn11 = new JButton("");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn11.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(11);

					btn11.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(11);
				}
			}
		});
		btn11.setBounds(212, 271, 90, 100);
		frame.getContentPane().add(btn11);

		JButton btn12 = new JButton("");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn12.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(12);

					btn12.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(12);
				}
			}
		});
		btn12.setBounds(312, 271, 90, 100);
		frame.getContentPane().add(btn12);

		JButton btn13 = new JButton("");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn13.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(13);

					btn13.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(13);
				}
			}
		});
		btn13.setBounds(10, 382, 90, 100);
		frame.getContentPane().add(btn13);

		JButton btn14 = new JButton("");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn14.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(14);

					btn14.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(14);
				}
			}
		});
		btn14.setBounds(112, 383, 90, 100);
		frame.getContentPane().add(btn14);

		JButton btn15 = new JButton("");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn15.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(15);

					btn15.setIcon(pictures[l]);
					buttons.add(l);

					numberButn.add(15);
				}

			}
		});
		btn15.setBounds(212, 383, 90, 100);
		frame.getContentPane().add(btn15);

		JButton btn16 = new JButton("");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn16.getIcon().toString().contains("bin/resources/cardback.jpg")) {

					counter++;

					l = checkButtons(16);

					btn16.setIcon(pictures[l]);

					buttons.add(l);

					numberButn.add(16);

				}
			}
		});
		btn16.setBounds(312, 382, 90, 100);
		frame.getContentPane().add(btn16);

		ArrayList<JButton> numberButtons = new ArrayList();
		{
			numberButtons.add(btn1);
			numberButtons.add(btn2);
			numberButtons.add(btn3);
			numberButtons.add(btn4);
			numberButtons.add(btn5);
			numberButtons.add(btn6);
			numberButtons.add(btn7);
			numberButtons.add(btn8);
			numberButtons.add(btn9);
			numberButtons.add(btn10);
			numberButtons.add(btn11);
			numberButtons.add(btn12);
			numberButtons.add(btn13);
			numberButtons.add(btn14);
			numberButtons.add(btn15);
			numberButtons.add(btn16);

		}

		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int number = 0;

				btn1.setIcon(back);
				btn2.setIcon(back);
				btn3.setIcon(back);
				btn4.setIcon(back);
				btn5.setIcon(back);
				btn6.setIcon(back);
				btn7.setIcon(back);
				btn8.setIcon(back);
				btn9.setIcon(back);
				btn10.setIcon(back);
				btn11.setIcon(back);
				btn12.setIcon(back);
				btn13.setIcon(back);
				btn14.setIcon(back);
				btn15.setIcon(back);
				btn16.setIcon(back);

				orderedCards.clear();
				gameBoard.clear();
				counter = 0;
				trys = 0;
				textTry.setText(Integer.toString(trys));


				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 2; j++) {

						orderedCards.add(i);

					}

				}

				for (int j = 0; j < 16; j++) {

					number = (int) ((Math.random() * orderedCards.size()));

					gameBoard.add(orderedCards.get(number));
					orderedCards.remove(orderedCards.get(number));

				}

			}
		});
		btnPlay.setBounds(42, 504, 89, 23);
		frame.getContentPane().add(btnPlay);

		JButton btnGuessAgain = new JButton("Guess Again");
		btnGuessAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				counter = 0;
				int x = 0;
				int y = 0;
				int h = 0;
				int i = 0;
				try {
					x = buttons.get(0);
					y = buttons.get(1);
					h = numberButn.get(0);
					i = numberButn.get(1);
				} catch (Exception c) {
					numberButtons.get(0).setIcon(back);
					numberButtons.get(1).setIcon(back);
					numberButtons.get(2).setIcon(back);
					numberButtons.get(3).setIcon(back);
					numberButtons.get(4).setIcon(back);
					numberButtons.get(5).setIcon(back);
					numberButtons.get(6).setIcon(back);
					numberButtons.get(7).setIcon(back);
					numberButtons.get(8).setIcon(back);
					numberButtons.get(9).setIcon(back);
					numberButtons.get(10).setIcon(back);
					numberButtons.get(11).setIcon(back);
					numberButtons.get(12).setIcon(back);
					numberButtons.get(13).setIcon(back);
					numberButtons.get(14).setIcon(back);
					numberButtons.get(14).setIcon(back);

					numberButn.clear();
					buttons.clear();

					JOptionPane.showMessageDialog(null, "Invalid entry!");

				}

				h = h - 1;
				i = i - 1;

				if (x == y) {

					numberButtons.get(i).setIcon(done);
					numberButtons.get(h).setIcon(done);

				}

				else {

					numberButtons.get(h).setIcon(back);
					numberButtons.get(i).setIcon(back);

				}

				buttons.clear();
				numberButn.clear();
			}
		});
		btnGuessAgain.setBounds(164, 504, 104, 23);
		frame.getContentPane().add(btnGuessAgain);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setBounds(300, 504, 89, 23);
		frame.getContentPane().add(btnExit);

		textTry = new JTextField();
		textTry.setBounds(326, 21, 48, 20);
		frame.getContentPane().add(textTry);
		textTry.setColumns(10);
	}

	public int checkButtons(int x) {

		int r = 0;

		if (counter <= 2) {

			r = setImage(x);
			if (counter % 2 == 0) {

				trys++;
				textTry.setText(Integer.toString(trys));

			}

		}

		else {

			r = 9;

		}

		return r;

	}

	public int setImage(int x) {

		int r = 0;

		int number = gameBoard.get(x - 1);

		if (number == 0) {

			r = 0;

		} else if (number == 1) {

			r = 1;

		} else if (number == 2) {

			r = 2;

		} else if (number == 3) {

			r = 3;

		} else if (number == 4) {

			r = 4;

		} else if (number == 5) {

			r = 5;

		} else if (number == 6) {

			r = 6;

		} else if (number == 7) {

			r = 7;

		}

		return r;

	}
}
