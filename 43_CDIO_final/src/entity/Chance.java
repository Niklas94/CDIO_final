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
		
		if (cm.pullCard(0).useCard(player))
			cm.returnCardToDeck(cm.pullCard(0));
			
//		if (cm.pullCard(0).returnCard())
//			cm.returnCardToDeck(cm.pullTopCard().useCard(player));
//		else if(!cm.pullCard(0).returnCard())
//			cm.pullTopCard().useCard(player);

	}

	@Override
	public int getId() {
		return this.id;
	}

}
