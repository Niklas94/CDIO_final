package controller;

import desktop_resources.GUI;
import entity.Bank;
import entity.Dicecup;
import entity.Player;

public class Game {

	public static void main(String[] args) throws Exception{

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
		boolean gameOn = true;

		while(gameOn){


			for(int i = 0; i < pM.getPlayerArray().length; i++) {

				if (!pM.getPlayer(i).jailStatus()) {
					boundary.GUI.pressEnter(pM.getPlayer(i).getName());
					cup.rollDice();

					for(int j = 0; j < players.length; j++){
						GUI.removeAllCars(pM.getPlayer(j).getName());
						GUI.setCar(pM.getPlayer(j).getPosition(), pM.getPlayer(j).getName());
					}

					pM.setPosition(pM.getPlayer(i), cup.getSum());
					GUI.setDice(cup.getX(0).getValue(), cup.getX(1).getValue());

					bM.getSquare(pM.getPlayer(i).getPosition()).landOnField(pM.getPlayer(i));

					for(int j = 0; j < players.length; j++){
						GUI.setBalance(pM.getPlayer(j).getName(), pM.getPlayer(j).getBalance());
						{
						}
					}

				}

				else {
					String a = GUI.getUserButtonPressed("Du er fængslet og kan komme ud ved enten at betale 1.000 kr, kaste to ens eller bruge et løsladelseskort. Hvad vælger du?", "Betale 1.000 kr.", "Prøve at kaste to ens", "Bruger mit løsladelseskort");
					if (a.equals("Betale 1.000 kr.")) {

					}
					else if (a.equals("Prøve at kaste to ens")) {
						boundary.GUI.pressEnter(pM.getPlayer(i).getName());
						cup.rollDice();
						if (cup.equalDice())
							pM.getPlayer(i).inJail();
					}
					else if (a.equals("Bruger mit løsladelseskort")) {
						if (pM.getPlayer(i).getJailCard()) {
							pM.getPlayer(i).useJailCardOwned();
							pM.getPlayer(i).inJail();
						}
						else {

						}
					}
				}

				if (cup.equalDice()) {
					pM.getPlayer(i).incGoToJail();
					if (pM.getPlayer(i).getGoToJail() == 3) {System.out.println(pM.getPlayerName(i) + " røg i fængsel pga. 3 slag med to ens værdier");}
					//pM.getPlayer(i).gotojail();
					i -= 1;
				}



			}
		}
	}
}

