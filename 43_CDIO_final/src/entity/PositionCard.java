package entity;

import controller.BoardManagement;

public class PositionCard extends Card {

	private int position;
	private BoardManagement bm;
	
	/**
	 * This constructs the position card with a position, description and bm.
	 * @param position the position of the player.
	 * @param desc the description of the card.
	 * @param bm the controlling boardManagement.
	 */
	public PositionCard(int position, String desc, BoardManagement bm) {
		this.position = position;
		super.setDescription(desc);
		this.bm = bm;
		
	}

	/**
	 * uses the card.
	 * @param player the player.
	 */
	
	@Override
	public void useCard(Player player) {
		if (position >= 0){
			player.setPosition(position);
			bm.getSquare(player.getPosition()).landOnField(player);
			if (40-position + player.getPosition() > 40 && position != 31) //Du får 4.000 kr. for at passerere start, medmindre du ryger i fængsel (position 31).
				player.updateBalance(4000);
		}
		else
			player.setPosition(player.getPosition() - 3);
	}
}
