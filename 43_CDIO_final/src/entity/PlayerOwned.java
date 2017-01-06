package entity;


/*
 * This Class is for the player to find out how many and which fields it is owning.
 * In this class there will be no pricing for the rent or anything.
 * There will be arrays for the different street types of colors that are represented in the game.
 * A player will then know which one of the field in the same color type it is owning.
 * This Class returns int and boolean values to determine if something is owned. 
 * This can be helpful for both Board class and Account class.
 * Because not all colors are the same pricing even though it is the same color.
 */


public class PlayerOwned {
	private final int BREWERY_TOTAL_ALL = 2;
	private final int FLEET_TOTAL_ALL = 4;
	
	private final int STREET_TOTAL_ALL = 22;
	private final int STREET_TOTAL_BLUE = 2;
	private final int STREET_TOTAL_GREEN = 3;
	private final int STREET_TOTAL_GREY = 3;
	private final int STREET_TOTAL_PINK = 3;
	private final int STREET_TOTAL_PURPLE = 2;
	private final int STREET_TOTAL_RED = 3;
	private final int STREET_TOTAL_WHITE = 3;
	private final int STREET_TOTAL_YELLOW = 3;
	
	private int totalBreweryOwned;
	private int totalFleetOwned;
	private int totalStreetOwned;
	
	private Boolean[] streetBlue;
	private Boolean[] streetGreen;
	private Boolean[] streetGrey;
	private Boolean[] streetPink;
	private Boolean[] streetPurple;
	private Boolean[] streetRed;
	private Boolean[] streetWhite;
	private Boolean[] streetYellow;
	
	public PlayerOwned() {
		
		totalBreweryOwned = 0;
		totalFleetOwned = 0;
		totalStreetOwned = 0;
		
		streetBlue = new Boolean[STREET_TOTAL_BLUE];
		streetGreen = new Boolean[STREET_TOTAL_GREEN];
		streetGrey = new Boolean[STREET_TOTAL_GREY];
		streetPink = new Boolean[STREET_TOTAL_PINK];
		streetPurple = new Boolean[STREET_TOTAL_PURPLE];
		streetRed = new Boolean[STREET_TOTAL_RED];
		streetWhite = new Boolean[STREET_TOTAL_WHITE];
		streetYellow = new Boolean[STREET_TOTAL_YELLOW];
	}
	
	/*
	 * SETTERS
	 */
	
	public void setTotalBreweryOwned(int number) {
		totalBreweryOwned += number;
	}
	
	public void setTotalFleetOwned(int number) {
		totalFleetOwned += number;
	}
	
	
	public void setTotalStreetOwned(int number) {
			totalStreetOwned += number;
	}
	
	public void setStreetBlueOwned(int blueNumber, Boolean bool) {
		if (bool == true) {
			streetBlue[blueNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetBlue[blueNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	public void setStreetGreenOwned(int greenNumber, Boolean bool) {
		if (bool == true) {
			streetGreen[greenNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetGreen[greenNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	public void setStreetGreyOwned(int greyNumber, Boolean bool) {
		if (bool == true) {
			streetGrey[greyNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetGrey[greyNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	public void setStreetPinkOwned(int pinkNumber, Boolean bool) {
		if (bool == true) {
			streetPink[pinkNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetPink[pinkNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool) {
		if (bool == true) {
			streetPurple[purpleNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetPurple[purpleNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	public void setStreetRedOwned(int redNumber, Boolean bool) {
		if (bool == true) {
			streetRed[redNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetRed[redNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool) {
		if (bool == true) {
			streetWhite[whiteNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetWhite[whiteNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	public void setStreetYellowOwned(int yellowNumber, Boolean bool) {
		if (bool == true) {
			streetYellow[yellowNumber-1] = bool;
			totalStreetOwned ++;
		}
		else {
			streetYellow[yellowNumber-1] = bool;
			totalStreetOwned --;
		}
		
	}
	
	
	
	/*
	 * GETTERS
	 */
	
	
	public int getTotalBreweryOwned() {
		return totalBreweryOwned;
	}
	
	public int getTotalFleetOwned() {
		return totalFleetOwned;
	}
	
	public int getTotalStreetOwned() {
		return totalStreetOwned;
		
	}
	
	
	
}
