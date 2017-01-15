package entity;

public abstract class Square {
	
	int id;
	String type;
	
	/**
	 * This constructs a square with the given id.
	 * @param id id of the square.
	 */
	
	public Square(int id){
		this.id = id;
	}
	
	public abstract int getId();
	public abstract void landOnField(Player player);
	public abstract String getType();
	
//	public abstract Ownable getOwnableSquare(int id);
//	public abstract NonOwnable getNonOwnableSquare(int id);

}
