package entity;

import controller.BoardManagement;

public class Prison extends NonOwnable {
	
	private BoardManagement bm;

	public Prison(int id, String name, BoardManagement bm) {
		super(id);
		this.name = name;
		this.bm = bm;
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
