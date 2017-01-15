package entity;

import entity.Die;


public class Dicecup {

	private Die x[]; //new Die[2];  
	private int sum; 
	
	/**
	 * This constructs a diceCup. Puts two dice in the cup and sets the variable sum to the values of the dice.
	 */
	
	public Dicecup() {
		x = new Die[2]; //Antal terninger
		x[0] = new Die();
		x[1] = new Die();
		sum = x[0].getValue() + x[1].getValue();
	}
 
	/**
	 * rolls the dice
	 */
	
	public void rollDice() { 
		sum = 0; //reset sum 
		x[0].rollDie();
		x[1].rollDie();
		sum += x[0].getValue(); 
		sum += x[1].getValue();
	}

	/**
	 * @return returns true if dice are equal value.
	 */
	
	public boolean equalDice() {
		if (x[0].getValue() == x[1].getValue())
				return true;
		else
			return false;
	}
	
	
	/**
	 * @return returns the sum.
	 */
	
	public int getSum() {
		return sum;
	}
	
	/**
	 * 
	 * @param a id of the die.
	 * @return returns the die.
	 */
	
	public Die getX(int a) {
		return x[a];
	}
	
}


