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

	public StreetYellow(int id, String name, int price, int rent, BoardManagement bm, String type, int house1, int house2, int house3, int house4, int hotel1, int housePrice) {
		super(id, name, price, rent, bm, type, house1, house2, house3, house4, hotel1, housePrice);
		// TODO Auto-generated constructor stub
	}

}
