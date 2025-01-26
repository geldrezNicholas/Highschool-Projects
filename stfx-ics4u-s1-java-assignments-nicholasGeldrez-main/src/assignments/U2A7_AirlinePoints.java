package assignments;

import java.awt.EventQueue;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A7_AirlinePoints {

	private JFrame frame;
	private JTextField textLast;
	private JTextField textFirst;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;

	// Variable Declaration
	ImageIcon plane = new ImageIcon(getClass().getResource("/resources/plane.jpg"));
	ArrayList<String> firstName = new ArrayList();
	ArrayList<String> lastName = new ArrayList();
	ArrayList<Integer> week1 = new ArrayList();
	ArrayList<Integer> week2 = new ArrayList();
	ArrayList<Integer> week3 = new ArrayList();
	ArrayList<Integer> week4 = new ArrayList();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A7_AirlinePoints window = new U2A7_AirlinePoints();
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
	public U2A7_AirlinePoints() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Airline Points");
		lblNewLabel.setBounds(169, 26, 118, 19);
		frame.getContentPane().add(lblNewLabel);

		textLast = new JTextField();
		textLast.setBounds(291, 95, 109, 20);
		frame.getContentPane().add(textLast);
		textLast.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setBounds(10, 98, 88, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textFirst = new JTextField();
		textFirst.setColumns(10);
		textFirst.setBounds(77, 95, 109, 20);
		frame.getContentPane().add(textFirst);
		
		JButton btnIcon = new JButton("");
		btnIcon.setBounds(326, 136, 186, 116);
		frame.getContentPane().add(btnIcon);
		
		btnIcon.setIcon(plane);

		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setBounds(199, 98, 88, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Week 1:");
		lblNewLabel_1_2.setBounds(10, 140, 88, 14);
		frame.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Week 2:");
		lblNewLabel_1_2_1.setBounds(10, 165, 88, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Week 3:");
		lblNewLabel_1_2_1_1.setBounds(10, 192, 88, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Week 4:");
		lblNewLabel_1_2_1_1_1.setBounds(10, 217, 88, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1);

		text1 = new JTextField();
		text1.setColumns(10);
		text1.setBounds(77, 137, 109, 20);
		frame.getContentPane().add(text1);

		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(77, 165, 109, 20);
		frame.getContentPane().add(text2);

		text3 = new JTextField();
		text3.setColumns(10);
		text3.setBounds(77, 189, 109, 20);
		frame.getContentPane().add(text3);

		text4 = new JTextField();
		text4.setColumns(10);
		text4.setBounds(77, 217, 109, 20);
		frame.getContentPane().add(text4);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 263, 502, 140);
		frame.getContentPane().add(textArea);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				personAdd();

			}
		});
		btnAdd.setBounds(220, 136, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				list(textArea);

			}
		});
		btnList.setBounds(220, 165, 89, 23);
		frame.getContentPane().add(btnList);

		JButton btnTotal = new JButton("Total Points");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				totalPoints(textArea);

			}
		});
		btnTotal.setBounds(220, 192, 89, 23);
		frame.getContentPane().add(btnTotal);
		
	}

	// DESCRIPTION: Adds person to array
	// PARAMETER LIST: personAdd(JTextArea textArea)
	// RETURN TYPE: N/A
	public void personAdd() {

		String name1 = new String();
		String name2 = new String();

		name1 = textFirst.getText();
		name2 = textLast.getText();

		try {
			week1.add(Integer.parseInt(text1.getText()));
			week2.add(Integer.parseInt(text2.getText()));
			week3.add(Integer.parseInt(text3.getText()));
			week4.add(Integer.parseInt(text4.getText()));
		} catch (Exception c) {

			JOptionPane.showMessageDialog(null, "Invalid Entry" + "\n" + "Enter a name");

		}

		if (name1.matches("[a-zA-Z]+") && name2.matches("[a-zA-Z]+")) {

			firstName.add(name1);
			lastName.add(name2);

		} else {
			JOptionPane.showMessageDialog(null, "Invalid Entry" + "\n" + "Enter a name");

		}
	}

	// DESCRIPTION: Lists the total points of a the person written
	// PARAMETER LIST: totalPoints(JTextArea textArea)
	// RETURN TYPE: N/A
	public void totalPoints(JTextArea textArea) {
		
		textArea.setText("");
		
		String name1 = new String();
		String name2 = new String();

		int num = 0;
		int total = 0;
		int bonus = 0;

		name1 = textFirst.getText();
		name2 = textLast.getText();

		if (name1.matches("[a-zA-Z]+") && name2.matches("[a-zA-Z]+")) {

			num = firstName.indexOf(name1);
			total = (week1.get(num) + week2.get(num) + week3.get(num) + week4.get(num));

			if (total >= 5000) {
				bonus = 1000;
				total += bonus;
				textArea.setText(textArea.getText() + firstName.get(num) + "'s Total Points are: " + total + " Bonus: " + bonus + "\n");

			} else {

				textArea.setText(textArea.getText() + firstName.get(num) + "'s Total Points are: " + total + " Bonus: " + bonus + "\n");

			}

		} else {
			JOptionPane.showMessageDialog(null, "Invalid Entry" + "\n" + "Enter a number");

		}

	}

	// DESCRIPTION: Lists array(names of people and their points)
	// PARAMETER LIST: list(JTextArea textArea)
	// RETURN TYPE: N/A
	public void list(JTextArea textArea) {

		textArea.setText("First Name\tLast Name\tWeek 1\tWeek 2\tWeek 3\tWeek 4\n");
		
		for (int i = 0; i < firstName.size(); i++) {

			textArea.setText(textArea.getText() + firstName.get(i) + "\t" + lastName.get(i) + "\t" + week1.get(i) + "\t"
					+ week2.get(i) + "\t" + week3.get(i) + "\t" + week4.get(i) + "\n");

		}
	}
}