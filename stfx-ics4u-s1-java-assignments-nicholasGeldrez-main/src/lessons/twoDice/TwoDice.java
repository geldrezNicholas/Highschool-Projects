package lessons.twoDice;

public class TwoDice {

	// data members 
	final int MAX_VALUE = 6;
	int dice1, dice2;
	
	// default constructor
	public TwoDice() {
		
		this.dice1 = 0;
		this.dice2 = 0;
		
	}
	
	// parameterized constructor
	public TwoDice(int d1, int d2) {
		
		this.dice1 = d1;
		this.dice2 = d2;
		
	}
	
	// get methods
	
	public int getDice1() {
		
		return this.dice1;
		
	}
	
	public int getDice2() {
		
		return this.dice2;
		
	}
	
	// set methods
	
	public void setDice1(int d1) {
		
		this.dice1 = d1;
		
	}
	
	public void setDice2(int d2) {
		
		this.dice2 = d2;
		
	}
	
	// generates 2 random numbers between 1 and MAX_VALUE
	public void rollDi() {
		
		dice1 = (int)(Math.random() * MAX_VALUE + 1);
		dice2 = (int)(Math.random() * MAX_VALUE + 1);
		
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.dice1 + "." + this.dice2;
				
		
	}
	
}
