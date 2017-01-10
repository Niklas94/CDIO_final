package entity;

public class Brewery extends Ownable {

	public Brewery(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return this.rent;
	}

	@Override
	public void buySquare(Player player) {
		// TODO Auto-generated method stub
		
		this.owner = player;
		
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		
		
		return owner;
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
