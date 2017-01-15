package entity;

import controller.BoardManagement;
import controller.CardManagement;

public class Chance extends NonOwnable {

	private BoardManagement bm;
	private CardManagement cm;

	public Chance(int id, CardManagement cm, String name, BoardManagement bm, String type) {
		super(id);
		this.name = name;
		this.cm = cm;
		this.bm = bm;
		this.type = type;
	}

	@Override
	public void landOnField(Player player) {
		bm.fieldLandedOn(player.getName(), this.name);
		cm.pullCard(0).useCard(player);
		bm.displayCardDescription(cm.pullCard(0).getDescription());
		cm.returnCardToDeck(cm.pullTopCard());
	}

	@Override
	public int getId() {
		return this.id;
	}

}
