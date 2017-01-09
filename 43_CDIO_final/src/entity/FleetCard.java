package entity;
import entity.Card;

public class FleetCard extends Card {

	public FleetCard(String desc) {
		super.setDescription(desc);
	}
	
	public int nearestFleet(int position) {
		int nearestFleet, calc;
		
		calc = position % 10;
		if (calc < 5)
			nearestFleet = position + calc;
		else 
			nearestFleet = position - (10-calc);
		return nearestFleet;
	}
	
}
