package test;

import controller.BoardManagement;
import controller.CardManagement;
import controller.PlayerManagement;
import entity.Bank;
import entity.Dicecup;
import entity.OwnableCard;
import desktop_resources.GUI;


public class jailCardTest {

	public static void main(String[] args) throws Exception{

		
		PlayerManagement pM = new PlayerManagement();
		Bank bank = new Bank();
		BoardManagement bM = new BoardManagement(bank);
		CardManagement cM = new CardManagement(bank, bM);
		Dicecup cup = new Dicecup();
		bM.createBoard(cM, cup);
		pM.createPlayers();
		bank.fillPlayerArray(pM.getPlayerArray());
		cM.getPlayerArray(pM.getPlayerArray());
		entity.Player[] players = pM.getPlayerArray();
		
		boolean gameOn = true;
		
		System.err.println("The next statement should be false: Player doesnt have a jailcard.");
		
		if (pM.getPlayer(0).getJailCard()) {
			System.out.println("true");
		}
		else if (!pM.getPlayer(0).getJailCard()) {
			System.err.println("false");
		}
		System.err.println("Now changing player " + pM.getPlayerName(0) + " to have a jailcard. Next statement should be true.");
		
		pM.getPlayer(0).setJailCardOwned(new OwnableCard("Test of ownable card"));
		
		if (pM.getPlayer(0).getJailCard()) {
			System.err.println("true");
		}
		else if (!pM.getPlayer(0).getJailCard()) {
			System.err.println("false");
		}
		
		System.err.println("Now changing player " + pM.getPlayerName(0) + " to remove his jailcard. Next statement should be false again.");
		pM.getPlayer(0).removeJailCardOwned();
		
		if (pM.getPlayer(0).getJailCard()) {
			System.err.println("true");
		}
		else if (!pM.getPlayer(0).getJailCard()) {
			System.err.println("false");
		}
		
		//Now we add 2 jailcards to the same player.
		System.err.println("Now adding two jailcards to " + pM.getPlayerName(0) + " next statement should be true.");
		pM.getPlayer(0).setJailCardOwned(new OwnableCard("Test of ownable card"));
		pM.getPlayer(0).setJailCardOwned(new OwnableCard("Test of ownable card"));
		
		if (pM.getPlayer(0).getJailCard()) {
			System.err.println("true");
		}
		else if (!pM.getPlayer(0).getJailCard()) {
			System.err.println("false");
		}
		
		System.err.println("Now removing one jailcard from " + pM.getPlayerName(0) + " he should still have one jailcard left, and therefor the next statement should be true.");
		pM.getPlayer(0).removeJailCardOwned();
		
		if (pM.getPlayer(0).getJailCard()) {
			System.err.println("true");
		}
		else if (!pM.getPlayer(0).getJailCard()) {
			System.err.println("false");
		}
		
		System.err.println("Now removing one jailcard from " + pM.getPlayerName(0) + "again, he should now have no jailcard left and therefor the next statement should be false.");
		pM.getPlayer(0).removeJailCardOwned();
		
		if (pM.getPlayer(0).getJailCard()) {
			System.err.println("true");
		}
		else if (!pM.getPlayer(0).getJailCard()) {
			System.err.println("false");
		}
		
		System.err.println("Now adding two jailcards to " + pM.getPlayerName(0) + " and removing two directly after. Next statement should be false.");
		pM.getPlayer(0).setJailCardOwned(new OwnableCard("Test of ownable card"));
		pM.getPlayer(0).setJailCardOwned(new OwnableCard("Test of ownable card"));
		pM.getPlayer(0).removeJailCardOwned();
		pM.getPlayer(0).removeJailCardOwned();
		
		if (pM.getPlayer(0).getJailCard()) {
			System.err.println("true");
		}
		else if (!pM.getPlayer(0).getJailCard()) {
			System.err.println("false");
		}
		
//		while(gameOn){
//			for(int i = 0; i < pM.getPlayerArray().length; i++){
//				boundary.GUI.pressEnter(pM.getPlayer(i).getName());
//				cup.rollDice();
//				pM.setPosition(pM.getPlayer(i), cup.getSum());
//				GUI.setDice(cup.getX(0).getValue(), cup.getX(1).getValue());
//
//				for(int j = 0; j < players.length; j++){
//					GUI.setBalance(pM.getPlayer(j).getName(), pM.getPlayer(j).getBalance());
//					{
//					}
//				}
//			}
//		}
	}
}
