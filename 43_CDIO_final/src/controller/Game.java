package controller;

import controller.BoardManagement;
import entity.Bank;
import entity.Dicecup;
import entity.Player;
import desktop_resources.GUI;


public class Game {

	public static void main(String[] args) throws Exception{

		Dicecup cup = new Dicecup();
		CardManagement cM = new CardManagement();
		PlayerManagement pM = new PlayerManagement();
		Bank bank = new Bank();
		BoardManagement bM = new BoardManagement(bank);
		bM.createBoard(cM, cup);
		pM.createPlayers();
		bank.fillPlayerArray(pM.getPlayerArray());
		bank.getBM(bM);
		cM.getPlayerArray(pM.getPlayerArray());
		Player[] players = pM.getPlayerArray();
		boolean gameOn = true;
		
		while(gameOn){
			for(int i = 0; i < pM.getPlayerArray().length; i++){
				boundary.GUI.pressEnter(pM.getPlayer(i).getName());
				cup.rollDice();
				pM.setPosition(pM.getPlayer(i), cup.getSum());
				GUI.setDice(cup.getX(0).getValue(), cup.getX(1).getValue());

				
				
				for(int j = 0; j < players.length; j++){
					GUI.setBalance(pM.getPlayer(j).getName(), pM.getPlayer(j).getBalance());
					{
					}
				}
			}
		}
	}
}
