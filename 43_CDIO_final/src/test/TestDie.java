package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Die;

public class TestDie {

	Die die;

	@Before
	public void setUp() throws Exception {
		die = new Die();
	}

	@After
	public void tearDown() throws Exception {
		die = null;
	}

	@Test
	public void getValue() {
		//Værdien er sat defualt til at være 1
		int expected = 1;
		int actual = die.getValue();
		assertEquals(expected, actual);
	}

	@Test
	public void testRoll() {

		int actOne = 0, actTwo = 0, actThree = 0, actFour = 0, actFive = 0, actSix = 0, actOther = 0;

		for (int i = 0; i < 99999; i++) {
			die.rollDie();
			if (die.getValue() == 1)
				actOne++;
			else if (die.getValue() == 2)
				actTwo++;
			else if (die.getValue() == 3)
				actThree++;
			else if (die.getValue() == 4)
				actFour++;
			else if (die.getValue() == 5)
				actFive++;
			else if (die.getValue() == 6)
				actSix++;
			else
				actOther++;
		}
		
		assertEquals(16667, actOne, 666);
		assertEquals(16667, actTwo, 666);
		assertEquals(16667, actThree, 666);
		assertEquals(16667, actFour, 666);
		assertEquals(16667, actFive, 666);
		assertEquals(16667, actSix, 666);
		assertEquals(0, actOther);

	}
}
