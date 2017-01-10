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
		GUI.addPlayer("John Rambo", 10000);

	}

}
