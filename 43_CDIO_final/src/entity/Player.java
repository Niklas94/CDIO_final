package entity;

import entity.Account;

public class Player {

	private Account myAccount;
	private PlayerOwned playerOwn;

	private String name;
	private int position;
	private boolean isAlive;

	/*
	 * Constructor
	 */
	
	public Player(String name) {

		myAccount = new Account();
		playerOwn = new PlayerOwned();
		this.name = name;
		this.isAlive = true;
		this.position = 0;

	}

	/*
	 * SETTERS
	 */
	
	// Update player balance
	public void updateBalance(int money) {
		this.myAccount.updateBalance(money);
	}

	// Checks if player money is zero or below, if so isAlive variable will be
	// false, else true.
	public void checkIfBankrupt() {
		if (this.myAccount.getMoney() <= 0)
			isAlive = false;
		else
			isAlive = true;

	}
	
	// Set player position
	public void setPosition(int position) {
		this.position = position;
	}

	// Set the Brewery to owned or not by its number and a boolean value.
	public void setBreweryOwned(int breweryNumber, Boolean bool) {
		playerOwn.setBreweryOwned(breweryNumber, bool);
	}
	// Set the Fleet to owned or not by its number and a boolean value.
	public void setFleetOwned(int fleetNumber, Boolean bool) {
		playerOwn.setFleetOwned(fleetNumber, bool);
	}
	// Set the Blue Street to owned or not by its number and a boolean value.
	public void setStreetBlueOwned(int blueNumber, Boolean bool) {
		playerOwn.setStreetBlueOwned(blueNumber, bool);
	}
	// Set the Green Street to owned or not by its number and a boolean value.
	public void setStreetGreenOwned(int greenNumber, Boolean bool) {
		playerOwn.setStreetGreenOwned(greenNumber, bool);
	}
	// Set the Grey Street to owned or not by its number and a boolean value.
	public void setStreetGreyOwned(int greyNumber, Boolean bool) {
		playerOwn.setStreetGreyOwned(greyNumber, bool);
	}
	// Set the Pink Street to owned or not by its number and a boolean value.
	public void setStreetPinkOwned(int pinkNumber, Boolean bool) {
		playerOwn.setStreetPinkOwned(pinkNumber, bool);
	}
	// Set the Purple Street to owned or not by its number and a boolean value.
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool) {
		playerOwn.setStreetPurpleOwned(purpleNumber, bool);
	}
	// Set the Red Street to owned or not by its number and a boolean value.
	public void setStreetRedOwned(int redNumber, Boolean bool) {
		playerOwn.setStreetRedOwned(redNumber, bool);
	}
	// Set the White Street to owned or not by its number and a boolean value.
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool) {
		playerOwn.setStreetWhiteOwned(whiteNumber, bool);
	}
	// Set the Yellow Street to owned or not by its number and a boolean value.
	public void setStreetYellowOwned(int yellowNumber, Boolean bool) {
		playerOwn.setStreetYellowOwned(yellowNumber, bool);
	}

	/*
	 * GETTERS
	 */
	
	// Get player name
	public String getName() {
		return name;
	}
	
	// Get player account
	public Account getMyAccount() {
		return myAccount;
	}

	// Get player position
	public int getPosition() {
		return this.position;
	}

	// Get player alive status
	public boolean isAlive() {
		return isAlive;
	}

	// Get player owned status on Brewery 1 or 2
	public void getBreweryOwned(int breweryNumber) {
		playerOwn.getBreweryOwned(breweryNumber);
	}
	// Get player owned status on Fleet 1, 2, 3 or 4
	public void getFleetOwned(int fleetNumber) {
		playerOwn.getFleetOwned(fleetNumber);
	}
	// Get player owned status on Blue Street 1 or 2
	public void getStreetBlueOwned(int blueNumber) {
		playerOwn.getStreetBlueOwned(blueNumber);
	}
	// Get player owned status on Green Street 1, 2 or 3
	public void getStreetGreenOwned(int greenNumber) {
		playerOwn.getStreetGreenOwned(greenNumber);
	}
	// Get player owned status on Grey Street 1, 2 or 3
	public void getStreetGreyOwned(int greyNumber) {
		playerOwn.getStreetGreyOwned(greyNumber);
	}
	// Get player owned status on Pink Street 1, 2 or 3
	public void getStreetPinkOwned(int pinkNumber) {
		playerOwn.getStreetPinkOwned(pinkNumber);
	}
	// Get player owned status on Purple Street 1 or 2
	public void getStreetPurpleOwned(int purpleNumber) {
		playerOwn.getStreetPurpleOwned(purpleNumber);
	}
	// Get player owned status on Red Street 1, 2 or 3
	public void getStreetRedOwned(int redNumber) {
		playerOwn.getStreetRedOwned(redNumber);
	}
	// Get player owned status on White Street 1, 2 or 3
	public void getStreetWhiteOwned(int whiteNumber) {
		playerOwn.getStreetWhiteOwned(whiteNumber);
	}
	// Get player owned status on Yellow Street 1, 2 or 3
	public void getStreetYellowOwned(int yellowNumber) {
		playerOwn.getStreetYellowOwned(yellowNumber);
	}
	// Get total owned Brewery
	public void getTotalBreweryOwned() {
		playerOwn.getTotalBreweryOwned();
	}
	// Get total owned Fleet
	public void getTotalFleetOwned() {
		playerOwn.getTotalFleetOwned();
	}
	// Get total owned streets
	public void getTotalStreetOwned() {
		playerOwn.getTotalStreetOwned();
	}
	
	// Get total owned Blue Streets
	public void getTotalStreetBlueOwned() {
		playerOwn.getTotalStreetBlueOwned();
	}
	
	// Get total owned Green Streets
	public void getTotalStreetGreenOwned() {
		playerOwn.getTotalStreetGreenOwned();
	}
	
	// Get total owned Grey Streets
	public void getTotalStreetGreyOwned() {
		playerOwn.getTotalStreetGreyOwned();
	}
	
	// Get total owned Pink Streets
	public void getTotalStreetPinkOwned() {
		playerOwn.getTotalStreetPinkOwned();
	}
	
	// Get total owned Purple Streets
	public void getTotalStreetPurpleOwned() {
		playerOwn.getTotalStreetPurpleOwned();
	}
	
	// Get total owned Red Streets
	public void getTotalStreetRedOwned() {
		playerOwn.getTotalStreetRedOwned();
	}
	
	// Get total owned White Streets
	public void getTotalStreetWiteOwned() {
		playerOwn.getTotalStreetWhiteOwned();
	}
	
	// Get total owned Yellow Streets
	public void getTotalStreetYellowOwned() {
		playerOwn.getTotalStreetYellowOwned();
	}

	// Recheck removeOwnership(Board board) when Board class is complete
	/*
	 * public void removeOwnership(Board board) { for (int i = 1; i <
	 * board.getSize() + 1; i++) { if (board.getFelt(i) instanceof Ownable) {
	 * Ownable f = (Ownable)board.getFelt(i); if (f.getOwner() == this) {
	 * f.removeOwner(); } } } }
	 */

}
