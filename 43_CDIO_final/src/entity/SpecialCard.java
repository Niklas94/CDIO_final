package entity;

public class SpecialCard extends Card {

	private int value;
	
	/**
	 * This constructs a special card with a description.
	 * @param desc description of the card.
	 */
	public SpecialCard(String desc) {
		super.setDescription(desc);
		value = 0;
	}

	
	/**
	 * Uses the card and updates the players account.
	 * @param player the player.
	 */
	@Override
	public void useCard(Player player) {
		if (this.getDescription().equals("Ejendomsskatterne er steget, ekstraudgifterne er: kr. 800 pr. hus, kr. 2.300 pr. hotel.")) {
			value = 800 * player.getHousesOwned() + 2300 * player.getHotelsOwned();
			player.updateBalance(-value);
		}
		else if (this.getDescription().equals("Oliepriserne er steget, og De skal betale: kr. 500 pr. hus. kr. 2.000 pr. hotel.")) {
			value = 500 * player.getHousesOwned() + 2000 * player.getHotelsOwned();
			player.updateBalance(-value);
		}
//		else if (this.getDescription().charAt(3) == ' ') {
////			if (player.getTotalValue() < 15000)
//				player.updateBalance(40000);
//		}
	}
}
