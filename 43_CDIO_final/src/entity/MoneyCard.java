package entity;

public class MoneyCard extends Card {
	
	private int amount;
	
	public MoneyCard(int amount, String desc, int index) {
		this.amount = amount;
		super.setDescription(desc);
		super.setId(index);
	}

	@Override
	public int useCard() {
		// TODO Auto-generated method stub
		return amount;
	}
	
}
