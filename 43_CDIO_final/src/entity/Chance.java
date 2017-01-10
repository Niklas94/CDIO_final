package entity;

import controller.CardManagement;
import desktop_resources.GUI; 

public class Chance extends NonOwnable {
	
	private static CardManagement cm;
	
	public Chance(int id, CardManagement cm) {
		super(id);
		this.cm = cm;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		//GUI.displayChanceCard(cm.pullCard(0).getDescription()); //Method to display text
		//cm.pullTopCard().useCard(player); //Perform the action of the card

		int cardId = cm.pullTopCard().getID();
		cm.returnCardToDeck(cm.pullCard(cardId));
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
