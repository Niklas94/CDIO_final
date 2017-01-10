package test;

import controller.CardManagement;
import controller.PlayerManagement;

public class CardTestQuickly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayerManagement pm = new PlayerManagement(3);
		pm.createPlayers();
		CardManagement cm = new CardManagement(31, pm.getPlayerArray());
		
		
	}

}
