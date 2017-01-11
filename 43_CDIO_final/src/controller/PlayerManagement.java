package controller;

import boundary.GUI;
import desktop_codebehind.Car;
import entity.Dicecup;
import entity.Player;

public class PlayerManagement {

	private Player[] player;
	private int playerCount;
	private int playersLeft;

	// Initialize an array of total players.
	public PlayerManagement() {
		
	}

	/*
	 * SETTERS
	 */

	// Creates the players.
	// Player names will be predefined (Player 1, Player 2, Player 3 ...)
	public void createPlayers() {
		do{
			playerCount = GUI.numberOfPlayers();
		} while(playerCount < 3 || playerCount > 6);
		
		player = new Player[playerCount];
		
		for (int i = 0; i < playerCount; i++) {
			String chosenName = GUI.playerNames();
			for(int j = 0; j < i; j++){
				if(player[j].getName().equals(chosenName))
					chosenName = chosenName + "1";
			}
			player[i] = new Player(chosenName);
			GUI.getPlayerNames(player[i].getName());
			Car car = new Car.Builder()
					.typeCar()
					.build();
			desktop_resources.GUI.addPlayer(chosenName, 30000, car);
			desktop_resources.GUI.setCar(player[i].getPosition(), player[i].getName());
		}
	}

	// Updates total number of players.
	public void updatePlayerCount(int count) {
		this.playerCount = count;
	}
	
	public Player getPlayer(int a){
		return player[a];
	}

	// Set the position of a player.
	public void setPosition(Player player, int sum) {
		desktop_resources.GUI.removeAllCars(player.getName());
		player.setPosition(player.getPosition() + sum);
		if(player.getPosition() > 40){
			int newpos = player.getPosition() % 40;
			player.setPosition(newpos);
			player.updateBalance(4000);
			desktop_resources.GUI.setBalance(player.getName(), player.getAccount().getMoney());
		}
		desktop_resources.GUI.setCar(player.getPosition(), player.getName());
		
	}
	
	public boolean buyField() {
		return GUI.buyField();
	}

	// Update player balance
	public void updateBalance(int money, int playerNumber) {
		player[playerNumber].updateBalance(money);
	}

	// Check if player is bankrupt.
	public void getPlayerStatus(int playerNumber) {
		player[playerNumber].checkIfBankrupt();
	}

	// Set the Brewery to owned or not by its number and a boolean value.
	public void setBreweryOwned(int breweryNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setBreweryOwned(breweryNumber, bool);
	}

//	// Set the Fleet to owned or not by its number and a boolean value.
//	public void setFleetOwned(int fleetNumber, Boolean bool, int playerNumber) {
//		player[playerNumber].setFleetOwned(fleetNumber, bool);
//	}

	// Set the Blue Street to owned or not by its number and a boolean value.
	public void setStreetBlueOwned(int blueNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetBlueOwned(blueNumber, bool);
	}

	// Set the Green Street to owned or not by its number and a boolean value.
	public void setStreetGreenOwned(int greenNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetGreenOwned(greenNumber, bool);
	}

	// Set the Grey Street to owned or not by its number and a boolean value.
	public void setStreetGreyOwned(int greyNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetGreyOwned(greyNumber, bool);
	}

	// Set the Pink Street to owned or not by its number and a boolean value.
	public void setStreetPinkOwned(int pinkNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetPinkOwned(pinkNumber, bool);
	}

