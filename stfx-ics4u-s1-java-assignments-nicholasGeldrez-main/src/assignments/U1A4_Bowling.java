package assignments;

import java.util.Random;

import assignments.bowling.BowlingTest;

public class U1A4_Bowling extends BowlingTest {

	// data members
	
	int roll1;
	int roll2;
	int currentFrame;	
	int score;
	 
	// default constructor
	public U1A4_Bowling() {
		
		currentFrame = 0;
		score = 0;

	}
	
	// roll method for outcomes
	public void roll() {
		
		// roll a random number for the first roll and display
		roll1 = ((int)(Math.random() * (11)));
		System.out.println("You rolled a " + roll1 + "!");
		
		// if user gets a strike
		if (roll1 == 10) {
			
			System.out.println("Strike! You're on a roll!");
			this.score += 20;
			this.currentFrame += 1;
			
		}
		
		else {
			
			// roll a random number for the second roll and display
			roll2 = ((int)(Math.random() * (11 - roll1)));
			System.out.println("You rolled a " + roll2 + "!");
			
			// outcomes of second roll
			if ((roll2 + roll1) == 10) {
				
				System.out.println("Spare! Almost there!");
				this.score += 15;
				this.currentFrame += 1;
			}
			
			else {
				
				this.score += (roll1+roll2);
				this.currentFrame += 1;
				System.out.println("You knocked down " + (roll1 + roll2) + " this frame!");
			}
			
		}
		
		// display current frame and score
		System.out.println("You played " + this.currentFrame + " frames!");
		System.out.println("You have a score of " + this.score + "!");

	}
	
}
		


