package test;

import static org.junit.Assert.*;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import entity.PlayerOwned;

public class TestPlayerOwned {
	
	PlayerOwned playerOwned;


	
	
	@Before
	public void setUp() throws Exception {
		playerOwned = new PlayerOwned();
	}

	@After
	public void tearDown() throws Exception {
		playerOwned = null;
	}
		

	@Test
	public void testSetBreweryOwned() {
		boolean actual = playerOwned.getBreweryOwned(1);
		assertFalse(actual);
		playerOwned.setBreweryOwned(1, true);
		actual = playerOwned.getBreweryOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetFleetOwned() {
		boolean actual = playerOwned.getFleetOwned(1);
		assertFalse(actual);
		playerOwned.setFleetOwned(1, true);
		actual = playerOwned.getFleetOwned(1);
		assertTrue(actual);
		
	}

	@Test
	public void testSetStreetBlueOwned() {
		boolean actual = playerOwned.getStreetBlueOwned(1);
		assertFalse(actual);
		playerOwned.setStreetBlueOwned(1, true);
		actual = playerOwned.getStreetBlueOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetStreetGreenOwned() {
		boolean actual = playerOwned.getStreetGreenOwned(1);
		assertFalse(actual);
		playerOwned.setStreetGreenOwned(1, true);
		actual = playerOwned.getStreetGreenOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetStreetGreyOwned() {
		boolean actual = playerOwned.getStreetGreyOwned(1);
		assertFalse(actual);
		playerOwned.setStreetGreyOwned(1, true);
		actual = playerOwned.getStreetGreyOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetStreetPinkOwned() {
		boolean actual = playerOwned.getStreetPinkOwned(1);
		assertFalse(actual);
		playerOwned.setStreetPinkOwned(1, true);
		actual = playerOwned.getStreetPinkOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetStreetPurpleOwned() {
		boolean actual = playerOwned.getStreetPurpleOwned(1);
		assertFalse(actual);
		playerOwned.setStreetPurpleOwned(1, true);
		actual = playerOwned.getStreetPurpleOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetStreetRedOwned() {
		boolean actual = playerOwned.getStreetRedOwned(1);
		assertFalse(actual);
		playerOwned.setStreetRedOwned(1, true);
		actual = playerOwned.getStreetRedOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetStreetWhiteOwned() {
		boolean actual = playerOwned.getStreetWhiteOwned(1);
		assertFalse(actual);
		playerOwned.setStreetWhiteOwned(1, true);
		actual = playerOwned.getStreetWhiteOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testSetStreetYellowOwned() {
		boolean actual = playerOwned.getStreetYellowOwned(1);
		assertFalse(actual);
		playerOwned.setStreetYellowOwned(1, true);
		actual = playerOwned.getStreetYellowOwned(1);
		assertTrue(actual);
	}

	@Test
	public void testGetTotalBreweryOwned() {
		int actual = playerOwned.getTotalBreweryOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalFleetOwned() {
		int actual = playerOwned.getTotalFleetOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetOwned() {
		int actual = playerOwned.getTotalStreetOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetBlueOwned() {
		int actual = playerOwned.getTotalStreetBlueOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetGreenOwned() {
		int actual = playerOwned.getTotalStreetGreenOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetGreyOwned() {
		int actual = playerOwned.getTotalStreetGreyOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetPinkOwned() {
		int actual = playerOwned.getTotalStreetPinkOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetPurpleOwned() {
		int actual = playerOwned.getTotalStreetPurpleOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetRedOwned() {
		int actual = playerOwned.getTotalStreetRedOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetWhiteOwned() {
		int actual = playerOwned.getTotalStreetWhiteOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetTotalStreetYellowOwned() {
		int actual = playerOwned.getTotalStreetYellowOwned();
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetBreweryOwned() {
		boolean actual = playerOwned.getBreweryOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetFleetOwned() {
		boolean actual = playerOwned.getFleetOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetBlueOwned() {
		boolean actual = playerOwned.getStreetBlueOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetGreenOwned() {
		boolean actual = playerOwned.getStreetGreenOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetGreyOwned() {
		boolean actual = playerOwned.getStreetGreyOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetPinkOwned() {
		boolean actual = playerOwned.getStreetBlueOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetPurpleOwned() {
		boolean actual = playerOwned.getStreetPurpleOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetRedOwned() {
		boolean actual = playerOwned.getStreetRedOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetWhiteOwned() {
		boolean actual = playerOwned.getStreetWhiteOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testGetStreetYellowOwned() {
		boolean actual = playerOwned.getStreetYellowOwned(1);
		assertFalse(actual);
	}

	@Test
	public void testObject() {
		assertNotNull(playerOwned);
		assertEquals(playerOwned.getClass(), PlayerOwned.class);
	}

}
