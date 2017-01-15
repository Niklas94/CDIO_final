package entity;

import controller.BoardManagement;

public class Brewery extends Ownable {

	private Dicecup cup;
	private BoardManagement bm;

	public Brewery(int id, String name, int price, BoardManagement bm, Dicecup cup, String type) {
		super(id);
		this.name = name;
		this.price = price;
		this.isOwned = false;
		this.cup = cup;
		this.bm = bm;
		this.type = type;
		//		this.rent = rent; 		// if we use this then remember to add a parameter in the constructor
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
	 * if the Brewery is not owned, the player purchases is. However, if the field is owned you pay an amount (rent) depending on which field it is.
	 */

	@Override
	public void landOnField(Player player) {
		bm.fieldLandedOn(player.getName(), this.name);
		if(!this.isOwned){
			bm.buyField(player, price, type);
		}
		else if(isOwned && player.getName() != owner) {
			int sum = cup.getSum();
			bm.payBreweryRent(player, owner, rent, sum);
		}
		else {
			bm.playerOwnsField(owner);
		}

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
