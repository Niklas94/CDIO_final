package controller;
import entity.Board;
import entity.Ownable;

public class BoardManagement {
	
	Board board;
	//private Player[] players; //Need this for the chance field
	
	public BoardManagement() throws Exception{
		board = new Board();
		
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


}
