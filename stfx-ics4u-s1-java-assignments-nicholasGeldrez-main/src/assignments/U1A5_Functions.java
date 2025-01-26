package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A5_Functions {

	// Variable Declaration

	double degrees = 0;
	double radians = 0;
	double negative = 0;
	double absolute = 0;
	double base = 0;
	double height = 0;
	double hypotenuse = 0;
	double a = 0;
	double b = 0;
	double c = 0;
	double xArray[] = new double[2];
	double x1 = 0;
	double x2 = 0;
	double dx1 = 0;
	double dy1 = 0;
	double dx2 = 0;
	double dy2 = 0;
	double distance = 0;

	private JFrame frame;
	private JTextField textDegrees;
	private JTextField textRadians;
	private JTextField textNegative;
	private JTextField textPositive;
	private JTextField textBase;
	private JTextField textHeight;
	private JTextField textHyp;
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;
	private JTextField textX1;
	private JTextField textX2;
	private JTextField textDX1;
	private JTextField textDY1;
	private JTextField textDY2;
	private JTextField textDX2;
	private JTextField textDistance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A5_Functions window = new U1A5_Functions();
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
	public U1A5_Functions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 564, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Functions");
		lblNewLabel.setBounds(256, 15, 63, 14);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(24, 60, 244, 121);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Convert Degrees to Radians");
		lblNewLabel_1.setBounds(10, 5, 208, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Degrees");
		lblNewLabel_1_1.setBounds(10, 44, 68, 14);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Radians");
		lblNewLabel_1_1_1.setBounds(10, 80, 68, 14);
		panel.add(lblNewLabel_1_1_1);

		textDegrees = new JTextField();
		textDegrees.setBounds(60, 41, 86, 20);
		panel.add(textDegrees);
		textDegrees.setColumns(10);

		textRadians = new JTextField();
		textRadians.setColumns(10);
		textRadians.setBounds(60, 77, 86, 20);
		panel.add(textRadians);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(278, 60, 235, 121);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1_2 = new JLabel("Turns every negative to positive");
		lblNewLabel_1_2.setBounds(27, 0, 208, 14);
		panel_1.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1_2 = new JLabel("Negative");
		lblNewLabel_1_1_2.setBounds(10, 36, 68, 14);
		panel_1.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("Absolute Value");
		lblNewLabel_1_1_2_1.setBounds(20, 61, 109, 14);
		panel_1.add(lblNewLabel_1_1_2_1);

		textNegative = new JTextField();
		textNegative.setBounds(61, 33, 86, 20);
		panel_1.add(textNegative);
		textNegative.setColumns(10);

		textPositive = new JTextField();
		textPositive.setColumns(10);
		textPositive.setBounds(10, 75, 86, 20);
		panel_1.add(textPositive);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(24, 217, 156, 148);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);

		JLabel lblNewLabel_1_3 = new JLabel("Pythagorean's Theorem");
		lblNewLabel_1_3.setBounds(10, 11, 208, 14);
		panel_1_1.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_1_3 = new JLabel("Base");
		lblNewLabel_1_1_3.setBounds(10, 36, 68, 14);
		panel_1_1.add(lblNewLabel_1_1_3);

		textBase = new JTextField();
		textBase.setColumns(10);
		textBase.setBounds(60, 36, 86, 20);
		panel_1_1.add(textBase);

		JLabel lblNewLabel_1_1_3_1 = new JLabel("Height");
		lblNewLabel_1_1_3_1.setBounds(10, 61, 68, 14);
		panel_1_1.add(lblNewLabel_1_1_3_1);

		textHeight = new JTextField();
		textHeight.setColumns(10);
		textHeight.setBounds(60, 58, 86, 20);
		panel_1_1.add(textHeight);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hypotenuse");
		lblNewLabel_1_1_1_1.setBounds(0, 123, 86, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1);

		textHyp = new JTextField();
		textHyp.setColumns(10);
		textHyp.setBounds(70, 120, 86, 20);
		panel_1_1.add(textHyp);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1.setBounds(190, 189, 165, 176);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);

		JLabel lblNewLabel_1_2_1 = new JLabel("Quadratic Formula");
		lblNewLabel_1_2_1.setBounds(26, 11, 208, 14);
		panel_1_1_1.add(lblNewLabel_1_2_1);

		textA = new JTextField();
		textA.setColumns(10);
		textA.setBounds(69, 36, 86, 20);
		panel_1_1_1.add(textA);

		textB = new JTextField();
		textB.setColumns(10);
		textB.setBounds(69, 58, 86, 20);
		panel_1_1_1.add(textB);

		textC = new JTextField();
		textC.setColumns(10);
		textC.setBounds(69, 81, 86, 20);
		panel_1_1_1.add(textC);

		JLabel lblNewLabel_1_1_4 = new JLabel("a");
		lblNewLabel_1_1_4.setBounds(24, 39, 68, 14);
		panel_1_1_1.add(lblNewLabel_1_1_4);

		JLabel lblNewLabel_1_1_4_1 = new JLabel("b");
		lblNewLabel_1_1_4_1.setBounds(26, 61, 68, 14);
		panel_1_1_1.add(lblNewLabel_1_1_4_1);

		JLabel lblNewLabel_1_1_4_2 = new JLabel("c");
		lblNewLabel_1_1_4_2.setBounds(26, 84, 68, 14);
		panel_1_1_1.add(lblNewLabel_1_1_4_2);

		textX1 = new JTextField();
		textX1.setColumns(10);
		textX1.setBounds(69, 133, 86, 20);
		panel_1_1_1.add(textX1);

		textX2 = new JTextField();
		textX2.setColumns(10);
		textX2.setBounds(69, 156, 86, 20);
		panel_1_1_1.add(textX2);

		JLabel lblNewLabel_1_1_4_2_1 = new JLabel("x1");
		lblNewLabel_1_1_4_2_1.setBounds(10, 136, 68, 14);
		panel_1_1_1.add(lblNewLabel_1_1_4_2_1);

		JLabel lblNewLabel_1_1_4_2_1_1 = new JLabel("x2");
		lblNewLabel_1_1_4_2_1_1.setBounds(10, 159, 68, 14);
		panel_1_1_1.add(lblNewLabel_1_1_4_2_1_1);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(new Color(255, 128, 64));
		panel_1_1_1_1.setBounds(365, 192, 165, 173);
		frame.getContentPane().add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Distance");
		lblNewLabel_1_2_1_1.setBounds(49, 0, 208, 14);
		panel_1_1_1_1.add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_1_1_4_3 = new JLabel("x1");
		lblNewLabel_1_1_4_3.setBounds(10, 25, 68, 14);
		panel_1_1_1_1.add(lblNewLabel_1_1_4_3);

		JLabel lblNewLabel_1_1_4_3_1 = new JLabel("x2");
		lblNewLabel_1_1_4_3_1.setBounds(10, 76, 68, 14);
		panel_1_1_1_1.add(lblNewLabel_1_1_4_3_1);

		JLabel lblNewLabel_1_1_4_3_2 = new JLabel("y1");
		lblNewLabel_1_1_4_3_2.setBounds(10, 48, 68, 14);
		panel_1_1_1_1.add(lblNewLabel_1_1_4_3_2);

		JLabel lblNewLabel_1_1_4_3_1_1 = new JLabel("y2");
		lblNewLabel_1_1_4_3_1_1.setBounds(10, 101, 68, 14);
		panel_1_1_1_1.add(lblNewLabel_1_1_4_3_1_1);

		textDX1 = new JTextField();
		textDX1.setBounds(36, 22, 86, 20);
		panel_1_1_1_1.add(textDX1);
		textDX1.setColumns(10);

		textDY1 = new JTextField();
		textDY1.setBounds(36, 45, 86, 20);
		panel_1_1_1_1.add(textDY1);
		textDY1.setColumns(10);

		textDY2 = new JTextField();
		textDY2.setColumns(10);
		textDY2.setBounds(36, 98, 86, 20);
		panel_1_1_1_1.add(textDY2);

		textDX2 = new JTextField();
		textDX2.setColumns(10);
		textDX2.setBounds(36, 73, 86, 20);
		panel_1_1_1_1.add(textDX2);

		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Distance");
		lblNewLabel_1_2_1_1_1.setBounds(10, 153, 68, 14);
		panel_1_1_1_1.add(lblNewLabel_1_2_1_1_1);

		textDistance = new JTextField();
		textDistance.setColumns(10);
		textDistance.setBounds(69, 150, 86, 20);
		panel_1_1_1_1.add(textDistance);

		JButton btnClear = new JButton("Clear All");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textDegrees.setText("");
				textRadians.setText("");
				textNegative.setText("");
				textPositive.setText("");
				textBase.setText("");
				textHeight.setText("");
				textHyp.setText("");
				textA.setText("");
				textB.setText("");
				textC.setText("");
				textX1.setText("");
				textX2.setText("");
				textDX1.setText("");
				textDY1.setText("");
				textDX2.setText("");
				textDY2.setText("");
				textDistance.setText("");

			}
		});
		btnClear.setBounds(141, 11, 89, 23);
		frame.getContentPane().add(btnClear);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnExit.setBounds(329, 11, 89, 23);
		frame.getContentPane().add(btnExit);

		JButton btnCalc1 = new JButton("Calculate");
		btnCalc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					degrees = Double.parseDouble(textDegrees.getText());

				} catch (Exception c) {

					JOptionPane.showMessageDialog(null, "Invalid entry!");

				}

				radians = toRadian(degrees);
				textRadians.setText(Double.toString(radians));

			}
		});
		btnCalc1.setBounds(156, 56, 89, 23);
		panel.add(btnCalc1);

		JButton btnCalc2 = new JButton("Calculate");
		btnCalc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					negative = Double.parseDouble(textNegative.getText());

				} catch (Exception c) {

					JOptionPane.showMessageDialog(null, "Invalid entry!");

				}

				absolute = toAbsolute(negative);
				textPositive.setText(Double.toString(absolute));

			}
		});
		btnCalc2.setBounds(115, 74, 89, 23);
		panel_1.add(btnCalc2);

		JButton btnCalc3 = new JButton("Calculate");
		btnCalc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					base = Double.parseDouble(textBase.getText());
					height = Double.parseDouble(textHeight.getText());

				} catch (Exception c) {

					JOptionPane.showMessageDialog(null, "Invalid entry!");

				}

				hypotenuse = pythagoreanT(base, height);
				textHyp.setText(Double.toString(hypotenuse));

			}
		});
		btnCalc3.setBounds(34, 86, 89, 23);
		panel_1_1.add(btnCalc3);

		JButton btnCalc4 = new JButton("Calculate");
		btnCalc4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					a = Double.parseDouble(textA.getText());
					b = Double.parseDouble(textB.getText());
					c = Double.parseDouble(textC.getText());

				} catch (Exception c) {

					JOptionPane.showMessageDialog(null, "Invalid entry!");

				}

				double d = ((b * b) - 4 * a * c);

				if (d < 0) {

					textX1.setText("Complex");
					textX2.setText("Complex");

				}

				else {
					quadraticFormula(a, b, c);
					textX1.setText(Double.toString(x1));
					textX2.setText(Double.toString(x2));

				}

			}

		});
		btnCalc4.setBounds(36, 109, 89, 23);
		panel_1_1_1.add(btnCalc4);

		JButton btnCalc5 = new JButton("Calculate");
		btnCalc5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					dx1 = Double.parseDouble(textDX1.getText());
					dy1 = Double.parseDouble(textDY1.getText());
					dx2 = Double.parseDouble(textDX2.getText());
					dy2 = Double.parseDouble(textDY2.getText());

				} catch (Exception c) {

					JOptionPane.showMessageDialog(null, "Invalid entry!");

				}

				if ((dx2 < dx1) || (dy2 < dy1)) {

					textDistance.setText("Invalid");

				}

				else {
					distance = findDistance(dx1, dy1, dx2, dy2);
					textDistance.setText(Double.toString(distance));

				}
			}

		});
		btnCalc5.setBounds(33, 119, 89, 23);
		panel_1_1_1_1.add(btnCalc5);

	}

	// DESCRIPTION: Returns the radian of a degree.
	// PARAMETER LIST: toRadian(double d)
	// RETURN TYPE: double
	public double toRadian(double d) {

		double r = 0;

		r = Math.toRadians(d);

		r = r * 100;
		r = Math.round(r);
		r = r / 100;

		return r;
	}

	// DESCRIPTION: Returns the absolute value of a number.
	// PARAMETER LIST: toAbsolute(double n)
	// RETURN TYPE: double
	public double toAbsolute(double n) {

		double a = 0;

		a = Math.abs(n);

		a = a * 100;
		a = Math.round(a);
		a = a / 100;

		return a;

	}

	// DESCRIPTION: Returns the hypotenuse of a triangle.
	// PARAMETER LIST: pythagoreanT(double b, double h1)
	// RETURN TYPE: double
	public double pythagoreanT(double b, double h1) {

		double h = 0;

		h = Math.sqrt((b * b) + (h1 * h1));

		h = h * 100;
		h = Math.round(h);
		h = h / 100;

		return h;

	}

	// DESCRIPTION: Calculates the xs' from a quadratic formula.
	// PARAMETER LIST: pythagoreanT(double a, double b, double c)
	// RETURN TYPE: N/A
	public void quadraticFormula(double a, double b, double c) {

		x1 = (b * b) - (4 * a * c);
		x1 = (-1 * b) + (Math.sqrt(x1));
		x1 = x1 / (2 * a);

		x1 = x1 * 100;
		x1 = Math.round(x1);
		x1 = x1 / 100;

		x2 = (b * b) - (4 * a * c);
		x2 = (-1 * b) - (Math.sqrt(x2));
		x2 = x2 / (2 * a);

		x2 = x2 * 100;
		x2 = Math.round(x2);
		x2 = x2 / 100;

	}

	// DESCRIPTION: Returns the distance from the two sets of given coordinates
	// PARAMETER LIST: findDistance(double dx1, double dy1, double dx2, double dy2)
	// RETURN TYPE: double
	public double findDistance(double dx1, double dy1, double dx2, double dy2) {

		double d = 0;
		double DXT = 0;
		double DYT = 0;

		DXT = dx2 - dx1;
		DYT = dy2 - dy1;

		d = Math.sqrt((DXT * DXT) + (DYT * DYT));

		d = d * 100;
		d = Math.round(d);
		d = d / 100;

		return d;

	}

}
