package entity;

import controller.BoardManagement;

public class Tax extends Square {

	public Tax(int id, BoardManagement bm) {
		super(id, bm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnField(Player player) {
		
	}

	@Override
	public int getId() {
		return this.id;
	}


}
