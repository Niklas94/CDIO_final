package entity;

import java.lang.reflect.Array;

public abstract class Card {

	private String description;
	
	public abstract void useCard(Player player);
	
	//Set Description of the card
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Return description of the specific card
	public String getDescription() {
		return this.description;
	}
}
