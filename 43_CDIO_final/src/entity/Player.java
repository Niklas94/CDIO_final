package entity;


import entity.Account;



public class Player {

	//Variables
	private String name;
	private Account myAccount;
	/*Will make a subclass for Account class and put it there
	private int breweryOwned, fleetOwned;
	*/
	private int position;
	private boolean isAlive = true;

	
	//Constructor
	public Player(String name) {
		this.name = name;
		myAccount = new Account();
		this.position = 0;
				
	}

	/*Will make a subclass for Account class and put it there
	public void updateFleetOwned() {
		this.fleetOwned++;
	}
	

	public int getFleetOwned(){ 
		return fleetOwned;
	}
	

	public void updateBreweryOwned() {
		breweryOwned++;
	}
	
	public int getBreweryOwned() {
		return breweryOwned++;
	}
	*/
	
	//Checks if player money is zero or below, if so isAlive variable will be false, else true.
	public void checkIfBankrupt() {
		if (this.myAccount.getMoney() <= 0)
			isAlive = false;
		else
			isAlive = true;
	}

	public String getName() {
		return name;
	}

	public void updateBalance(int money) {
		this.myAccount.updateBalance(money);
	}


	public Account getMyAccount() {
		return myAccount;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	// Recheck removeOwnership(Board board) when Board class is complete
	/*
	public void removeOwnership(Board board) {
		for (int i = 1; i < board.getSize() + 1; i++) {
			if (board.getFelt(i) instanceof Ownable) {
				Ownable f = (Ownable)board.getFelt(i);
				if (f.getOwner() == this) {
					f.removeOwner();
				}
			}
		}
	}
	*/
	
	public boolean isAlive() {
		return isAlive;
	}

}

