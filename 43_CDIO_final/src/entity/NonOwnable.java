package entity;

public abstract class NonOwnable extends Square {

	public NonOwnable(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public abstract void landOnField(Player player);

}
