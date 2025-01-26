package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.io.*;
import assignments.Dogs;

public class U3A4D_SearchApplication {

	private JFrame frame;
	private JTextField textSearch;
	private JTextField textName;
	private JTextField textBreed;
	private JTextField textColour;
	private JTextField textTrait;

	Dogs dogs = new Dogs();
	ArrayList<Dogs> dogsList = new ArrayList();

	BufferedReader br = null;
	String[] fullLine = new String[4];
	String line = new String();
	String name = new String();
	String breed = new String();
	String colour = new String();
	String trait = new String();
	Dogs sillyDog = new Dogs();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A4D_SearchApplication window = new U3A4D_SearchApplication();
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
	public U3A4D_SearchApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		try {
			br = new BufferedReader(new FileReader("Dogs.txt"));
		} catch (Exception e2) {

			e2.printStackTrace();

		}

		try {

			while ((line = br.readLine()) != null) {

				fullLine = line.split(" ");

				name = fullLine[0];
				breed = fullLine[1];
				colour = fullLine[2];
				trait = fullLine[3];

				dogsList.add(new Dogs(name, breed, colour, trait));

			}
		} catch (Exception e2) {

			e2.printStackTrace();

		}

		Dogs[] array = new Dogs[dogsList.size()];

		dogsList.toArray(array);

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Dog poo");
		lblNewLabel.setBounds(182, 11, 132, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Search Criteria");
		lblNewLabel_1.setBounds(46, 54, 94, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setBounds(46, 89, 94, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Breed of Dog:");
		lblNewLabel_1_1_1.setBounds(46, 125, 94, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Colour");
		lblNewLabel_1_1_1_1.setBounds(46, 164, 94, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Character Trait:");
		lblNewLabel_1_1_1_1_1.setBounds(46, 208, 94, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);

		textSearch = new JTextField();
		textSearch.setBounds(134, 51, 153, 20);
		frame.getContentPane().add(textSearch);
		textSearch.setColumns(10);

		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(134, 86, 153, 20);
		frame.getContentPane().add(textName);

		textBreed = new JTextField();
		textBreed.setColumns(10);
		textBreed.setBounds(134, 122, 153, 20);
		frame.getContentPane().add(textBreed);

		textColour = new JTextField();
		textColour.setColumns(10);
		textColour.setBounds(134, 161, 153, 20);
		frame.getContentPane().add(textColour);

		textTrait = new JTextField();
		textTrait.setColumns(10);
		textTrait.setBounds(134, 205, 153, 20);
		frame.getContentPane().add(textTrait);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				sillyDog = search(textSearch.getText(), array);

				if (sillyDog == null) {

					textName.setText("None Found");
					textBreed.setText("None Found");
					textColour.setText("None Found");
					textTrait.setText("None Found");

				}

				else {

					textName.setText(sillyDog.getName());
					textBreed.setText(sillyDog.getBreed());
					textColour.setText(sillyDog.getColour());
					textTrait.setText(sillyDog.getTrait());

				}

			}

		});
		btnSearch.setBounds(312, 50, 89, 23);
		frame.getContentPane().add(btnSearch);
	}

	public Dogs search(String t, Dogs[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i].getName().compareToIgnoreCase(t) == 0 || a[i].getBreed().compareToIgnoreCase(t) == 0
					|| a[i].getColour().compareToIgnoreCase(t) == 0 || a[i].getTrait().compareToIgnoreCase(t) == 0) {
				return a[i];
			}

		}
		return null;

	}
}
