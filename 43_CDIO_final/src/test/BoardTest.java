package test;

import controller.BoardManagement;
import desktop_resources.GUI;


public class BoardTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BoardManagement bM = new BoardManagement();
		
		
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
