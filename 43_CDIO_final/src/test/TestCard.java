package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Card;

public class TestCard {

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
		
		String expected = "I am working";
		card.setDescription("I am working");
		String actual = card.getDescription();
		assertEquals(expected, actual);
		
	}

}
