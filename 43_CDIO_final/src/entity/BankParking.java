package entity;

import controller.BoardManagement;

public class BankParking extends Square {
	
	String name;

	public BankParking(int id, String name, BoardManagement bm) {
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
