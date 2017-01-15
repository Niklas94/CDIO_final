package entity;

import controller.BoardManagement;

public class Fleet extends Ownable {
	
	private BoardManagement bm;

	/**
	 * This constructs Fleet with an id, name, price, rent, bm and type.
	 * @param id id of the square.
	 * @param name name of the fleet.
	 * @param price price of the fleet.
	 * @param rent rent of the fleet.
	 * @param bm the controlling boardManagement.
	 * @param type the type of the fleet.
	 */
	public Fleet(int id, String name, int price, int rent, BoardManagement bm, String type) {
		super(id);
		this.name = name;
		this.price = price;
		this.rent = rent;
		this.isOwned = false;
		this.bm = bm;
		this.type = type;
	}
	/**
	 * @return returns the price.
	 */

	@Override
	public int getPrice() {
		return this.price;
	}

	/**
	 * @return returns the rent.
	 */
	
	@Override
	public int getRent() {
		return this.rent;
	}

	/**
	 * buys the fleet.
	 */
	
	@Override
	public void buySquare(String player) {
		this.owner = player;
		this.isOwned = true;	
	}

	/**
	 *	@return returns the owner. 	
	 */
	
	@Override
	public String getOwner() {
		return owner;
	}

	/**
	 * @return returns the square id.
	 */
	
	@Override
	public int getId() {
		return this.id;
	}

	
	/**
	 * @return returns isOwned boolean value.
	 */
	
	@Override
	public boolean isOwned() {
		return isOwned;
	}
	
	/**
	 * if the Fleet is not owned, the player purchases is. However, if the field is owned you pay an amount (rent) depending on which field it is.
	 * @param player the player.
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

	/**
	 * @return returns the type.
	 */
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}


		
}
