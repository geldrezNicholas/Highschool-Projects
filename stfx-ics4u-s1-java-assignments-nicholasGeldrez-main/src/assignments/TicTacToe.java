package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TicTacToe {
	ImageIcon x = new ImageIcon(getClass().getResource("/resources/X.jpg"));
	ImageIcon o = new ImageIcon(getClass().getResource("/resources/O.jpg"));
	ImageIcon blank = new ImageIcon(getClass().getResource("/resources/blank.jpg"));
	ImageIcon[] xo = new ImageIcon[3];
	{
		xo[0] = o;
		xo[1] = x;
		xo[2] = blank;
	}
	Integer[] xonumImage = new Integer[1];
	int[] frames = new int[9];
	{
		for (int h = 2; h < 11; h++) {
			frames[h - 2] = h;
		}
	}
	int counter = 0;
	int numImage = 0;
	int returns = 0;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(156, 11, 184, 21);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblWin = new JLabel("");
		lblWin.setBounds(49, 438, 68, 14);
		frame.getContentPane().add(lblWin);

		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn1.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn1.setIcon(xo[numImage]);
					frames[0] = numImage;
					lblWin.setText(win(btn1));
				}
			}
		});
		btn1.setBounds(30, 51, 106, 92);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn2.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn2.setIcon(xo[numImage]);
					frames[1] = numImage;
					lblWin.setText(win(btn2));
				}
			}
		});
		btn2.setBounds(166, 51, 106, 92);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn3.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn3.setIcon(xo[numImage]);
					frames[2] = numImage;
					lblWin.setText(win(btn3));
				}
			}
		});
		btn3.setBounds(306, 51, 106, 92);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn4.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn4.setIcon(xo[numImage]);
					frames[3] = numImage;
					lblWin.setText(win(btn4));
				}
			}
		});
		btn4.setBounds(30, 154, 106, 92);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn5.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn5.setIcon(xo[numImage]);
					frames[4] = numImage;
					lblWin.setText(win(btn5));
				}
			}
		});
		btn5.setBounds(166, 154, 106, 92);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn6.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn6.setIcon(xo[numImage]);
					frames[5] = numImage;
					lblWin.setText(win(btn6));
				}
			}
		});
		btn6.setBounds(306, 154, 106, 92);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn7.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn7.setIcon(xo[numImage]);
					frames[6] = numImage;
					lblWin.setText(win(btn7));
				}
			}
		});
		btn7.setBounds(30, 257, 106, 92);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn8.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn8.setIcon(xo[numImage]);
					frames[7] = numImage;
					lblWin.setText(win(btn8));
				}
			}
		});
		btn8.setBounds(166, 257, 106, 92);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn9.getIcon().toString().contains("/resources/blank.jpg")) {
					counter++;
					check();
					btn9.setIcon(xo[numImage]);
					frames[8] = numImage;
					lblWin.setText(win(btn9));
				}
			}
		});
		btn9.setBounds(306, 257, 106, 92);
		frame.getContentPane().add(btn9);

		JButton[] buttons = new JButton[9];
		{
			buttons[0] = btn1;
			buttons[1] = btn2;
			buttons[2] = btn3;
			buttons[3] = btn4;
			buttons[4] = btn5;
			buttons[5] = btn6;
			buttons[6] = btn7;
			buttons[7] = btn8;
			buttons[8] = btn9;
		}

		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xonumImage[0] = 0;
				counter = 1;
				reset(buttons);
			}
		});
		btnX.setBounds(61, 386, 51, 41);
		frame.getContentPane().add(btnX);

		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xonumImage[0] = 1;
				counter = 0;
				reset(buttons);
			}
		});
		btnO.setBounds(177, 386, 51, 41);
		frame.getContentPane().add(btnO);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(285, 386, 121, 41);
		frame.getContentPane().add(btnExit);
	}
	// DESCRIPTION: Resets when clicking x or o
	// PARAMETER LIST: reset(JButton[] buttons, int c)
	// RETURN TYPE: void
	public void reset(JButton[] buttons) {
		for (int i = 0; i < 9; i++) {
			buttons[i].setIcon(blank);
		}
		for (int i = 2; i < 11; i++) {
			frames[i - 2] = i;
		}
	}
	// DESCRIPTION: Calls to another method from corresponding numImageber to see if
	// user clicked x or o
	// PARAMETER LIST: check(int c)
	// RETURN TYPE: void
	public void check() {
		if (xonumImage[0] == 1) {
			numImage = xoGuess();
		} else {
			numImage = xoGuess();
		}
	}
	// DESCRIPTION: If user clicked "O", returns numImageber corresponding to image
	// PARAMETER LIST: oGuess(int c)
	// RETURN TYPE: void
	public int xoGuess() {
		int r = 0;
			if (counter % 2 == 0) {
				r = 1;
			} else {
				r = 0;
		}
		return r;
	}
	// DESCRIPTION: Determines who wins the game
	// PARAMETER LIST: win(int c)
	// RETURN TYPE: String
	public String win(JButton button) {
		String r = "";
		if ((frames[0] == frames[1] && frames[2] == frames[0]) || (frames[3] == frames[4] && frames[5] == frames[3]) 	|| (frames[6] == frames[7] && frames[8] == frames[6]) || (frames[0] == frames[3] && frames[6] == frames[0]) || (frames[1] == frames[4] && frames[7] == frames[1]) || (frames[2] == frames[5] && frames[8] == frames[2]) || (frames[0] == frames[4] && frames[8] == frames[0]) || (frames[2] == frames[4] && frames[6] == frames[2])) {
			if (counter % 2 == 0) {
				r = ("X's Wins!");
			} else {
				r = ("O's Wins!");
			}
		} else if ((frames[0] != 2) && (frames[1] != 3) && (frames[2] != 4) && (frames[3] != 5) && (frames[4] != 6) && (frames[5] != 7) && (frames[6] != 8) && (frames[7] != 9) && (frames[8] != 10)) {
			r = ("TIE!");
		} else {
		}
		return r;
	}
}