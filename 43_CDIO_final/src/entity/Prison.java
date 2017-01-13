package entity;

import controller.BoardManagement;
import desktop_resources.GUI;

public class Prison extends NonOwnable {

	private BoardManagement bm;
	private Dicecup cup;

	public Prison(int id, String name, BoardManagement bm, Dicecup cup, String type) {
		super(id);
		this.name = name;
		this.bm = bm;
		this.cup = cup;
		this.type = type;
	}

	@Override
	public void landOnField(Player player) {

		if (!player.jailStatus()) {
			bm.fieldLandedOn(player.getName(), this.name);
			player.inJail();
			player.setPosition(11);
			String ans;
			if (player.getJailCard()) {
				ans = GUI.getUserButtonPressed("Du er fængslet og kan komme ud ved enten at betale 1.000 kr, kaste to ens eller bruge et løsladelseskort. Hvad vælger du?", "Betale 1.000 kr.", "Prøve at kaste to ens", "Bruger mit løsladelseskort");
				if (ans.equals("Betale 1.000 kr.")) {

				}
				else if (ans.equals("Prøve at kaste to ens")) {
					boundary.GUI.pressEnter(player.getName());
					cup.rollDice();
					if (cup.equalDice())
						player.inJail();
				}
				else if (ans.equals("Bruger mit løsladelseskort")) {
					if (player.getJailCard()) {
						player.useJailCardOwned();
						player.inJail();
					}
					else {

					}
				}
			}
			else {
				ans = GUI.getUserButtonPressed("Du er fængslet og kan komme ud ved enten at betale 1.000 kr eller ved at kaste to ens. Hvad vælger du?", "Betale 1.000 kr.", "Prøve at kaste to ens");
				if (ans.equals("Betale 1.000 kr."));
				
			}
		}
	}

	@Override
	public int getId() {
		return this.id;
	}

}
