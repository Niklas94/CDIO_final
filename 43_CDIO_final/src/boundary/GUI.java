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

		desktop_resources.GUI.showMessage(name + " tryk OK for at kaste med terningerne");

	}

	public static void printValue(int sum) {

		desktop_resources.GUI.showMessage("Du har kastet: " + sum);

	}
	
	public static boolean buyField(){
		String answer = desktop_resources.GUI.getUserSelection("Feltet er ikke ejet. Vil du gerne købe feltet?", "Ja", "Nej");
		if("Ja".equalsIgnoreCase(answer))
			return true;
		else
			return false;
	}
	
	public static void playerOwnsField(String owner){
		desktop_resources.GUI.showMessage(owner + ", du er landet paa dit eget felt.");
	}
	
	public static void fieldLandedOn(String player, String fieldName){
		desktop_resources.GUI.showMessage(player +" landede på " + fieldName + ".");
	}
	
	public static String payTax(){
		return desktop_resources.GUI.getUserButtonPressed("Betal indkomstskat. Enten 10% af dit fulde beløb eller 4.000kr. ", "10%", "4.000kr.");
	}

}
