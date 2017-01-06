package entity;

public class CardManagement {

	private Card[] cardArr;

	//Card Array
	public CardManagement(int numberOfCardManagement) {
		cardArr = new Card[numberOfCardManagement];

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

	//Shuffle cards
	public void shuffleCards() {
		Card[] cardArrShuffled = new Card[cardArr.length];
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * cardArr.length); //Et tilfældigt tal fra 1 til og med længden af cardArr længden.
			while (cardArr[r] == null) { //Hvis objektet er tom
				r = (int) (Math.random() * cardArr.length);
			}
				cardArrShuffled[i] = cardArr[r];
				cardArr[r] = null;
		}
		cardArr = cardArrShuffled;
	}

	public Card pullCard(int index) {
		return cardArr[index];
	}

}
