package entity;



public abstract class Ownable extends Square {

	protected String name;
	protected int price, rent, housePrice, hotelPrice;
	protected String owner;
	protected boolean isOwned;

	public Ownable(int id) {
		super(id);
	}

	public abstract int getPrice();
	public abstract int getRent();
	public abstract void buySquare(String player);
	public abstract String getOwner();
	public abstract boolean isOwned();
	public void removeOwner(){
		this.owner=null;
	}
}