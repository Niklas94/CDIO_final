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
	public void testShuffleCards() throws Exception {

		int expected = 27;
		int actual = 0;

		cm.createCards();
		cm.shuffleCards();

		for (int i = 0; i < 27; i++) {
			System.out.println(cm.pullCard(i).getId());
			if (i+1 != cm.pullCard(i).getId()) //I plus i with 1, since each card has an id 1 greater than the index they are located at in the array. Example: card at index 0, has the id 1.
				actual++;
		}
		assertEquals(expected, actual);
	}

	@Test
	public void testPullTopCard() throws Exception {
		
		//First we create the cards
		cm.createCards();
		
		//Then we pull the top card, and gets the description of that card. That description is what we expect to get again, when we now pull the last card in the deck.
		String expected1 = cm.pullTopCard().getDescription();
		String actual1 = cm.pullCard(26).getDescription();
		assertEquals(expected1, actual1);
		
		//Now we try again with the 2nd card in the deck. The 2nd card is obviously at the top now, since we alerady pulled the first one.
		String expected2 = cm.pullTopCard().getDescription();
		String actual2 = cm.pullCard(0).getDescription();
		assertEquals(expected2, actual2);
	}

	@Test
	public void testReturnCardToDeck() throws Exception {
		
		cm.createCards();
		Card expected = cm.pullTopCard(); //Expected card must be the one at the top.
		Card actual = cm.pullCard(26);
		assertEquals(expected, actual);
	}
}
