package entity;
import controller.BoardManagement;
import controller.CardManagement;
import entity.Card;

public class FleetCard extends Card {

	private Bank bank;
	private BoardManagement bm;
	
	public FleetCard(String desc, Bank bank, BoardManagement bm) {
		super.setDescription(desc);
		this.bank = bank;
		this.bm = bm;
	}

	@Override
	public void useCard(Player player, CardManagement cm) {
		if (player.getPosition() >= 3 && player.getPosition() <= 8) {
			player.setPosition(6);
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice());
			}
		}
		else if (player.getPosition() == 18)
		{
			player.setPosition(16);
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice());
			}
		}
		else if (player.getPosition() == 23) {
			player.setPosition(26);
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice());
			}
		}
		else if (player.getPosition() >= 34 && player.getPosition() <= 37) {
			player.setPosition(36);	
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice());
			}
		}
		System.out.println(super.getDescription());
		cm.returnCardToDeck(this);
	}
}
