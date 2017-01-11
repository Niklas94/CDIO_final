package entity;

import controller.BoardManagement;

public abstract class Square {
	
	int id;
	private BoardManagement bm;
	
	public Square(int id, BoardManagement bm){
		this.id = id;
		this.bm = bm;
	}
	
	public abstract int getId();
	public abstract void landOnField(Player player);
	
//	public abstract Ownable getOwnableSquare(int id);
//	public abstract NonOwnable getNonOwnableSquare(int id);

}
