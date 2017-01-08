package entity;

public class CardManagement {

	private Card[] cardArr;
	private Card[] nonOwnableCards;

	//Card Array
	public CardManagement(int numberOfCards) {
		cardArr = new Card[numberOfCards];
		nonOwnableCards = new Card[numberOfCards];
	}

	public void createCards() {

		//First we create the desired amount of cards - these card objects have nothing but id.

		for (int i = 0; i < cardArr.length; i++) {
			cardArr[i] = new Card(); //Lav et tomt kort
			cardArr[i].setId(i+1); //Sæt det tomme korts id til at være i.

			//From here and on, we give the card objects values, descriptions and may change the boolean ownable, depending on which specific card from the monopoly game, we are talking about.
			//The descriptions and values are directly copied from the actual cards.
			//The Easiser cards to implement (Value orientated):
			if (i < 3) {
				cardArr[i].setValue(1000);
				cardArr[i].setDescription("De modtager deres aktieudbytte. Modtag kr. 1.000 af banken.");
			}
			else if (2 < i && i < 5) {
				cardArr[i].setValue(-3000);
				cardArr[i].setDescription("Betal kr. 3.000 for reparation af deres vogn.");
			}
			else if (i == 5) {
				cardArr[i].setValue(-1000);
				cardArr[i].setDescription("Betal deres bilforsikring kr. 1.000.");
			}
			else if (5 < i && i < 8) {
				cardArr[i].setValue(1000);
				cardArr[i].setDescription("Deres præmieobligation er kommet ud. De modtager kr. 1.000 af banken.");
			}
			else if (i == 8) {
				cardArr[i].setValue(-200);
				cardArr[i].setDescription("De har været en tur i udlandet og haft for mange cigaretter med hjem. Betal told kr. 200.");
			}
			else if (i == 9) {
				cardArr[i].setValue(500);
				cardArr[i].setDescription("De har vundet i Klasselotteriet. Modtag kr. 500.");
			}
			else if (i == 10) {
				cardArr[i].setValue(3000);
				cardArr[i].setDescription("Kommunen har eftergivet et kvartals skat. Hæv i banken kr. 3.000.");
			}
			else if (i == 11) {
				cardArr[i].setValue(-2000);
				cardArr[i].setDescription("De har modtaget deres tandlægeregning. Betal kr. 2.000.");
			}
			else if (i == 12) {
				cardArr[i].setValue(200);
				cardArr[i].setDescription("Værdien af egen avl fra nyttehaven udgør kr. 200, som de modtager af banken.");
			}
			else if (i == 13) {
				cardArr[i].setValue(1000);
				cardArr[i].setDescription("Grundet dyrtiden har de fået gageforhøjelse. Modtag kr. 1.000.");
			}
			else if (i == 14) {
				cardArr[i].setValue(1000);
				cardArr[i].setDescription("De havde en række med elleve rigtige i tipning. Modtag kr. 1.000.");
			}
			else if (i == 15) {
				cardArr[i].setValue(-200);
				cardArr[i].setDescription("De har måttet vedtage en parkeringsbøde. Betal kr. 200 i bøde.");
			}
			else if (i == 16) {
				cardArr[i].setValue(-1000);
				cardArr[i].setDescription("De har kørt frem for Fuld Stop. Betal kr. 1.000 i bøde");
			}
			//Slightly harder cards to implement (Position orientated):
			else if (i == 17) {
				cardArr[i].setPosition(-3);
				cardArr[i].setDescription("Ryk tre felter tilbage.");
			}
			else if (i == 18) {
				cardArr[i].setDescription("Ryk frem til Frederiksberg Allé. Hvis de passerer Start, indkassér kr. 4.000.");
			}
			else if (i == 19) {
				cardArr[i].setDescription("Ryk frem til Start.");
			}
			else if (i == 20) {
				cardArr[i].setDescription("Ryk frem til Grønningen. Hvis de passerer Start, indkassér da kr. 4.000.");
			}
			else if (i == 21) {
				cardArr[i].setDescription("Tag ind på Rådhuspladsen.");
			}
			else if (21 < i && i < 24) {
				cardArr[i].setDescription("Ryk brikken frem til det nærmeste rederi og betal ejeren to gange den leje, han ellers er berettiget til. Hvis selskabet ikke ejes af nogen kan de købe det af banken.");
			}
			else if (23 < i && i < 26) {
				cardArr[i].setDescription("Gå i fængsel. Ryk direkte til fængslet. Selv om de passerer Start, indkasserer de ikke kr. 4.000.");
			}
			else if (i == 26) {
				cardArr[i].setDescription("Tag med den nærmeste færge - Flyt brikken frem, og hvis de passerer Start inkassér da kr. 4.000.");
			}
			//Add more
		}
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

		//If card is NOT ownable, store it in another array for non ownable cards.
		if (!cardArr[0].isItOwnable()) {
			for (int i = 0; i < cardArr.length; i++) {
				if (nonOwnableCards[i] == null)
					nonOwnableCards[i] = cardArr[0];
			}
		}
		
		//Moving all cards 1 down in index. Now the card at index 1, is now at index 0 - therefore the next top card which is pulled from the deck.
		for (int i = 0; i < cardArr.length-1; i++) {
			cardArr[i] = cardArr[i+1];
		}
		//this.returnCardToDeck(topCard); //The line below and the for loop about 10 lines above this line, did basically the same as this, but in a slightly different way. Keeping both things for now, just in case.
		cardArr[cardArr.length-1] = null; //new Card(cardArr.length, 0, "Placeholder");
		return topCard;
	}
	
	public Card getNonOwnableCard(int index) {
		return nonOwnableCards[index];
	}
	
	//Meant to update the balance on a specific player account.
	public void updateMoney(Card card, Player player) {
		player.updateBalance(card.getValue());
	}
	
	//Meant to update the position of a specific player.
	public void updatePosition(Card card, Player player) {
		
		if (card.getId() == 17) { //Move back 3 squares/fields
			player.setPosition(player.getPosition() - 3);
		}
		else if (card.getId() == 18) { //Frederiksberg Alle
			player.setPosition(12);
		}
		else if (card.getId() == 19) { //Start
			player.setPosition(1);
		}
		else if (card.getId() == 20) { //Grønningen
			player.setPosition(25);
		}
		else if (card.getId() == 21) { //Rådhuspladsen
			player.setPosition(40);
		}
		else if ((21 < card.getId() && card.getId() < 24) || card.getId() == 26) { //Fleets
			if (35 < player.getPosition())
				player.setPosition(6);
			else if (5 < player.getPosition())
				player.setPosition(16);
			else if (15 < player.getPosition())
				player.setPosition(26);
			else if (25 < player.getPosition())
				player.setPosition(36);
			//Missing an if / else statement, that checks if the specific field is owned, to double up the payment.
		}
		else if (23 < card.getId() && card.getId() < 26) { //Prison
			player.setPosition(31);
		}
		
	}
	
	//Meant to check, what the player has to update, based on the ID of the specific card.
	public void update(Card card, Player player) {
		if (card.getId() < 17)
			this.updateMoney(card, player);
		else if (17 < card.getId() && card.getId() < 26)
			this.updatePosition(card, player);
	}
	
}


