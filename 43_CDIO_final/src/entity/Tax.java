package entity;

import controller.BoardManagement;

public class Tax extends NonOwnable {
	
	private BoardManagement bm;

	public Tax(int id, BoardManagement bm, String name) {
		super(id);
		this.bm = bm;
		this.name = name;
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
