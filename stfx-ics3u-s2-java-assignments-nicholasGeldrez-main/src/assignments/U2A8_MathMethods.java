package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A8_MathMethods {

	private JFrame frame;
	private JTextField txtFieldA1;
	private JTextField txtFieldA2;
	private JTextField txtFieldB1;
	private JTextField txtFieldB2;
	private JTextField txtFieldC1;
	private JTextField txtFieldC2;
	private JTextField txtFieldD1;
	private JTextField txtFieldD2;
	private JTextField txtFieldE;
	private JTextField txtFieldF;
	private JTextField txtFieldG;
	private JTextField txtFieldH;
	double variableA1 = 0;
	double variableA2 = 0;
	double variableB1 = 0;
	double variableB2 = 0;
	double variableC1 = 0;
	double variableC2 = 0;
	double variableD1 = 0;
	double variableD2 = 0;
	double variableE = 0;
	double variableF = 0;
	double variableG = 0;
	double variableH = 0;
	double answerA = 0;
	double answerB = 0;
	double answerC = 0;
	double answerD = 0;
	double answerE = 0;
	double answerF = 0;
	double answerG = 0;
	double answerH = 0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A8_MathMethods window = new U2A8_MathMethods();
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
	public U2A8_MathMethods() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 751);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Magical Math Methods");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(153, 11, 224, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFirst = new JLabel("Enter two numbers and click the button. The program will display the largest of the two numbers:");
		lblFirst.setBounds(10, 62, 602, 14);
		frame.getContentPane().add(lblFirst);
		
		JLabel lblSecond = new JLabel("Enter two numbers and click the button. The program will display the first number to the power of the second:");
		lblSecond.setBounds(10, 223, 649, 14);
		frame.getContentPane().add(lblSecond);
		
		JLabel lblThird = new JLabel("Enter two numbers and click the button. The program will display the smallest of the two numbers:");
		lblThird.setBounds(10, 144, 602, 14);
		frame.getContentPane().add(lblThird);
		
		JLabel lblEnterTheLength = new JLabel("Enter the length of two sides of a right angle triangle. The program will display the hypotenuse of the triangle:");
		lblEnterTheLength.setBounds(10, 310, 672, 14);
		frame.getContentPane().add(lblEnterTheLength);
		
		JLabel lblEnterADecimal = new JLabel("Enter a decimal value. The program will display the value rounded down to the nearest integer.");
		lblEnterADecimal.setBounds(10, 386, 553, 14);
		frame.getContentPane().add(lblEnterADecimal);
		
		JLabel lblEnterTheLength_1_1 = new JLabel("Enter a decimal value. The program will display the value rounded up to the nearest integer:");
		lblEnterTheLength_1_1.setBounds(10, 466, 553, 14);
		frame.getContentPane().add(lblEnterTheLength_1_1);
		
		JLabel lblEnterTheLength_1_1_1 = new JLabel("Enter an integer. The program will display the square root of the integer:");
		lblEnterTheLength_1_1_1.setBounds(10, 556, 553, 14);
		frame.getContentPane().add(lblEnterTheLength_1_1_1);
		
		JLabel lblEnterTheLength_1_1_1_1 = new JLabel("Enter an angle in degrees. The program will display the angle in the radians.");
		lblEnterTheLength_1_1_1_1.setBounds(10, 631, 553, 14);
		frame.getContentPane().add(lblEnterTheLength_1_1_1_1);
		
		txtFieldA1 = new JTextField();
		txtFieldA1.setBounds(84, 96, 37, 20);
		frame.getContentPane().add(txtFieldA1);
		txtFieldA1.setColumns(10);
		
		txtFieldA2 = new JTextField();
		txtFieldA2.setColumns(10);
		txtFieldA2.setBounds(161, 96, 37, 20);
		frame.getContentPane().add(txtFieldA2);
		
		txtFieldB1 = new JTextField();
		txtFieldB1.setColumns(10);
		txtFieldB1.setBounds(84, 180, 37, 20);
		frame.getContentPane().add(txtFieldB1);
		
		txtFieldB2 = new JTextField();
		txtFieldB2.setColumns(10);
		txtFieldB2.setBounds(161, 180, 37, 20);
		frame.getContentPane().add(txtFieldB2);
		
		txtFieldC1 = new JTextField();
		txtFieldC1.setColumns(10);
		txtFieldC1.setBounds(84, 260, 37, 20);
		frame.getContentPane().add(txtFieldC1);
		
		txtFieldC2 = new JTextField();
		txtFieldC2.setColumns(10);
		txtFieldC2.setBounds(161, 260, 37, 20);
		frame.getContentPane().add(txtFieldC2);
		
		txtFieldD1 = new JTextField();
		txtFieldD1.setColumns(10);
		txtFieldD1.setBounds(84, 355, 37, 20);
		frame.getContentPane().add(txtFieldD1);
		
		txtFieldD2 = new JTextField();
		txtFieldD2.setColumns(10);
		txtFieldD2.setBounds(161, 355, 37, 20);
		frame.getContentPane().add(txtFieldD2);
		
		txtFieldE = new JTextField();
		txtFieldE.setColumns(10);
		txtFieldE.setBounds(127, 423, 37, 20);
		frame.getContentPane().add(txtFieldE);
		
		txtFieldF = new JTextField();
		txtFieldF.setColumns(10);
		txtFieldF.setBounds(127, 508, 37, 20);
		frame.getContentPane().add(txtFieldF);
		
		txtFieldG = new JTextField();
		txtFieldG.setColumns(10);
		txtFieldG.setBounds(127, 594, 37, 20);
		frame.getContentPane().add(txtFieldG);
		
		txtFieldH = new JTextField();
		txtFieldH.setColumns(10);
		txtFieldH.setBounds(127, 667, 37, 20);
		frame.getContentPane().add(txtFieldH);
		
		JLabel lblAnswerA = new JLabel("");
		lblAnswerA.setBounds(385, 99, 46, 14);
		frame.getContentPane().add(lblAnswerA);
		
		JLabel lblAnswerB = new JLabel("");
		lblAnswerB.setBounds(385, 183, 46, 14);
		frame.getContentPane().add(lblAnswerB);
		
		JLabel lblAnswerC = new JLabel("");
		lblAnswerC.setBounds(385, 263, 46, 14);
		frame.getContentPane().add(lblAnswerC);
		
		JLabel lblAnswerD = new JLabel("");
		lblAnswerD.setBounds(385, 358, 46, 14);
		frame.getContentPane().add(lblAnswerD);
		
		JLabel lblAnswerE = new JLabel("");
		lblAnswerE.setBounds(385, 426, 46, 14);
		frame.getContentPane().add(lblAnswerE);
		
		JLabel lblAnswerF = new JLabel("");
		lblAnswerF.setBounds(385, 511, 46, 14);
		frame.getContentPane().add(lblAnswerF);
		
		JLabel lblAnswerG = new JLabel("");
		lblAnswerG.setBounds(385, 597, 46, 14);
		frame.getContentPane().add(lblAnswerG);
		
		JLabel lblAnswerH = new JLabel("");
		lblAnswerH.setBounds(327, 670, 216, 14);
		frame.getContentPane().add(lblAnswerH);
		
		JButton btnA = new JButton("Largest");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				
				variableA1 = Double.parseDouble(txtFieldA1.getText());
				variableA2 = Double.parseDouble(txtFieldA2.getText());
				
				answerA = Math.max(variableA1, variableA2);
				
				lblAnswerA.setText(String.valueOf(answerA));
				
				}
				
				catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnA.setBounds(218, 95, 89, 23);
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("Smallest");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
				variableB1 = Double.parseDouble(txtFieldB1.getText());
				variableB2 = Double.parseDouble(txtFieldB2.getText());
				
				answerB = Math.min(variableB1, variableB2);
				
				lblAnswerB.setText(String.valueOf(answerB));
				
				}
				
				catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnB.setBounds(218, 179, 89, 23);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("To the Power Of");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					
				variableC1 = Double.parseDouble(txtFieldC1.getText());
				variableC2 = Double.parseDouble(txtFieldC2.getText());
				
				answerC = Math.pow(variableC1, variableC2);
				
				lblAnswerC.setText(String.valueOf(answerC));
				
				}
				
				catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnC.setBounds(208, 259, 139, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("Hypotenuse");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
				variableD1 = Double.parseDouble(txtFieldD1.getText());
				variableD2 = Double.parseDouble(txtFieldD2.getText());
				
				answerD = Math.hypot(variableD1, variableD2);
				
				lblAnswerD.setText(String.valueOf(answerD));
				
				}
				
				catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnD.setBounds(218, 352, 108, 23);
		frame.getContentPane().add(btnD);
		
		JButton btnE = new JButton("Rounded Down");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
				variableE = Double.parseDouble(txtFieldE.getText());
				
				answerE = Math.floor(variableE);
				
				lblAnswerE.setText(String.valueOf(answerE));
				
				}
				
				catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnE.setBounds(218, 422, 129, 23);
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("Rounded Up");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
				variableF = Double.parseDouble(txtFieldF.getText());
				
				answerF = Math.ceil(variableF);
				
				lblAnswerF.setText(String.valueOf(answerF));
				
				}
				
				catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}

			}
		});
		btnF.setBounds(218, 507, 108, 23);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("Square Root");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
				variableG = Double.parseDouble(txtFieldG.getText());
				
				answerG = Math.sqrt(variableG);
				
				lblAnswerG.setText(String.valueOf(answerG));
				
				}
				
				catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnG.setBounds(218, 593, 108, 23);
		frame.getContentPane().add(btnG);
		
		JButton btnH = new JButton("In Radians");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
				variableH = Double.parseDouble(txtFieldH.getText());
				
				answerH = Math.toRadians(variableH);
				
				lblAnswerH.setText(String.valueOf(answerH));
				
				}
				
				catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Invalid Entry");
					
				}
				
			}
		});
		btnH.setBounds(218, 666, 159, 23);
		frame.getContentPane().add(btnH);
	}
}
