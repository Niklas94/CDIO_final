package entity;

public class Start extends NonOwnable {

	/**
	 * This constructs the start field with a id, name and type.
	 * @param id id of the square.
	 * @param name name of the square.
	 * @param type type of the square.
	 */
	
	public Start(int id, String name, String type) {
		super(id);
		this.name = name;
		this.type = type;
	}

	/**
	 * sets the land on field.
	 */
	
	@Override
	public void landOnField(Player player) {
		
	}
	
	/**
	 * returns the id of the field.
	 */

	@Override
	public int getId() {
		return this.id;
	}

}
