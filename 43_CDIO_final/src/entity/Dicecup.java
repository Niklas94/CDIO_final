package entity;

import entity.Die;


public class Dicecup {

	//Variabler
	private Die x[]; //new Die[2];  
	private int sum; 

	public Dicecup() {
		x = new Die[2]; //Antal terninger
		x[0] = new Die();
		x[1] = new Die();
		sum = x[0].getValue() + x[1].getValue();
	}
 
	public void rollDice() { 
		sum = 0; //reset sum 
		x[0].rollDie();
		x[1].rollDie();
		sum += x[0].getValue(); 
		sum += x[1].getValue();
	}

	public boolean equalDice() {
		if (x[0].getValue() == x[1].getValue())
				return true;
		else
			return false;
	}
	
	
	public int getSum() {
		return sum;
	}
	
	public Die getX(int a) {
		return x[a];
	}
	
}


