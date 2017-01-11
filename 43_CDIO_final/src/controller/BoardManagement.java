package controller;

import entity.Board;
import entity.Ownable;
import entity.Player;
import entity.Bank;

public class BoardManagement {
	
	private Board board;
	//private Player[] players; //Need this for the chance field
	
	public BoardManagement() throws Exception{
		board = new Board(this);
		
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
		
	}


}
