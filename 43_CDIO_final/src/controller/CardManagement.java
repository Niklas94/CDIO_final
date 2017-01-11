package controller;

import java.io.FileReader;

import entity.Card;
import entity.FleetCard;
import entity.MoneyCard;
import entity.OwnableCard;
import entity.Player;
import entity.PlayerBirthdayCard;
import entity.PositionCard;
import entity.SpecialCard;

import java.io.BufferedReader;

public class CardManagement {

	private Card[] cardArr = new Card[31]; //Change the number to create more cards - remember to add type, value and such in "Card Description.txt" file
	private Player[] players;

	//Card Array
	public CardManagement() {
	}
	
	public void getPlayerArray(Player[] players) {
		this.players = players;
	}

	public void createCards() throws Exception {

		FileReader file = new FileReader("Card Description.txt");
		BufferedReader br = new BufferedReader(file);
		String str;
		String desc;

		//Creation of the different type of cards, and what variables they have to caontain, based on the type.
		int i = 0;
		while((str = br.readLine()) != null && i < cardArr.length){
			String type = str.split(";")[0]; //Read the type of the card
			switch(type){
			case "MoneyCard": 
				int amount = Integer.parseInt(str.split(";")[1]); //Read the amount of money a player receives / loses
				desc = str.split(";")[2]; //Description of the card
				cardArr[i++] = new MoneyCard(amount, desc);
				//cardArr[i].setId(i);
				break;
			case "PositionCard":
				int amount2 = Integer.parseInt(str.split(";")[1]);
				desc = str.split(";")[2];
				cardArr[i++] = new PositionCard(amount2, desc);
				//cardArr[i].setId(i);
				break;
			case "FleetCard":
				desc = str.split(";")[1];
				cardArr[i++] = new FleetCard(desc);
				//cardArr[i].setId(i);
				break;
			case "SpecialCard":
				desc = str.split(";")[1];
				cardArr[i++] = new SpecialCard(desc);
				//cardArr[i].setId(i);
				break;
			case "PlayerBirthdayCard":
				desc = str.split(";")[1];
				cardArr[i++] = new PlayerBirthdayCard(desc, players);
				//cardArr[i].setId(i);
				break;
			}
		}
		br.close();
	}

	/*Shuffle cards

	There are probably a better method to do this, but this method is doing the following:
	Creating a temporary identical deck to the one we work with. 
	Picking a random number between 1 to the number of cards in the original card deck.
	Now lets say, at first the number is 5. It now places the card at the index of 5, at the top (index 0) of this new identical deck we created at the very beginning.
	Now we make the original decks array, at index 5, point at no object. This is to make sure, that we wont pick the same card again, and shuffle it into our new deck.
	This is repeated until all cards have been picked.
	In addition, no card will ever be at their original index. 

	 */
	public void shuffleCards() {
		Card[] cardArrShuffled = new Card[cardArr.length];
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * cardArr.length); //A random number from 1 to the card arrays length.
			while (cardArr[r] == null || r == i) { //If the object at the specific index is null or r == i, pick a new number. We want to shuffle properly!
				r = (int) (Math.random() * cardArr.length);
			}
			cardArrShuffled[i] = cardArr[r];
			cardArr[r] = null;
		}
		cardArr = cardArrShuffled;
	}

	//Return a card back into the deck
	public void returnCardToDeck(Card card) {
		if (card instanceof OwnableCard) { //If the card one of the two ownable jailcards.
			for (int i = 0; i < cardArr.length; i++) {
				if (cardArr[i] == null) { //Find one of the two 'null' cards (basically what previously were a jailcard).
					Card tempCard = card; //Save the returning jailcard into a temporary card.
					for (int j = i; j < cardArr.length; j++) { //Move all the cards from the null card and above, one down in index.
						cardArr[j] = cardArr[j+1];
					}
					cardArr[cardArr.length - 1] = tempCard; //Return the jailcard back into the deck.
					break;
				}
			}
		}

		cardArr[cardArr.length-1] = card;
	}

	//This method is, as of now (7. January 2017) only here, so we can test all the other methods.
	public Card pullCard(int index) {
		return cardArr[index];
	}

	//Pull the card, at the top of the deck
	public Card pullTopCard() {

		//The card you pick 
		Card topCard = cardArr[0];

		//Moving all cards 1 down in index. Now the card at index 1, is now at index 0 - therefore the next top card which is pulled from the deck.
		for (int i = 0; i < cardArr.length-1; i++) {
			cardArr[i] = cardArr[i+1];
		}

		//Return card to the bottom of the deck
		if (!(topCard instanceof OwnableCard)) {
			this.returnCardToDeck(topCard); //The line below and the for loop about 10 lines above this line, did basically the same as this, but in a slightly different way. Keeping both things for now, just in case.
			cardArr[cardArr.length-1] = null;
		}
		return topCard;
	}
}


