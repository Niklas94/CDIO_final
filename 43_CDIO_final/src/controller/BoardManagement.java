package controller;

import entity.Board;
import entity.Ownable;
import entity.Player;
import entity.Bank;

public class BoardManagement {
	
	Board board;
	//private Player[] players; //Need this for the chance field
	
	public BoardManagement() throws Exception{
		board = new Board(this);
		
	}
	
	public void createBoard(CardManagement cm){
		board.createBoard(cm);
	}
	
	public Ownable getOwnableSquare(int id){
		if(board.getSquare(id) instanceof Ownable){
			Ownable o = (Ownable)board.getOwnableSquare(id);
			return o;
		}
		else
			return null;
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
		
	}


}
