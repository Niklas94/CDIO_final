package entity;

public abstract class Square {
	
	int id;
	
	public Square(int id){
		this.id = id;
	}
	
	public abstract int getId();
	
//	public abstract Ownable getOwnableSquare(int id);
//	public abstract NonOwnable getNonOwnableSquare(int id);

}
