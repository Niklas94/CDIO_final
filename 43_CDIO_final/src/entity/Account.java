package entity;

public class Account {

	private int money;
	private final int MONEYZERO = 0;
	private final int STARTMONEY = 30000;
	private Player player;

	public Account(Player player) {
		money = STARTMONEY;
		player = this.player;

	}

	/*
	 * SETTERS
	 */

	public void updateBalance(int money) {
		this.money += money;
		if (this.money < this.MONEYZERO)
			this.money = this.MONEYZERO;
	}

	/*
	 * GETTERS
	 */

	public int getMoney() {
		return money;
	}

	

}
