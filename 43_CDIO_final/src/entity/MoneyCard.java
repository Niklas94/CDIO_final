package entity;

public class MoneyCard extends Card {
	
	private int amount;
	
	/**
	 * This constructs money card with an amount and description.
	 * @param amount amount of money.
	 * @param desc description of card.
	 */
	
	public MoneyCard(int amount, String desc) {
		this.amount = amount;
		super.setDescription(desc);
	}
	
	/**
	 * uses the card.
	 */
	
	@Override
	public void useCard(Player player) {
		player.updateBalance(amount);
	}
}
