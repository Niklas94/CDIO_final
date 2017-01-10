package entity;

public class PositionCard extends Card {

	private int position;

	public PositionCard(int position, String desc) {
		this.position = position;
		super.setDescription(desc);
	}

	@Override
	public void useCard(Player player) {
		if (position >= 0)
			player.setPosition(position);
		else
			player.setPosition(player.getPosition() - 3);
	}
}
