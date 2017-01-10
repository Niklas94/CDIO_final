package test;

import controller.BoardManagement;
import desktop_resources.GUI;


public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BoardManagement bM = new BoardManagement();
		} catch (Exception e) {
			e.printStackTrace();
		}

		long a = System.currentTimeMillis();
		int counter = 10;
		
		System.err.println(counter);
		counter--;
		
		while(true) {
			
			long b = System.currentTimeMillis();
			
			
			if ((b - a) > 1000) {
				System.err.println(counter);
				a = System.currentTimeMillis();
				counter--;
				if(counter == -1){
					GUI.addPlayer("John Rambo", 10000);
					break;
				}
			}
			
		}
		

	}

}
