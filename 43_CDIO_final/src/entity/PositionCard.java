package entity;

import controller.BoardManagement;
import controller.CardManagement;

public class PositionCard extends Card {

	private int position;
	private BoardManagement bm;
	
	public PositionCard(int position, String desc, BoardManagement bm) {
		this.position = position;
		super.setDescription(desc);
		this.bm = bm;
		
	}

	@Override
	public void useCard(Player player, CardManagement cm) {
		System.out.println(super.getDescription());
		if (position >= 0){
			player.setPosition(position);
			bm.getSquare(player.getPosition()).landOnField(player);
			if (40-position + player.getPosition() > 40 && position != 31) //Du får 4.000 kr. for at passerere start, medmindre du ryger i fængsel (position 31).
				player.updateBalance(4000);
		}
		else
			player.setPosition(player.getPosition() - 3);
		cm.returnCardToDeck(this);
	}
}
