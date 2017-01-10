package entity;

public class Chance extends NonOwnable {
	
	String name;

	public Chance(int id, String name) {
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
