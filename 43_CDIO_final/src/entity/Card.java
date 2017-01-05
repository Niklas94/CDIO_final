package entity;

import java.lang.reflect.Array;

public class Card {

	private int id, value;
	private String description;
	private boolean ownable = false;
	
	public void setId(int id) {
		this.id = id;
	}
	
	//Set Description of the card
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Set Value
	public void setValue(int value) {
		this.value = value;
	}
	
	//Get Value
	public int getValue() {
		return value;
	}
	
	//Set if ownable
	public void isOwnable() {
		this.ownable = true;
	}
	
	//Used to check if the specific card is ownable
	public boolean isItOwnable() {
		return ownable;
	}
	
}
