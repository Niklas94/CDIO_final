package entity;

public class PositionCard extends Card {

	private int position;
	
	public PositionCard(int position, String desc) {
		this.position = position;
		super.setDescription(desc);
	}
	
	public int getPosition() {
		return position;
	}

	@Override
	public int useCard() {
		
		// TODO Auto-generated method stub
		return 0;
	}
	

}
