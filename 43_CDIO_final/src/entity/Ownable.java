package entity;

public abstract class Ownable extends Square {
	
	String name;
	int price;
	int rent;
	Player owner;

	public Ownable(int id) {
		super(id);
	}
	
	
	public abstract int getPrice();
	public abstract int getRent();
	public abstract void buySquare(Player player);
	public abstract Player getOwner();
	
}