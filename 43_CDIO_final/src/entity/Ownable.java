package entity;



public abstract class Ownable extends Square {
	


	protected String name;
	protected int price, originalRent, rent, housePrice, hotelPrice;
	protected String owner;
	protected boolean isOwned;

	/**
	 * This constructs ownable squares with a given id.
	 * @param id the id of the square.
	 */
	
	public Ownable(int id) {
		super(id);
	}

	
	public abstract int getPrice();
	public abstract int getRent();
	public abstract void buySquare(String player);
	public abstract String getOwner();
	/**
	 * @return returns a boolean if owned. 
	 */
	public abstract boolean isOwned();
	
	/**
	 * removes the owner.
	 */
	public void removeOwner(){
		this.owner=null;
	}
}