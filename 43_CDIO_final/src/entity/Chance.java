package entity;

import controller.CardManagement;

public class Chance extends NonOwnable {
	
	String name;
	CardManagement cm;
	
	public Chance(int id, CardManagement cm, String name) {
		super(id);
		this.name = name;
		this.cm = cm;
	}

	@Override
	public void landOnField(Player player) {

		//GUI.displayChanceCard(cm.pullCard(0).getDescription()); //Method to display text
		cm.pullTopCard().useCard(player); //Perform the action of the card

	}

	@Override
	public int getId() {
		return this.id;
	}

}
