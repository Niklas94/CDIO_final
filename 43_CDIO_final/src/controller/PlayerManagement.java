package controller;

import entity.Player;

public class PlayerManagement {

	private Player[] player;
	private int playerCount;
	private int playersLeft;

	// Initialize an array of total players.
	public PlayerManagement(int numberOfPlayers) {
		player = new Player[numberOfPlayers];
		this.playerCount = numberOfPlayers;
	}

	/*
	 * SETTERS
	 */

	// Creates the players.
	// Player names will be predefined (Player 1, Player 2, Player 3 ...)
	public void createPlayers() {
		for (int i = 0, j = 1; i < playerCount; i++, j++) {
			this.player[i] = new Player("Player " + j);
		}
	}

	// Updates total number of players.
	public void updatePlayerCount(int count) {
		this.playerCount = count;
	}

	// Set the position of a player.
	public void setPosition(int position, int playerNumber) {
		player[playerNumber - 1].setPosition(position);
	}

	// Update player balance
	public void updateBalance(int money, int playerNumber) {
		player[playerNumber - 1].updateBalance(money);
	}

	// Check if player is bankrupt.
	public void getPlayerStatus(int playerNumber) {
		player[playerNumber - 1].checkIfBankrupt();
	}

	// Set the Brewery to owned or not by its number and a boolean value.
	public void setBreweryOwned(int breweryNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setBreweryOwned(breweryNumber, bool);
	}

	// Set the Fleet to owned or not by its number and a boolean value.
	public void setFleetOwned(int fleetNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setFleetOwned(fleetNumber, bool);
	}

	// Set the Blue Street to owned or not by its number and a boolean value.
	public void setStreetBlueOwned(int blueNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetBlueOwned(blueNumber, bool);
	}

	// Set the Green Street to owned or not by its number and a boolean value.
	public void setStreetGreenOwned(int greenNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetGreenOwned(greenNumber, bool);
	}

	// Set the Grey Street to owned or not by its number and a boolean value.
	public void setStreetGreyOwned(int greyNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetGreyOwned(greyNumber, bool);
	}

	// Set the Pink Street to owned or not by its number and a boolean value.
	public void setStreetPinkOwned(int pinkNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetPinkOwned(pinkNumber, bool);
	}

	// Set the Purple Street to owned or not by its number and a boolean value.
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetPurpleOwned(purpleNumber, bool);
	}

	// Set the Red Street to owned or not by its number and a boolean value.
	public void setStreetRedOwned(int redNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetRedOwned(redNumber, bool);
	}

	// Set the White Street to owned or not by its number and a boolean value.
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetWhiteOwned(whiteNumber, bool);
	}

	// Set the Yellow Street to owned or not by its number and a boolean value.
	public void setStreetYellowOwned(int yellowNumber, Boolean bool, int playerNumber) {
		player[playerNumber - 1].setStreetYellowOwned(yellowNumber, bool);
	}

	/*
	 * GETTERS
	 */

	// Getter to return player name
	public String getPlayerName(int playerNumber) {
		return player[playerNumber - 1].getName();
	}

	// Getter to return the position of a player
	public int getPosition(int playerNumber) {
		return player[playerNumber - 1].getPosition();
	}

	// Get player alive status
	public boolean isAlive(int playerNumber) {
		return player[playerNumber - 1].isAlive();
	}

	// Getter to return players left.
	public int getPlayersLeft() {
		return playersLeft;
	}

	// Get player owned status on Brewery 1 or 2
	public boolean getBreweryOwned(int breweryNumber, int playerNumber) {
		return player[playerNumber - 1].getBreweryOwned(breweryNumber);
	}

	// Get player owned status on Fleet 1, 2, 3 or 4
	public boolean getFleetOwned(int fleetNumber, int playerNumber) {
		return player[playerNumber - 1].getFleetOwned(fleetNumber);
	}

	// Get player owned status on Blue Street 1 or 2
	public boolean getStreetBlueOwned(int blueNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetBlueOwned(blueNumber);
	}

	// Get player owned status on Green Street 1, 2 or 3
	public boolean getStreetGreenOwned(int greenNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetGreenOwned(greenNumber);
	}

	// Get player owned status on Grey Street 1, 2 or 3
	public boolean getStreetGreyOwned(int greyNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetGreyOwned(greyNumber);
	}

	// Get player owned status on Pink Street 1, 2 or 3
	public boolean getStreetPinkOwned(int pinkNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetPinkOwned(pinkNumber);
	}

	// Get player owned status on Purple Street 1 or 2
	public boolean getStreetPurpleOwned(int purpleNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetPurpleOwned(purpleNumber);
	}

	// Get player owned status on Red Street 1, 2 or 3
	public boolean getStreetRedOwned(int redNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetRedOwned(redNumber);
	}

	// Get player owned status on White Street 1, 2 or 3
	public boolean getStreetWhiteOwned(int whiteNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetWhiteOwned(whiteNumber);
	}

	// Get player owned status on Yellow Street 1, 2 or 3
	public boolean getStreetYellowOwned(int yellowNumber, int playerNumber) {
		return player[playerNumber - 1].getStreetYellowOwned(yellowNumber);
	}

	// Get total owned Brewery
	public int getTotalBreweryOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalBreweryOwned();
	}

	// Get total owned Fleet
	public int getTotalFleetOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalFleetOwned();
	}

	// Get total owned streets
	public int getTotalStreetOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetOwned();
	}

	// Get total owned Blue Streets
	public int getTotalStreetBlueOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetBlueOwned();
	}

	// Get total owned Green Streets
	public int getTotalStreetGreenOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetGreenOwned();
	}

	// Get total owned Grey Streets
	public int getTotalStreetGreyOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetGreyOwned();
	}

	// Get total owned Pink Streets
	public int getTotalStreetPinkOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetPinkOwned();
	}

	// Get total owned Purple Streets
	public int getTotalStreetPurpleOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetPurpleOwned();
	}

	// Get total owned Red Streets
	public int getTotalStreetRedOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetRedOwned();
	}

	// Get total owned White Streets
	public int getTotalStreetWhiteOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetWhiteOwned();
	}

	// Get total owned Yellow Streets
	public int getTotalStreetYellowOwned(int playerNumber) {
		return player[playerNumber - 1].getTotalStreetYellowOwned();
	}

}
