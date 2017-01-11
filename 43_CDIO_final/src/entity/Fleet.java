package entity;

import controller.BoardManagement;

public class Fleet extends Ownable {

	public Fleet(int id, String name, int price, int rent, BoardManagement bm) {
		super(id, bm);
		this.name = name;
		this.price = price;
		this.rent = rent;
		this.isOwned = false;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getRent() {
		return this.rent;
	}

	@Override
	public void buySquare(String player) {
		this.owner = player;
		this.isOwned = true;
		
	}

	@Override
	public String getOwner() {
		return owner;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public boolean isOwned() {
		return isOwned;
	}

	@Override
	public void landOnField(Player player) {
		
	}


		
}
