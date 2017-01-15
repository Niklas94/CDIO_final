package controller;

import entity.Board;
import entity.Dicecup;
import entity.Fleet;
import entity.Ownable;
import entity.Player;
import entity.Square;
import entity.Bank;
import boundary.GUI;

public class BoardManagement {

	private Board board;
	private Bank bank;
	int blue, green, grey, pink, purple, red, white, yellow;
	int blueOwned, greenOwned, greyOwned, pinkOwned, purpleOwned, redOwned, whiteOwned, yellowOwned;
	//private Player[] players; //Need this for the chance field

	public BoardManagement(Bank bank) throws Exception{
		board = new Board();
		this.bank = bank;
	}


	public Fleet returnFleet(int id) {
		return (Fleet) this.board.logicField[id - 1];
	}

	public void createBoard(CardManagement cm, Dicecup cup){
		board.createBoard(cm, cup, this);
	}

	public Square getSquare(int id){
		return this.board.logicField[id - 1];
	}

	public int getNumberOfSquares(){
		return this.board.logicField.length;
	}

	public boolean isOwned(int id) {
		return ((Ownable) board.getSquare(id)).isOwned();
	}

	public String prisonOptions(boolean prisonCard) {
		return GUI.prisonOptions(prisonCard);
	}

	public void pressEnter(String name) {
		GUI.pressEnter(name);
	}

	public void displayCardDescription(String desc) {
		GUI.displayCardDescription(desc);
	}

	public boolean ownable(int id){
		if(board.getSquare(id) instanceof Ownable)
			return true;
		else
			return false;
	}

	public String payTax(){
		return GUI.payTax();
	}

	public void buyField(Player player, int price, String color){
		if(GUI.buyField()){
			if(bank.buyField(player, price)){
				board.getOwnableSquare(player.getPosition() - 1).buySquare(player.getName());
				if (board.getOwnableSquare(player.getPosition() - 1) instanceof Fleet)
					player.setFleetOwned();
				desktop_resources.GUI.setHouses(player.getPosition(), 1);
				player.setStreetsOwned(color);
			}
		}
	}

	public void payRent(Player player, String owner, int rent){
		bank.payRent(player, owner, rent);
	}

	public void payBreweryRent(Player player, String owner, int rent, int sum){
		bank.payBreweryRent(player, owner, rent, sum);
	}

	public void playerOwnsField(String owner){
		GUI.playerOwnsField(owner);
	}

	public void fieldLandedOn(String player, String fieldName){
		GUI.fieldLandedOn(player, fieldName);
	}

	public void setStreetAmmount(){
		Square[] squares = board.getLogicField();
		for(int i = 0; i < squares.length; i++){
			if(squares[i].getType() == "Blue")
				blue++;
			else if(squares[i].getType() == "Green")
				green++;
			else if(squares[i].getType() == "Grey")
				grey++;
			else if(squares[i].getType() == "Pink")
				pink++;
			else if(squares[i].getType() == "Purple")
				purple++;
			else if(squares[i].getType() == "Red")
				red++;
			else if(squares[i].getType() == "White")
				white++;
			else if(squares[i].getType() == "Yellow")
				yellow++;
		}
	}

	public void checkOwnedStreets (Player player){
		Square[] squares = board.getLogicField();
		bank.checkOwnedStreets(squares);
	}
	
}
