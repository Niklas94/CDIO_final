package entity;

import controller.BoardManagement;
import desktop_resources.GUI;

public class Bank {

	Player[] players;


	public Bank() {
		
	}
	
	public void fillPlayerArray(Player[] players){
		this.players = players;
	}

	public void buyField(Player player, int price) {


	}

	public void removeOwnership(boolean isAlive, Player player, BoardManagement bM){
		if(!isAlive) {
			for(int i=0; i < bM.getNumberOfSquares();i++){
				if(bM.getSquare(i) instanceof Ownable)
					if (((Ownable) bM.getSquare(i)).getOwner() == player.getName())
						((Ownable) bM.getSquare(i)).removeOwner();
			}
		}
	}

	public void payRent(Player player, String owner, int rent) {		
	}

}





