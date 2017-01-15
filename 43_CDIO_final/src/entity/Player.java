package entity;

import entity.Account;

public class Player {

	private Account myAccount;
	private PlayerOwned playerOwn;
	private Card[] jailCards;

	private String name;
	private int position, goToJail, turnsInJail;
	private boolean isAlive = true, inJail = false;
	private String[] streetsOwned = new String[28];

	/*
	 * Constructor
	 */

	public Player(String name) {
		jailCards = new OwnableCard[2];
		myAccount = new Account(this);
		playerOwn = new PlayerOwned();
		this.name = name;
		this.isAlive = true;
		this.position = 1;
	}

	/*
	 * SETTERS
	 */

	/**
	 * @return the streetsOwned
	 */
	public String[] getStreetsOwned() {
		return streetsOwned;
	}

	/**
	 * @param streetsOwned the streetsOwned to set
	 */
	public void setStreetsOwned(String Street) {
		for(int i = 0 ; i < streetsOwned.length ; i++){
			if(streetsOwned[i] == null)
				streetsOwned[i] = Street;
		}
	}

	public void inJail() {
		if (!inJail)
			this.inJail = true;
		else
			this.inJail = false;
	}

	public void incGoToJail() {
		this.goToJail++;
	}


	public void resetGoToJail() {
		this.goToJail = 0;
	}

	// Set jailcard to owned
	public void setJailCardOwned(Card card) {
		for (int i = 0; i < jailCards.length; i++) {
			if (jailCards[i] == null) {
				jailCards[i] = card;
				break;
			}
		}
	}

	/**
	 * removes a Get-Out-Of-Jail-Card from the player.
	 */
	public void useJailCardOwned() {
		for (int i = 0; i < jailCards.length; i++) {
			if (jailCards[i] != null) {
				jailCards[i] = null;
				break;
			}
		}
	}

	/**
	 * Method to update a given player's balance.
	 * @param money
	 */
	public void updateBalance(int money) {
		this.myAccount.updateBalance(money);
	}
/**
 * Gets balance
 * @return amount in given player's account.
 */
	public int getBalance(){
		return this.myAccount.getMoney();
	}

