package controller;

import entity.Board;
import entity.Dicecup;
import entity.Fleet;
import entity.Ownable;
import entity.Player;
import entity.Square;
import entity.Bank;
import entity.Street;
import boundary.GUI;

public class BoardManagement {

	private Board board;
	private Bank bank;
	//private Player[] players; //Need this for the chance field

	/**
	 * This constructs the BoardManagement with a bank.
	 * @param bank the bank.
	 * @throws Exception
	 */

	public BoardManagement(Bank bank) throws Exception{
		board = new Board();
		this.bank = bank;
	}

	/**
	 * return the fleet.
	 * @param id the square id.
	 * @return return the fleet.
	 */

	public Fleet returnFleet(int id) {
		return (Fleet) this.board.getLogicField(id - 1);
	}

	/**
	 * create the board.
	 * @param cm the controlling cardManagement.
	 * @param cup the diceCup.
	 */

	public void createBoard(CardManagement cm, Dicecup cup){
		board.createBoard(cm, cup, this);
	}

	/**
	 * get the squares.
	 * @param id the square id.
	 * @return returns the logicField.
	 */

	public Square getSquare(int id){
		return this.board.getLogicField(id);
	}
	
	public void replaceStreetField(int id) {
		this.board.replaceStreetField(id);
	}

	/**
	 * get number of squares.
	 * @return returns the total length of the logicfields.
	 */

	public int getNumberOfSquares(){
		return this.board.getLogicArr().length;
	}

	/**
	 * check if is owned.
	 * @param id the square id.
	 * @return returns true or false.
	 */

	public boolean isOwned(int id) {
		return ((Ownable) board.getSquare(id)).isOwned();
	}

	/**
	 * @param prisonCard boolean value.
	 * @return returns the GUI.
	 */

	public String prisonOptions(boolean prisonCard) {
		return GUI.prisonOptions(prisonCard);
	}

	/**
	 * Tells GUI to press enter.
	 * @param name the name.
	 */

	public void pressEnter(String name) {
		GUI.pressEnter(name);
	}

	/**
	 * @param desc the card description.
	 */

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
				board.setGuifieldOwner(player.getName(), player.getPosition() - 1);
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

	public void buyHouse(Player player){
		if(GUI.buyHouse(player.getName())){
			do{
				int Field = GUI.whichStreet();
				while (!(board.getSquare(Field - 1) instanceof Street)) {
					Field = GUI.whichStreetAgain();
				}
				Street s = ((Street)board.getSquare(Field - 1));
				if(s.getHousePrice() > player.getBalance()){
					GUI.cantAfford();
				}
				else if (s.canBuyHouse() && s.getOwner() == player.getName()) {
					int houses = s.getHouses() + 1;
					desktop_resources.GUI.setHouses(Field, houses);
					s.setHouses(houses);	
					s.setRent();	
					bank.buyHouse(board.getSquare(Field - 1), player);
					player.incHousesOwned();
				}
				else if (s.canBuyHotel() && s.getOwner() == player.getName()) {
					s.setHouses(0);
					desktop_resources.GUI.setHouses(Field, 0);
					desktop_resources.GUI.setHotel(Field, true);
					s.incHotel();
					s.setRent();	
					bank.buyHouse(board.getSquare(Field - 1), player);
					player.incHotelsOwned();
				}
				else {
					GUI.dontOwn();
				}

			} while (GUI.buyHouseAgain(player.getName()));
		}
	}

	public void checkOwnedStreets (){
		Square[] squares = board.getLogicArr();
		bank.checkOwnedStreets(squares);
	}

}
