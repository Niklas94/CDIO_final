package entity;

import java.lang.reflect.Array;

public abstract class Card {

	private String description;
	private int id;
	
	public abstract void useCard(Player player);
	
	//Set id
	public void setId(int id) {
		this.id = id;
	}
	
	//Set Description of the card
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Get id
	public int getID() {
		return id;
	}
	
	//Return description of the specific card
	public String getDescription() {
		return this.description;
	}
}
