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

	public void removeOwnership(Player player){
		if(!player.getStatus()) {
			for(int i=0; i < bm.getNumberOfSquares();i++){
				if(bm.getSquare(i) instanceof Ownable)
					if (((Ownable) bm.getSquare(i)).getOwner() == player.getName()){
						((Ownable) bm.getSquare(i)).removeOwner();
						if(bm.getSquare(i) instanceof Street) {
							bm.replaceStreetField(i);
						}
					}
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
					rent = (int) (rent / (8 / Math.pow(2, players[i].getFleetOwned() - 1)));
			}
		}
		if (player.getBalance() >= rent) {
			player.updateBalance(-rent);
		}
		else if (player.getBalance() < rent) {
			rent = player.getBalance();
			player.updateBalance(-(rent+1));
		}
		for(int i = 0; i < players.length; i++){
			if(players[i].getName() == owner)
				players[i].updateBalance(rent);
		}
	}

	/**
	 * 
	 * @param player paying the rent
	 * @param owner of the field
	 * @param rent of the brewery (100)
	 * @param sum which the rent is multiplied by
	 * 
	 * if both breweries are owned by the same player, the rent is multiplied by two.
	 */
	public void payBreweryRent(Player player, String owner, int rent, int sum){

		int totalBrewery = 0;
		for (int i = 0; i < bm.getNumberOfSquares(); i++) {
			if (bm.getSquare(i) instanceof Brewery)
				if (((Brewery) bm.getSquare(i)).getOwner() == owner)
					totalBrewery++;
		}
		if (totalBrewery == 2)
			rent = 2*rent*sum;
		else
			rent = rent*sum;
		
		if (player.getBalance() >= rent*sum) {
			player.updateBalance(-rent);
		}
		else if (player.getBalance() < rent*sum) {
			rent = player.getBalance();
			player.updateBalance(-(rent+1));
		}
		for(int i = 0; i < players.length; i++){
			if(players[i].getName() == owner)
				players[i].updateBalance(rent);
		}
	}
	
	/**
	 * This method updates the player balance when he buys a house.
	 * @param square the square on which a house is bought.
	 * @param player the player buying the house.
	 */
	
	public void buyHouse(Square square, Player player){
		int housePrice = ((Street)square).getHousePrice();
		player.updateBalance(-housePrice);
	}

	/**
	 * This method checks all players, to see if any of them owns all fields of a specific type, e.g. the blue streets. If so, double the rent on those streets.
	 * @param squaresArr
	 */
	public void checkOwnedStreets (Square[] squaresArr){
		Square[] squares = squaresArr;
		int blue = 2, green = 3, grey = 3, pink = 3, purple = 2, red = 3, white = 3, yellow = 3, orange = 3;
		for(int j = 0; j < players.length; j++){
			int blueOwned = 0, greenOwned = 0, greyOwned = 0, pinkOwned = 0, purpleOwned = 0, redOwned = 0, whiteOwned = 0, yellowOwned = 0, orangeOwned = 0;
			for(int i = 0; i < squares.length; i++){
				if(squares[i].getType() == "Blue" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					blueOwned++;
				else if(squares[i].getType() == "Green" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					greenOwned++;
				else if(squares[i].getType() == "Grey" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					greyOwned++;
				else if(squares[i].getType() == "Pink" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					pinkOwned++;
				else if(squares[i].getType() == "Purple" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					purpleOwned++;
				else if(squares[i].getType() == "Red" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					redOwned++;
				else if(squares[i].getType() == "White" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					whiteOwned++;
				else if(squares[i].getType() == "Yellow" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					yellowOwned++;
				else if (squares[i].getType() == "Orange" && players[j].getName() == ((Ownable)squares[i]).getOwner())
					orangeOwned++;
			}
			for(int i = 0; i < squares.length; i++){
				if (blue == blueOwned)
					if (squares[i].getType() == "Blue")
						((Street)squares[i]).setRent();
				if (green == greenOwned)
					if (squares[i].getType() == "Green")
						((Street)squares[i]).setRent();
				if (grey == greyOwned)
					if (squares[i].getType() == "Grey")
						((Street)squares[i]).setRent();
				if (pink == pinkOwned)
					if (squares[i].getType() == "Pink")
						((Street)squares[i]).setRent();
				if (purple == purpleOwned)
					if (squares[i].getType() == "Purple")
						((Street)squares[i]).setRent();
				if (red == redOwned)
					if (squares[i].getType() == "Red")
						((Street)squares[i]).setRent();
				if (white == whiteOwned)
					if (squares[i].getType() == "White")
						((Street)squares[i]).setRent();
				if (yellow == yellowOwned)
					if (squares[i].getType() == "Yellow")
						((Street)squares[i]).setRent();
				if (orange == orangeOwned)
					if (squares[i].getType() == "Orange")
						((Street)squares[i]).setRent();
			}
		}
	}
}





