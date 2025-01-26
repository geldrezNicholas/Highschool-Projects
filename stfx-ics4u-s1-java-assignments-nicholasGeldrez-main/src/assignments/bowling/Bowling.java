package assignments.bowling;

public class Bowling {

	// data members 
	final int MAX_VALUE = 10;
	int roll1;
	int roll2;
	int currentRoll;
	int score;
	int frame;
	
	
	// default constructor
	public Bowling() {
		
		this.roll1 = 0;
		this.roll2 = 0;
		this.currentRoll = 0;
		this.score = 0;
		this.frame = 1;
		
	}
	
	// parameterized constructor
	public Bowling (int r1, int r2, int cr, int s, int f) {
		
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
	
	public int getFrame() {
		
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
	
	public void setScore (int s) {
		
		this.score += s;
		
	}
	
	public void setFrame(int f) {
		
		this.frame += f;
		
	}
	
	// generates random number which represents roll1 between 1 and MAX_VALUE
	public void roll(int p) {
				
		if ((this.frame % 2) == 0) {
			
			roll1 = ((int)(Math.random()*(p+1)));
			
			p -= roll1;
			
		}
		
		else {
			
			roll2 = ((int)(Math.random()* (p + 1)));
			p -= roll2;
			
		}
		
		if (roll1 == 10) {
			
			this.score += 20;
			this.frame += 2;
			
		}
		
		else {
			
			if (p == 0) {
				
				this.score -= roll1;
				this.score += 15;
				this.frame += 1;
					
			}
			
			else {
				
				if((this.frame % 2) == 0) {
				
				this.score += roll1;
				
			}
			
				else {
					
					this.score += roll2;
					
				}
			
			this.frame += 1;
			
			}
			
		}
			
	}
		
		
	/*	roll2 = ((int)(Math.random() * (11 - roll1)));

		this.frame += 0.5;
		
		if (frame % 1 != 0) {
			
			if (roll1 == 10) {
				
				this.score += 20;
				this.currentRoll = roll1;
				//this.frame += 0.5;
				this.roll2 = 0;
				
			}	
			
			else {
				
				if ((roll2 + roll1) == 10) {
					
					this.currentRoll = roll2;
					this.score += 15;
					this.frame += 0.5;
					
				}
				
				else {
					
					this.currentRoll = roll2;
					this.score += (roll1+roll2);
					this.frame += 0.5;
					
				}
				
			}
				
		}
		
		
		else {
			
			if ((roll2 + roll1) == 10) {
				
				this.currentRoll = roll2;
				this.score += 15;
				this.frame += 0.5;
				
			}
			
			else {
				
				this.currentRoll = roll2;
				this.score += (roll1+roll2);
				this.frame += 0.5;
				
			}
			
			
		}
		
		
	/*	// if user gets a strike
		if (roll1 == 10) {
		
			this.score += 20;
			this.currentRoll = 10;
			this.frame += 0.5;
			this.roll2 = 0;
			
		}
		
		else {
			
			// roll a random number for the second roll and display
			roll2 = ((int)(Math.random() * (11 - roll1)));
			
			// outcomes of second roll
			if ((roll2 + roll1) == 10) {
				
				this.currentRoll = roll2;
				this.score += 15;
				this.frame += 0.5;
				
			}
			
			else {
				
				this.currentRoll = roll2;
				this.score += (roll1+roll2);
				this.frame += 0.5;
				
			}
			
		} */
		

	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.roll1 + "." + this.roll2 + "." + this.score + "." + this.frame + ".";
				
	}
	
}
