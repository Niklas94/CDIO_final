package entity;

public class CardManagement {

	private Card[] cardArr;
	
	//Card Array
	public CardManagement(int numberOfCardManagement) {
		cardArr = new Card[numberOfCardManagement];
		
	}
	
	public void createCards() {
		for (int i = 0; i < cardArr.length; i++) {
			cardArr[i] = new Card(); //Lav et tomt kort
			cardArr[i].setId(i); //Sæt det tomme korts id til at være i.
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
				cardArr[i].setDescription("Betal deres bilforsikring kr. 1.000");
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
