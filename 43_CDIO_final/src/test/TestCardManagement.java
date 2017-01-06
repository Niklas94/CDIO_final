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
		cm = new CardManagement(17);
	}

	@After
	public void tearDown() throws Exception {
		cm = null;
	}

	//	@Test
	//	public void testShuffleCardsPrint() {
	//		
	//		//Not a proper test - but try run the program, and you can see in the printoutline that it works.
	//		cm.createCards();
	//		for (int i = 0; i < 17; i++) {
	//			System.out.println(cm.pullCard(i).toString());
	//		}
	//		System.out.println(""); //Line break
	//		cm.shuffleCards();
	//		for (int i = 0; i < 17; i++) {
	//			System.out.println(cm.pullCard(i).toString());
	//		}
	//		System.out.println("");
	//		//Previous syso: "Id´en på kortet er: " + cm.pullCard(i).getId() + " og værdien af dette kort er: " + cm.pullCard(i).getValue() + " og beskrivelsen er: " + cm.pullCard(i).getDescription()
	//		
	//	}

	/*

	I am testing the shuffle cards method, by checking the id of a card at a specific index AFTER shuffling. 
	I check each cards ID, from index 0 to the length of the array. Each time a card has the same id as the index (plus 1) we increment the actual value, which will result in a failed test.

	 */
	@Test
	public void testShuffleCards() {

		int expected = 0;
		int actual = 0;

		cm.createCards();
		cm.shuffleCards();

		for (int i = 0; i < 17; i++) {
			if (i+1 == cm.pullCard(i).getId()) //I plus i with 1, since each card has an id 1 greater than the index they are located at in the array. Example: card at index 0, has the id 1.
				actual++;
		}

		assertEquals(expected, actual);
	}

	@Test
	public void testPullTopCard() {

		int expected = 0;
		int actual = 0;
		
		cm.createCards();
		cm.pullTopCard();

		for (int i = 0; i < 17; i++) {
			if (cm.pullCard(i) == null) {
				//Do nothing
				System.out.println("Pulled a null card"); //Made this "if branch" to prevent nullPointerException...
			}
			else if (cm.pullCard(i).getId() != i+2) {
				System.out.println(cm.pullCard(i).getId() + " != " + (i+2));
				actual++;
			}
			
		}
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	//	@Test
	//	public void testPullTopCard() {
	//		
	//		cm.createCards();
	//		
	//		for (int i = 0; i < 17; i++) {
	//			System.out.println(cm.pullCard(i).getId());
	//		}
	//		
	//		cm.pullTopCard();
	//		
	//		for (int i = 0; i < 17; i++) {
	//			System.out.println(cm.pullCard(i).getId());
	//		}
	//	}

}
