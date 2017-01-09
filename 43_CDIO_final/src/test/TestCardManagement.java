package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Card;
import entity.CardManagement;

public class TestCardManagement {

	CardManagement cm;

	@Before
	public void setUp() throws Exception {
		cm = new CardManagement(27);
	}

	@After
	public void tearDown() throws Exception {
		cm = null;
	}
	/*

	I am testing the shuffle cards method, by checking the id of a card at a specific index AFTER shuffling. 
	I check each cards ID, from index 0 to the length of the array. Each time a card has the same id as the index (plus 1) we increment the actual value, which will result in a failed test.

	 */
	@Test
	public void testShuffleCards() {

		int expected = 0;
		int actual = 0;

		cm.createCards();
		cm.shuffleCards();

		for (int i = 0; i < 27; i++) {
			if (i+1 == cm.pullCard(i).getId()) //I plus i with 1, since each card has an id 1 greater than the index they are located at in the array. Example: card at index 0, has the id 1.
				actual++;
		}
		assertEquals(expected, actual);
	}

	@Test
	public void testPullTopCard() {

		int expected = 0;
		int actual = 0;
		cm.createCards();
		Card expected2 = cm.pullCard(0); //This method returns the card from the specific index. In this test, we obviously pick the first card.
		Card actual2 = cm.pullTopCard(); //The method were testing - it is meant to return the top card while also moving all cards in the deck, 1 index down. 

		for (int i = 0; i < 27; i++) { //This whole for loop is meant to test if the new cards at each index is the same as we would expect, after pulling the top card from the deck once.
			if (cm.pullCard(i) == null) { //This if-statement is only made to prevent a nullPointerException. Since obviously when you pull a card from a deck, the deck will be 1 card smaller, until the card is returned.
				System.out.println("Pulled a null card"); //But in our code, we specified the deck as an array which always is the same size, even when you pull a card. In our code, when pulling a card, we make the last index of the array pointing at no object, until A card is returned.
			}
			else if (cm.pullCard(i).getId() != i+2) {
				System.out.println(cm.pullCard(i).getId() + " != " + (i+2));
				actual++;
			}
		}
		assertEquals(expected, actual);
		assertEquals(expected2, actual2);
	}

	@Test
	public void testReturnCardToDeck() {
		
		cm.createCards();
		Card expected = cm.pullTopCard(); //Expected card must be the one at the top.
		cm.returnCardToDeck(cm.getNonOwnableCard(0));
		
		Card actual = cm.pullCard(26);
		assertEquals(expected, actual);
	}
}
