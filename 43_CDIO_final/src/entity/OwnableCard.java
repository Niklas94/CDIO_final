package entity;

public class OwnableCard extends Card {
	
	public OwnableCard(String desc) {
		super.setDescription(desc);
	}

	@Override
	public void useCard(Player player) {
		//player.setCardOwned(this);
	}

}
