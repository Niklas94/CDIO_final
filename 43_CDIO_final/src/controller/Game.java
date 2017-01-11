package controller;

import controller.BoardManagement;
import entity.Bank;
import entity.Dicecup;
import desktop_resources.GUI;


public class Game {

	public static void main(String[] args) throws Exception{

		CardManagement cM = new CardManagement(31);
		PlayerManagement pM = new PlayerManagement();
		Bank bank = new Bank();
		BoardManagement bM = new BoardManagement(bank);
		bM.createBoard(cM);
		pM.createPlayers();
		bank.fillPlayerArray(pM.getPlayerArray());
		cM.getPlayerArray(pM.getPlayerArray());
		entity.Player[] players = pM.getPlayerArray();
		Dicecup cup = new Dicecup();
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
