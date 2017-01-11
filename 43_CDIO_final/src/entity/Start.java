package entity;

import controller.BoardManagement;

public class Start extends NonOwnable {
	
	String name;

	public Start(int id, String name, BoardManagement bm) {
		super(id, bm);
		this.name = name;
	}

	@Override
	public void landOnField(Player player) {
		
	}

	@Override
	public int getId() {
		return this.id;
	}

}
