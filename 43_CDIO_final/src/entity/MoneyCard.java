package entity;

import controller.CardManagement;

public class MoneyCard extends Card {
	
	private int amount;
	
	public MoneyCard(int amount, String desc) {
		this.amount = amount;
		super.setDescription(desc);
	}
	
	@Override
	public void useCard(Player player, CardManagement cm) {
		player.updateBalance(amount);
		cm.returnCardToDeck(this);
	}
	
}
