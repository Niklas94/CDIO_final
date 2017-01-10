package boundary;

public class GUI {

	private static int numberPlayers;
	private static String name;

	public static int numberOfPlayers() {
		numberPlayers = desktop_resources.GUI.getUserInteger("Indtast antal spillere mellem 3 og 6.");
		return numberPlayers;
	}

	public static String playerNames() {
		name = desktop_resources.GUI.getUserString("Hvad er dit navn?");
		return name;
	}

	public static void getPlayerNames(String name) {
		desktop_resources.GUI.showMessage(name);
	}

	public static void winnerFound(String name) {

		desktop_resources.GUI.showMessage("Vinderen er: " + name);

	}

	public static void pressEnter(String name) {

		desktop_resources.GUI.showMessage(name + " tryk enter for at kaste med terningerne");

	}

	public static void printValue(int sum) {

		desktop_resources.GUI.showMessage("Du har kastet: " + sum);

	}

}
