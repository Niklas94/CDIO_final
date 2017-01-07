package entity;


public class Account {

	private int money;
	private final int MONEYZERO = 0;
	private final int STARTMONEY = 30000;
	private PlayerOwned playerOwned;
	//private Bank bank;

	public Account() {
		money = STARTMONEY;
	}
	
	/*
	 * SETTERS
	 */
	
	public void updateBalance(int money) 
	{
		this.money += money;		
		if ( this.money < this.MONEYZERO )
			this.money = this.MONEYZERO;
	}
	
	public void setBreweryOwned(int breweryNumber, Boolean bool) {
		playerOwned.setBreweryOwned(breweryNumber, bool);
	}
	public void setFleetOwned(int fleetNumber, Boolean bool) {
		playerOwned.setFleetOwned(fleetNumber, bool);
	}
	public void setStreetBlueOwned(int blueNumber, Boolean bool) {
		playerOwned.setStreetBlueOwned(blueNumber, bool);
	}
	public void setStreetGreenOwned(int greenNumber, Boolean bool) {
		playerOwned.setStreetGreenOwned(greenNumber, bool);
	}
	public void setStreetGreyOwned(int greyNumber, Boolean bool) {
		playerOwned.setStreetGreyOwned(greyNumber, bool);
	}
	public void setStreetPinkOwned(int pinkNumber, Boolean bool) {
		playerOwned.setStreetPinkOwned(pinkNumber, bool);
	}
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool) {
		playerOwned.setStreetPurpleOwned(purpleNumber, bool);
	}
	public void setStreetRedOwned(int redNumber, Boolean bool) {
		playerOwned.setStreetRedOwned(redNumber, bool);
	}
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool) {
		playerOwned.setStreetWhiteOwned(whiteNumber, bool);
	}
	public void setStreetYellowOwned(int yellowNumber, Boolean bool) {
		playerOwned.setStreetYellowOwned(yellowNumber, bool);
	}
	
	/*
	 * GETTERS 
	 */
	
	public int getMoney() {
		return money;
	}
	
	public int getTotalBreweryOwned() {
		return playerOwned.getTotalBreweryOwned();
	}
	
	public int getTotalFleetOwned() {
		return playerOwned.getTotalFleetOwned();
	}
	
	public int getTotalStreetOwned() {
		return playerOwned.getTotalStreetOwned();
	}
	
	public Boolean getBreweryOwned(int breweryNumber) {
		return playerOwned.getBreweryOwned(breweryNumber);
	}
	
	public Boolean getFleetOwned(int fleetNumber) {
		return playerOwned.getFleetOwned(fleetNumber);
	}
	
	public Boolean getStreetBlueOwned(int blueNumber) {
		return playerOwned.getStreetBlueOwned(blueNumber);
	}
	
	public Boolean getStreetGreenOwned(int greenNumber) {
		return playerOwned.getStreetGreenOwned(greenNumber);
	}
	
	public Boolean getStreetGreyOwned(int greyNumber) {
		return playerOwned.getStreetGreyOwned(greyNumber);
	}
	
	public Boolean getStreetPinkOwned(int pinkNumber) {
		return playerOwned.getStreetPinkOwned(pinkNumber);
	}
	
	public Boolean getStreetPurpleOwned(int purpleNumber) {
		return playerOwned.getStreetPurpleOwned(purpleNumber);
	}
	
	public Boolean getStreetRedOwned(int redNumber) {
		return playerOwned.getStreetRedOwned(redNumber);
	}
	
	public Boolean getStreetWhiteOwned(int whiteNumber) {
		return playerOwned.getStreetWhiteOwned(whiteNumber);
	}
	
	public Boolean getStreetYellowOwned(int yellowNumber) {
		return playerOwned.getStreetYellowOwned(yellowNumber);
	}

}
