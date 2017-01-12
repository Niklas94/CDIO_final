package entity;

import controller.BoardManagement;

public class Prison extends NonOwnable {
	
	private BoardManagement bm;
	private String name;

	public Prison(int id, String name, BoardManagement bm) {
		super(id);
		this.name = name;
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
