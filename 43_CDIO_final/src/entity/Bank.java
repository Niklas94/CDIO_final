package entity;

import controller.BoardManagement;

public class Bank {

	private Player[] players;
	private BoardManagement bm;


	/**
	 * This constructs the bank.
	 */
	
	public Bank() {
		
	}
	
	/**
	 * fills the player array.
	 * @param players the players
	 */
	
	public void fillPlayerArray(Player[] players){
		this.players = players;
	}
	
	/**
	 * get the bm.
	 * @param bm the controlling boardManagement.
	 */
	
	public void getBM(BoardManagement bm){
		this.bm = bm;
	}
	
	/**
	 * buys the field.
	 * @param player the player.
	 * @param price the price of the field.
	 * @return returns true or false
	 */

	public boolean buyField(Player player, int price) {
		if(player.getBalance() >= price){
			player.updateBalance(-price);
			return true;
		}
		else
			return false;

	}

	/**
	 * removes ownership.
	 * @param isAlive boolean value.
	 * @param player the player.
	 * @param bM the controlling boardManagement.
	 */
	
	public void removeOwnership(boolean isAlive, Player player, BoardManagement bM){
		if(!isAlive) {
			for(int i=0; i < bM.getNumberOfSquares();i++){
				if(bM.getSquare(i) instanceof Ownable)
					if (((Ownable) bM.getSquare(i)).getOwner() == player.getName())
						((Ownable) bM.getSquare(i)).removeOwner();
			}
		}
	}

	/**
	 * pays the rent.
	 * @param player the player.
	 * @param owner the owner.
	 * @param rent the rent.
	 */
	
	public void payRent(Player player, String owner, int rent) {
		if(bm.getSquare(player.getPosition()) instanceof Fleet){
			for(int i = 0; i < players.length; i++){
				if(players[i].getName() == owner)
					rent = (int) (rent / (8 / Math.pow(2, players[i].getTotalFleetOwned() - 1)));
			}
		}
		if(player.getBalance() < rent){
			rent = player.getBalance();
		}
		player.updateBalance(-rent);
		for(int i = 0; i < players.length; i++){
			if(players[i].getName() == owner)
				players[i].updateBalance(rent);
		}
	}
	public void payBreweryRent(Player player, String owner, int rent, int sum){
		
	}

}





