package entity;

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
	
	public PlayerOwned() {
		
		totalBreweryOwned = 0;
		totalFleetOwned = 0;
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
	 *SETTERS
	 *
	 *<-- All setters work like written on the next lines. Please read. -->
	 * 
	 *Calling the method like this "setBreweryOwned(1, true)" will give
	 * the value true on the first brewery field for the user and increment totalBreweryOwned.
	 * Doing so will let us know if player owns it or not. 
	 * Calling "setBreweryOwned(1, false)" will set the value false on the first field
	 * letting us know the player is not owning the field anymore and decrement totalBreweryOwned.
	 */
	
	
	
	public void setBreweryOwned(int breweryNumber, Boolean bool) {
		if (bool == true) {
			brewery[breweryNumber-1] = bool;
			totalBreweryOwned ++;
		}
		else {
			brewery[breweryNumber-1] = bool;
			totalBreweryOwned --;
		}
		
	}
	
	
	public void setFleetOwned(int fleetNumber, Boolean bool) {
		if (bool == true) {
			fleet[fleetNumber-1] = bool;
			totalFleetOwned ++;
		}
		else {
			fleet[fleetNumber-1] = bool;
			totalFleetOwned --;
		}
		
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
	
	
	
	/* GETTERS
	 * 
	 * Calling the method "getFleetOwned(2)" either gives true or false 
	 * on the second fleet field that is on the board.
	 * 
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
	
	
	public Boolean getBreweryOwned(int breweryNumber) {
		return brewery[breweryNumber-1];
	}
	public Boolean getFleetOwned(int fleetNumber) {
		return fleet[fleetNumber-1];
	}
	public Boolean getStreetBlueOwned(int blueNumber) {
		return streetBlue[blueNumber-1];
	}
	public Boolean getStreetGreenOwned(int greenNumber) {
		return streetGreen[greenNumber-1];
	}
	public Boolean getStreetGreyOwned(int greyNumber) {
		return streetGrey[greyNumber-1];
	}
	public Boolean getStreetPinkOwned(int pinkNumber) {
		return streetPink[pinkNumber-1];
	}
	public Boolean getStreetPurpleOwned(int purpleNumber) {
		return streetPurple[purpleNumber-1];
	}
	public Boolean getStreetRedOwned(int redNumber) {
		return streetRed[redNumber-1];
	}
	public Boolean getStreetWhiteOwned(int whiteNumber) {
		return streetWhite[whiteNumber-1];
	}
	public Boolean getStreetYellowOwned(int yellowNumber) {
		return streetYellow[yellowNumber-1];
	}
}
