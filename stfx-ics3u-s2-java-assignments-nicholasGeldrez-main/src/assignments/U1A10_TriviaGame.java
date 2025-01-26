package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class U1A10_TriviaGame {

	//Variable Declaration
	private JFrame frame;
	private JTextField txtAnswer;
	int questionNum = 0;
	boolean question1 = true;
	boolean question2 = false;
	boolean question3 = false;
	boolean question4 = false;
	boolean question5 = false;
	boolean endGame = false;
	String userGuess;
	int pointsValue = 0;
	double questionNumber = 0;
	double questionC = 0;
	double questionI = 0;
	double questionPerc = 0;
	//ArrayList<String> possibleAnswers = new ArrayList<String>();
	//possibleAnswers.add("A");
	
	
		
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A10_TriviaGame window = new U1A10_TriviaGame();
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
	public U1A10_TriviaGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Trivia!");
		lblHeader.setFont(new Font("Malgun Gothic Semilight", Font.BOLD | Font.ITALIC, 22));
		lblHeader.setBounds(186, 11, 175, 30);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblInst1 = new JLabel("Hello there! You will be asked 5 multiple choice questions!");
		lblInst1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInst1.setBounds(10, 52, 424, 29);
		frame.getContentPane().add(lblInst1);
		
		JLabel lblInst2 = new JLabel("If you answer a question right, you will gain 100 points!");
		lblInst2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInst2.setBounds(10, 72, 424, 30);
		frame.getContentPane().add(lblInst2);
		
		JLabel lblInst3 = new JLabel("If you answer a question wrong, you will lose 100 points.");
		lblInst3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInst3.setBounds(10, 92, 424, 30);
		frame.getContentPane().add(lblInst3);
		
		JLabel lblYourPoints = new JLabel("YOUR POINTS!:");
		lblYourPoints.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblYourPoints.setBounds(74, 122, 205, 35);
		frame.getContentPane().add(lblYourPoints);
		
		JLabel lblPointsValue = new JLabel("0");
		lblPointsValue.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPointsValue.setBounds(275, 127, 105, 24);
		frame.getContentPane().add(lblPointsValue);
		
		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblQuestion.setBounds(159, 162, 205, 30);
		frame.getContentPane().add(lblQuestion);
		
		JLabel lblQuestionAsk = new JLabel("What year was the very first model of the iPhone released?");
		lblQuestionAsk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuestionAsk.setBounds(10, 189, 424, 31);
		frame.getContentPane().add(lblQuestionAsk);
		
		JLabel lblPrompt = new JLabel("");
		lblPrompt.setBounds(10, 433, 414, 14);
		frame.getContentPane().add(lblPrompt);
		
		txtAnswer = new JTextField();
		txtAnswer.setBounds(16, 368, 86, 20);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JLabel lblAnswerA = new JLabel("A: 2007");
		lblAnswerA.setBounds(37, 254, 65, 14);
		frame.getContentPane().add(lblAnswerA);
		
		JLabel lblAnswerB = new JLabel("B: 2008");
		lblAnswerB.setBounds(37, 279, 65, 14);
		frame.getContentPane().add(lblAnswerB);
		
		JLabel lblAnswerC = new JLabel("C: 2010");
		lblAnswerC.setBounds(37, 304, 65, 14);
		frame.getContentPane().add(lblAnswerC);
		
		JLabel lblAnswerD = new JLabel("D: 2006");
		lblAnswerD.setBounds(37, 329, 65, 14);
		frame.getContentPane().add(lblAnswerD);
		
		JLabel lblQuestionNum = new JLabel("Questions Completed: ");
		lblQuestionNum.setBounds(206, 265, 135, 14);
		frame.getContentPane().add(lblQuestionNum);
		
		JLabel lblQuestionsCorrect = new JLabel("Questions Correct: ");
		lblQuestionsCorrect.setBounds(206, 304, 120, 14);
		frame.getContentPane().add(lblQuestionsCorrect);
		
		JLabel lblQuestionsIncorrect = new JLabel("Questions Incorrect: ");
		lblQuestionsIncorrect.setBounds(206, 342, 120, 14);
		frame.getContentPane().add(lblQuestionsIncorrect);
		
		JLabel lblQuestionPerc = new JLabel("Percentage Correct: ");
		lblQuestionPerc.setBounds(206, 382, 127, 14);
		frame.getContentPane().add(lblQuestionPerc);
		
		JLabel lblQValue = new JLabel("0");
		lblQValue.setBounds(351, 265, 46, 14);
		frame.getContentPane().add(lblQValue);
		
		JLabel lblCValue = new JLabel("0");
		lblCValue.setBounds(351, 304, 46, 14);
		frame.getContentPane().add(lblCValue);
		
		JLabel lblIValue = new JLabel("0");
		lblIValue.setBounds(351, 342, 46, 14);
		frame.getContentPane().add(lblIValue);
		
		JLabel lblPercValue = new JLabel("0");
		lblPercValue.setBounds(351, 382, 46, 14);
		frame.getContentPane().add(lblPercValue);
		
		JLabel lblFinalQ = new JLabel("");
		lblFinalQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFinalQ.setBounds(74, 231, 72, 23);
		frame.getContentPane().add(lblFinalQ);
		
		JLabel lblFinalC = new JLabel("");
		lblFinalC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFinalC.setBounds(275, 222, 72, 23);
		frame.getContentPane().add(lblFinalC);
		
		JLabel lblFinalI = new JLabel("");
		lblFinalI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFinalI.setBounds(74, 320, 72, 23);
		frame.getContentPane().add(lblFinalI);
		
		JLabel lblFinalP = new JLabel("");
		lblFinalP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFinalP.setBounds(275, 320, 86, 23);
		frame.getContentPane().add(lblFinalP);
		
		JLabel lblQuestionNumFinal = new JLabel("");
		lblQuestionNumFinal.setBounds(44, 206, 135, 14);
		frame.getContentPane().add(lblQuestionNumFinal);
		
		JLabel lblQuestionsCorrectFinal = new JLabel("");
		lblQuestionsCorrectFinal.setBounds(241, 206, 120, 14);
		frame.getContentPane().add(lblQuestionsCorrectFinal);
		
		JLabel lblQuestionsIncorrectFinal = new JLabel("");
		lblQuestionsIncorrectFinal.setBounds(37, 304, 120, 14);
		frame.getContentPane().add(lblQuestionsIncorrectFinal);
		
		JLabel lblQuestionPercFinal = new JLabel("");
		lblQuestionPercFinal.setBounds(234, 304, 146, 14);
		frame.getContentPane().add(lblQuestionPercFinal);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//To identify which question should be present
				if (questionNum == 0) {
					question1 = true;
					question2 = false;
					question3 = false;
					question4 = false;
					question5 = false;

					questionNum++;
				}
				else if (questionNum == 1) {
					question1 = false;
					question2 = true;
					question3 = false;
					question4 = false;
					question5 = false;

					questionNum++;
				}
				else if (questionNum == 2) {
					question1 = false;
					question2 = false;
					question3 = true;
					question4 = false;
					question5 = false;

					questionNum++;
				}
				else if (questionNum == 3) {
					question1 = false;
					question2 = false;
					question3 = false;
					question4 = true;
					question5 = false;

					questionNum++;
				}
				else {
					question1 = false;
					question2 = false;
					question3 = false;
					question4 = false;
					question5 = true;

					questionNum++;
				}
			
					
				//First question
					if (question1 == true) {
						//Get user input
						userGuess = txtAnswer.getText();
						//If the input is an actual guess
						if (userGuess.equals("A") || userGuess.equals("a") || userGuess.equals("B") || userGuess.equals("b") || userGuess.equals("C") || userGuess.equals("c") || userGuess.equals("D") || userGuess.equals("d")) {
							//add 1 to questionNumber to switch the question
							questionNumber++;
							//Change the amount of questions completed
							lblQValue.setText(String.valueOf(questionNumber));
							//If they guess the right answer
							if (userGuess.equals("A") || userGuess.equals("a")) {
								
								//Displays
								lblPrompt.setText(String.valueOf("You are correct!"));
								
								pointsValue = pointsValue + 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));
								
								questionC++;
								lblCValue.setText(String.valueOf(questionC));
								
								lblQuestionAsk.setText(String.valueOf("What's the shortcut for the 'copy' function on most computers?"));
								lblAnswerA.setText(String.valueOf("A: Crtl+A"));
								lblAnswerB.setText(String.valueOf("B: Crtl+V"));
								lblAnswerC.setText(String.valueOf("C: Crtl+C"));
								lblAnswerD.setText(String.valueOf("D: Crtl+Z"));
								txtAnswer.setText(null);
								//percentage calculations
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + " %"));
								
							}
							//If the answer is wrong
							else {
								//Displays
								lblPrompt.setText(String.valueOf("You are incorrect!"));
								
								pointsValue = pointsValue - 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));
								
								questionI++;
								lblIValue.setText(String.valueOf(questionI));

								lblQuestionAsk.setText(String.valueOf("What's the shortcut for the 'copy' function on most computers?"));
								lblAnswerA.setText(String.valueOf("A: Crtl+A"));
								lblAnswerB.setText(String.valueOf("B: Crtl+V"));
								lblAnswerC.setText(String.valueOf("C: Crtl+C"));
								lblAnswerD.setText(String.valueOf("D: Crtl+Z"));
								txtAnswer.setText(null);
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + " %"));
								
							}
						}
						//If the user input is not AaBbCcDd	resets to question1
						else {
							lblPrompt.setText(String.valueOf("This is an invalid answer, please use a, b, c, or d for the next question!"));
							//Makes question1 = true again
							questionNum--;
							lblQuestionAsk.setText(String.valueOf("What year was the very first model of the iPhone released?"));
							lblAnswerA.setText(String.valueOf("A: 2007"));
							lblAnswerB.setText(String.valueOf("B: 2008"));
							lblAnswerC.setText(String.valueOf("C: 2010"));
							lblAnswerD.setText(String.valueOf("D: 2006"));
								
						}	
					}	
					//Second Question
					else if (question2 == true) {
						//Get user input
						userGuess = txtAnswer.getText();
						//If the input is an actual guess
						if (userGuess.equals("A") || userGuess.equals("a") || userGuess.equals("B") || userGuess.equals("b") || userGuess.equals("C") || userGuess.equals("c") || userGuess.equals("D") || userGuess.equals("d")) {
							//add 1 to questionNumber to switch the question
							questionNumber++;
							//Change the amount of questions completed
							lblQValue.setText(String.valueOf(questionNumber));
							//If they guess the right answer
							if (userGuess.equals("C") || userGuess.equals("c")) {
								//Displays
								lblPrompt.setText(String.valueOf("You are correct!"));
								
								pointsValue = pointsValue + 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));
								
								questionC++;
								lblCValue.setText(String.valueOf(questionC));
								
								lblQuestionAsk.setText(String.valueOf("Which planet has the most gravity?"));
								lblAnswerA.setText(String.valueOf("A: Earth"));
								lblAnswerB.setText(String.valueOf("B: Jupiter"));
								lblAnswerC.setText(String.valueOf("C: Saturn"));
								lblAnswerD.setText(String.valueOf("D: Venus"));
								txtAnswer.setText(null);
			
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));

							}
							//If input is wrong
							else {
								//Displays
								lblPrompt.setText(String.valueOf("You are incorrect!"));
								
								pointsValue = pointsValue - 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));	
								
								questionI++;
								lblIValue.setText(String.valueOf(questionI));
								
								lblQuestionAsk.setText(String.valueOf("Which planet has the most gravity?"));
								lblAnswerA.setText(String.valueOf("A: Earth"));
								lblAnswerB.setText(String.valueOf("B: Jupiter"));
								lblAnswerC.setText(String.valueOf("C: Saturn"));
								lblAnswerD.setText(String.valueOf("D: Venus"));
								txtAnswer.setText(null);
			
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));
								
							}
						}
						//If the user input is not AaBbCcDd	resets to question2
						else {
							lblPrompt.setText(String.valueOf("This is an invalid answer, please use a, b, c, or d for the next question!"));
							//Makes question2 = true again
							questionNum--;
							lblQuestionAsk.setText(String.valueOf("What's the shortcut for the 'copy' function on most computers?"));
							lblAnswerA.setText(String.valueOf("A: Crtl+A"));
							lblAnswerB.setText(String.valueOf("B: Crtl+V"));
							lblAnswerC.setText(String.valueOf("C: Crtl+C"));
							lblAnswerD.setText(String.valueOf("D: Crtl+Z"));
								
						}
					}
					//Third Question
					else if (question3 == true) {
						//Get user input
						userGuess = txtAnswer.getText();
						//If the input is an actual guess
						if (userGuess.equals("A") || userGuess.equals("a") || userGuess.equals("B") || userGuess.equals("b") || userGuess.equals("C") || userGuess.equals("c") || userGuess.equals("D") || userGuess.equals("d")) {
							//add 1 to questionNumber to switch the question
							questionNumber++;
							//Change the amount of questions completed
							lblQValue.setText(String.valueOf(questionNumber));
							//If they guess the right answer
							if (userGuess.equals("B") || userGuess.equals("b")) {
								//Displays
								lblPrompt.setText(String.valueOf("You are correct!"));
								
								pointsValue = pointsValue + 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));
								
								questionC++;
								lblCValue.setText(String.valueOf(questionC));
								
								lblQuestionAsk.setText(String.valueOf("What was Twitter's original name?"));
								lblAnswerA.setText(String.valueOf("A: twoot"));
								lblAnswerB.setText(String.valueOf("B: twttr"));
								lblAnswerC.setText(String.valueOf("C: twitt"));
								lblAnswerD.setText(String.valueOf("D: tweetr"));
								txtAnswer.setText(null);
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));
								
							}
							//If input is wrong
							else {
								//Displays
								lblPrompt.setText(String.valueOf("You are incorrect!"));
								
								pointsValue = pointsValue - 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));	
								
								questionI++;
								lblIValue.setText(String.valueOf(questionI));
								
								lblQuestionAsk.setText(String.valueOf("What was Twitter's original name?"));
								lblAnswerA.setText(String.valueOf("A: twoot"));
								lblAnswerB.setText(String.valueOf("B: twttr"));
								lblAnswerC.setText(String.valueOf("C: twitt"));
								lblAnswerD.setText(String.valueOf("D: tweetr"));
								txtAnswer.setText(null);
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));
								
							}
						}
						//If the user input is not AaBbCcDd	resets to question3
						else {
							lblPrompt.setText(String.valueOf("This is an invalid answer, please use a, b, c, or d for the next question!"));
							//Makes question3 = true again
							questionNum--;
							lblQuestionAsk.setText(String.valueOf("Which planet has the most gravity?"));
							lblAnswerA.setText(String.valueOf("A: Earth"));
							lblAnswerB.setText(String.valueOf("B: Jupiter"));
							lblAnswerC.setText(String.valueOf("C: Saturn"));
							lblAnswerD.setText(String.valueOf("D: Venus"));
								
						}
						
					}
					//Fourth Question
					else if (question4 == true) {
						//Get user input
						userGuess = txtAnswer.getText();
						//If the input is an actual guess
						if (userGuess.equals("A") || userGuess.equals("a") || userGuess.equals("B") || userGuess.equals("b") || userGuess.equals("C") || userGuess.equals("c") || userGuess.equals("D") || userGuess.equals("d")) {
							//add 1 to questionNumber to switch the question
							questionNumber++;
							//Change the amount of questions completed
							lblQValue.setText(String.valueOf(questionNumber));
							//If they guess the right answer
							if (userGuess.equals("B") || userGuess.equals("b")) {
								//Displays
								lblPrompt.setText(String.valueOf("You are correct!"));
								
								pointsValue = pointsValue + 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));
								
								questionC++;
								lblCValue.setText(String.valueOf(questionC));
								
								lblQuestionAsk.setText(String.valueOf("How many molecules of oxygen does ozone have?"));
								lblAnswerA.setText(String.valueOf("A: 4"));
								lblAnswerB.setText(String.valueOf("B: 1"));
								lblAnswerC.setText(String.valueOf("C: 2"));
								lblAnswerD.setText(String.valueOf("D: 3"));
								txtAnswer.setText(null);
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));
								
							}
							//If input is wrong
							else {
								//Display
								lblPrompt.setText(String.valueOf("You are incorrect!"));
								
								pointsValue = pointsValue - 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));	
								
								questionI++;
								lblIValue.setText(String.valueOf(questionI));
								
								lblQuestionAsk.setText(String.valueOf("How many molecules of oxygen does ozone have?"));
								lblAnswerA.setText(String.valueOf("A: 4"));
								lblAnswerB.setText(String.valueOf("B: 1"));
								lblAnswerC.setText(String.valueOf("C: 2"));
								lblAnswerD.setText(String.valueOf("D: 3"));
								txtAnswer.setText(null);
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));
								
							}
						}
						//If the user input is not AaBbCcDd	resets to question4
						else {
							lblPrompt.setText(String.valueOf("This is an invalid answer, please use a, b, c, or d for the next question!"));
							//Makes question4 = true again
							questionNum--;
							lblQuestionAsk.setText(String.valueOf("What was Twitter's original name?"));
							lblAnswerA.setText(String.valueOf("A: twoot"));
							lblAnswerB.setText(String.valueOf("B: twttr"));
							lblAnswerC.setText(String.valueOf("C: twitt"));
							lblAnswerD.setText(String.valueOf("D: tweetr"));
								
						}
	
					}
					//Fifth Question
					else if (question5 == true) {
						//Get user input
						userGuess = txtAnswer.getText();
						//If the input is an actual guess
						if (userGuess.equals("A") || userGuess.equals("a") || userGuess.equals("B") || userGuess.equals("b") || userGuess.equals("C") || userGuess.equals("c") || userGuess.equals("D") || userGuess.equals("d")) {
							//add 1 to questionNumber to switch the question
							questionNumber++;
							//Change the amount of questions completed
							lblQValue.setText(String.valueOf(questionNumber));
							//If they guess the right answer
							if (userGuess.equals("D") || userGuess.equals("d")) {
								//Displays
								lblPrompt.setText(String.valueOf("You are correct!"));
								
								pointsValue = pointsValue + 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));
								
								questionC++;
								lblCValue.setText(String.valueOf(questionC));
								
								txtAnswer.setText(null);
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));
								//Displays final screen with full statistics of the user's inputs
								lblFinalQ.setText(String.valueOf(questionNumber));
								lblFinalC.setText(String.valueOf(questionC));
								lblFinalI.setText(String.valueOf(questionI));
								lblFinalP.setText(String.valueOf(questionPerc + " %"));
								lblQuestionNumFinal.setText(String.valueOf("Questions Completed!:"));
								lblQuestionsCorrectFinal.setText(String.valueOf("Questions Correct!:"));
								lblQuestionsIncorrectFinal.setText(String.valueOf("Questions Incorrect!:"));
								lblQuestionPercFinal.setText(String.valueOf("Questions Percentage!:"));
								
								lblQuestionAsk.setText(String.valueOf(""));
								lblAnswerA.setText(String.valueOf(""));
								lblAnswerB.setText(String.valueOf(""));
								lblAnswerC.setText(String.valueOf(""));
								lblAnswerD.setText(String.valueOf(""));
								lblQuestion.setText(String.valueOf(""));
								lblQuestionNum.setText(String.valueOf(""));
								lblQuestionsCorrect.setText(String.valueOf(""));
								lblQuestionsIncorrect.setText(String.valueOf(""));
								lblQuestionPerc.setText(String.valueOf(""));
								lblQValue.setText(String.valueOf(""));
								lblCValue.setText(String.valueOf(""));
								lblIValue.setText(String.valueOf(""));
								lblPercValue.setText(String.valueOf(""));
								
							}
							//If input is wrong
							else {
								//Displays
								lblPrompt.setText(String.valueOf("You are incorrect!"));
								
								pointsValue = pointsValue - 100;
								
								lblPointsValue.setText(String.valueOf(pointsValue));	
								
								questionI++;
								lblIValue.setText(String.valueOf(questionI));
								
								txtAnswer.setText(null);
								//Percentage
								questionPerc = (questionC/questionNumber)*100;
								
								questionPerc = questionPerc*10;
								questionPerc = Math.round(questionPerc);
								questionPerc = questionPerc/10;
										
								lblPercValue.setText(String.valueOf(questionPerc + "%"));
								//Displays final screen with full statistics of the user's inputs
								lblFinalQ.setText(String.valueOf(questionNumber));
								lblFinalC.setText(String.valueOf(questionC));
								lblFinalI.setText(String.valueOf(questionI));
								lblFinalP.setText(String.valueOf(questionPerc + " %"));
								lblQuestionNumFinal.setText(String.valueOf("Questions Completed!:"));
								lblQuestionsCorrectFinal.setText(String.valueOf("Questions Correct!:"));
								lblQuestionsIncorrectFinal.setText(String.valueOf("Questions Incorrect!:"));
								lblQuestionPercFinal.setText(String.valueOf("Questions Percentage!:"));
								
								lblQuestionAsk.setText(String.valueOf(""));
								lblAnswerA.setText(String.valueOf(""));
								lblAnswerB.setText(String.valueOf(""));
								lblAnswerC.setText(String.valueOf(""));
								lblAnswerD.setText(String.valueOf(""));
								lblQuestion.setText(String.valueOf(""));
								lblQuestionNum.setText(String.valueOf(""));
								lblQuestionsCorrect.setText(String.valueOf(""));
								lblQuestionsIncorrect.setText(String.valueOf(""));
								lblQuestionPerc.setText(String.valueOf(""));
								lblQValue.setText(String.valueOf(""));
								lblCValue.setText(String.valueOf(""));
								lblIValue.setText(String.valueOf(""));
								lblPercValue.setText(String.valueOf(""));
								
							}
						}
						//If the user input is not AaBbCcDd	resets to question5
						else {
							lblPrompt.setText(String.valueOf("This is an invalid answer, please use a, b, c, or d for the next question!"));
							//Makes question5 = true again
							questionNum--;
							lblQuestionAsk.setText(String.valueOf("How many molecules of oxygen does ozone have?"));
							lblAnswerA.setText(String.valueOf("A: 4"));
							lblAnswerB.setText(String.valueOf("B: 1"));
							lblAnswerC.setText(String.valueOf("C: 2"));
							lblAnswerD.setText(String.valueOf("D: 3"));
								
						}
					}
	
				}
				
				
		});	
			
		btnNewButton.setBounds(10, 399, 105, 23);
		frame.getContentPane().add(btnNewButton);

	}
}
