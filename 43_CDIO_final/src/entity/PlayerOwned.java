package entity;


/*
 * This Class is for the player to find out how many fields it is owning.
 * In this class there will be no pricing for the rent or anything.
 * There will be arrays for the different street types of colors that are represented in the game.
 * A player will then know which one of the field in the same color type it is owning. 
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
	
	private int breweryOwned;
	private int fleetOwned;
	private int streetOwned;
	
	
	public PlayerOwned() {
		
		breweryOwned = 0;
		fleetOwned = 0;
		streetOwned = 0;
	}
	
	
	
	
	
	
	
	
	
}
