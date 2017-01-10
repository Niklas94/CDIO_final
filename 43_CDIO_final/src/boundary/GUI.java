package boundary;

import entity.Player;

public class GUI {
	

	
	private static int numberPlayers;
	private static String name;

	public static int numberOfPlayers() {
		numberPlayers = GUI.getUserInteger("Indtast antal spillere" + " mellem 2 og 6.");
		return numberPlayers;
	}

	public static String playerNames() {

		name = GUI.getUserString("Hvad er dit navn?");
		return name;

	}
	
	public static void getPlayerNames(String name) {

		GUI.showMessage(name);
		
	}

	public static void winnerFound(String name) {

		GUI.showMessage("Vinderen er: " + name);

				
	}
	
	public static void pressEnter(String name) {
		
		GUI.showMessage(name + " tryk enter for at kaste med terningerne");

		
	}
	
	public static void printValue(int sum) {
		
		GUI.showMessage("Du har kastet: " + sum);

		
	}
	
	public static void printBalance(Player player) {
		
//		GUI.showMessage(player.getName() + ", din pengebeholdning er nu på " + player.getAccount().getMoney());

	}

}
