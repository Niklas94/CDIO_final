package controller;

import java.io.FileReader;

import entity.Bank;
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

	private Card[] cardArr = new Card[32]; //Change the number to create more cards - remember to add type, value and such in "Card Description.txt" file
	private Player[] players; //SpecialBirthday Card.
	private Bank bank; //Fleet card
	private BoardManagement bm; //Fleet and position card

	//Card Array
	public CardManagement(Bank bank, BoardManagement bm) {
		this.bank = bank;
		this.bm = bm;
	}

	/**
	 * 
	 * @param players - all the players in the game stored in a array
	 * @see PlayerBirthdayCard
	 */
	public void getPlayerArray(Player[] players) {
		this.players = players;
	}

	/**
	 * 
	 * @throws Exception - in case the text file "Card Description" does not exist or is renamed.
	 * @see Card Description.txt
	 */
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
				cardArr[i++] = new PositionCard(amount2, desc, bm);
				//cardArr[i].setId(i);
				break;
			case "FleetCard":
				desc = str.split(";")[1];
				cardArr[i++] = new FleetCard(desc, bank, bm);
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
			case "OwnableCard":
				desc = str.split(";")[1];
				cardArr[i++] = new OwnableCard(desc);
				break;
			}
		}
		br.close();
	}
	
	/**
	 * Shuffles the card deck.
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

	/**
	 * Returns a card to the deck. When a card is used, it is immediately returned to the deck. This is also the case for ownable cards.
	 * @param card
	 * @see Chance class
	 */
	public void returnCardToDeck(Card card) {
		if (card instanceof OwnableCard) { //If the card is one of the two ownable jailcards.
			for (int i = 0; i < cardArr.length; i++) {
				if (cardArr[i].getDescription().equals("Placeholder")) { //Find one of the two 'placeholder' cards (basically what previously were a jailcard).
					Card tempCard = card; //Save the returning jailcard into a temporary card.
					for (int j = i; j < cardArr.length-1; j++) { //Move all the cards from the placeholder card and above, one down in index.
						cardArr[j] = cardArr[j+1];
					}
					cardArr[cardArr.length - 1] = tempCard; //Return the jailcard back into the deck.
					break;
				}
			}
		}
		else
			cardArr[cardArr.length-1] = card;
	}

	/**
	 * @param index - which card from the array that is pulled. 
	 * @return the card from the specific index, unless the card is a placeholder card.
	 * @see pullTopCard
	 */
	public Card pullCard(int index) {
		Card topCard;

		if (!cardArr[index].getDescription().equals("Placeholder"))
			return topCard = cardArr[index];
		else if (!cardArr[index + 1].getDescription().equals("Placeholder"))
			return topCard = cardArr[index + 1];
		else
			return topCard = cardArr[index + 2];
	}

	/**
	 * Pulls the card, at the top of the deck (index 0). Moves all the other cards 1 down in index (index 31 goes to 30, 30 goes to 29 and so on...)
	 * If the card is an ownable card, instead of returning the ownablecard that was picked and used, we instead return a "placeholder" card into the deck. 
	 * @return the top card, unless its a placeholder card
	 * @see Chance class
	 */
	public Card pullTopCard() {

		Card topCard;

		//The card you pick 
		if (!cardArr[0].getDescription().equals("Placeholder"))
			topCard = cardArr[0];
		else if (!cardArr[0].getDescription().equals("Placeholder"))
			topCard = cardArr[1];
		else
			topCard = cardArr[2];

		//Moving all cards 1 down in index. Now the card at index 1, is now at index 0 - therefore the next top card which is pulled from the deck.
		for (int i = 0; i < cardArr.length-1; i++) {
			cardArr[i] = cardArr[i+1];
		}

		//Creating
		if (topCard instanceof OwnableCard) {
			return cardArr[cardArr.length-1] = new OwnableCard("Placeholder");
		}
		return topCard;
	}
}


