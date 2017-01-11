package entity;

import controller.CardManagement;

public class Chance extends NonOwnable {
	
	private CardManagement cm;
	String name;

	public Chance(int id, CardManagement cm, String name) {
		super(id);
		this.name = name;
		this.cm = cm;
	}

	@Override
	public void landOnField(Player player) {
		//cm.pullTopCard().useCard(player); //Perform the action of the card

//		int cardId = cm.pullTopCard().getID();
//		cm.returnCardToDeck(cm.pullCard(cardId));
		cm.pullTopCard().useCard(player, cm); //Perform the action of the card
	}

	@Override
	public int getId() {
		return this.id;
	}

}
