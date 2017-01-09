package entity;

public class MoneyCard extends Card {
	
	private int amount;
	
	public MoneyCard(int amount, String desc) {
		this.amount = amount;
		super.setDescription(desc);
	}
	
	public int getValue() {
		return amount;
	}

	@Override
	public int useCard() {
		// TODO Auto-generated method stub
		return amount;
	}
	
}
