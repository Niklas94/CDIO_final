package entity;

import java.lang.reflect.Array;
import java.util.Arrays;

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

	private int totalBreweryOwned;
	private int totalFleetOwned;
	private int totalStreetOwned;
	private int totalStreetBlueOwned;
	private int totalStreetGreenOwned;
	private int totalStreetGreyOwned;
	private int totalStreetPinkOwned;
	private int totalStreetPurpleOwned;
	private int totalStreetRedOwned;
	private int totalStreetWhiteOwned;
	private int totalStreetYellowOwned;

	private Boolean[] brewery;
	private Boolean[] fleet;
	private Boolean[] streetBlue;
	private Boolean[] streetGreen;
	private Boolean[] streetGrey;
	private Boolean[] streetPink;
	private Boolean[] streetPurple;
	private Boolean[] streetRed;
	private Boolean[] streetWhite;
	private Boolean[] streetYellow;

	/*
	 * Constructor 
	 */
	
	public PlayerOwned() {

		totalBreweryOwned = 0;
		totalFleetOwned = 0;		
		totalStreetBlueOwned = 0;
		totalStreetGreenOwned = 0;
		totalStreetGreyOwned = 0;
		totalStreetPinkOwned = 0;
		totalStreetPurpleOwned = 0;
		totalStreetRedOwned = 0;
		totalStreetWhiteOwned = 0;
		totalStreetYellowOwned = 0;
		totalStreetOwned = 0;

		brewery = new Boolean[2];
		fleet = new Boolean[4];
		streetBlue = new Boolean[2];
		streetGreen = new Boolean[3];
		streetGrey = new Boolean[3];
		streetPink = new Boolean[3];
		streetPurple = new Boolean[2];
		streetRed = new Boolean[3];
		streetWhite = new Boolean[3];
		streetYellow = new Boolean[3];
		
		
		

		Arrays.fill(brewery, false);
		Arrays.fill(fleet, false);
		Arrays.fill(streetBlue, false);
		Arrays.fill(streetGreen, false);
		Arrays.fill(streetGrey, false);
		Arrays.fill(streetPink, false);
		Arrays.fill(streetPurple, false);
		Arrays.fill(streetRed, false);
		Arrays.fill(streetWhite, false);
		Arrays.fill(streetYellow, false);

	}

	/*
	 * SETTERS
	 *
	 * <-- All setters work like written on the next lines. Please read. -->
	 * 
	 * Calling the method like this "setBreweryOwned(1, true)" will give the
	 * value true on the first brewery field for the user and increment
	 * totalBreweryOwned. Doing so will let us know if player owns it or not.
	 * Calling "setBreweryOwned(1, false)" will set the value false on the first
	 * field letting us know the player is not owning the field anymore and
	 * decrement totalBreweryOwned. Remember, these numbers does not correspond
	 * to the field numbers on the board. The numbers means if there are 3
	 * fields of Green colored Street fields, then the first one is 1, second 2
	 * etc.
	 */

	// Set the Brewery to owned or not by its number and a boolean value.
	public void setBreweryOwned(int breweryNumber, Boolean bool) {
		if (bool == true) {
			brewery[breweryNumber - 1] = bool;
			totalBreweryOwned++;
		} else {
			brewery[breweryNumber - 1] = bool;
			totalBreweryOwned--;
		}

	}

	// Set the Fleet to owned or not by its number and a boolean value.
	public void setFleetOwned(int fleetNumber, Boolean bool) {
		if (bool == true) {
			fleet[fleetNumber - 1] = bool;
			totalFleetOwned++;
		} else {
			fleet[fleetNumber - 1] = bool;
			totalFleetOwned--;
		}

	}

	// Set the Blue Street to owned or not by its number and a boolean value.
	public void setStreetBlueOwned(int blueNumber, Boolean bool) {
		if (bool == true) {
			streetBlue[blueNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetBlueOwned++;
		} else {
			streetBlue[blueNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetBlueOwned--;
		}

	}

	// Set the Green Street to owned or not by its number and a boolean value.
	public void setStreetGreenOwned(int greenNumber, Boolean bool) {
		if (bool == true) {
			streetGreen[greenNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetGreenOwned++;
		} else {
			streetGreen[greenNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetGreenOwned--;
		}

	}

	// Set the Grey Street to owned or not by its number and a boolean value.
	public void setStreetGreyOwned(int greyNumber, Boolean bool) {
		if (bool == true) {
			streetGrey[greyNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetGreyOwned++;
		} else {
			streetGrey[greyNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetGreyOwned--;
		}

	}

	// Set the Pink Street to owned or not by its number and a boolean value.
	public void setStreetPinkOwned(int pinkNumber, Boolean bool) {
		if (bool == true) {
			streetPink[pinkNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetPinkOwned++;
		} else {
			streetPink[pinkNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetPinkOwned--;
		}

	}

	// Set the Purple Street to owned or not by its number and a boolean value.
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool) {
		if (bool == true) {
			streetPurple[purpleNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetPurpleOwned++;
		} else {
			streetPurple[purpleNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetPurpleOwned--;
		}

	}

	// Set the Red Street to owned or not by its number and a boolean value.
	public void setStreetRedOwned(int redNumber, Boolean bool) {
		if (bool == true) {
			streetRed[redNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetRedOwned++;
		} else {
			streetRed[redNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetRedOwned--;
		}

	}

	// Set the White Street to owned or not by its number and a boolean value.
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool) {
		if (bool == true) {
			streetWhite[whiteNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetWhiteOwned++;
		} else {
			streetWhite[whiteNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetWhiteOwned--;
		}

	}

	// Set the Yellow Street to owned or not by its number and a boolean value.
	public void setStreetYellowOwned(int yellowNumber, Boolean bool) {
		if (bool == true) {
			streetYellow[yellowNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetYellowOwned++;
		} else {
			streetYellow[yellowNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetYellowOwned--;
		}

	}

	/*
	 * GETTERS
	 * 
	 * Calling the method "getFleetOwned(2)" either gives true or false on the
	 * second fleet field that is on the board.
	 * 
	 * 
	 */

	// Get total owned Brewery
	public int getTotalBreweryOwned() {
		return totalBreweryOwned;
	}

	// Get total owned Fleet
	public int getTotalFleetOwned() {
		return totalFleetOwned;
	}

	// Get total owned Streets (ALL)
	public int getTotalStreetOwned() {
		return totalStreetOwned;

	}

	// Get total owned Blue Streets
	public int getTotalStreetBlueOwned() {
		return totalStreetBlueOwned;
	}

	// Get total owned Green Streets
	public int getTotalStreetGreenOwned() {
		return totalStreetGreenOwned;
	}

	// Get total owned Grey Streets
	public int getTotalStreetGreyOwned() {
		return totalStreetGreyOwned;
	}

	// Get total owned Pink Streets
	public int getTotalStreetPinkOwned() {
		return totalStreetPinkOwned;
	}

	// Get total owned Purple Streets
	public int getTotalStreetPurpleOwned() {
		return totalStreetPurpleOwned;
	}

	// Get total owned Red Streets
	public int getTotalStreetRedOwned() {
		return totalStreetRedOwned;
	}

	// Get total owned White Streets
	public int getTotalStreetWhiteOwned() {
		return totalStreetWhiteOwned;
	}

	// Get total owned Yellow Streets
	public int getTotalStreetYellowOwned() {
		return totalStreetYellowOwned;
	}
	// Get owned status on Brewery 1 or 2
	public boolean getBreweryOwned(int breweryNumber) {
		return brewery[breweryNumber - 1];
	}
	// Get owned status on Fleet 1, 2, 3 or 4
	public boolean getFleetOwned(int fleetNumber) {
		return fleet[fleetNumber - 1];
	}
	// Get owned status on Blue Street 1 or 2
	public boolean getStreetBlueOwned(int blueNumber) {
		return streetBlue[blueNumber - 1];
	}
	// Get owned status on Green Street 1, 2 or 3
	public boolean getStreetGreenOwned(int greenNumber) {
		return streetGreen[greenNumber - 1];
	}
	// Get owned status on Grey Street 1, 2 or 3
	public boolean getStreetGreyOwned(int greyNumber) {
		return streetGrey[greyNumber - 1];
	}
	// Get owned status on Pink Street 1, 2 or 3
	public boolean getStreetPinkOwned(int pinkNumber) {
		return streetPink[pinkNumber - 1];
	}
	// Get owned status on Purple Street 1 or 2
	public boolean getStreetPurpleOwned(int purpleNumber) {
		return streetPurple[purpleNumber - 1];
	}
	// Get owned status on Red Street 1, 2 or 3
	public boolean getStreetRedOwned(int redNumber) {
		return streetRed[redNumber - 1];
	}
	// Get owned status on White Street 1, 2 or 3
	public boolean getStreetWhiteOwned(int whiteNumber) {
		return streetWhite[whiteNumber - 1];
	}
	// Get owned status on Yellow Street 1, 2 or 3
	public boolean getStreetYellowOwned(int yellowNumber) {
		return streetYellow[yellowNumber - 1];
	}

}
