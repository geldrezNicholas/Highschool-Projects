package assignments;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import lessons.Employee;
import assignments.Book;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A4_SearchAlgorithm {

	private JFrame frame;
	private JTextField textRef;
	private JTextField textTitle;
	private JTextField textAut;

	Book book = new Book();
	ArrayList<Book> myBookList = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A4_SearchAlgorithm window = new U3A4_SearchAlgorithm();
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
	public U3A4_SearchAlgorithm() {
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

		JLabel lblNewLabel = new JLabel("St,FX Learning Commons");
		lblNewLabel.setBounds(137, 30, 170, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Book Reference #:");
		lblNewLabel_1.setBounds(51, 75, 116, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Book Title:");
		lblNewLabel_1_1.setBounds(51, 121, 116, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Author:");
		lblNewLabel_1_1_1.setBounds(51, 164, 116, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		textRef = new JTextField();
		textRef.setBounds(166, 73, 239, 20);
		frame.getContentPane().add(textRef);
		textRef.setColumns(10);

		textTitle = new JTextField();
		textTitle.setColumns(10);
		textTitle.setBounds(166, 118, 239, 20);
		frame.getContentPane().add(textTitle);

		textAut = new JTextField();
		textAut.setColumns(10);
		textAut.setBounds(166, 161, 239, 20);
		frame.getContentPane().add(textAut);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BufferedReader br = null;
				String referenceNumber = new String();
				String title = new String();
				String author = new String();
				Book finalBook = null;
				int num = 0;

				try {
					br = new BufferedReader(new FileReader("BookList.txt"));
				} catch (Exception e2) {

					e2.printStackTrace();

				}

				try {

					while ((referenceNumber = br.readLine()) != null) {

						title = br.readLine();
						author = br.readLine();

						myBookList.add(new Book(referenceNumber, title, author));

					}
				} catch (Exception e2) {

					e2.printStackTrace();

				}

				Book[] bookList = new Book[myBookList.size()];

				int ref = Integer.parseInt(textRef.getText());

				myBookList.toArray(bookList);

				finalBook = search(ref, bookList, num);

				if (myBookList.contains(finalBook) == false) {

					textTitle.setText("Title Not Found!");
					textAut.setText("Author Not Found!");

				}

				else {

					textTitle.setText(finalBook.title);
					textAut.setText(finalBook.author);

				}

			}

		});
		btnSearch.setBounds(67, 213, 89, 23);
		frame.getContentPane().add(btnSearch);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textRef.setText("");
				textTitle.setText("");
				textAut.setText("");

			}
		});
		btnClear.setBounds(180, 213, 89, 23);
		frame.getContentPane().add(btnClear);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setBounds(289, 213, 89, 23);
		frame.getContentPane().add(btnExit);
	}

	// DESCRIPTION: Recursively searches for book through reference number
	// PARAMETER LIST: search(int rn, Book[] bl, int i)
	// RETURN TYPE: Book
	public Book search(int rn, Book[] bl, int i) {

		if (rn <= 0) {

			return null;

		}

		else if (rn == Integer.parseInt(bl[i].getReferenceNum())) {

			return bl[i];

		}

		else if (i >= 23) {

			return null;

		}

		else {

			return search(rn, bl, i + 1);
		}
	}
}
