package controller;

import entity.Player;

 

public class PlayerManagement {
	
	Player[] player;
	int playerCount;
	int playersLeft;
	
	//Creates an array of total players.
	public PlayerManagement(int numberOfPlayers) {
		player = new Player[numberOfPlayers];
		this.playerCount = numberOfPlayers;
	}
	
	/*Error in player creation, cannot predefine player names. What do we do?
	 * Don't we use the name only on the GUI?
	//Creates the players.
	public void createPlayers(String name) {
		for (int i = 0; i < playerCount; i ++) {
			this.player[i] = new Player(name);
		}
	}
	*/
	
	//Updates total number of players.
	public void updatePlayerCount(int count) {
		this.playerCount = count;
	}
	
	//Getter to return player name based on the index number of the player array.
	public String getPlayerName(int playerIndex) {
		return player[playerIndex].getName();
	}
	
	//Getter to return players left.
	public int getPlayersLeft() {
		return playersLeft;
	}
	
	//Check if player is bankrupt.
	public void getPlayerStatus(int playerIndex) {
		player[playerIndex].checkIfBankrupt();
	}
	
	//Updates the position of a player.
	public void updatePosition(int playerIndex, int position) {
		player[playerIndex].setPosition(position);
	}
	
	//Getter to return the position of a player
	public int getPosition(int playerIndex) {
		return player[playerIndex].getPosition();
	}
	
	/*Code will be done when Board class is finished.
	public void removePlayerOwnership() {
		
	}
	
	
	public void buyField() {
		
	}
	*/
}
