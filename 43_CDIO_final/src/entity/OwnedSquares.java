package entity;

import java.util.ArrayList;

public class OwnedSquares {
	private ArrayList<Ownable> squares;
	private Account owner;


	public OwnedSquares(Account owner) {
		this.squares = new ArrayList<Ownable>();
		this.owner = owner;
	}


	public ArrayList<Ownable> getSquares() {
		return squares;
	}


	
	public Account getOwner() {
		return owner;
	}



}