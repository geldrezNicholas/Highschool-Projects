package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A9_StringMethods {

	private JFrame frame;
	private JTextField txtFieldA;
	private JTextField txtFieldB;
	private JTextField txtFieldC;
	private JTextField txtFieldD1;
	private JTextField txtFieldD2;
	private JTextField txtFieldE1;
	private JTextField txtFieldE2;
	private JTextField txtFieldF;
	private JTextField txtFieldG;
	String variableA = "";
	String variableB = "";
	String variableC = "";
	String variableD1 = "";
	String variableD2 = "";
	String variableE1 = "";
	String variableE2;
	String variableF = "";
	String variableG = "";
	int answerA = 0;
	String answerB;
	char answerC;
	boolean answerD;
	boolean answerE;
	CharSequence answerF;
	String answerG;
	int eight;
	int four;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A9_StringMethods window = new U2A9_StringMethods();
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
	public U2A9_StringMethods() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 788, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Super String Software");
		lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHeader.setBounds(216, 22, 202, 20);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblNewLabel = new JLabel("Enter a String. The program will output the number of characters in the String:");
		lblNewLabel.setBounds(22, 70, 479, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterAString = new JLabel("Enter a String using lowercase letters. The program will output the String in all capital letters:");
		lblEnterAString.setBounds(22, 134, 626, 14);
		frame.getContentPane().add(lblEnterAString);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter a String. The program will output the character at the 4th spot:");
		lblNewLabel_1_1.setBounds(22, 199, 479, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter two Strings. The program will output whether or not they are identical:");
		lblNewLabel_1_2.setBounds(22, 267, 596, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter a String and a letter, the program will output whether or not the letter is found in the String:");
		lblNewLabel_1_3.setBounds(22, 344, 668, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Enter a String that is at least 8 chracters long. The program will output chracters 4 to 6:");
		lblNewLabel_1_4.setBounds(22, 421, 573, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Enter a String that contains at least one \"a\" the program will then replace all occurances of the letter \"a\" with \"x\":");
		lblNewLabel_1_5.setBounds(10, 499, 721, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		txtFieldA = new JTextField();
		txtFieldA.setBounds(76, 103, 127, 20);
		frame.getContentPane().add(txtFieldA);
		txtFieldA.setColumns(10);
		
		txtFieldB = new JTextField();
		txtFieldB.setColumns(10);
		txtFieldB.setBounds(76, 168, 127, 20);
		frame.getContentPane().add(txtFieldB);
		
		txtFieldC = new JTextField();
		txtFieldC.setColumns(10);
		txtFieldC.setBounds(76, 236, 127, 20);
		frame.getContentPane().add(txtFieldC);
		
		txtFieldD1 = new JTextField();
		txtFieldD1.setColumns(10);
		txtFieldD1.setBounds(37, 306, 127, 20);
		frame.getContentPane().add(txtFieldD1);
		
		txtFieldD2 = new JTextField();
		txtFieldD2.setColumns(10);
		txtFieldD2.setBounds(187, 306, 116, 20);
		frame.getContentPane().add(txtFieldD2);
		
		txtFieldE1 = new JTextField();
		txtFieldE1.setColumns(10);
		txtFieldE1.setBounds(32, 377, 127, 20);
		frame.getContentPane().add(txtFieldE1);
		
		txtFieldE2 = new JTextField();
		txtFieldE2.setColumns(10);
		txtFieldE2.setBounds(187, 377, 40, 20);
		frame.getContentPane().add(txtFieldE2);
		
		txtFieldF = new JTextField();
		txtFieldF.setColumns(10);
		txtFieldF.setBounds(100, 457, 127, 20);
		frame.getContentPane().add(txtFieldF);
		
		txtFieldG = new JTextField();
		txtFieldG.setColumns(10);
		txtFieldG.setBounds(100, 543, 127, 20);
		frame.getContentPane().add(txtFieldG);
		
		JLabel lblAnswerA = new JLabel("");
		lblAnswerA.setBounds(443, 109, 152, 14);
		frame.getContentPane().add(lblAnswerA);
		
		JLabel lblAnswerB = new JLabel("");
		lblAnswerB.setBounds(350, 174, 412, 14);
		frame.getContentPane().add(lblAnswerB);
		
		JLabel lblAnswerC = new JLabel("");
		lblAnswerC.setBounds(393, 242, 369, 14);
		frame.getContentPane().add(lblAnswerC);
		
		JLabel lblAnswerD = new JLabel("");
		lblAnswerD.setBounds(443, 309, 152, 14);
		frame.getContentPane().add(lblAnswerD);
		
		JLabel lblAnswerE = new JLabel("");
		lblAnswerE.setBounds(432, 380, 152, 14);
		frame.getContentPane().add(lblAnswerE);
		
		JLabel lblAnswerF = new JLabel("");
		lblAnswerF.setBounds(432, 460, 258, 14);
		frame.getContentPane().add(lblAnswerF);
		
		JLabel lblAnswerG = new JLabel("");
		lblAnswerG.setBounds(432, 546, 152, 14);
		frame.getContentPane().add(lblAnswerG);
		
		JButton btnA = new JButton("Length");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variableA = txtFieldA.getText();
	
				answerA = variableA.length();
				
				lblAnswerA.setText(String.valueOf(answerA));
				
			}
		});
		btnA.setBounds(251, 100, 89, 23);
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("All Caps");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variableB = txtFieldB.getText();
				
				answerB = variableB.toUpperCase();
				
				lblAnswerB.setText(String.valueOf(answerB));
				
			}
		});
		btnB.setBounds(251, 165, 89, 23);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("4th Spot");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variableC = txtFieldC.getText();
				
				four = variableC.length();
				
				if (four >= 4) {
				
				answerC = variableC.charAt(3);
				
				lblAnswerC.setText(String.valueOf(answerC));
				
				}
				
				else {
					
					lblAnswerC.setText(String.valueOf("Try again with 4 or more characters!"));
					
				}
					
				
			}
		});
		btnC.setBounds(251, 233, 89, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("Identical?");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variableD1 = txtFieldD1.getText();
				variableD2 = txtFieldD2.getText();
				
				answerD = variableD1.equals(variableD2);
				
				lblAnswerD.setText(String.valueOf(answerD));
				
			}
		});
		btnD.setBounds(329, 305, 89, 23);
		frame.getContentPane().add(btnD);
		
		JButton btnE = new JButton("Letter Found?");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variableE1 = txtFieldE1.getText();
				variableE2 = txtFieldE2.getText();
				
				answerE = variableE1.contains(variableE2);
				
				lblAnswerE.setText(String.valueOf(answerE));
				
			}
		});
		btnE.setBounds(263, 376, 155, 23);
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("Characters 4 to 6");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variableF = txtFieldF.getText();
				eight = variableF.length();
				if (eight >= 8) {
					
					answerF = variableF.subSequence(3, 6);

					
					lblAnswerF.setText(String.valueOf(answerF));
					
				}
				
				else {
					
					lblAnswerF.setText(String.valueOf("Try again with 8 or more characters!"));	
					
				}
				
				
			}
		});
		btnF.setBounds(251, 456, 167, 23);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("Replaces \"a\"");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variableG = txtFieldG.getText();
				
				answerG = variableG.replaceAll("a", "x");

				
				lblAnswerG.setText(String.valueOf(answerG));
				
			}
		});
		btnG.setBounds(251, 542, 167, 23);
		frame.getContentPane().add(btnG);
		

		
	}
}
