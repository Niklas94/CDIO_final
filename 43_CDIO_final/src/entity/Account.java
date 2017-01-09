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
	public void getBreweryOwned(int breweryNumber) {
		player.getBreweryOwned(breweryNumber);
	}
	// Get player owned status on Fleet 1, 2, 3 or 4
	public void getFleetOwned(int fleetNumber) {
		player.getFleetOwned(fleetNumber);
	}
	// Get player owned status on Blue Street 1 or 2
	public void getStreetBlueOwned(int blueNumber) {
		player.getStreetBlueOwned(blueNumber);
	}
	// Get player owned status on Green Street 1, 2 or 3
	public void getStreetGreenOwned(int greenNumber) {
		player.getStreetGreenOwned(greenNumber);
	}
	// Get player owned status on Grey Street 1, 2 or 3
	public void getStreetGreyOwned(int greyNumber) {
		player.getStreetGreyOwned(greyNumber);
	}
	// Get player owned status on Pink Street 1, 2 or 3
	public void getStreetPinkOwned(int pinkNumber) {
		player.getStreetPinkOwned(pinkNumber);
	}
	// Get player owned status on Purple Street 1 or 2
	public void getStreetPurpleOwned(int purpleNumber) {
		player.getStreetPurpleOwned(purpleNumber);
	}
	// Get player owned status on Red Street 1, 2 or 3
	public void getStreetRedOwned(int redNumber) {
		player.getStreetRedOwned(redNumber);
	}
	// Get player owned status on White Street 1, 2 or 3
	public void getStreetWhiteOwned(int whiteNumber) {
		player.getStreetWhiteOwned(whiteNumber);
	}
	// Get player owned status on Yellow Street 1, 2 or 3
	public void getStreetYellowOwned(int yellowNumber) {
		player.getStreetYellowOwned(yellowNumber);
	}
	// Get total owned Brewery
	public void getTotalBreweryOwned() {
		player.getTotalBreweryOwned();
	}
	// Get total owned Fleet
	public void getTotalFleetOwned() {
		player.getTotalFleetOwned();
	}
	// Get total owned streets
	public void getTotalStreetOwned() {
		player.getTotalStreetOwned();
	}
	
	// Get total owned Blue Streets
	public void getTotalStreetBlueOwned() {
		player.getTotalStreetBlueOwned();
	}
	
	// Get total owned Green Streets
	public void getTotalStreetGreenOwned() {
		player.getTotalStreetGreenOwned();
	}
	
	// Get total owned Grey Streets
	public void getTotalStreetGreyOwned() {
		player.getTotalStreetGreyOwned();
	}
	
	// Get total owned Pink Streets
	public void getTotalStreetPinkOwned() {
		player.getTotalStreetPinkOwned();
	}
	
	// Get total owned Purple Streets
	public void getTotalStreetPurpleOwned() {
		player.getTotalStreetPurpleOwned();
	}
	
	// Get total owned Red Streets
	public void getTotalStreetRedOwned() {
		player.getTotalStreetRedOwned();
	}
	
	// Get total owned White Streets
	public void getTotalStreetWiteOwned() {
		player.getTotalStreetWhiteOwned();
	}
	
	// Get total owned Yellow Streets
	public void getTotalStreetYellowOwned() {
		player.getTotalStreetYellowOwned();
	}

}
