package controller;

import entity.Board;
import entity.Dicecup;
import entity.Ownable;
import entity.Player;
import entity.Bank;
import boundary.GUI;

public class BoardManagement {

	private Board board;
	private Bank bank;
	//private Player[] players; //Need this for the chance field

	public BoardManagement(Bank bank) throws Exception{
		board = new Board(this);
		this.bank = bank;

	}

	public void createBoard(CardManagement cm, Dicecup cup){
		board.createBoard(cm, cup);
	}

	public Object getSquare(int id){
		return this.board.logicField[id];
	}

	public int getNumberOfSquares(){
		return this.board.logicField.length;
	}

	public boolean isOwned(int id) {
		return ((Ownable) board.getSquare(id)).isOwned();
	}

	public boolean ownable(int id){
		if(board.getSquare(id) instanceof Ownable)
			return true;
		else
			return false;
	}

	public void buyField(Player player, int price){
		if(GUI.buyField()){
			if(bank.buyField(player, price)){
				board.getOwnableSquare(player.getPosition() - 1).buySquare(player.getName());
				desktop_resources.GUI.setHouses(player.getPosition() - 1, 1);
			}
		}
	}

	public void payRent(Player player, String owner, int rent){
		bank.payRent(player, owner, rent);
	}
	
	public void payBreweryRent(Player player, String owner, int rent, int sum){
		bank.payBreweryRent(player, owner, rent, sum);
	}

}