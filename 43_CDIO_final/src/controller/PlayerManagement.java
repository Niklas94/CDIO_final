package controller;

import boundary.GUI;
import desktop_codebehind.Car;
import entity.Player;

public class PlayerManagement {

	private Player[] player;
	private int playerCount;
	private int originalPlayerCount;
	private int playersLeft;
	// Initialize an array of total players.
	public PlayerManagement() {

	}

	/*
	 * SETTERS
	 */

	/**
	 * Creates the amount of players and with it, the cars.
	 */
	public void createPlayers() {
		do{
			playerCount = GUI.numberOfPlayers();
		} while(playerCount < 3 || playerCount > 6);

		this.originalPlayerCount = this.playerCount;

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
	
	/**
	 * Used to check whether there is only one player or not left alive.
	 * @return false if multiple players are left, true if only one is.
	 */

	public boolean winCheck(){
		int playersLeft = originalPlayerCount;

		for(int i = 0; i < player.length; i++){
			if(!player[i].getStatus())
				playersLeft--;
		}
		if(playersLeft == 1)
			return true;
		else
			return false;

	}

	/**
	 * Updates the amount of players.
	 * @param count number to update the playercount.
	 */
	public void updatePlayerCount() {
		this.playerCount--;
	}


	/**
	 * Sets the position of the player after he/she rolls the dice, making sure that there are no erors (IndexOutOfBounds) by using the "newpos" variable.
	 * @param player
	 * @param sum
	 */
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

	/**
	 * Gives the player the option to buy a given Square.
	 * @return true/false
	 */
	public boolean buyField() {
		return GUI.buyField();
	}

	/**
	 * Updates a given player's balance. 
	 * @param money
	 * @param playerNumber
	 */
	public void updateBalance(int money, int playerNumber) {
		player[playerNumber].updateBalance(money);
	}



	/*
	 * GETTERS
	 */

	/**
	 * gets the player
	 * @param a the player index id
	 * @return returns the player.
	 */
	public Player getPlayer(int a){
		return player[a];
	}

	/**
	 * Checks if the player is bankrupt.
	 * @param playerNumber
	 */
	public void getPlayerStatus(int playerNumber) {
		player[playerNumber].checkIfBankrupt();
	}


	/**
	 * @param playerNumber the player number.
	 * @return returns the player alive status.
	 */

	// Get player alive status
	public boolean getStatus(int playerNumber) {
		return player[playerNumber].getStatus();
	}

	/**
	 * @return returns playersleft.
	 */

	// Getter to return players left.
	public int getPlayersLeft() {
		return playersLeft;
	}

	/**
	 * @return returns the player.
	 */

	// Getter to return player
	public Player[] getPlayerArray() {
		return player;
	}

}
