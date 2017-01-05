package entity;

public class CardManagement {

	private Card[] cardArr;
	
	//Card Array
	public CardManagement(int numberOfCardManagement) {
		cardArr = new Card[numberOfCardManagement];
		
	}
	
	public void createCardManagement() {
		for (int i = 0; i < cardArr.length; i++) {
			cardArr[i] = new Card(); //Lav et tomt kort
			cardArr[i].setId(i); //Sæt det tomme korts id til at være i.
			if (i < 2) {
				//Do something
			}
			else if (1 < i && i < 4) {
				//Do something else
			}
		}
	}
	
	//Shuffle cards - current source: http://stackoverflow.com/questions/16313567/shuffling-a-deck-of-cards-redundancy-after-swapping-two-values
	public void shuffleCards() {
		Card[] cardArrShuffled = new Card[cardArr.length];
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * cardArr.length); //Et tilfældigt tal fra 1 til og med længden af cardArr længden.
			cardArrShuffled[i] = cardArr[r];
		}
		cardArr = cardArrShuffled;
	}
	
	public Card pullCard() {
		return cardArr[0];
	}
	
}
