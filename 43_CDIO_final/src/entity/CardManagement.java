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
			//Add more
		}
	}

	/*Shuffle cards

	There are probably a better method to do this, but this method is doing the following:
	Creating a temporary identical deck to the one we work with. 
	Picking a random number between 1 to the number of cards in the original card deck.
	Now lets say, at first the number is 5. It now places the card at the index of 5, at the top of this new identical deck, we created at the very beginning.
	Now we make the original decks array, at index 5, point at no object. This is to make sure, that we wont pick the same card again, and shuffle it into our new deck.
	This is repeated until all cards have been picked

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

	public Card pullCard(int index) {
		return cardArr[index];
	}

	public Card pullTopCard() {

		//The card you pick 
		Card topCard = cardArr[0];

		if (!cardArr[0].isItOwnable()) {
			for (int i = 0; i < cardArr.length; i++) {
				if (nonOwnableCards[i] == null)
					nonOwnableCards[i] = cardArr[0];
			}
		}
		
		//Moving all cards 1 down in index. Now the card at index 1, is now at index 0 - therefor the next top card which is pulled from the deck.
		for (int i = 0; i < cardArr.length-1; i++) {
			cardArr[i] = cardArr[i+1];
		}
		cardArr[cardArr.length-1] = null; //new Card(cardArr.length, 0, "Placeholder");
		
		return topCard;
	}
	
	public Card getNonOwnableCard(int index) {
		return nonOwnableCards[index];
	}
}


