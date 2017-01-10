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
	
	private int totalHousesOwned;
	private int totalHousesOnStreetBlue;
	private int totalHousesOnStreetGreen;
	private int totalHousesOnStreetGrey;
	private int totalHousesOnStreetPink;
	private int totalHousesOnStreetPurple;
	private int totalHousesOnStreetRed;
	private int totalHousesOnStreetWhite;
	private int totalHousesOnStreetYellow;
	
	private int totalHotelsOwned;
	private int totalHotelOnStreetBlue;
	private int totalHotelOnStreetGreen;
	private int totalHotelOnStreetGrey;
	private int totalHotelOnStreetPink;
	private int totalHotelOnStreetPurple;
	private int totalHotelOnStreetRed;
	private int totalHotelOnStreetWhite;
	private int totalHotelOnStreetYellow;

	private Boolean[] brewery;
	private Boolean[] fleet;
	private Boolean[] streetOnBlue;
	private Boolean[] streetOnGreen;
	private Boolean[] streetOnGrey;
	private Boolean[] streetOnPink;
	private Boolean[] streetOnPurple;
	private Boolean[] streetOnRed;
	private Boolean[] streetOnWhite;
	private Boolean[] streetOnYellow;
	
	private int[] houseOnStreetBlue;
	private int[] houseOnStreetGreen;
	private int[] houseOnStreetGrey;
	private int[] houseOnStreetPink;
	private int[] houseOnStreetPurple;
	private int[] houseOnStreetRed;
	private int[] houseOnStreetWhite;
	private int[] houseOnStreetYellow;
	
	private int[] hotelOnStreetBlue;
	private int[] hotelOnStreetGreen;
	private int[] hotelOnStreetGrey;
	private int[] hotelOnStreetPink;
	private int[] hotelOnStreetPurple;
	private int[] hotelOnStreetRed;
	private int[] hotelOnStreetWhite;
	private int[] hotelOnStreetYellow;

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
		
		totalHousesOwned = 0;
		totalHousesOnStreetBlue = 0;
		totalHousesOnStreetGreen = 0;
		totalHousesOnStreetGrey= 0;
		totalHousesOnStreetPink= 0;
		totalHousesOnStreetPurple= 0;
		totalHousesOnStreetRed= 0;
		totalHousesOnStreetWhite= 0;
		totalHousesOnStreetYellow= 0;
		
		totalHotelsOwned = 0;
		totalHotelOnStreetBlue = 0;
		totalHotelOnStreetGreen = 0;
		totalHotelOnStreetGrey= 0;
		totalHotelOnStreetPink= 0;
		totalHotelOnStreetPurple= 0;
		totalHotelOnStreetRed= 0;
		totalHotelOnStreetWhite= 0;
		totalHotelOnStreetYellow= 0;

		// Initializes owned fields
		brewery = new Boolean[2];
		fleet = new Boolean[4];
		streetOnBlue = new Boolean[2];
		streetOnGreen = new Boolean[3];
		streetOnGrey = new Boolean[3];
		streetOnPink = new Boolean[3];
		streetOnPurple = new Boolean[2];
		streetOnRed = new Boolean[3];
		streetOnWhite = new Boolean[3];
		streetOnYellow = new Boolean[3];
		
		//Initializes owned houses array sizes
		houseOnStreetBlue = new int[2];
		houseOnStreetGreen = new int[3];
		houseOnStreetGrey = new int[3];
		houseOnStreetPink = new int[3];
		houseOnStreetPurple = new int[2];
		houseOnStreetRed = new int[3];
		houseOnStreetWhite = new int[3];
		houseOnStreetYellow = new int[3];
		
		hotelOnStreetBlue = new int[2];
		hotelOnStreetGreen = new int[3];
		hotelOnStreetGrey = new int[3];
		hotelOnStreetPink = new int[3];
		hotelOnStreetPurple = new int[2];
		hotelOnStreetRed = new int[3];
		hotelOnStreetWhite = new int[3];
		hotelOnStreetYellow = new int[3];

		//Initializes owned field arrays values to false
		Arrays.fill(brewery, false);
		Arrays.fill(fleet, false);
		Arrays.fill(streetOnBlue, false);
		Arrays.fill(streetOnGreen, false);
		Arrays.fill(streetOnGrey, false);
		Arrays.fill(streetOnPink, false);
		Arrays.fill(streetOnPurple, false);
		Arrays.fill(streetOnRed, false);
		Arrays.fill(streetOnWhite, false);
		Arrays.fill(streetOnYellow, false);
		
		//Initializes owned house arrays value to 0
		Arrays.fill(houseOnStreetBlue, 0);
		Arrays.fill(houseOnStreetGreen, 0);
		Arrays.fill(houseOnStreetGrey, 0);
		Arrays.fill(houseOnStreetPink, 0);
		Arrays.fill(houseOnStreetPurple, 0);
		Arrays.fill(houseOnStreetRed, 0);
		Arrays.fill(houseOnStreetWhite, 0);
		Arrays.fill(houseOnStreetYellow, 0);
		
		//Initializes owned hotel arrays value to 0
		Arrays.fill(hotelOnStreetBlue, 0);
		Arrays.fill(hotelOnStreetGreen, 0);
		Arrays.fill(hotelOnStreetGrey, 0);
		Arrays.fill(hotelOnStreetPink, 0);
		Arrays.fill(hotelOnStreetPurple, 0);
		Arrays.fill(hotelOnStreetRed, 0);
		Arrays.fill(hotelOnStreetWhite, 0);
		Arrays.fill(hotelOnStreetYellow, 0);

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

	
	/*
	 *Boolean VALUES on fields 
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
			streetOnBlue[blueNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetBlueOwned++;
		} else {
			streetOnBlue[blueNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetBlueOwned--;
		}

	}

	// Set the Green Street to owned or not by its number and a boolean value.
	public void setStreetGreenOwned(int greenNumber, Boolean bool) {
		if (bool == true) {
			streetOnGreen[greenNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetGreenOwned++;
		} else {
			streetOnGreen[greenNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetGreenOwned--;
		}

	}

	// Set the Grey Street to owned or not by its number and a boolean value.
	public void setStreetGreyOwned(int greyNumber, Boolean bool) {
		if (bool == true) {
			streetOnGrey[greyNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetGreyOwned++;
		} else {
			streetOnGrey[greyNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetGreyOwned--;
		}

	}

	// Set the Pink Street to owned or not by its number and a boolean value.
	public void setStreetPinkOwned(int pinkNumber, Boolean bool) {
		if (bool == true) {
			streetOnPink[pinkNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetPinkOwned++;
		} else {
			streetOnPink[pinkNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetPinkOwned--;
		}

	}

	// Set the Purple Street to owned or not by its number and a boolean value.
	public void setStreetPurpleOwned(int purpleNumber, Boolean bool) {
		if (bool == true) {
			streetOnPurple[purpleNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetPurpleOwned++;
		} else {
			streetOnPurple[purpleNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetPurpleOwned--;
		}

	}

	// Set the Red Street to owned or not by its number and a boolean value.
	public void setStreetRedOwned(int redNumber, Boolean bool) {
		if (bool == true) {
			streetOnRed[redNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetRedOwned++;
		} else {
			streetOnRed[redNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetRedOwned--;
		}

	}

	// Set the White Street to owned or not by its number and a boolean value.
	public void setStreetWhiteOwned(int whiteNumber, Boolean bool) {
		if (bool == true) {
			streetOnWhite[whiteNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetWhiteOwned++;
		} else {
			streetOnWhite[whiteNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetWhiteOwned--;
		}

	}

	// Set the Yellow Street to owned or not by its number and a boolean value.
	public void setStreetYellowOwned(int yellowNumber, Boolean bool) {
		if (bool == true) {
			streetOnYellow[yellowNumber - 1] = bool;
			totalStreetOwned++;
			totalStreetYellowOwned++;
		} else {
			streetOnYellow[yellowNumber - 1] = bool;
			totalStreetOwned--;
			totalStreetYellowOwned--;
		}

	}
	
	/*
	 * Int VALUES on HOUSES
	 */
	
	public void setHouseOnStreetBlue(int blueNumber, int houses) {
			houseOnStreetBlue[blueNumber - 1] = houses;
			totalHousesOwned = houses;
			totalHousesOnStreetBlue = houses;
	}
	
	public void setHouseOnStreetGreen(int greenNumber, int houses) {
		houseOnStreetGreen[greenNumber - 1] = houses;
		totalHousesOwned = houses;
		totalHousesOnStreetGreen = houses;
}

	public void setHouseOnStreetGrey(int greyNumber, int houses) {
		houseOnStreetGrey[greyNumber - 1] = houses;
		totalHousesOwned = houses;
		totalHousesOnStreetGrey = houses;
}
	
	public void setHouseOnStreetPink(int pinkNumber, int houses) {
		houseOnStreetPink[pinkNumber - 1] = houses;
		totalHousesOwned = houses;
		totalHousesOnStreetPink = houses;
}
	
	public void setHouseOnStreetPurple(int purpleNumber, int houses) {
		houseOnStreetPurple[purpleNumber - 1] = houses;
		totalHousesOwned = houses;
		totalHousesOnStreetPurple = houses;
}
	
	public void setHouseOnStreetRed(int redNumber, int houses) {
		houseOnStreetRed[redNumber - 1] = houses;
		totalHousesOwned = houses;
		totalHousesOnStreetRed = houses;
}

	public void setHouseOnStreetWhite(int whiteNumber, int houses) {
		houseOnStreetWhite[whiteNumber - 1] = houses;
		totalHousesOwned = houses;
		totalHousesOnStreetWhite = houses;
}
	public void setHouseOnStreetYellow(int yellowNumber, int houses) {
		houseOnStreetYellow[yellowNumber - 1] = houses;
		totalHousesOwned = houses;
		totalHousesOnStreetYellow = houses;
}
	
	/*
	 * Int VALUES on HOTELS
	 */
	
	public void setHotelOnStreetBlue(int blueNumber, int hotel) {
		houseOnStreetBlue[blueNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetBlue = hotel;
}
	public void setHotelOnStreetGreen(int greenNumber, int hotel) {
		houseOnStreetGreen[greenNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetGreen = hotel;
}
	
	public void setHotelOnStreetGrey(int greyNumber, int hotel) {
		houseOnStreetGrey[greyNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetGrey = hotel;
}
	
	public void setHotelOnStreetPink(int pinkNumber, int hotel) {
		houseOnStreetPink[pinkNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetPink = hotel;
}
	
	public void setHotelOnStreetPurple(int purpleNumber, int hotel) {
		houseOnStreetPurple[purpleNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetPurple = hotel;
}
	
	public void setHotelOnStreetRed(int redNumber, int hotel) {
		houseOnStreetRed[redNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetRed = hotel;
}
	
	public void setHotelOnStreetWhite(int whiteNumber, int hotel) {
		houseOnStreetWhite[whiteNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetWhite = hotel;
}
	
	public void setHotelOnStreetYellow(int yellowNumber, int hotel) {
		houseOnStreetYellow[yellowNumber - 1] = hotel;
		totalHotelsOwned = hotel;
		totalHotelOnStreetYellow = hotel;
}
	
	/*
	 * GETTERS
	 * 
	 * Calling the method "getFleetOwned(2)" either gives true or false on the
	 * second fleet field that is on the board.
	 * 
	 * 
	 */
	
	/*
	 * Int VALUES on totals
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
	
	/*
	 * Boolean VALUES on fields
	 */

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
		return streetOnBlue[blueNumber - 1];
	}

	// Get owned status on Green Street 1, 2 or 3
	public boolean getStreetGreenOwned(int greenNumber) {
		return streetOnGreen[greenNumber - 1];
	}

	// Get owned status on Grey Street 1, 2 or 3
	public boolean getStreetGreyOwned(int greyNumber) {
		return streetOnGrey[greyNumber - 1];
	}

	// Get owned status on Pink Street 1, 2 or 3
	public boolean getStreetPinkOwned(int pinkNumber) {
		return streetOnPink[pinkNumber - 1];
	}

	// Get owned status on Purple Street 1 or 2
	public boolean getStreetPurpleOwned(int purpleNumber) {
		return streetOnPurple[purpleNumber - 1];
	}

	// Get owned status on Red Street 1, 2 or 3
	public boolean getStreetRedOwned(int redNumber) {
		return streetOnRed[redNumber - 1];
	}

	// Get owned status on White Street 1, 2 or 3
	public boolean getStreetWhiteOwned(int whiteNumber) {
		return streetOnWhite[whiteNumber - 1];
	}

	// Get owned status on Yellow Street 1, 2 or 3
	public boolean getStreetYellowOwned(int yellowNumber) {
		return streetOnYellow[yellowNumber - 1];
	}

}
