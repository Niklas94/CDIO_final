package entity;

import controller.CardManagement; 

public class Chance extends NonOwnable {
	
	private static Player[] players;
	private static CardManagement cm = new CardManagement(31, players);
	
	public Chance(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		cm.pullTopCard().useCard(player);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
