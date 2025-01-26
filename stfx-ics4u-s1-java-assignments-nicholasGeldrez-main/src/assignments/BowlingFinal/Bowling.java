package assignments.BowlingFinal;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Bowling {

	// data members

	final int MAX_VALUE = 10;
	int roll1;
	int roll2;
	int currentRoll;
	int currentThrow;
	int score;
	int frame;
	int totalPins;
	int pinsLeft;

	// default constructor

	public Bowling() {
		this.currentThrow = 0;
		this.roll1 = 0;
		this.roll2 = 0;
		this.currentRoll = 0;
		this.score = 0;
		this.frame = 0;
		this.totalPins = 10;
		this.pinsLeft = 0;
	}

	// parameterized constructor

	public Bowling(int r1, int r2, int cr, int s, int f, int rc) {

		this.roll1 = r1;

		this.roll2 = r2;

		this.currentRoll = cr;

		this.score = s;

		this.frame = f;

	}

	// get methods

	public int getRoll1() {

		return this.roll1;
	}

	public int getRoll2() {

		return this.roll2;
	}

	public int getCurrentRoll() {

		return this.currentRoll;
	}

	public int getScore() {

		return this.score;
	}

	public double getFrame() {

		return this.frame;
	}

	// set methods

	public void setRoll1(int r1) {

		this.roll1 = r1;
	}

	public void setroll2(int r2) {

		this.roll2 = r2;

	}

	public void setCurrentRoll(int cr) {

		this.currentRoll = cr;
	}

	public void setScore(int s) {

		this.score += s;
	}

	public void setFrame(int f) {

		this.frame += f;
	}

	public void resetPins() {

		this.pinsLeft = 0;
	}

	public int rollRandom() {

		// random number
		int pins = (int) (Math.random() * (totalPins - pinsLeft) + 1);

		// if first throw
		// strike 1st attempt
		if (pins == totalPins && currentThrow % 2 == 0) {
			roll1 = 20;
			pins = 10;
			pinsLeft = 10;
			return pins;
		}

		// spare
		else if (pins + pinsLeft >= totalPins) {
			if (pinsLeft == 10) {

				pins = 0;
				return pins;

			}

			else {

				roll2 = 15;
				this.pinsLeft = 0;
				return pins;

			}

		}

		// not a strike nor spare
		roll1 = pins;
		roll2 = pins;
		pinsLeft = pins;
		return pins;

	}

	public void roll(JTextField textRoll, JTextField textFrame, JTextField textScore, JButton btnFrame) {

		// whether or not the currentThrow is even or odd
		if (currentThrow % 2 == 0) {
			// First throw of Frame
			// Math
			currentRoll = rollRandom();
			score += this.roll1;
			roll2 = 0;

			// Setting text
			textScore.setText(Integer.toString(score));
			textRoll.setText(Integer.toString(currentRoll));

		} 
		
		else {

			// 2nd throw of Frame, ends Frame
			currentRoll = rollRandom();

			score += this.roll2;

			roll1 = 0;

			resetPins();

			textScore.setText(Integer.toString(score));
			textRoll.setText(Integer.toString(currentRoll));

			frame += 1;
			textFrame.setText(Integer.toString(frame));

			if (frame == 10) {

				btnFrame.setEnabled(false);

			}

		}

		currentThrow += 1;

	}

	@Override

	public String toString() {

		return super.toString() + "." + this.roll1 + "." + this.roll2 + "." + this.currentRoll + "." + this.score + "."
				+ this.frame + ".";

	}

}
