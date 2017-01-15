package entity;

import controller.BoardManagement;

public class Bank {

	private Player[] players;
	private BoardManagement bm;


	public Bank() {

	}

	public void fillPlayerArray(Player[] players){
		this.players = players;
	}

	public void getBM(BoardManagement bm){
		this.bm = bm;
	}

	public boolean buyField(Player player, int price) {
		if(player.getBalance() >= price){
			player.updateBalance(-price);
			return true;
		}
		else
			return false;

	}

	public void removeOwnership(boolean isAlive, Player player, BoardManagement bM){
		if(!isAlive) {
			for(int i=0; i < bM.getNumberOfSquares();i++){
				if(bM.getSquare(i) instanceof Ownable)
					if (((Ownable) bM.getSquare(i)).getOwner() == player.getName()){
						((Ownable) bM.getSquare(i)).removeOwner();
						if(bM.getSquare(i) instanceof Street)
							((Street) bm.getSquare(i)).setOriginalRent();
					}
			}
		}
	}

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

	public void checkOwnedStreets (Square[] squaresArr){
		Square[] squares = squaresArr;
		int blue = 2, green = 3, grey = 3, pink = 3, purple = 2, red = 3, white = 3, yellow = 3;
		for(int j = 0; j < players.length; j++){
			int blueOwned = 0, greenOwned = 0, greyOwned = 0, pinkOwned = 0, purpleOwned = 0, redOwned = 0, whiteOwned = 0, yellowOwned = 0;
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
			}
		}
	}
}





