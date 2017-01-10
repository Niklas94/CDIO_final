package entity;

public abstract class Ownable {
	int price;
	String name;
int basevalue;

	public Ownable (String name, int price) {
		this.price = price;
		this.name = name;

	}
	public int getPrice() {
		return price;
	}
	
	public int getValue() {
		
		return basevalue;
	}
}