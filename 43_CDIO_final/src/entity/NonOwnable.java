package entity;

public abstract class NonOwnable extends Square {
	
	String name;
	/**
	 * This constructs a nonownable card with an id.
	 * @param id the id of the square.
	 */

	public NonOwnable(int id) {
		super(id);
	}
	

}
