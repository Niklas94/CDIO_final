package entity;

import entity.Account;

public class Player {

	private Account myAccount;
	private PlayerOwned playerOwn;
	private Card[] jailCards;

	private String name;
	private int position;
	private boolean isAlive;

	/*
	 * Constructor
	 */

	public Player(String name) {

		jailCards = new Card[2];
		myAccount = new Account(this);
		playerOwn = new PlayerOwned();
		this.name = name;
		this.isAlive = true;
		this.position = 0;

	}

	/*
	 * SETTERS
	 */

	// Set jailcard to owned
	public void setJailCardOwned(Card card) {
		for (int i = 0; i < jailCards.length; i++) {
			if (jailCards[i] == null)
				jailCards[i] = card;
		}
	}

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

	public Card getJailCard() {
		for (int i = 0; i < jailCards.length; i++) {
			if (jailCards[i] != null)
				return jailCards[i];
		}
		return null;
	}

	// Get player name
	public String getName() {
		return name;
	}

	// Get player position
	public int getPosition() {
		return this.position;
	}

	// Get player alive status
	public boolean isAlive() {
		return isAlive;
	}

	public Account getAccount() {
		return this.myAccount;
	}

	// Get player owned status on Brewery 1 or 2
	public boolean getBreweryOwned(int breweryNumber) {
		return playerOwn.getBreweryOwned(breweryNumber);
	}

	// Get player owned status on Fleet 1, 2, 3 or 4
	public boolean getFleetOwned(int fleetNumber) {
		return playerOwn.getFleetOwned(fleetNumber);
	}

	// Get player owned status on Blue Street 1 or 2
	public boolean getStreetBlueOwned(int blueNumber) {
		return playerOwn.getStreetBlueOwned(blueNumber);
	}

	// Get player owned status on Green Street 1, 2 or 3
	public boolean getStreetGreenOwned(int greenNumber) {
		return playerOwn.getStreetGreenOwned(greenNumber);
	}

	// Get player owned status on Grey Street 1, 2 or 3
	public boolean getStreetGreyOwned(int greyNumber) {
		return playerOwn.getStreetGreyOwned(greyNumber);
	}

	// Get player owned status on Pink Street 1, 2 or 3
	public boolean getStreetPinkOwned(int pinkNumber) {
		return playerOwn.getStreetPinkOwned(pinkNumber);
	}

	// Get player owned status on Purple Street 1 or 2
	public boolean getStreetPurpleOwned(int purpleNumber) {
		return playerOwn.getStreetPurpleOwned(purpleNumber);
	}

	// Get player owned status on Red Street 1, 2 or 3
	public boolean getStreetRedOwned(int redNumber) {
		return playerOwn.getStreetRedOwned(redNumber);
	}

	// Get player owned status on White Street 1, 2 or 3
	public boolean getStreetWhiteOwned(int whiteNumber) {
		return playerOwn.getStreetWhiteOwned(whiteNumber);
	}

	// Get player owned status on Yellow Street 1, 2 or 3
	public boolean getStreetYellowOwned(int yellowNumber) {
		return playerOwn.getStreetYellowOwned(yellowNumber);
	}

	// Get total owned Brewery
	public int getTotalBreweryOwned() {
		return playerOwn.getTotalBreweryOwned();
	}

	// Get total owned Fleet
	public int getTotalFleetOwned() {
		return playerOwn.getTotalFleetOwned();
	}

	// Get total owned streets
	public int getTotalStreetOwned() {
		return playerOwn.getTotalStreetOwned();
	}

	// Get total owned Blue Streets
	public int getTotalStreetBlueOwned() {
		return playerOwn.getTotalStreetBlueOwned();
	}

	// Get total owned Green Streets
	public int getTotalStreetGreenOwned() {
		return playerOwn.getTotalStreetGreenOwned();
	}

	// Get total owned Grey Streets
	public int getTotalStreetGreyOwned() {
		return playerOwn.getTotalStreetGreyOwned();
	}

	// Get total owned Pink Streets
	public int getTotalStreetPinkOwned() {
		return playerOwn.getTotalStreetPinkOwned();
	}

	// Get total owned Purple Streets
	public int getTotalStreetPurpleOwned() {
		return playerOwn.getTotalStreetPurpleOwned();
	}

	// Get total owned Red Streets
	public int getTotalStreetRedOwned() {
		return playerOwn.getTotalStreetRedOwned();
	}

	// Get total owned White Streets
	public int getTotalStreetWhiteOwned() {
		return playerOwn.getTotalStreetWhiteOwned();
	}

	// Get total owned Yellow Streets
	public int getTotalStreetYellowOwned() {
		return playerOwn.getTotalStreetYellowOwned();
	}

	// Get total owned Houses (ALL)
	public int getTotalHousesOwned() {
		return playerOwn.getTotalHousesOwned();
	}

	// Get total owned Hotels (ALL)
	public int getTotalHotelsOwned() {
		return playerOwn.getTotalHotelsOwned();

	}

}
