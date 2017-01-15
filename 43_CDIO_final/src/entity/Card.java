package entity;

public abstract class Card {

	private String description;
	private int id;

	/**
	 * Using the card for the specific player - e.g. a moneycard will update the balance for the player, with a specific amount.
	 * @param player the player
	 */
	public abstract void useCard(Player player);

	/**
	 * Sets the description of the card - description is pulled from the text file "Card Description". 
	 * @param description of the card
	 * @see CardManagement 	 
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * Returns the description of the card.
	 * @return description of the card
	 */
	public String getDescription() {
		return this.description;
	}
}
