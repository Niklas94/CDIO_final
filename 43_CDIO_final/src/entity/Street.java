package entity;


import controller.BoardManagement;

public abstract class Street extends Ownable {

	
	
	private BoardManagement bm;

	/**
	 * 	/**
	 * This constructs a street with a specified id, name, price, rent, bm and type.
	 * @param id the id of square
	 * @param name the name of the street
	 * @param price the price of the street
	 * @param rent the rent for the street
	 * @param bm the controlling boardManagement
	 * @param type the type of the field
	 */
	
	
	public Street(int id, String name, int price, int rent, BoardManagement bm, String type) {
		super(id);
		this.name = name;
		this.price = price;
		this.rent = rent;
		this.isOwned = false;
		this.bm = bm;
		this.type = type;
	}
	
	/**
	 * @return returns the type of the square.
	 */
	
	@Override
	public String getType(){
		return this.type;
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
	  * @param player the player.
	  */
	
	@Override
	public void buySquare(String player) {
		this.owner = player;
		this.isOwned = true;
	}

	/**
	  * @return returns the owner.
	  */
	
	@Override
	public String getOwner() {
		return owner;
	}

	/**
	  * @return returns the id of the square.
	  */
	
	@Override
	public int getId() {
		return this.id;
	}
	
	/**
	  * @return returns the boolean value of isOwned.
	  */
	
	@Override
	public boolean isOwned(){
		return isOwned;
	}

	/**
	 * if the Street is not owned, the player purchases is. However, if the field is owned you pay an amount (rent) depending on which field it is.
	 * @param player the player.
	 * 
	 */
	@Override
	public void landOnField(Player player) {

		bm.fieldLandedOn(player.getName(), this.name);
		if(!this.isOwned){
			bm.buyField(player, price, type);
		}
		else if(isOwned && player.getName() != owner)
			bm.payRent(player, owner, rent);
		else {
			bm.playerOwnsField(owner);
		}
	}
}

