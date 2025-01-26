package assignments;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A5_SortApplication {

	private JFrame frame;
	Maple maple = new Maple();
	ArrayList<Maple> maples = new ArrayList();

	BufferedReader br = null;
	String[] fullLine = new String[15];
	String line = new String();
	String refDate = new String();
	String geo = new String();
	String dguid = new String();
	String mapleProd = new String();
	String uom = new String();
	String uomId = new String();
	String scalarFactor = new String();
	String scalarID = new String();
	String vector = new String();
	String coordinate = new String();
	String value = new String();
	String status = new String();
	String symbol = new String();
	String terminated = new String();
	String decimals = new String();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A5_SortApplication window = new U3A5_SortApplication();
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
	public U3A5_SortApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		try {
			br = new BufferedReader(new FileReader("3210035401_databaseLoadingData.csv"));
		} catch (Exception e2) {

			e2.printStackTrace();

		}

		try {

			while ((line = br.readLine()) != null) {

				fullLine = line.split(",");

				refDate = fullLine[0];
				geo = fullLine[1];
				dguid = fullLine[2];
				mapleProd = fullLine[3];
				uom = fullLine[4];
				uomId = fullLine[5];
				scalarFactor = fullLine[6];
				scalarID = fullLine[7];
				vector = fullLine[8];
				coordinate = fullLine[9];
				value = fullLine[10];
				status = fullLine[11];
				symbol = fullLine[12];
				terminated = fullLine[13];
				decimals = fullLine[14];

				maples.add(new Maple(refDate, geo, dguid, mapleProd, uom, uomId, scalarFactor, scalarID, vector,
						coordinate, value, status, symbol, terminated, decimals));

			}
		} catch (Exception e2) {

			e2.printStackTrace();

		}

		Maple[] array = new Maple[maples.size()];

		maples.toArray(array);

		frame = new JFrame();
		frame.setBounds(100, 100, 768, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 116, 732, 296);
		frame.getContentPane().add(textArea);

		JLabel lblNewLabel = new JLabel("Ascending");
		lblNewLabel.setBounds(140, 11, 76, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblDescending = new JLabel("Descending");
		lblDescending.setBounds(526, 11, 76, 14);
		frame.getContentPane().add(lblDescending);

		JButton btnRefA = new JButton("Reference");
		btnRefA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, true);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
			
				
				
			}
		});
		btnRefA.setBounds(63, 36, 89, 23);
		frame.getContentPane().add(btnRefA);

		JButton btnGeoA = new JButton("Geo");
		btnGeoA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, true);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
			
				
				
				
			}
		});
		btnGeoA.setBounds(194, 35, 89, 23);
		frame.getContentPane().add(btnGeoA);

		JButton btnDguidA = new JButton("DGUID");
		btnDguidA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, true);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
			
				
				
				
			}
		});
		btnDguidA.setBounds(30, 69, 89, 23);
		frame.getContentPane().add(btnDguidA);

		JButton btnMapleA = new JButton("Maple");
		btnMapleA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, true);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
			
				
				
				
			}
		});
		btnMapleA.setBounds(140, 69, 89, 23);
		frame.getContentPane().add(btnMapleA);

		JButton btnUOMA = new JButton("UOM");
		btnUOMA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, true);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
			
				
				
				
			}
		});
		btnUOMA.setBounds(252, 69, 89, 23);
		frame.getContentPane().add(btnUOMA);

		JButton btnRefD = new JButton("Reference");
		btnRefD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, false);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
			
				
				
				
			}
		});
		btnRefD.setBounds(417, 37, 89, 23);
		frame.getContentPane().add(btnRefD);

		JButton btnGeoD = new JButton("Geo");
		btnGeoD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, false);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
				
			}
		});
		btnGeoD.setBounds(548, 36, 89, 23);
		frame.getContentPane().add(btnGeoD);

		JButton btnDguidD = new JButton("DGUID");
		btnDguidD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, false);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
				
			}
		});
		btnDguidD.setBounds(384, 70, 89, 23);
		frame.getContentPane().add(btnDguidD);

		JButton btnMapleD = new JButton("Maple");
		btnMapleD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String poo = new String();
				
				sortRef(array, false);
				
				for (int i = 0; i < array.length; i ++) {
					
					poo += array[i] + "\n";
					
					
					
				}
				
				textArea.setText(poo);
				
				
			}
		});
		btnMapleD.setBounds(494, 70, 89, 23);
		frame.getContentPane().add(btnMapleD);

		JButton btnUOMD = new JButton("UOM");
		btnUOMD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUOMD.setBounds(609, 69, 89, 23);
		frame.getContentPane().add(btnUOMD);
	}
	
	// DESCRIPTION - Sorts Maple array ascending (true) or descending (false) directions .
	// PARAMETERS - Maple[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortRef(Maple[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getRef().compareTo(a[i + 1].getRef()) > 0) {

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

					if (a[i].getRef().compareTo(a[i + 1].getRef()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	
	// DESCRIPTION - Sorts Maple array ascending (true) or descending (false) directions .
	// PARAMETERS - Maple[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortGeo(Maple[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getGeo().compareTo(a[i + 1].getGeo()) > 0) {

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

					if (a[i].getGeo().compareTo(a[i + 1].getGeo()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	
	
	// DESCRIPTION - Sorts Maple array ascending (true) or descending (false) directions .
	// PARAMETERS - Maple[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortDGUID(Maple[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getDGUID().compareTo(a[i + 1].getDGUID()) > 0) {

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

					if (a[i].getDGUID().compareTo(a[i + 1].getDGUID()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	
	
	// DESCRIPTION - Sorts Maple array ascending (true) or descending (false) directions .
	// PARAMETERS - Maple[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortMapleProd(Maple[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getMapleProd().compareTo(a[i + 1].getMapleProd()) > 0) {

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

					if (a[i].getMapleProd().compareTo(a[i + 1].getMapleProd()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	
	
	// DESCRIPTION - Sorts Maple array ascending (true) or descending (false) directions .
	// PARAMETERS - Maple[] a, boolean ascending
	// RETURN TYPE - void
	public static void sortUOM(Maple[] a, boolean ascending)  {
		
		if (ascending == true) {

			while (ascending == true) {

				ascending = false;

				// code to keep passing, comparing and swapping

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i].getUOM().compareTo(a[i + 1].getUOM()) > 0) {

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

					if (a[i].getUOM().compareTo(a[i + 1].getUOM()) < 0) {

						swap(a, i, i + 1);

						ascending = false;

					}

				}

			}

		}
	}
	

	// DESCRIPTION - Swaps maple array elements x with y.
	// PARAMETERS - maple[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(Maple[] a, int x, int y) {

		Maple temp;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}

	
}

