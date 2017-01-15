package entity;

public class SpecialCard extends Card {

	private int value;
	
	public SpecialCard(String desc) {
		super.setDescription(desc);
		value = 0;
	}

	@Override
	public boolean useCard(Player player) {
		if (this.getDescription().equals("Ejendomsskatterne er steget, ekstraudgifterne er: kr. 800 pr. hus, kr. 2.300 pr. hotel.")) {
			value = 800 * player.getTotalHousesOwned() + 2300 * player.getTotalHotelsOwned();
			player.updateBalance(-value);
		}
		else if (this.getDescription().equals("Oliepriserne er steget, og De skal betale: kr. 500 pr. hus. kr. 2.000 pr. hotel.")) {
			value = 500 * player.getTotalHousesOwned() + 2000 * player.getTotalHotelsOwned();
			player.updateBalance(-value);
		}
//		else if (this.getDescription().charAt(3) == ' ') {
////			if (player.getTotalValue() < 15000)
//				player.updateBalance(40000);
//		}
		return true;
	}
}
