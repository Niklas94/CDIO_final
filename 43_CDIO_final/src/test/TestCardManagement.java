package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.CardManagement;

public class TestCardManagement {

	CardManagement cm;
	
	@Before
	public void setUp() throws Exception {
		cm = new CardManagement(20);
	}

	@After
	public void tearDown() throws Exception {
		cm = null;
	}

	@Test
	public void testShuffleCards() {
		
		//Not a proper test - but try run the program, and you can see in the printoutline that it works.
		cm.createCards();
		for (int i = 0; i < 17; i++) {
			System.out.println(cm.pullCard(i).toString());
		}
		System.out.println(""); //Line break
		cm.shuffleCards();
		for (int i = 0; i < 17; i++) {
			System.out.println(cm.pullCard(i).toString());
		}
		
		//Previous syso: "Id´en på kortet er: " + cm.pullCard(i).getId() + " og værdien af dette kort er: " + cm.pullCard(i).getValue() + " og beskrivelsen er: " + cm.pullCard(i).getDescription()
		
	}

}
