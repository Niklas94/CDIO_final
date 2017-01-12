package entity;

import controller.BoardManagement;

public class Tax extends NonOwnable {
	
	private BoardManagement bm;

	public Tax(int id, BoardManagement bm) {
		super(id);
		this.bm = bm;
	}

	@Override
	public void landOnField(Player player) {
		
	}

	@Override
	public int getId() {
		return this.id;
	}


}
