package entity;

public class Start extends NonOwnable {

	public Start(int id, String name, String type) {
		super(id);
		this.name = name;
		this.type = type;
	}

	@Override
	public void landOnField(Player player) {
		
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
