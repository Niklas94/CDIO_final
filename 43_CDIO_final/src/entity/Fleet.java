package entity;

public class Fleet extends Ownable {
	
	

	public Fleet(int id, String name, int price, int rent) {
		super(id);
		this.name = name;
		this.price = price;
		this.rent = rent;
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
