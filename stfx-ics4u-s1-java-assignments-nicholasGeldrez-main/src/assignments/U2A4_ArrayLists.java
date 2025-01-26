package assignments;

import java.util.ArrayList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.util.Comparator;

public class U2A4_ArrayLists {

	private JFrame frame;
	private JTextField textName;

	ArrayList<String> students = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A4_ArrayLists window = new U2A4_ArrayLists();
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
	public U2A4_ArrayLists() {
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

		JLabel lblNewLabel = new JLabel("Student Records");
		lblNewLabel.setBounds(155, 11, 110, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 48, 110, 14);
		frame.getContentPane().add(lblName);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 73, 255, 166);
		frame.getContentPane().add(textArea);

		textName = new JTextField();
		textName.setBounds(47, 45, 218, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				add(textName);

			}
		});
		btnAdd.setBounds(298, 48, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				remove(textName);

			}
		});
		btnRemove.setBounds(298, 82, 89, 23);
		frame.getContentPane().add(btnRemove);

		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				sort(textArea);

			}
		});
		btnSort.setBounds(298, 116, 89, 23);
		frame.getContentPane().add(btnSort);

		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				list(textArea);

			}
		});
		btnList.setBounds(298, 150, 89, 23);
		frame.getContentPane().add(btnList);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setBounds(298, 184, 89, 23);
		frame.getContentPane().add(btnExit);

	}

	// DESCRIPTION: Adds name to array
	// PARAMETER LIST: add(JTextField textName)
	// RETURN TYPE: N/A
	public void add(JTextField textName) {

		String stu = new String();

		stu = textName.getText();

		if (stu.matches("[a-zA-Z]+")) {

			students.add(stu);

		}

		else {

			JOptionPane.showMessageDialog(null, "Invalid Entry" + "\n" + "Enter a name");

		}

	}

	// DESCRIPTION: Removes typed name from array
	// PARAMETER LIST: remove(JTextField textName)
	// RETURN TYPE: N/A
	public void remove(JTextField textName) {

		students.remove(textName.getText());

	}

	// DESCRIPTION: Sorts and lists alphabetically
	// PARAMETER LIST: sort(JTextArea textArea)
	// RETURN TYPE: N/A
	public void sort(JTextArea textArea) {

		textArea.setText("");

		students.sort(Comparator.naturalOrder());

		for (int i = 0; i < students.size(); i++) {

			textArea.setText(textArea.getText() + students.get(i) + "\n");

		}
	}

	// DESCRIPTION: Lists array
	// PARAMETER LIST: list(JTextArea textArea)
	// RETURN TYPE: N/A
	public void list(JTextArea textArea) {

		textArea.setText("");

		for (int i = 0; i < students.size(); i++) {

			textArea.setText(textArea.getText() + students.get(i) + "\n");

		}
	}

}
