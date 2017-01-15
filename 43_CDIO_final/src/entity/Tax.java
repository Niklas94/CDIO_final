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


	/**
	 * Updates balance by either 4000 or 10% depending on what you choose, or 2000 if you land on the other tax field.
	 */
	
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
	
	/**
	 * Returns id for the Tax square.
	 */

	@Override
	public int getId() {
		return this.id;
	}


}
