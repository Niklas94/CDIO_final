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
			for(int i = 0; i < pM.getPlayerArray().length; i++){
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
				}
			}
		}
	}
}
