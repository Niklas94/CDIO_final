package entity;

public class Account {

	private int money;
	private final int MONEYZERO = 0;
	private final int STARTMONEY = 30000;

	public Account() {
		money = STARTMONEY;
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
