package entity;
import entity.Card;

public class FleetCard extends Card {

	public FleetCard(String desc, int index) {
		super.setDescription(desc);
		super.setId(index);
	}

	@Override
	public int useCard() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int useCard(int position) {
		// TODO Auto-generated method stub
		int nearestFleet;
		
		if (position >= 3 && position <= 8)
			return nearestFleet = 6;
		else if (position == 18)
			return nearestFleet = 16;
		else if (position == 23)
			return nearestFleet = 26;
		else if (position >= 34 && position <= 37)
			return nearestFleet = 36;
		else
			return 0;
	}
	
}
