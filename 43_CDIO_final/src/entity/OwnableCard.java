package entity;

import controller.CardManagement;

public class OwnableCard extends Card {

	private boolean isOwned;

	public OwnableCard(String desc) {
		super.setDescription(desc);
		this.isOwned = false;
	}

	@Override
	public void useCard(Player player, CardManagement cm) {
		// TODO Auto-generated method stub

		if (!isOwned) {
			player.setJailCardOwned(this);
			isOwned = true;
		}
		else {
			cm.returnCardToDeck(this);
			isOwned = false;
		}
	}

}
