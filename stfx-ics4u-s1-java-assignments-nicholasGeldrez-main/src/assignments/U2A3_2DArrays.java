package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A3_2DArrays {

	int counter = 0;
	String[][] student = new String[15][6];
	String FN = "";
	String LN = "";
	int test1 = 0;
	int test2 = 0;
	int test3 = 0;
	int test4 = 0;
	int stuAvg = 0;

	private JFrame frame;
	private JTextField textFN;
	private JTextField textLN;
	private JTextField textTest1;
	private JTextField textTest2;
	private JTextField textTest3;
	private JTextField textTest4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A3_2DArrays window = new U2A3_2DArrays();
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
	public U2A3_2DArrays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Grades");
		lblNewLabel.setBounds(230, 26, 128, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(26, 74, 128, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(244, 74, 128, 14);
		frame.getContentPane().add(lblLastName);

		textFN = new JTextField();
		textFN.setBounds(102, 71, 86, 20);
		frame.getContentPane().add(textFN);
		textFN.setColumns(10);

		textLN = new JTextField();
		textLN.setColumns(10);
		textLN.setBounds(323, 71, 86, 20);
		frame.getContentPane().add(textLN);

		JLabel lblFirstName_1 = new JLabel("Test 1:");
		lblFirstName_1.setBounds(26, 127, 128, 14);
		frame.getContentPane().add(lblFirstName_1);

		JLabel lblFirstName_1_1 = new JLabel("Test 2:");
		lblFirstName_1_1.setBounds(26, 152, 128, 14);
		frame.getContentPane().add(lblFirstName_1_1);

		JLabel lblFirstName_1_2 = new JLabel("Test 3:");
		lblFirstName_1_2.setBounds(26, 177, 128, 14);
		frame.getContentPane().add(lblFirstName_1_2);

		JLabel lblFirstName_1_3 = new JLabel("Test 4:");
		lblFirstName_1_3.setBounds(26, 202, 128, 14);
		frame.getContentPane().add(lblFirstName_1_3);

		textTest1 = new JTextField();
		textTest1.setBounds(102, 124, 96, 20);
		frame.getContentPane().add(textTest1);
		textTest1.setColumns(10);

		textTest2 = new JTextField();
		textTest2.setColumns(10);
		textTest2.setBounds(102, 149, 96, 20);
		frame.getContentPane().add(textTest2);

		textTest3 = new JTextField();
		textTest3.setColumns(10);
		textTest3.setBounds(102, 174, 96, 20);
		frame.getContentPane().add(textTest3);

		textTest4 = new JTextField();
		textTest4.setColumns(10);
		textTest4.setBounds(102, 202, 96, 20);
		frame.getContentPane().add(textTest4);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 233, 510, 328);
		frame.getContentPane().add(textArea);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				stuAdd(textArea, btnAdd);

			}
		});
		btnAdd.setBounds(244, 118, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnStudentAverage = new JButton("Student Average");
		btnStudentAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				stuAvg(textArea);

			}
		});
		btnStudentAverage.setBounds(385, 118, 135, 23);
		frame.getContentPane().add(btnStudentAverage);

		JButton btnTestAverage = new JButton("Test Average");
		btnTestAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				testAvg(textArea);

			}
		});
		btnTestAverage.setBounds(385, 148, 135, 23);
		frame.getContentPane().add(btnTestAverage);

		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				stuLists(textArea);

			}
		});
		btnList.setBounds(244, 148, 89, 23);
		frame.getContentPane().add(btnList);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setBounds(323, 198, 89, 23);
		frame.getContentPane().add(btnExit);
	}

	// DESCRIPTION: Determines test averages.
	// PARAMETER LIST: testAvg(JTextArea textArea)
	// RETURN TYPE: N/A
	public void testAvg(JTextArea textArea) {

		textArea.setText("Test 1\tTest 2\tTest 3\tTest 4");

		test1 = 0;
		test2 = 0;
		test3 = 0;
		test4 = 0;

		for (int j = 0; j < 15; j++) {

			if (student[j][0] == null) {

				test1 = test1 / j;
				test2 = test2 / j;
				test3 = test3 / j;
				test4 = test4 / j;

				break;

			} else {

				if (j == 14) {

					test1 = test1 / 15;
					test2 = test2 / 15;
					test3 = test3 / 15;
					test4 = test4 / 15;

				}

				test1 += Integer.parseInt(student[j][2]);
				test2 += Integer.parseInt(student[j][3]);
				test3 += Integer.parseInt(student[j][4]);
				test4 += Integer.parseInt(student[j][5]);

			}
		}

		textArea.setText(textArea.getText() + "\n" + test1 + "\t" + test2 + "\t" + test3 + "\t" + test4);

	}

	// DESCRIPTION: Determines a students average
	// PARAMETER LIST: stuAvg(JTextArea textArea)
	// RETURN TYPE: N/A
	public void stuAvg(JTextArea textArea) {

		textArea.setText("First Name\tLast Name\tTest Average");

		FN = textFN.getText();
		LN = textLN.getText();

		for (int i = 0; i < 15; i++) {

			if (student[i][0] != null && student[i][0].equals(FN) && student[i][1].equals(LN)) {

				test1 = Integer.parseInt(student[i][2]);
				test2 = Integer.parseInt(student[i][3]);
				test3 = Integer.parseInt(student[i][4]);
				test4 = Integer.parseInt(student[i][5]);

				stuAvg = (test1 + test2 + test3 + test4) / 4;

				break;

			} else {

				stuAvg = 0;

			}

		}

		textArea.setText(textArea.getText() + "\n" + FN + "\t" + LN + "\t" + stuAvg);

	}

	// DESCRIPTION: Lists students in order of their attributes
	// PARAMETER LIST: stuLists(JTextArea textArea)
	// RETURN TYPE: N/A
	public void stuLists(JTextArea textArea) {

		textArea.setText("First Name\tLast Name\tTest 1\tTest 2\tTest 3\tTest 4\n");

		for (int i = 0; i < 15; i++) {

			if (student[i][0] == null) {

				break;

			} else {

				for (int j = 0; j < 6; j++) {

					textArea.setText(textArea.getText() + student[i][j] + "\t");
				}
			}

			textArea.setText(textArea.getText() + "\n");
		}

	}

	// DESCRIPTION: Adds student to array
	// PARAMETER LIST: stuAdd(JTextArea textArea, JButton Add)
	// RETURN TYPE: N/A
	public void stuAdd(JTextArea textArea, JButton btnAdd) {

		if (counter < student.length - 1) {

			try {

				student[counter][0] = textFN.getText();
				student[counter][1] = textLN.getText();
				Integer.valueOf(student[counter][2] = textTest1.getText());
				Integer.valueOf(student[counter][3] = textTest2.getText());
				Integer.valueOf(student[counter][4] = textTest3.getText());
				Integer.valueOf(student[counter][5] = textTest4.getText());

			} catch (Exception c) {

				JOptionPane.showMessageDialog(null, "Invalid Entry");
				counter--;

			}

		}

		else {

			btnAdd.setEnabled(false);

		}

		if (Integer.valueOf(student[counter][2]) < 0 || Integer.valueOf(student[counter][2]) > 100
				|| Integer.valueOf(student[counter][3]) < 0 || Integer.valueOf(student[counter][3]) > 100
				|| Integer.valueOf(student[counter][4]) < 0 || Integer.valueOf(student[counter][4]) > 100
				|| Integer.valueOf(student[counter][5]) < 0 || Integer.valueOf(student[counter][5]) > 100) {

			counter--;

			JOptionPane.showMessageDialog(null, "Invalid Entry");

		}

		counter += 1;

	}

}
