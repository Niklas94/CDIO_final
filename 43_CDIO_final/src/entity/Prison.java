package entity;

public class Prison extends NonOwnable {
	
	String name;

	public Prison(int id, String name) {
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
