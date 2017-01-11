package entity;

public class Start extends NonOwnable {
	
	String name;

	public Start(int id, String name) {
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
