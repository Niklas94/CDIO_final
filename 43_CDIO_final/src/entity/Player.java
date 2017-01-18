package entity;

import entity.Account;

public class Player {

	private Account myAccount;
	private Card[] jailCards;

	private String name;
	private int position, goToJail, turnsInJail, fleetOwned, housesOwned, hotelsOwned;
	private boolean isAlive = true, inJail = false;

	
	/**
	 * This constructs a player with a given name.
	 * @param name player name.
	 */

	public Player(String name) {
		jailCards = new OwnableCard[2];
		myAccount = new Account(this);
		this.name = name;
		this.isAlive = true;
		this.position = 1;
	}
	
	/**
	 * If the player buys a fleet field this method is called to
	 * update the amount of fleets he owns.
	 */
	
	public void setFleetOwned(){
		this.fleetOwned++;
	}
	
	/**
	 * Gets the amount of fleets a player owns.
	 * @return returns the amount he owns.
	 */
	
	public int getFleetOwned(){
		return this.fleetOwned;
	}
	
	/**
	 * Used to check whether a player is alive or not, ie. whether hes bankrupt or not.
	 * @return
	 */
	
	public boolean getStatus(){
		return this.isAlive;
	}

	/*
	 * SETTERS
	 */


	/**
	 * changes the boolean value of inJail.
	 */
	
	public void inJail() {
		if (!inJail)
			this.inJail = true;
		else
			this.inJail = false;
	}

	/**
	 * increments incGoToJail.
	 */
	public void incGoToJail() {
		this.goToJail++;
	}

	/**
	 * resets goToJail.
	 */

	public void resetGoToJail() {
		this.goToJail = 0;
	}

	
	/**
	 * gives jailCard to player.
	 * @param card the type of card.
	 */
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
	 * @param money the amount of money.
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
	
	/**
	 * sets the position of a player.
	 * @param position position of the player.
	 */

	// Set player position
	public void setPosition(int position) {
		this.position = position;
		if(this.position == -1)
			this.position = 0;
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

	public Account getAccount() {
		return this.myAccount;
	}

	/**
	 * @return the turnsInJail
	 */
	public int getTurnsInJail() {
		return turnsInJail;
	}
	
	/**
	 * increments the incTurnsInJail
	 */
	
	public void incTurnsInJail(){
		this.turnsInJail++;
	}

	/**
	 * @param turnsInJail the turnsInJail to set
	 */
	public void setTurnsInJail(int turnsInJail) {
		this.turnsInJail = turnsInJail;
	}

	/**
	 * @return the hotelsOwned
	 */
	public int getHotelsOwned() {
		return hotelsOwned;
	}

	/**
	 * @param hotelsOwned the hotelsOwned to set
	 */
	public void incHotelsOwned() {
		this.hotelsOwned++;
		this.housesOwned -= 4;
	}

	/**
	 * @return the housesOwned
	 */
	public int getHousesOwned() {
		return housesOwned;
	}

	/**
	 * @param housesOwned the housesOwned to set
	 */
	public void incHousesOwned() {
		this.housesOwned++;
	}
}
