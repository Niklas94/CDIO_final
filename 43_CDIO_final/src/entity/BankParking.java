package entity;

import controller.BoardManagement;

public class BankParking extends NonOwnable {
	
	private BoardManagement bm;
	
	/**
	 * This constructs the BankParking with an id, name, bm and type.
	 * @param id the id of the square.
	 * @param name the name of the square.
	 * @param bm the controlling boardManagement.
	 * @param type the type of the square.
	 */

	public BankParking(int id, String name, BoardManagement bm, String type) {
		super(id);
		this.name = name;
		this.bm = bm;
		this.type = type;
	}
	
	/**
	 * sets the landOnField.
	 * @param player the player.
	 */

	@Override
	public void landOnField(Player player) {
		bm.fieldLandedOn(player.getName(), this.name);
		
	}
	
	/**
	 * @return returns the id of the square.
	 */

	@Override
	public int getId() {
		return this.id;
	}
	
	/**
	 * @return returns the type of the square.
	 */

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
