package entity;

public class Account {

	private int money;
	private final int MONEYZERO = 0;
	private final int STARTMONEY = 30000;
	private Player player;

	public Account(Player player) {
		money = STARTMONEY;
		player = this.player;
		
	}

	/*
	 * SETTERS
	 */

	public void updateBalance(int money) {
		this.money += money;
		if (this.money < this.MONEYZERO)
			this.money = this.MONEYZERO;
	}

	/*
	 * GETTERS
	 */

	public int getMoney() {
		return money;
	}
	
	// Get player owned status on Brewery 1 or 2
	public boolean getBreweryOwned(int breweryNumber) {
		return player.getBreweryOwned(breweryNumber);
	}
	// Get player owned status on Fleet 1, 2, 3 or 4
	public boolean getFleetOwned(int fleetNumber) {
		return player.getFleetOwned(fleetNumber);
	}
	// Get player owned status on Blue Street 1 or 2
	public boolean getStreetBlueOwned(int blueNumber) {
		return player.getStreetBlueOwned(blueNumber);
	}
	// Get player owned status on Green Street 1, 2 or 3
	public boolean getStreetGreenOwned(int greenNumber) {
		return player.getStreetGreenOwned(greenNumber);
	}
	// Get player owned status on Grey Street 1, 2 or 3
	public boolean getStreetGreyOwned(int greyNumber) {
		return player.getStreetGreyOwned(greyNumber);
	}
	// Get player owned status on Pink Street 1, 2 or 3
	public boolean getStreetPinkOwned(int pinkNumber) {
		return player.getStreetPinkOwned(pinkNumber);
	}
	// Get player owned status on Purple Street 1 or 2
	public boolean getStreetPurpleOwned(int purpleNumber) {
		return player.getStreetPurpleOwned(purpleNumber);
	}
	// Get player owned status on Red Street 1, 2 or 3
	public boolean getStreetRedOwned(int redNumber) {
		return player.getStreetRedOwned(redNumber);
	}
	// Get player owned status on White Street 1, 2 or 3
	public boolean getStreetWhiteOwned(int whiteNumber) {
		return player.getStreetWhiteOwned(whiteNumber);
	}
	// Get player owned status on Yellow Street 1, 2 or 3
	public boolean getStreetYellowOwned(int yellowNumber) {
		return player.getStreetYellowOwned(yellowNumber);
	}
	// Get total owned Brewery
	public int getTotalBreweryOwned() {
		return player.getTotalBreweryOwned();
	}
	// Get total owned Fleet
	public int getTotalFleetOwned() {
		return player.getTotalFleetOwned();
	}
	// Get total owned streets
	public int getTotalStreetOwned() {
		return player.getTotalStreetOwned();
	}
	
	// Get total owned Blue Streets
	public int getTotalStreetBlueOwned() {
		return player.getTotalStreetBlueOwned();
	}
	
	// Get total owned Green Streets
	public int getTotalStreetGreenOwned() {
		return player.getTotalStreetGreenOwned();
	}
	
	// Get total owned Grey Streets
	public int getTotalStreetGreyOwned() {
		return player.getTotalStreetGreyOwned();
	}
	
	// Get total owned Pink Streets
	public int getTotalStreetPinkOwned() {
		return player.getTotalStreetPinkOwned();
	}
	
	// Get total owned Purple Streets
	public int getTotalStreetPurpleOwned() {
		return player.getTotalStreetPurpleOwned();
	}
	
	// Get total owned Red Streets
	public int getTotalStreetRedOwned() {
		return player.getTotalStreetRedOwned();
	}
	
	// Get total owned White Streets
	public int getTotalStreetWiteOwned() {
		return player.getTotalStreetWhiteOwned();
	}
	
	// Get total owned Yellow Streets
	public int getTotalStreetYellowOwned() {
		return player.getTotalStreetYellowOwned();
	}

}
