package entity;

public class Brewery extends Ownable {

	public Brewery(int id) {
		super(id);
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
