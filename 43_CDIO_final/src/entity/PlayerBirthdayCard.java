package entity;

public class PlayerBirthdayCard extends Card {

	Player[] players;
	private int amount;

	/**
	 * This constructs a birthday card with a description and player.
	 * @param desc description of the card.
	 * @param players the players.
	 */
	
	public PlayerBirthdayCard(String desc, Player[] players) {
		super.setDescription(desc);
		this.players = players;
	}

	/**
	 * uses the card.
	 * @param player the player.
	 */
	
	@Override
	public void useCard(Player player) {
		for (int i = 0; i < players.length; i++) {
			if(players[i] != player && players[i].isAlive()) {
				if(players[i].getAccount().getMoney() >= 200) {
					players[i].updateBalance(-200);
					amount += 200;
				}
				else {
					players[i].updateBalance(players[i].getAccount().getMoney());
					amount += players[i].getAccount().getMoney();
				}
			}
		}
		player.updateBalance(amount);
		amount = 0;
	}
}
