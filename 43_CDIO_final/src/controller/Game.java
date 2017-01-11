package controller;

import controller.BoardManagement;
import entity.Bank;
import entity.Dicecup;
import desktop_resources.GUI;


public class Game {

	public static void main(String[] args) throws Exception{

		CardManagement cM = new CardManagement(31);

		BoardManagement bM = new BoardManagement();
		bM.createBoard(cM);

		PlayerManagement pM = new PlayerManagement();
		pM.createPlayers();
		Bank bank = new Bank(pM.getPlayerArray());
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
				if(bM.ownable(pM.getPlayer(i).getPosition() - 1) && !bM.isOwned(pM.getPlayer(i).getPosition() - 1)) {
					//if(bM.ownable(pM.getPlayer(i).getPosition()) && !bM.getOwnableSquare(pM.getPlayer(i).getPosition()).isOwned()){
					if(boundary.GUI.buyField()){
						bank.buyField(pM.getPlayer(i), bM.getOwnableSquare(pM.getPlayer(i).getPosition() - 1));
					}
				}
				else if(bM.ownable(pM.getPlayer(i).getPosition() - 1) && bM.isOwned(pM.getPlayer(i).getPosition() - 1) && pM.getPlayer(i).getName() != bM.getOwnableSquare(pM.getPlayer(i).getPosition() -1).getOwner()){
					bank.payRent(pM.getPlayer(i), bM.getOwnableSquare(pM.getPlayer(i).getPosition() - 1), cup.getSum());
				}
				for(int j = 0; j < players.length; j++){
					GUI.setBalance(pM.getPlayer(j).getName(), pM.getPlayer(j).getBalance());
					{
					}
				}
			}
		}
	}
}
