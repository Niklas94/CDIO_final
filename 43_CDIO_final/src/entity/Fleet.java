package entity;

import controller.BoardManagement;

public class Fleet extends Ownable {
	
	private BoardManagement bm;

	public Fleet(int id, String name, int price, int rent, BoardManagement bm, String type) {
		super(id);
		this.name = name;
		this.price = price;
		this.rent = rent;
		this.isOwned = false;
		this.bm = bm;
		this.type = type;
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
	/**
	 * if the Fleet is not owned, the player purchases is. However, if the field is owned you pay an amount (rent) depending on which field it is.
	 */
	@Override
	public void landOnField(Player player) {
		bm.fieldLandedOn(player.getName(), this.name);
		if(!this.isOwned){
			bm.buyField(player, price, type);
		}
		else
			bm.payRent(player, owner, rent);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}


		
}