	// Set the Purple Street to owned or not by its number and a boolean value.
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetPurpleOwned(purpleNumber, bool);
	}

	// Set the Red Street to owned or not by its number and a boolean value.
	public void setStreetRedOwned(int redNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetRedOwned(redNumber, bool);
	}

	// Set the White Street to owned or not by its number and a boolean value.
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetWhiteOwned(whiteNumber, bool);
	}

	// Set the Yellow Street to owned or not by its number and a boolean value.
	public void setStreetYellowOwned(int yellowNumber, Boolean bool, int playerNumber) {
		player[playerNumber].setStreetYellowOwned(yellowNumber, bool);
	}

	/*
	 * Int VALUES on HOUSES
	 */

	public void setHouseOnStreetBlue(int blueNumber, int houses) {
		player[blueNumber].setHouseOnStreetBlue(blueNumber, houses);
	}

	public void setHouseOnStreetGreen(int greenNumber, int houses) {
		player[greenNumber].setHouseOnStreetGreen(greenNumber, houses);
	}

	public void setHouseOnStreetGrey(int greyNumber, int houses) {
		player[greyNumber].setHouseOnStreetGrey(greyNumber, houses);
	}

	public void setHouseOnStreetPink(int pinkNumber, int houses) {
		player[pinkNumber].setHouseOnStreetPink(pinkNumber, houses);
	}

	public void setHouseOnStreetPurple(int purpleNumber, int houses) {
		player[purpleNumber].setHouseOnStreetPurple(purpleNumber, houses);
	}

	public void setHouseOnStreetRed(int redNumber, int houses) {
		player[redNumber].setHouseOnStreetRed(redNumber, houses);
	}

	public void setHouseOnStreetWhite(int whiteNumber, int houses) {
		player[whiteNumber].setHouseOnStreetWhite(whiteNumber, houses);
	}

	public void setHouseOnStreetYellow(int yellowNumber, int houses) {
		player[yellowNumber].setHouseOnStreetYellow(yellowNumber, houses);
	}

	/*
	 * Int VALUES on HOTELS
	 */

	public void setHotelOnStreetBlue(int blueNumber, int hotel) {
		player[blueNumber].setHotelOnStreetBlue(blueNumber, hotel);
	}

	public void setHotelOnStreetGreen(int greenNumber, int hotel) {
		player[greenNumber].setHotelOnStreetGreen(greenNumber, hotel);
	}

	public void setHotelOnStreetGrey(int greyNumber, int hotel) {
		player[greyNumber].setHotelOnStreetGrey(greyNumber, hotel);
	}

	public void setHotelOnStreetPink(int pinkNumber, int hotel) {
		player[pinkNumber].setHotelOnStreetPink(pinkNumber, hotel);
	}

	public void setHotelOnStreetPurple(int purpleNumber, int hotel) {
		player[purpleNumber].setHotelOnStreetPurple(purpleNumber, hotel);
	}

	public void setHotelOnStreetRed(int redNumber, int hotel) {
		player[redNumber].setHotelOnStreetRed(redNumber, hotel);
	}

	public void setHotelOnStreetWhite(int whiteNumber, int hotel) {
		player[whiteNumber].setHotelOnStreetWhite(whiteNumber, hotel);
	}

	public void setHotelOnStreetYellow(int yellowNumber, int hotel) {
		player[yellowNumber].setHotelOnStreetYellow(yellowNumber, hotel);
	}

	/*
	 * GETTERS
	 */

	// Getter to return player name
	public String getPlayerName(int playerNumber) {
		return player[playerNumber].getName();
	}

	// Getter to return the position of a player
	public int getPosition(int playerNumber) {
		return player[playerNumber].getPosition();
	}

	// Get player alive status
	public boolean isAlive(int playerNumber) {
		return player[playerNumber].isAlive();
	}

	// Getter to return players left.
	public int getPlayersLeft() {
		return playersLeft;
	}

	// Getter to return player
	public Player[] getPlayerArray() {
		return player;
	}

	// Get player owned status on Brewery 1 or 2
	public boolean getBreweryOwned(int breweryNumber, int playerNumber) {
		return player[playerNumber].getBreweryOwned(breweryNumber);
	}

	// Get player owned status on Fleet 1, 2, 3 or 4
	public boolean getFleetOwned(int fleetNumber, int playerNumber) {
		return player[playerNumber].getFleetOwned(fleetNumber);
	}

	// Get player owned status on Blue Street 1 or 2
	public boolean getStreetBlueOwned(int blueNumber, int playerNumber) {
		return player[playerNumber].getStreetBlueOwned(blueNumber);
	}

	// Get player owned status on Green Street 1, 2 or 3
	public boolean getStreetGreenOwned(int greenNumber, int playerNumber) {
		return player[playerNumber].getStreetGreenOwned(greenNumber);
	}

	// Get player owned status on Grey Street 1, 2 or 3
	public boolean getStreetGreyOwned(int greyNumber, int playerNumber) {
		return player[playerNumber].getStreetGreyOwned(greyNumber);
	}

	// Get player owned status on Pink Street 1, 2 or 3
	public boolean getStreetPinkOwned(int pinkNumber, int playerNumber) {
		return player[playerNumber].getStreetPinkOwned(pinkNumber);
	}

	// Get player owned status on Purple Street 1 or 2
	public boolean getStreetPurpleOwned(int purpleNumber, int playerNumber) {
		return player[playerNumber].getStreetPurpleOwned(purpleNumber);
	}

	// Get player owned status on Red Street 1, 2 or 3
	public boolean getStreetRedOwned(int redNumber, int playerNumber) {
		return player[playerNumber].getStreetRedOwned(redNumber);
	}

	// Get player owned status on White Street 1, 2 or 3
	public boolean getStreetWhiteOwned(int whiteNumber, int playerNumber) {
		return player[playerNumber].getStreetWhiteOwned(whiteNumber);
	}

	// Get player owned status on Yellow Street 1, 2 or 3
	public boolean getStreetYellowOwned(int yellowNumber, int playerNumber) {
		return player[playerNumber].getStreetYellowOwned(yellowNumber);
	}

	// Get total owned Brewery
	public int getTotalBreweryOwned(int playerNumber) {
		return player[playerNumber].getTotalBreweryOwned();
	}

	// Get total owned Fleet
	public int getTotalFleetOwned(int playerNumber) {
		return player[playerNumber].getTotalFleetOwned();
	}

	// Get total owned streets
	public int getTotalStreetOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetOwned();
	}

	// Get total owned Blue Streets
	public int getTotalStreetBlueOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetBlueOwned();
	}

	// Get total owned Green Streets
	public int getTotalStreetGreenOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetGreenOwned();
	}

	// Get total owned Grey Streets
	public int getTotalStreetGreyOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetGreyOwned();
	}

	// Get total owned Pink Streets
	public int getTotalStreetPinkOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetPinkOwned();
	}

	// Get total owned Purple Streets
	public int getTotalStreetPurpleOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetPurpleOwned();
	}

	// Get total owned Red Streets
	public int getTotalStreetRedOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetRedOwned();
	}

	// Get total owned White Streets
	public int getTotalStreetWhiteOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetWhiteOwned();
	}

	// Get total owned Yellow Streets
	public int getTotalStreetYellowOwned(int playerNumber) {
		return player[playerNumber].getTotalStreetYellowOwned();
	}

	// Get total owned Houses (ALL)
	public int getTotalHousesOwned(int playerNumber) {
		return player[playerNumber].getTotalHousesOwned();
	}

	// Get total owned Hotels (ALL)
	public int getTotalHotelsOwned(int playerNumber) {
		return player[playerNumber].getTotalHotelsOwned();

	}

	// Get total owned Houses on Blue Streets
	public int getTotalHousesOnBlue(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnBlue();
	}

	// Get total owned Houses on Green Streets
	public int getTotalHousesOnGreen(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnGreen();
	}

	// Get total owned Houses on Grey Streets
	public int getTotalHousesOnGrey(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnGrey();
	}

	// Get total owned Houses on Pink Streets
	public int getTotalHousesOnPink(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnPink();
	}

	// Get total owned Houses on Purple Streets
	public int getTotalHousesOnPurple(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnPurple();
	}

	// Get total owned Houses on Red Streets
	public int getTotalHousesOnRed(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnRed();
	}

	// Get total owned Houses on White Streets
	public int getTotalHousesOnWhite(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnWhite();
	}

	// Get total owned Houses on Yellow Streets
	public int getTotalHousesOnYellow(int playerNumber) {
		return player[playerNumber - 1].getTotalHousesOnYellow();
	}

	// Get total owned Hotels on Blue Streets
	public int getTotalHotelsOnBlue(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnBlue();
	}

	// Get total owned Hotels on Green Streets
	public int getTotalHotelsOnGreen(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnGreen();
	}

	// Get total owned Hotels on Grey Streets
	public int getTotalHotelsOnGrey(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnGrey();
	}

	// Get total owned Hotels on Pink Streets
	public int getTotalHotelsOnPink(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnPink();
	}

	// Get total owned Hotels on Purple Streets
	public int getTotalHotelsOnPurple(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnPurple();
	}

	// Get total owned Hotels on Red Streets
	public int getTotalHotelsOnRed(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnRed();
	}

	// Get total owned Hotels on White Streets
	public int getTotalHotelsOnWhite(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnWhite();
	}

	// Get total owned Hotels on Yellow Streets
	public int getTotalHotelsOnYellow(int playerNumber) {
		return player[playerNumber - 1].getTotalHotelsOnYellow();
	}

	// Get total owned Houses on a specific field at one of the Blue Streets
	public int getHousesOnBlueStreet(int playerNumber, int blueNumber) {
		return player[playerNumber - 1].getHousesOnBlueStreet(blueNumber);
	}

	// Get total owned Houses on a specific field at one of the Green Streets
	public int getHousesOnGreenStreet(int playerNumber, int greenNumber) {
		return player[playerNumber - 1].getHousesOnGreenStreet(greenNumber);
	}

	// Get total owned Houses on a specific field at one of the Grey Streets
	public int getHousesOnGreyStreet(int playerNumber, int greyNumber) {
		return player[playerNumber - 1].getHousesOnGreyStreet(greyNumber);
	}

	// Get total owned Houses on a specific field at one of the Pink Streets
	public int getHousesOnPinkStreet(int playerNumber, int pinkNumber) {
		return player[playerNumber - 1].getHousesOnPinkStreet(pinkNumber);
	}

	// Get total owned Houses on a specific field at one of the Purple Streets
	public int getHousesOnPurpleStreet(int playerNumber, int purpleNumber) {
		return player[playerNumber - 1].getHousesOnPurpleStreet(purpleNumber);
	}

	// Get total owned Houses on a specific field at one of the Red Streets
	public int getHousesOnRedStreet(int playerNumber, int redNumber) {
		return player[playerNumber - 1].getHousesOnRedStreet(redNumber);
	}

	// Get total owned Houses on a specific field at one of the White Streets
	public int getHousesOnWhiteStreet(int playerNumber, int whiteNumber) {
		return player[playerNumber - 1].getHousesOnWhiteStreet(whiteNumber);
	}

	// Get total owned Houses on a specific field at one of the Yellow Streets
	public int getHousesOnYellowStreet(int playerNumber, int yellowNumber) {
		return player[playerNumber - 1].getHousesOnYellowStreet(yellowNumber);
	}

	// Get total owned Hotels on a specific field at one of the Blue Streets
	public int getHotelsOnBlueStreet(int playerNumber, int blueNumber) {
		return player[playerNumber - 1].getHotelsOnBlueStreet(blueNumber);
	}

	// Get total owned Hotels on a specific field at one of the Green Streets
	public int getHotelsOnGreenStreet(int playerNumber, int greenNumber) {
		return player[playerNumber - 1].getHotelsOnGreenStreet(greenNumber);
	}

	// Get total owned Hotels on a specific field at one of the Grey Streets
	public int getHotelsOnGreyStreet(int playerNumber, int greyNumber) {
		return player[playerNumber - 1].getHotelsOnGreyStreet(greyNumber);
	}

	// Get total owned Hotels on a specific field at one of the Pink Streets
	public int getHotelsOnPinkStreet(int playerNumber, int pinkNumber) {
		return player[playerNumber - 1].getHotelsOnPinkStreet(pinkNumber);
	}

	// Get total owned Hotels on a specific field at one of the Purple Streets
	public int getHotelsOnPurpleStreet(int playerNumber, int purpleNumber) {
		return player[playerNumber - 1].getHotelsOnPurpleStreet(purpleNumber);
	}

	// Get total owned Hotels on a specific field at one of the Red Streets
	public int getHotelsOnRedStreet(int playerNumber, int redNumber) {
		return player[playerNumber - 1].getHotelsOnRedStreet(redNumber);
	}

	// Get total owned Hotels on a specific field at one of the White Streets
	public int getHotelsOnWhiteStreet(int playerNumber, int whiteNumber) {
		return player[playerNumber - 1].getHotelsOnWhiteStreet(whiteNumber);
	}

	// Get total owned Hotels on a specific field at one of the Yellow Streets
	public int getHotelsOnYellowStreet(int playerNumber, int yellowNumber) {
		return player[playerNumber - 1].getHotelsOnYellowStreet(yellowNumber);
	}

}
