package entity;

import java.util.ArrayList;

public class Bank {

	//constructor
	int playercount;

	ArrayList<OwnedSquares> PlayerSquares = new ArrayList<OwnedSquares>(); //Each account has a list of its owned squares in this ArrayList

	
	//Creating an ArrayList of ownablesquares for each player.
	public Bank(Account[] accounts) {
		this.playercount = accounts.length;
		for(int i = 0; i<playercount; i++) {
			OwnedSquares ListOfOwned = new OwnedSquares(accounts[i]);
			PlayerSquares.add(ListOfOwned);		
		}
	}
	//Bank.buyField(2,Squares[38]);
	//Returns true if the transaction is successful and false if either the player has too little money or the square is already owned.
	public boolean buyField(int playerid, Ownable square) {
		if(canAfford(playerid, square) && getOwner(square)==null){
			OwnedSquares playerOwnedSquares = PlayerSquares.get(playerid);
			playerOwnedSquares.getOwner().updateBalance(-square.getPrice());
			playerOwnedSquares.getSquares().add(square);
			return true;
		}
		if (!canAfford(playerid,square)) {
			System.out.println("Player "+playerid+" cannot afford "+square.name+" at the price of "+square.price);

		}
		else {
			System.out.println("Square "+square.name +" is already owned by Player "+getPlayerId(square));
		}
		return false;
	}

	//Gets the ID if the player owning  certain square.
	public int getPlayerId(Ownable square) {
		for (int id = 0; id < PlayerSquares.size();id++) {
			OwnedSquares os = PlayerSquares.get(id);
			if(os.getSquares().contains(square)){
				return id;
			}

		}
		return -1;
	}

	//Gets the account owning the input square, or null if not owned.
	public Account getOwner(Ownable square) {
		for(OwnedSquares os : PlayerSquares){
			if(os.getSquares().contains(square)){
				return os.getOwner();
			}

		}
		return null;
	}

	public boolean canAfford(int playerid, Ownable square) {
		int price = square.getPrice();
		OwnedSquares os = PlayerSquares.get(playerid);
		if (price < os.getOwner().getMoney()){
			return true;
		}
		else
			return false;
	}
	public Ownable[] getOwned(int playerid) {
		ArrayList<Ownable> os = PlayerSquares.get(playerid).getSquares();
		return os.toArray(new Ownable[os.size()]);
	}
	
	public boolean sellField(int playerid, Ownable square) {
		if(getOwner(square)!=null){
			OwnedSquares playerOwnedSquares = PlayerSquares.get(playerid);
			playerOwnedSquares.getOwner().updateBalance(((square.getPrice())/2));
			playerOwnedSquares.getSquares().remove(square);
			return true;
		}
		if (getOwner(square)==null){
			System.out.println("Player "+playerid+" does not own"+square.name + ", therefore cannot sell the square.");

		}
		else {
			System.out.println("Square "+square.name +" is now sold for "+ (square.getPrice()/2));
		}
		return false;
	}

}





