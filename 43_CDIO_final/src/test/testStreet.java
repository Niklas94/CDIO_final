package test;

import controller.BoardManagement;
import controller.CardManagement;
import controller.PlayerManagement;
import desktop_fields.Street;
import entity.Bank;
import entity.Dicecup;
import entity.Player;
import entity.StreetBlue;

public class testStreet {

	public static void main(String[] args) throws Exception {
		Dicecup cup = new Dicecup();
		PlayerManagement pM = new PlayerManagement();
		Bank bank = new Bank();
		BoardManagement bM = new BoardManagement(bank);
		CardManagement cM = new CardManagement(bank, bM);
		bM.createBoard(cM, cup);
		pM.createPlayers();
		bank.fillPlayerArray(pM.getPlayerArray());
		bank.getBM(bM);
		cM.getPlayerArray(pM.getPlayerArray());
		cM.createCards();
		//cM.shuffleCards();
		Player[] players = pM.getPlayerArray();


		int i = 0;
		pM.setPosition(pM.getPlayer(i), 1);
		bM.getSquare(players[i].getPosition()).landOnField(players[i]);
	}
}
