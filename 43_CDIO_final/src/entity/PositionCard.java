package entity;

public class PositionCard extends Card {

	private int position;
	
	public PositionCard(int position, String desc, int index) {
		this.position = position;
		super.setDescription(desc);
		super.setId(index);
	}

	@Override
	public int useCard() {
		
		// TODO Auto-generated method stub
		return position;
	}
	

}
