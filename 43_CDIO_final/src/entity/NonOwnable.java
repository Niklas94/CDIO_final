package entity;

import controller.BoardManagement;

public abstract class NonOwnable extends Square {

	public NonOwnable(int id, BoardManagement bm) {
		super(id, bm);
	}
	

}
