package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Card;

public class TestCard {

	//This JUnit test, tests if we can manipulate with a cards variables.
	
	Card card;
	
	@Before
	public void setUp() throws Exception {
		card = new Card();
	}

	@After
	public void tearDown() throws Exception {
		card = null;	
	}

	@Test
	public void testSetValue() {
		//Testing to see, if the setValue() method works.
		
		//First we test, if the value at first is 0.
		int expected = 0;
		int actual = card.getValue();
		assertEquals(expected, actual);
		
		//Then we see, if we can manipulate the value of the card.
		int expected2 = 100;
		card.setValue(100);
		int actual2 = card.getValue();
		assertEquals(expected2, actual2);
		
		}
	
	@Test
	public void testIsOwnable() {
		//Default ownable is false - testing to see if it returns the false boolean.
		boolean expected = false;
		boolean actual = card.isItOwnable();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOwnable() {
		//Testing to see, if the method ownable() changes the boolean from false to true
		boolean expected = true;
		card.isOwnable(); //This method we are testing
		boolean actual = card.isItOwnable(); //This method worked in the previous test. Assuming it works now.
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetDescription() {
		//Testing to see, if the setDescription() method works.
		
		//First we test, if it actually is null at the very start
		String expected = null;
		String actual = card.getDescription();
		assertEquals(expected, actual);
		
		//Now we change the description and see if it works
		String expected2 = "I am working";
		card.setDescription("I am working");
		String actual2 = card.getDescription();
		assertEquals(expected2, actual2);
		
	}

}
