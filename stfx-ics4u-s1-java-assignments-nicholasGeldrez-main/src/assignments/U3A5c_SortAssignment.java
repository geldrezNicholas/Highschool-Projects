package assignments;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A5c_SortAssignment {

	private JFrame frame;
	private JTextField textField;
	Hispanic hispanic = new Hispanic();
	ArrayList<Hispanic> arrayList = new ArrayList();

	BufferedReader br = null;
	String[] fullLine = new String[13];
	String line = new String();
	String indicator = new String();
	String unit = new String();
	String unitNum = new String();
	String stubName = new String();
	String stubNameNum = new String();
	String stubLabel = new String();
	String stubLabelNum = new String();
	String year = new String();
	String yearNum = new String();
	String age = new String();
	String ageNum = new String();
	String estimate = new String();
	String flag = new String();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A5c_SortAssignment window = new U3A5c_SortAssignment();
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
	public U3A5c_SortAssignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		try {
			br = new BufferedReader(new FileReader("deathsHispanic.csv"));
		} catch (Exception e2) {

			e2.printStackTrace();

		}

		try {

			while ((line = br.readLine()) != null) {

				fullLine = line.split(",");

				indicator = fullLine[0];
				unit = fullLine[1];
				unitNum = fullLine[2];
				stubName = fullLine[3];
				stubNameNum = fullLine[4];
				stubLabel = fullLine[5];
				stubLabelNum = fullLine[6];
				year = fullLine[7];
				yearNum = fullLine[8];
				age = fullLine[9];
				ageNum = fullLine[10];
				estimate = fullLine[11];
				flag = fullLine[12];

				arrayList.add(new Hispanic(indicator, unit, unitNum, stubName, stubNameNum, stubLabel, stubLabelNum, year, yearNum,
						age, ageNum, estimate, flag));

			}
		} catch (Exception e2) {

			e2.printStackTrace();

		}

		Hispanic[] array = new Hispanic[arrayList.size()];

		arrayList.toArray(array);
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 852, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(194, 11, 632, 411);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(10, 175, 174, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearchI = new JButton("Search Int");
		btnSearchI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.getText();
				
				
			}
		});
		btnSearchI.setBounds(10, 106, 174, 23);
		frame.getContentPane().add(btnSearchI);
		
		JButton btnSearchS = new JButton("Search String");
		btnSearchS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnSearchS.setBounds(10, 140, 174, 23);
		frame.getContentPane().add(btnSearchS);
		
		JButton btnAscending = new JButton("Ascending");
		btnAscending.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String poo = new String();
				
				sortRef(array, true);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
				
			}
		});
		btnAscending.setBounds(10, 206, 174, 23);
		frame.getContentPane().add(btnAscending);
		
		JButton btnDescending = new JButton("Descending");
		btnDescending.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, false);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
				
				
			}
		});
		btnDescending.setBounds(10, 240, 174, 23);
		frame.getContentPane().add(btnDescending);
	}
	
	// DESCRIPTION - Sorts Hispanic array ascending (true) or descending (false) directions .
	// PARAMETERS - Hispanic[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortRef(Hispanic[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getInd().compareTo(a[i + 1].getInd()) > 0) {

						swap(a, i, i + 1);

						ascending = true;

					}

				}

			}

		}

		else {

			while (ascending == false) {

				ascending = true;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getInd().compareTo(a[i + 1].getInd()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	
	// DESCRIPTION - Swaps Hispanic array elements x with y.
	// PARAMETERS - Hispanic[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(Hispanic[] a, int x, int y) {

		Hispanic temp;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}
	
	
	
}
