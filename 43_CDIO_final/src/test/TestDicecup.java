package test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Dicecup;

public class TestDicecup {

	Dicecup cup;
	
	@Before
	public void setUp() throws Exception {
		cup = new Dicecup();
	}

	@After
	public void tearDown() throws Exception {
		cup = null;
	}

	@Test
	public void testGetSum() {
		//Der er to terninger i dicecuppen - og vi ved at default værcupn pr. terning er 1, derfor må summen være , da der er to terninger i dicecuppen.
		int expected = 2;
		int actual = cup.getSum();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRollDice() {
		
		
		int actTwo = 0, actThree = 0, actFour = 0, actFive = 0, actSix = 0, actSeven = 0, actEight = 0, actNine = 0, actTen = 0, actEleven = 0, actTwelve = 0, actOther = 0;

		for (int i = 0; i < 99999; i++) {
			cup.rollDice();
			if (cup.getSum() == 2)
				actTwo++;
			else if (cup.getSum() == 3)
				actThree++;
			else if (cup.getSum() == 4)
				actFour++;
			else if (cup.getSum() == 5)
				actFive++;
			else if (cup.getSum() == 6)
				actSix++;
			else if (cup.getSum() == 7)
				actSeven++;
			else if (cup.getSum() == 8)
				actEight++;
			else if (cup.getSum() == 9)
				actNine++;
			else if (cup.getSum() == 10)
				actTen++;
			else if (cup.getSum() == 11)
				actEleven++;
			else if (cup.getSum() == 12)
				actTwelve++;
			else
				actOther++;
		}
		
		assertEquals(2778, actTwo, 111);
		assertEquals(5556, actThree, 222);
		assertEquals(8333, actFour, 333);
		assertEquals(11111, actFive, 444);
		assertEquals(13889, actSix, 555);
		assertEquals(16667, actSeven, 666);
		assertEquals(13889, actEight, 555);
		assertEquals(11111, actNine, 444);
		assertEquals(8333, actTen, 333);
		assertEquals(5556, actEleven, 222);
		assertEquals(2778, actTwelve, 111);
		assertEquals(0, actOther);
		
	}
	

}
