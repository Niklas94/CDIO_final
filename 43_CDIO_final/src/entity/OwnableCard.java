package entity;

public class OwnableCard extends Card {

	private boolean Owned;
	
	public OwnableCard() {
		Owned = false;
	}
	
	public boolean isItOwned() {
		return Owned;
	}

	@Override
	public int useCard() {
		// TODO Auto-generated method stub
		return 0;
	}
}
