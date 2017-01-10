package entity;
import entity.Card;

public class FleetCard extends Card {

	public FleetCard(String desc) {
		super.setDescription(desc);
	}

	@Override
	public void useCard(Player player) {
		if (player.getPosition() >= 3 && player.getPosition() <= 8)
			player.setPosition(6);
		else if (player.getPosition() == 18)
			player.setPosition(16);
		else if (player.getPosition() == 23)
			player.setPosition(26);
		else if (player.getPosition() >= 34 && player.getPosition() <= 37)
			player.setPosition(36);	
	}
}
