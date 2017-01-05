package entity;


public class Account {

	private int money;
	private final int MONEYZERO = 0;
	
	public Account() {
		money = 30000;
	}
	
	public void updateBalance(int money) 
	{
		this.money += money;		
		if ( this.money < this.MONEYZERO )
			this.money = 0;
	}
	
	public int getMoney() {
		return money;
	}
	
}
