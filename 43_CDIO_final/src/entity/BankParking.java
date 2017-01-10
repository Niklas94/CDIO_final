package entity;

public class BankParking extends NonOwnable {
	
	String name;

	public BankParking(int id, String name) {
		super(id);
		this.name = name;
	}

	@Override
	public void landOnField(Player player) {
		
		
	}

	@Override
	public int getId() {
		return this.id;
	}

}
