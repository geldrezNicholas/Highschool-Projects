package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;

import assignments.Student;

public class U3A4b_SearchAlgorithm {

	private JFrame frame;
	private JTextField textSearch;
	private JTextField textStudent;
	private JTextField textGrade;

	Student student = new Student();
	ArrayList<Student> studentList = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A4b_SearchAlgorithm window = new U3A4b_SearchAlgorithm();
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
	public U3A4b_SearchAlgorithm() {
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

		JLabel lblNewLabel = new JLabel("Student Grades");
		lblNewLabel.setBounds(155, 11, 96, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Search Criteria");
		lblNewLabel_1.setBounds(35, 57, 110, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textSearch = new JTextField();
		textSearch.setBounds(155, 54, 187, 20);
		frame.getContentPane().add(textSearch);
		textSearch.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Student");
		lblNewLabel_1_1.setBounds(35, 96, 110, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		textStudent = new JTextField();
		textStudent.setColumns(10);
		textStudent.setBounds(155, 93, 187, 20);
		frame.getContentPane().add(textStudent);

		JLabel lblNewLabel_1_1_1 = new JLabel("Grade");
		lblNewLabel_1_1_1.setBounds(35, 145, 110, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		textGrade = new JTextField();
		textGrade.setColumns(10);
		textGrade.setBounds(155, 142, 187, 20);
		frame.getContentPane().add(textGrade);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BufferedReader br = null;
				String student = new String();
				String grade = new String();

				try {
					br = new BufferedReader(new FileReader("StudentGrades.txt"));
				} catch (Exception e2) {

					e2.printStackTrace();

				}

				try {

					while ((student = br.readLine()) != null) {

						grade = br.readLine();
						studentList.add(new Student(student, grade));

					}
				} catch (Exception e2) {

					e2.printStackTrace();

				}

				studentList.get(0).getStudent();
				
				String[] fubar = linearSearch(textSearch.getText());
		
				if (fubar[0].equals("true")) {

					textStudent.setText(fubar[1]);
					textGrade.setText(fubar[2]);

				}

				else {

					textStudent.setText("Student Not Found!");
					textGrade.setText("Grade Not Found!");
					

				}
			}
		});
		btnSearch.setBounds(50, 212, 89, 23);
		frame.getContentPane().add(btnSearch);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textSearch.setText("");
				textStudent.setText("");
				textGrade.setText("");

			}
		});
		btnClear.setBounds(155, 212, 89, 23);
		frame.getContentPane().add(btnClear);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setBounds(269, 212, 89, 23);
		frame.getContentPane().add(btnExit);
	}

	public String[] linearSearch(String t) {
		
		String[] result = {"false", "", ""};
		String name = new String();
		String lastName = new String();

		
		for (int i = 0; i < studentList.size(); i++) {
			
			String[] fullName = studentList.get(i).getStudent().split(" ",2);

			name = fullName[0];
			lastName = fullName[1];
			
			
			if (name.compareToIgnoreCase(t.toString()) == 0 || lastName.compareToIgnoreCase(t.toString()) == 0) {

				result[0] = "true";
				result[1] = name + " " + lastName;
				result[2] = studentList.get(i).getGrade().toString();

				return result;

			}

		}

		return result;

	}

}
