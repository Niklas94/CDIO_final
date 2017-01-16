package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import entity.Player;
import entity.Bank;

public class BankTest {
	Player player1;
	Player player2;
	Bank bank;
	
	@Before
	public void setUp() throws Exception {
		player1 = new Player("Dr. B");
		player2 = new Player("High Lord Einar");
		bank = new Bank();
	}

	@After
	public void tearDown() throws Exception {
		player1 = null;
		player2 = null;
		bank = null;		
	}

	@Test
	public void testBuyField() {
		bank.buyField(player1, 2000);
		int actual = player1.getBalance();
		int expected = 28000;
		assertEquals(expected, actual);
	}
}
