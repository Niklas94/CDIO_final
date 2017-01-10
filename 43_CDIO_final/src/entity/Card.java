package entity;

import java.lang.reflect.Array;

public abstract class Card {

	private int id;
	private String description;
	
	public abstract int useCard();
	
	//Set the id of the specific card. 
	public void setId(int id) {
		this.id = id; //+1 because index =/= id
	}
	
	//Get the id of the specific card - only makes sense, when using through the CardManagement array of cards.
	public int getId() {
		return this.id;
	}
	
	//Set Description of the card
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Return description of the specific card
	public String getDescription() {
		return this.description;
	}
}
