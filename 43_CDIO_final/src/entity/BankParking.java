package entity;

import controller.BoardManagement;

public class BankParking extends Square {
	
	private BoardManagement bm;
	
	String name;

	public BankParking(int id, String name, BoardManagement bm) {
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
