package entity;

import controller.BoardManagement;


public class StreetYellow extends Street {
	
	/**
	 * This constructs a yellow street with a specified id, name, price, rent, bm and type.
	 * @param id the id of square
	 * @param name the name of the street
	 * @param price the price of the street
	 * @param rent the rent.
	 * @param bm the controlling boardManagement
	 * @param type the type of the field
	 */

	public StreetYellow(int id, String name, int price, int rent, BoardManagement bm, String type) {
		super(id, name, price, rent, bm, type);
		// TODO Auto-generated constructor stub
	}

}
