package controller;

import boundary.GUI;
import desktop_codebehind.Car;
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



}
