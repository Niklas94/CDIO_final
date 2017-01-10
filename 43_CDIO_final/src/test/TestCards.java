package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.PlayerManagement;
import entity.Card;
import entity.FleetCard;
import entity.MoneyCard;
import entity.Player;
import entity.PlayerBirthdayCard;
import entity.PositionCard;
import entity.SpecialCard;

public class TestCards {

	//This JUnit test, tests if we can manipulate with a cards variables.
	
	Card card1, card2, card3, card4, card5;
	PlayerManagement pm;
	
	@Before
	public void setUp() throws Exception {
		card1 = new MoneyCard(0, "Money card");
		card2 = new PositionCard(0, "Position card");
		card3 = new FleetCard("Fleet card");
		card4 = new SpecialCard("Special card");
		pm.createPlayers();
		card5 = new PlayerBirthdayCard("Player birthday card", players);
	}

	@After
	public void tearDown() throws Exception {
		card1 = null;
		card2 = null;
		card3 = null;
		card4 = null;
		card5 = null;
	}

	@Test
	public void testMoneyCard() {
		}
	
	@Test
	public void testFleetCard() {
	}
}
