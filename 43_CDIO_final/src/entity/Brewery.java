package entity;

public class Brewery extends Ownable {

	public Brewery(int id, String name, int price) {
		super(id);
		this.name = name;
		this.price = price;
//		this.rent = rent; 		// if we use this then remember to add a parameter in the constructor
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getRent() {
		return this.rent;
	}

	@Override
	public void buySquare(String player) {
		this.owner = player;
	}

	@Override
	public String getOwner() {
		return owner;
	}

	@Override
	public void landOnField(Player player) {
		
	}

	@Override
	public int getId() {
		return this.id;
	}

}
