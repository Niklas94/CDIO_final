package entity;

import controller.BoardManagement;

public class Brewery extends Ownable {

	private Dicecup cup;
	private BoardManagement bm;

	/**
	 * This constructs the Brewery with an id, name, price, bm, cup and type.
	 * @param id the id of the square.
	 * @param name the name of the brewery.
	 * @param price the price of the brewery.
	 * @param bm the controlling boardManagement,
	 * @param cup the diceCup.
	 * @param type the type of the Brewery.
	 */
	
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

	/**
	 * @return returns the Brewery price.
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
	 * buys the Brewery square.
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
	 * @return returns the isOwned boolean value.
	 */
	
	@Override
	public boolean isOwned() {
		return isOwned;
	}
	
	/**
	 * if the Brewery is not owned, the player purchases is. However, if the field is owned you pay an amount (rent) depending on which field it is.
	 * @param player the player.
	 * 
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
	
	/**
	 * @return returns the type.
	 */

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
