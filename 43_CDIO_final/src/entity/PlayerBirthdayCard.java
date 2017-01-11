package entity;

import controller.CardManagement;

public class PlayerBirthdayCard extends Card {

	Player[] players;
	private int amount;

	public PlayerBirthdayCard(String desc, Player[] players) {
		super.setDescription(desc);
		this.players = players;
	}

	@Override
	public void useCard(Player player, CardManagement cm) {
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
		cm.returnCardToDeck(this);
	}
}
