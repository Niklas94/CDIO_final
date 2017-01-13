package entity;

import controller.BoardManagement;

public class BankParking extends NonOwnable {
	
	private BoardManagement bm;

	public BankParking(int id, String name, BoardManagement bm, String type) {
		super(id);
		this.name = name;
		this.bm = bm;
		this.type = type;
	}

	@Override
	public void landOnField(Player player) {
		bm.fieldLandedOn(player.getName(), this.name);
		
	}

	@Override
	public int getId() {
		return this.id;
	}

}
