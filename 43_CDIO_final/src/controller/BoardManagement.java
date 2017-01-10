package controller;

import entity.Board;

public class BoardManagement {
	
	Board board;
	
	public BoardManagement() throws Exception{
		board = new Board();
		board.createBoard();
	}


}
