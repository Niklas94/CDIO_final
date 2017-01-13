package entity;

import controller.BoardManagement;

public class Tax extends NonOwnable {

	private BoardManagement bm;

	public Tax(int id, BoardManagement bm, String name, String type) {
		super(id);
		this.bm = bm;
		this.name = name;
		this.type = type;
	}

	@Override
	public void landOnField(Player player) {
		bm.fieldLandedOn(player.getName(), this.name);
		if(player.getPosition() - 1 == 4){
			switch(bm.payTax()){
			case "10%" :
				player.updateBalance(- (int) (player.getBalance() * 0.1));
				break;
			case "4.000kr." :
				player.updateBalance(-4000);
				break;
			default :
				break;
			}
		}
		else 			
			player.updateBalance(-2000);
	}

	@Override
	public int getId() {
		return this.id;
	}


}
