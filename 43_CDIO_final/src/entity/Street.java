package entity;


import controller.BoardManagement;

public abstract class Street extends Ownable {

	
	private boolean canBuyHouse = false;
	private int houses, hotel, housePrice, house1, house2, house3, house4, hotel1;
	private boolean canBuyHotel = false;
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
	
	
	public Street(int id, String name, int price, int rent, BoardManagement bm, String type, int house1, int house2, int house3, int house4, int hotel1, int housePrice) {
		super(id);
		this.name = name;
		this.price = price;
		this.originalRent = rent;
		this.isOwned = false;
		this.bm = bm;
		this.type = type;
		this.rent = this.originalRent;
		this.house1 = house1;
		this.house2 = house2;
		this.house3 = house3;
		this.house4 = house4;
		this.hotel1 = hotel1;
		this.housePrice = housePrice;
	}
	
	
	
	/**
<<<<<<< HEAD
	 *   When all streets of a certain color have the same owner the rent is doubled using this method.
	 */
	
	public void setRent(){
		this.rent = 2 * this.originalRent;
		this.canBuyHouse = true;
		if (houses == 1)
			this.rent = house1;
		else if (houses == 2)
			this.rent = house2;
		else if (houses == 3)
			this.rent = house3;
		else if (houses == 4){
			this.rent = house4;
			this.canBuyHotel = true;
		}
		else if (hotel == 1){
			this.rent = hotel1;
			this.canBuyHouse = false;
			this.canBuyHotel = false;
		}
	}
	
	/**
	 * When a hotel is bought on the street, this method sets its hotel amount to 1.
	 */
	
	public void incHotel(){
		this.hotel = 1;
	}
	
	/**
	 *   If a player goes bankrupt and loses ownership of his streets this method is called to revert the rent to the original price.
	 */
	
	public void setOriginalRent(){
		this.rent = this.originalRent;
	}
	
	/**
	 * @return returns the type of the field
=======
	 * @return returns the type of the square.
>>>>>>> branch 'develop' of https://github.com/Niklas94/CDIO_final.git
	 */
	
	@Override
	public String getType(){
		return this.type;
	}
	
	/**
	 * Checks if a house can be bought on the street.
	 * @return returns the boolean value whether a house can be bought.
	 */

	public boolean canBuyHouse() {
		return this.canBuyHouse;
	}
	
	/**
	 * Checks whether a hotel can be bought on the street.
	 * @return returns a boolean value whether a house can be bought.
	 */
	
	public boolean canBuyHotel() {
		return this.canBuyHotel;
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
	
	/**
	 * Gets the price of houses on the particular street.
	 * @return returns the house price.
	 */

	public int getHousePrice(){
		return this.housePrice;
	}
	
	/**
	 * Checks how many houses have been bought on the street.
	 * @return returns the amount of houses.
	 */

	public int getHouses() {
		return houses;
	}

	/**
	 * If a house is bought this updates the varible that keeps track
	 * of how many houses are one it.
	 * @param houses how many houses there are on the street.
	 */

	public void setHouses(int houses) {
		this.houses = houses;
	}
}

