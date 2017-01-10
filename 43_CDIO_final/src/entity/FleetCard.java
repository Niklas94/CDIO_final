package entity;
import entity.Card;

public class FleetCard extends Card {

	public FleetCard(String desc) {
		super.setDescription(desc);
		//super.setId(index);
	}

	@Override
	public int useCard() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int useCard(int playerPosition) {
		// TODO Auto-generated method stub
		int nearestFleet;
		
		if (playerPosition >= 3 && playerPosition <= 8)
			return nearestFleet = 6;
		else if (playerPosition == 18)
			return nearestFleet = 16;
		else if (playerPosition == 23)
			return nearestFleet = 26;
		else if (playerPosition >= 34 && playerPosition <= 37)
			return nearestFleet = 36;
		else
			return 0;
	}
}
