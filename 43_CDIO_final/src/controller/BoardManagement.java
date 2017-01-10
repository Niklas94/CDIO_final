package controller;

import entity.Board;
import entity.Square;

public class BoardManagement {
	
	Board board;
	//private Player[] players; //Need this for the chance field
	
	public BoardManagement() throws Exception{
		board = new Board();
		board.createBoard();
	}
	
	public Square getOwnableSquares(int id){
		return board.getOwnableSquare(id);
	}


}
