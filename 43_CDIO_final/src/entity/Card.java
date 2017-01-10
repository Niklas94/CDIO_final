package entity;

import java.lang.reflect.Array;

public abstract class Card {

	private int id;
	private String description;
	
	public abstract int useCard();
	
	//Set Description of the card
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Return description of the specific card
	public String getDescription() {
		return this.description;
	}
}
