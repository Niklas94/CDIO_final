package entity;

public class Fleet extends Ownable {
	
	

	public Fleet(int id) {
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
	public void buySquare(String player) {
		// TODO Auto-generated method stub
		this.owner = player;
		
	}

	@Override
	public String getOwner() {
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
