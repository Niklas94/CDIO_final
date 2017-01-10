package entity;

public class SpecialCard extends Card {

	private int value;
	
	public SpecialCard(String desc) {
		super.setDescription(desc);
		value = 0;
	}
	
	@Override
	public void useCard(Player player) {
		
		if (this.getDescription().charAt(2) == 'e') {
			value -= 800 * player.getTotalHousesOwned() - 2300 * player.getTotalHotelsOwned();
			player.updateBalance(value);
		}
		else if (this.getDescription().charAt(2) == 'i') {
			value -= 500 * player.getTotalHousesOwned() - 2000 * player.getTotalHotelsOwned();
			player.updateBalance(value);
		}
		else if (this.getDescription().charAt(2) == ' ') {
//			if (player.getTotalValue() < 15000)
				player.updateBalance(40000);
		}
		
	}
}
