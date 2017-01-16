package boundary;

public class GUI {

	private static int numberPlayers;
	private static String name;

	public static int numberOfPlayers() {
		numberPlayers = desktop_resources.GUI.getUserInteger("Indtast antal spillere mellem 3 og 6.");
		return numberPlayers;
	}

	public static String prisonOptions(boolean prisonCard) {
		if (prisonCard)
			return desktop_resources.GUI.getUserButtonPressed("Du er fængslet og kan komme ud ved enten at betale 1.000 kr, kaste to ens eller bruge et løsladelseskort. Hvad vælger du?", "Betale 1.000 kr.", "Prøve at kaste to ens", "Bruger mit løsladelseskort");
		else
			return desktop_resources.GUI.getUserButtonPressed("Du er fængslet og kan komme ud ved enten at betale 1.000 kr eller ved at kaste to ens. Hvad vælger du?", "Betale 1.000 kr.", "Prøve at kaste to ens");
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
		desktop_resources.GUI.showMessage(owner + ", du er landet på dit eget felt.");
	}

	public static void fieldLandedOn(String player, String fieldName){
		desktop_resources.GUI.showMessage(player + " landede på " + fieldName + ".");
	}

	public static String payTax(){
		return desktop_resources.GUI.getUserButtonPressed("Betal indkomstskat. Enten 10% af dit fulde beløb eller 4.000kr. ", "10%", "4.000kr.");
	}

	public static void displayCardDescription(String desc) {
		desktop_resources.GUI.displayChanceCard(desc);
	}


	public static void newTurn(String name) {
		desktop_resources.GUI.showMessage(name + ", det er din tur.");
	}

	public static boolean buyHouse(String player){
		String answer = desktop_resources.GUI.getUserSelection(player + ", vil du gerne købe et hus/hotel?", "Ja", "Nej");
		if("Ja".equalsIgnoreCase(answer))
			return true;
		else
			return false;
	}
	
	public static boolean buyHouseAgain(String player) {
		String answer = desktop_resources.GUI.getUserSelection(player + ", vil du gerne købe et hus/hotel på et andet felt?", "Ja", "Nej");
		if("Ja".equalsIgnoreCase(answer))
			return true;
		else
			return false;
	}

	public static int whichStreet(){
		return desktop_resources.GUI.getUserInteger("Vælg det feltummer, hvor du gerne vil købe et hus/hotel (Sæt musen over feltet for at se, hvilket feltnummer det har).", 1, 40);
	}
	
	public static int whichStreetAgain() {
		return desktop_resources.GUI.getUserInteger("Du valgte et ugyldigt felt. Prøv igen.).", 1, 40);
	}
	
	public static void dontOwn() {
		desktop_resources.GUI.showMessage("Du opfylder ikke kravene for at kunne købe huse/hotel på denne grund.");
	}
	
	public static void cantAfford(){
		desktop_resources.GUI.showMessage("Du har ikke råd til at købe et hus/hotel, på denne grund.");
	}
}
