package test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

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
	public void testPlayerOwned() {
		// Testing if variables get initialized with the int value 1
		int actual = 0;
		int expected = playerOwned.getTotalBreweryOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalFleetOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetBlueOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetGreenOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetGreyOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetPinkOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetPurpleOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetRedOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetWhiteOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetYellowOwned();
		assertEquals(actual, expected);
		expected = playerOwned.getTotalStreetOwned();
		assertEquals(actual, expected);
		
		// Testing if the arrays get initialized with the given value
		Boolean[] actualArray = {false, false};
		Boolean[] expectedArray = (Boolean[]) Array.newInstance(Boolean.class, 2);
		
		
		
		
	}

	@Test
	public void testSetBreweryOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFleetOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetBlueOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetGreenOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetGreyOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetPinkOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetPurpleOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetRedOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetWhiteOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetYellowOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalBreweryOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalFleetOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetBlueOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetGreenOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetGreyOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetPinkOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetPurpleOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetRedOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetWhiteOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalStreetYellowOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBreweryOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFleetOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetBlueOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetGreenOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetGreyOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetPinkOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetPurpleOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetRedOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetWhiteOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetYellowOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
