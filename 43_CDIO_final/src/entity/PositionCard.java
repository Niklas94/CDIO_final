package entity;

import controller.CardManagement;

public class PositionCard extends Card {

	private int position;
	
	
	public PositionCard(int position, String desc) {
		this.position = position;
		super.setDescription(desc);
		
	}

	@Override
	public void useCard(Player player, CardManagement cm) {
		System.out.println(super.getDescription());
		if (position >= 0){
			player.setPosition(position);
		}
		else
			player.setPosition(player.getPosition() - 3);
		cm.returnCardToDeck(this);
	}
}
