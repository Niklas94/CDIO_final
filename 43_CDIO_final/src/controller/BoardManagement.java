package controller;

import entity.Board;
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

	public void createBoard(CardManagement cm){
		board.createBoard(cm);
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
		if(GUI.buyField())
			bank.buyField(player, price);
	}

	public void payRent(Player player, String owner, int rent){
		bank.payRent(player, owner, rent);
	}

}