	/**
	 * Checks if the player is bankrupt (below 0)
	 * @return whether the player is bankrupt or not (isAlive).
	 */
	public boolean checkIfBankrupt() {
		if (this.myAccount.getMoney() < 0)
			this.isAlive = false;
		return isAlive;
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
	public void setFleetOwned() {
		playerOwn.setFleetOwned();
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
	 * Int VALUES on HOUSES
	 */

	public void setHouseOnStreetBlue(int blueNumber, int houses) {
		playerOwn.setHouseOnStreetBlue(blueNumber, houses);
	}

	public void setHouseOnStreetGreen(int greenNumber, int houses) {
		playerOwn.setHouseOnStreetGreen(greenNumber, houses);
	}

	public void setHouseOnStreetGrey(int greyNumber, int houses) {
		playerOwn.setHouseOnStreetGrey(greyNumber, houses);
	}

	public void setHouseOnStreetPink(int pinkNumber, int houses) {
		playerOwn.setHouseOnStreetPink(pinkNumber, houses);
	}

	public void setHouseOnStreetPurple(int purpleNumber, int houses) {
		playerOwn.setHouseOnStreetPurple(purpleNumber, houses);
	}

	public void setHouseOnStreetRed(int redNumber, int houses) {
		playerOwn.setHouseOnStreetRed(redNumber, houses);
	}

	public void setHouseOnStreetWhite(int whiteNumber, int houses) {
		playerOwn.setHouseOnStreetWhite(whiteNumber, houses);
	}

	public void setHouseOnStreetYellow(int yellowNumber, int houses) {
		playerOwn.setHouseOnStreetYellow(yellowNumber, houses);
	}

	/*
	 * Int VALUES on HOTELS
	 */

	public void setHotelOnStreetBlue(int blueNumber, int hotel) {
		playerOwn.setHotelOnStreetBlue(blueNumber, hotel);
	}

	public void setHotelOnStreetGreen(int greenNumber, int hotel) {
		playerOwn.setHotelOnStreetGreen(greenNumber, hotel);
	}

	public void setHotelOnStreetGrey(int greyNumber, int hotel) {
		playerOwn.setHotelOnStreetGrey(greyNumber, hotel);
	}

	public void setHotelOnStreetPink(int pinkNumber, int hotel) {
		playerOwn.setHotelOnStreetPink(pinkNumber, hotel);
	}

	public void setHotelOnStreetPurple(int purpleNumber, int hotel) {
		playerOwn.setHotelOnStreetPurple(purpleNumber, hotel);
	}

	public void setHotelOnStreetRed(int redNumber, int hotel) {
		playerOwn.setHotelOnStreetRed(redNumber, hotel);
	}

	public void setHotelOnStreetWhite(int whiteNumber, int hotel) {
		playerOwn.setHotelOnStreetWhite(whiteNumber, hotel);
	}

	public void setHotelOnStreetYellow(int yellowNumber, int hotel) {
		playerOwn.setHotelOnStreetYellow(yellowNumber, hotel);
	}

	/*
	 * GETTERS
	 */

	public boolean jailStatus() { //returns the boolean inJail.
		return this.inJail;
	}

	public int getGoToJail() {
		return this.goToJail;
	}

	public Boolean getJailCard() {
		for (int i = 0; i < jailCards.length; i++) {
			if (this.jailCards[i] != null)
				return true;
		}
		return false;
	}

	public Card  returnJailCard() {
		if (this.jailCards[0] != null)
			return this.jailCards[0];
		else
			return this.jailCards[1];
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

	// Get total owned Houses on Blue Streets
	public int getTotalHousesOnBlue() {
		return playerOwn.getTotalHousesOnBlue();
	}

	// Get total owned Houses on Green Streets
	public int getTotalHousesOnGreen() {
		return playerOwn.getTotalHousesOnGreen();
	}

	// Get total owned Houses on Grey Streets
	public int getTotalHousesOnGrey() {
		return playerOwn.getTotalHousesOnGrey();
	}

	// Get total owned Houses on Pink Streets
	public int getTotalHousesOnPink() {
		return playerOwn.getTotalHousesOnPink();
	}

	// Get total owned Houses on Purple Streets
	public int getTotalHousesOnPurple() {
		return playerOwn.getTotalHousesOnPurple();
	}

	// Get total owned Houses on Red Streets
	public int getTotalHousesOnRed() {
		return playerOwn.getTotalHousesOnRed();
	}

	// Get total owned Houses on White Streets
	public int getTotalHousesOnWhite() {
		return playerOwn.getTotalHousesOnWhite();
	}

	// Get total owned Houses on Yellow Streets
	public int getTotalHousesOnYellow() {
		return playerOwn.getTotalHousesOnYellow();
	}

	// Get total owned Hotels on Blue Streets
	public int getTotalHotelsOnBlue() {
		return playerOwn.getTotalHotelsOnBlue();
	}

	// Get total owned Hotels on Green Streets
	public int getTotalHotelsOnGreen() {
		return playerOwn.getTotalHotelsOnGreen();
	}

	// Get total owned Hotels on Grey Streets
	public int getTotalHotelsOnGrey() {
		return playerOwn.getTotalHotelsOnGrey();
	}

	// Get total owned Hotels on Pink Streets
	public int getTotalHotelsOnPink() {
		return playerOwn.getTotalHotelsOnPink();
	}

	// Get total owned Hotels on Purple Streets
	public int getTotalHotelsOnPurple() {
		return playerOwn.getTotalHotelsOnPurple();
	}

	// Get total owned Hotels on Red Streets
	public int getTotalHotelsOnRed() {
		return playerOwn.getTotalHotelsOnRed();
	}

	// Get total owned Hotels on White Streets
	public int getTotalHotelsOnWhite() {
		return playerOwn.getTotalHotelsOnWhite();
	}

	// Get total owned Hotels on Yellow Streets
	public int getTotalHotelsOnYellow() {
		return playerOwn.getTotalHotelsOnYellow();
	}

	// Get total owned Houses on a specific field at one of the Blue Streets
	public int getHousesOnBlueStreet(int blueNumber) {
		return playerOwn.getHousesOnBlueStreet(blueNumber);
	}

	// Get total owned Houses on a specific field at one of the Green Streets
	public int getHousesOnGreenStreet(int greenNumber) {
		return playerOwn.getHousesOnGreenStreet(greenNumber);
	}

	// Get total owned Houses on a specific field at one of the Grey Streets
	public int getHousesOnGreyStreet(int greyNumber) {
		return playerOwn.getHousesOnGreyStreet(greyNumber);
	}

	// Get total owned Houses on a specific field at one of the Pink Streets
	public int getHousesOnPinkStreet(int pinkNumber) {
		return playerOwn.getHousesOnPinkStreet(pinkNumber);
	}

	// Get total owned Houses on a specific field at one of the Purple Streets
	public int getHousesOnPurpleStreet(int purpleNumber) {
		return playerOwn.getHousesOnPurpleStreet(purpleNumber);
	}

	// Get total owned Houses on a specific field at one of the Red Streets
	public int getHousesOnRedStreet(int redNumber) {
		return playerOwn.getHousesOnRedStreet(redNumber);
	}

	// Get total owned Houses on a specific field at one of the White Streets
	public int getHousesOnWhiteStreet(int whiteNumber) {
		return playerOwn.getHousesOnWhiteStreet(whiteNumber);
	}

	// Get total owned Houses on a specific field at one of the Yellow Streets
	public int getHousesOnYellowStreet(int yellowNumber) {
		return playerOwn.getHousesOnYellowStreet(yellowNumber);
	}

	// Get total owned Hotels on a specific field at one of the Blue Streets
	public int getHotelsOnBlueStreet(int blueNumber) {
		return playerOwn.getHotelsOnBlueStreet(blueNumber);
	}

	// Get total owned Hotels on a specific field at one of the Green Streets
	public int getHotelsOnGreenStreet(int greenNumber) {
		return playerOwn.getHotelsOnGreenStreet(greenNumber);
	}

	// Get total owned Hotels on a specific field at one of the Grey Streets
	public int getHotelsOnGreyStreet(int greyNumber) {
		return playerOwn.getHotelsOnGreyStreet(greyNumber);
	}

	// Get total owned Hotels on a specific field at one of the Pink Streets
	public int getHotelsOnPinkStreet(int pinkNumber) {
		return playerOwn.getHotelsOnPinkStreet(pinkNumber);
	}

	// Get total owned Hotels on a specific field at one of the Purple Streets
	public int getHotelsOnPurpleStreet(int purpleNumber) {
		return playerOwn.getHotelsOnPurpleStreet(purpleNumber);
	}

	// Get total owned Hotels on a specific field at one of the Red Streets
	public int getHotelsOnRedStreet(int redNumber) {
		return playerOwn.getHotelsOnRedStreet(redNumber);
	}

	// Get total owned Hotels on a specific field at one of the White Streets
	public int getHotelsOnWhiteStreet(int whiteNumber) {
		return playerOwn.getHotelsOnWhiteStreet(whiteNumber);
	}

	// Get total owned Hotels on a specific field at one of the Yellow Streets
	public int getHotelsOnYellowStreet(int yellowNumber) {
		return playerOwn.getHotelsOnYellowStreet(yellowNumber);
	}

	/**
	 * @return the turnsInJail
	 */
	public int getTurnsInJail() {
		return turnsInJail;
	}
	
	public void incTurnsInJail(){
		this.turnsInJail++;
	}

	/**
	 * @param turnsInJail the turnsInJail to set
	 */
	public void setTurnsInJail(int turnsInJail) {
		this.turnsInJail = turnsInJail;
	}

}
