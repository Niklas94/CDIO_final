package entity;

public class OwnableCard extends Card {

	private boolean isOwned;

	public OwnableCard(String desc) {
		super.setDescription(desc);
		this.isOwned = false;
	}

	@Override
	public void useCard(Player player) {
		// TODO Auto-generated method stub
		if (!this.getDescription().equals("Placeholder")) { //Making sure that a placeholder card wont do anything
			if (!isOwned) {
				isOwned = true;
				player.setJailCardOwned(this);
			}
			else {
				isOwned = false;
				player.useJailCardOwned();
			}
		}
	}
}
