package entity;

import controller.BoardManagement;
import controller.CardManagement;

public class Chance extends Square {
	
	private CardManagement cm;
	String name;

	public Chance(int id, CardManagement cm, String name, BoardManagement bm) {
		super(id, bm);
		this.name = name;
		this.cm = cm;
	}

	@Override
	public void landOnField(Player player) {
		//cm.pullTopCard().useCard(player); //Perform the action of the card

		int cardId = cm.pullTopCard().getID();
		cm.returnCardToDeck(cm.pullCard(cardId));
		cm.pullTopCard().useCard(player); //Perform the action of the card
	}

	@Override
	public int getId() {
		return this.id;
	}

}
