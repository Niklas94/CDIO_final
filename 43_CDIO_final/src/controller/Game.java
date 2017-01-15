package controller;

import desktop_resources.GUI;
import entity.Bank;
import entity.Dicecup;
import entity.Player;

public class Game {

	public static void main(String[] args) throws Exception{
		new Game().go();
	}

	public void go() throws Exception {

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
		cM.shuffleCards();
		Player[] players = pM.getPlayerArray();
		boolean gameOn = true;

		while(gameOn){

			for(int i = 0; i < pM.getPlayerArray().length; i++) {
				
				if (!pM.getPlayer(i).jailStatus()) {
					boundary.GUI.pressEnter(players[i].getName());
					cup.rollDice();

					for(int j = 0; j < players.length; j++){
						GUI.removeAllCars(players[j].getName());
						GUI.setCar(players[j].getPosition(), players[j].getName());
					}

					pM.setPosition(players[i], cup.getSum());
					GUI.setDice(cup.getX(0).getValue(), cup.getX(1).getValue());

					//if (pM.getPlayer(i).getPosition() - 1 == 31) {
						bM.getSquare(players[i].getPosition()).landOnField(players[i]);
					
					for(int j = 0; j < players.length; j++){
						GUI.setBalance(players[j].getName(), players[j].getBalance());
						{
						}
					}

				}

				else {
					
					bM.getSquare(players[i].getPosition()).landOnField(players[i]);
				}

				if (cup.equalDice()) {
					players[i].incGoToJail();
					if (players[i].getGoToJail() == 3) {System.out.println(players[i].getName() + " røg i fængsel pga. 3 slag med to ens værdier");}
					//pM.getPlayer(i).gotojail();
					i -= 1;
				}
				else if (!cup.equalDice())
					players[i].resetGoToJail();
					



			}
		}
	}
}

