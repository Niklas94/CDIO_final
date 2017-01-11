package entity;

public abstract class Ownable extends Square {
	
	String name;
	int price;
	int rent;
	String owner;
	boolean isOwned;

	public Ownable(int id) {
		super(id);
	}
	
	public abstract int getPrice();
	public abstract int getRent();
	public abstract void buySquare(String player);
	public abstract String getOwner();
	public abstract boolean isOwned();
	
}