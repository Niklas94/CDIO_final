package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.BoardManagement;
import controller.CardManagement;
import controller.PlayerManagement;
import entity.Bank;
import entity.Card;
import entity.Player;

public class TestCardManagement {

	CardManagement cm;
	PlayerManagement pm;
	Bank bank;
	BoardManagement bm;
	Player[] players;

	@Before
	public void setUp() throws Exception {
		cm = new CardManagement(bank, bm);
		pm = new PlayerManagement();
//		pM.createPlayers();
//		cm.getPlayerArray(pM.getPlayerArray());
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

		String[] beforeShuffling;
		beforeShuffling = new String[33];
		int expected = 33, actual = 0;
		
		cm.createCards();

		for (int i = 0; i < 33; i++) {
			beforeShuffling[i] = cm.pullTopCard().getDescription();
		}
		cm.shuffleCards();
		
		for (int i = 0; i < 33; i++) {
			if (cm.pullCard(i).getDescription() != beforeShuffling[i])
				actual++;
		}
		assertEquals(expected, actual);
		
		cm.returnCardToDeck(cm.pullTopCard());
	}

	@Test
	public void testPullTopCard() throws Exception {
		
		//First we create the cards
		cm.createCards();
		cm.shuffleCards();
		
		//Then we pull the top card, and gets the description of that card. That description is what we expect to get again, when we now pull the last card in the deck.
		String expected1 = cm.pullTopCard().getDescription();
		String actual1 = cm.pullCard(32).getDescription();
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
		cm.returnCardToDeck(expected);
		Card actual = cm.pullCard(33);
		assertEquals(expected, actual);
	}
}
