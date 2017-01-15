package entity;
import controller.BoardManagement;
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
	public void useCard(Player player) {
		if (player.getPosition() >= 3 && player.getPosition() <= 8) {
			player.setPosition(6);
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				if (this.getDescription().equals("Tag med den nærmeste færge - Flyt brikken frem, og hvis De passerer Start inkassér da kr. 4.000."))
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
				else
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent() * 2);
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice(), "Fleet");
			}
		}
		else if (player.getPosition() == 18)
		{
			player.setPosition(16);
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				if (this.getDescription().equals("Tag med den nærmeste færge - Flyt brikken frem, og hvis De passerer Start inkassér da kr. 4.000."))
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
				else
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent() * 2);
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice(), "Fleet");
			}
		}
		else if (player.getPosition() == 23) {
			player.setPosition(26);
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				if (this.getDescription().equals("Tag med den nærmeste færge - Flyt brikken frem, og hvis De passerer Start inkassér da kr. 4.000."))
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
				else
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent() * 2);
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice(), "Fleet");
			}
		}
		else if (player.getPosition() >= 34 && player.getPosition() <= 37) {
			player.setPosition(36);	
			if (bm.returnFleet(player.getPosition()).isOwned && bm.returnFleet(player.getPosition()).getOwner() != player.getName()) {
				if (this.getDescription().equals("Tag med den nærmeste færge - Flyt brikken frem, og hvis De passerer Start inkassér da kr. 4.000."))
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent());
				else
					bank.payRent(player, bm.returnFleet(player.getPosition()).getOwner(), bm.returnFleet(player.getPosition()).getRent() * 2);
			}
			else if (!bm.returnFleet(player.getPosition()).isOwned) {
				bm.buyField(player, bm.returnFleet(player.getPosition()).getPrice(), "Fleet");
			}
		}
	}
}
