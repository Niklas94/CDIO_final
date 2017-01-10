package controller;

import controller.BoardManagement;
import desktop_resources.GUI;

public class Game {

	public static void main(String[] args) throws Exception{
		
		CardManagement cM = new CardManagement(31);
		
		BoardManagement bM = new BoardManagement();
		bM.createBoard(cM);
		
		PlayerManagement pM = new PlayerManagement(4);
		pM.createPlayers();
		cM.getPlayerArray(pM.getPlayerArray());
		
		
		
		

		
	}

}
