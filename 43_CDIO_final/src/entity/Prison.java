package entity;

import controller.BoardManagement;
import controller.CardManagement;

public class Prison extends NonOwnable {

	private BoardManagement bm;
	private Dicecup cup;
	private CardManagement cm;

	/**
	 * This constructs a prison square with an id, name, bm, cup, type and cm.
	 * @param id id of the square.
	 * @param name name of the square.
	 * @param bm the controlling boardManagement.
	 * @param cup the diceCup.
	 * @param type the type of the square.
	 * @param cm the controlling cardManagement.
	 */
	
	public Prison(int id, String name, BoardManagement bm, Dicecup cup, String type, CardManagement cm) {
		super(id);
		this.name = name;
		this.bm = bm;
		this.cup = cup;
		this.type = type;
		this.cm = cm;
	}

	/**
	 * Depending on how many turns you have been on the prison square, you get consequences. 
	 * @param player the player.
	 */
	
	@Override
	public void landOnField(Player player) {

		if (!player.jailStatus() && player.getPosition()  == 31 && player.getTurnsInJail() == 0) {
			bm.fieldLandedOn(player.getName(), this.name); //Prints the field you landed on
			player.inJail(); //You are now in jail (boolean)
			player.setPosition(11); //Move to jail
			player.incTurnsInJail();
		}
		else if (player.getTurnsInJail() > 0 && player.getTurnsInJail() < 3){
			String ans; //Answer later on...
			ans = bm.prisonOptions(player.getJailCard());
			if (ans.equals("Betale 1.000 kr.")) {
				player.updateBalance(-1000);
				player.inJail();
			}
			else if (ans.equals("Prøve at kaste to ens")) {
				bm.pressEnter(player.getName()); 
				cup.rollDice();
				if (cup.equalDice())
					player.inJail();
			}
			else if (ans.equals("Bruger mit løsladelseskort")) {
				cm.returnCardToDeck(player.returnJailCard()); //Return the card to the deck
				player.useJailCardOwned(); //Use it (remove from player)
				player.inJail(); //Not in jail anymore.

			}
		}
		if(player.getTurnsInJail() >= 3){
			player.inJail();
			player.updateBalance(-1000);
		}
		player.incTurnsInJail();
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
