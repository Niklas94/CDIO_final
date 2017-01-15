package entity;

import controller.BoardManagement;
import controller.CardManagement;

public class Chance extends NonOwnable {

	private BoardManagement bm;
	private CardManagement cm;

	/**
	 * This constructs Chance square with an id, cm, bm and type.
	 * @param id id of the square.
	 * @param cm the controlling cardManagement.
	 * @param name the name of the Change field.
	 * @param bm the controlling boardManagement.
	 * @param type the type of the change square.
	 */
	
	public Chance(int id, CardManagement cm, String name, BoardManagement bm, String type) {
		super(id);
		this.name = name;
		this.cm = cm;
		this.bm = bm;
		this.type = type;
	}

	/**
	 * 	the landOnField for change.
	 *@param player the player. 
	 */
	
	@Override
	public void landOnField(Player player) {
		bm.fieldLandedOn(player.getName(), this.name);
		cm.pullCard(0).useCard(player);
		bm.displayCardDescription(cm.pullCard(0).getDescription());
		cm.returnCardToDeck(cm.pullTopCard());
	}

	/**
	 * @return returns the square id.
	 */
	
	@Override
	public int getId() {
		return this.id;
	}

	/**
	 * @return returns the type.
	 */
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
