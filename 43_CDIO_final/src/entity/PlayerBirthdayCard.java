package entity;

public class PlayerBirthdayCard extends Card {

	Player[] players;
	private int amount;

	public PlayerBirthdayCard(String desc, Player[] players) {
		super.setDescription(desc);
		this.players = players;
	}

	@Override
	public void useCard(Player player) {
		for (int i = 0; i < players.length; i++) {
			if(players[i] != player && players[i].isAlive()) {
				if(players[i].getMyAccount() >= 200) {
					players[i].updateBalance(-200);
					amount += 200;
				}
				else {
					players[i].updateBalance(players[i].getMyAccount().getMoney());
					amount += players[i].getMyAccount().getMoney();
				}
			}
		}
		player.updateBalance(amount);
		amount = 0;
	}
}
