package entity;


import entity.Account;

public class Player {

	private Account myAccount;
	
	private String name;
	private int position;
	private boolean isAlive;

	
	public Player(String name) {
		
		myAccount = new Account();
		this.name = name;
		this.isAlive = true;
		this.position = 0;
				
	}
	
	/*
	 * SETTERS
	 */
	
	//Checks if player money is zero or below, if so isAlive variable will be false, else true.

	
	public void updateBalance(int money) {
		this.myAccount.updateBalance(money);
	}
	
	public void checkIfBankrupt() {
		if (this.myAccount.getMoney() <= 0)
			isAlive = false;
		else
			isAlive = true;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	public void setBreweryOwned(int breweryNumber, Boolean bool) {
		myAccount.setBreweryOwned(breweryNumber, bool);
	}
	public void setFleetOwned(int fleetNumber, Boolean bool) {
		myAccount.setFleetOwned(fleetNumber, bool);
	}
	public void setStreetBlueOwned(int blueNumber, Boolean bool) {
		myAccount.setStreetBlueOwned(blueNumber, bool);
	}
	public void setStreetGreenOwned(int greenNumber, Boolean bool) {
		myAccount.setStreetGreenOwned(greenNumber, bool);
	}
	public void setStreetGreyOwned(int greyNumber, Boolean bool) {
		myAccount.setStreetGreyOwned(greyNumber, bool);
	}
	public void setStreetPinkOwned(int pinkNumber, Boolean bool) {
		myAccount.setStreetPinkOwned(pinkNumber, bool);
	}
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool) {
		myAccount.setStreetPurpleOwned(purpleNumber, bool);
	}
	public void setStreetRedOwned(int redNumber, Boolean bool) {
		myAccount.setStreetRedOwned(redNumber, bool);
	}
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool) {
		myAccount.setStreetWhiteOwned(whiteNumber, bool);
	}
	public void setStreetYellowOwned(int yellowNumber, Boolean bool) {
		myAccount.setStreetYellowOwned(yellowNumber, bool);
	}
	
	/*
	 * GETTERS
	 */

	public String getName() {
		return name;
	}

	public Account getMyAccount() {
		return myAccount;
	}

	public int getPosition() {
		return this.position;
	}

	public boolean isAlive() {
		return isAlive;
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
	

	


}

