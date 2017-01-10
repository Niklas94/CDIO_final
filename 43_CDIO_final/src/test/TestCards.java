package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Card;
import entity.FleetCard;
import entity.MoneyCard;
import entity.PositionCard;

public class TestCards {

	//This JUnit test, tests if we can manipulate with a cards variables.
	
	Card card1, card2, card3;
	
	@Before
	public void setUp() throws Exception {
		card1 = new MoneyCard(0, "0");
		card2 = new PositionCard(0, "0");
		card3 = new FleetCard("0");
	}

	@After
	public void tearDown() throws Exception {
		card1 = null;
		card2 = null;
		card3 = null;
	}

	@Test
	public void testMoneyCardValue() {
		//Testing to see, if the setValue() method works.
		
		//First we test, if the value at first is 0.
		int expected = 0;
		int actual = card1.useCard();
		assertEquals(expected, actual);
		
		//Then we see, if we can manipulate the value of the card, by recreating the object.
		int expected2 = 100;
		card1 = new MoneyCard(100, "0");
		int actual2 = card1.useCard();
		assertEquals(expected2, actual2);
		}
	
	@Test
	public void testSetDescription() {
		//Testing to see, if the setDescription() method works.
		
		//First we test, if it actually is 0 at the very start
		String expected = "0";
		String actual = card1.getDescription();
		assertEquals(expected, actual);
		
		//Now we change the description and see if it works
		String expected2 = "I am working";
		card1.setDescription("I am working");
		String actual2 = card1.getDescription();
		assertEquals(expected2, actual2);	
	}
	
	@Test
	public void testFleetCard() {
		//Testing to see if the useCard on a fleetcard works as intended (moving the player to the correct fleet field)
		
		//There are fleet fields on fields nr. 6 - 16 - 26 and 36.
		//Chance fields are on: 3 - 8 - 18 - 23 - 34 - 37.
		//We assume the players position to be equal to chance fields nr.
		int expected1 = 6, expected2 = 6, expected3 = 16, expected4 = 26, expected5 = 36, expected6 = 36;
		int actual1 = ((FleetCard)card3).useCard(3);
		int actual2 = ((FleetCard)card3).useCard(8);
		int actual3 = ((FleetCard)card3).useCard(18);
		int actual4 = ((FleetCard)card3).useCard(23);
		int actual5 = ((FleetCard)card3).useCard(34);
		int actual6 = ((FleetCard)card3).useCard(37);
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
		assertEquals(expected4, actual4);
		assertEquals(expected5, actual5);
		assertEquals(expected6, actual6);
	}
}
