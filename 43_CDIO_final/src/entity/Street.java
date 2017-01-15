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
		this.originalRent = rent;
		this.isOwned = false;
		this.bm = bm;
		this.type = type;
		this.rent = this.originalRent;
	}
	
	/**
	 *   When all streets of a certain color have the same owner the rent is doubled using this method.
	 */
	
	public void setRent(){
		this.rent = 2 * this.originalRent;
	}
	
	/**
	 *   If a player goes bankrupt and loses ownership of his streets this method is called to revert the rent to the original price.
	 */
	
	public void setOriginalRent(){
		this.rent = this.originalRent;
	}
	
	/**
	 * @return returns the type of the field
	 */
	
	@Override
	public String getType(){
		return this.type;
	}

	
	/**
	  * {@inheritDoc}
	  */
	
	@Override
	public int getPrice() {
		return this.price;
	}

	/**
	  * {@inheritDoc}
	  */
	
	@Override
	public int getRent() {
		return this.rent;
	}

	/**
	  * {@inheritDoc}
	  */
	
	@Override
	public void buySquare(String player) {
		this.owner = player;
		this.isOwned = true;
	}

	/**
	  * {@inheritDoc}
	  */
	
	@Override
	public String getOwner() {
		return owner;
	}

	/**
	  * {@inheritDoc}
	  */
	
	@Override
	public int getId() {
		return this.id;
	}
	
	/**
	  * {@inheritDoc}
	  */
	
	@Override
	public boolean isOwned(){
		return isOwned;
	}

	/**
	 * if the Street is not owned, the player purchases is. However, if the field is owned you pay an amount (rent) depending on which field it is.
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

