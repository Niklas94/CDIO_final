package controller;

import entity.Board;
import entity.Square;

public class BoardManagement {
	
	Board board;
	
	public BoardManagement() throws Exception{
		board = new Board();
		board.createBoard();
	}
	
	public Square getOwnableSquares(int id){
		return board.getOwnableSquare(id);
	}


}
