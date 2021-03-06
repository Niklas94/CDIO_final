package entity;

import desktop_fields.Brewery;
import desktop_fields.Chance;
import desktop_fields.Field;
import desktop_fields.Jail;
import desktop_fields.Refuge;
import desktop_fields.Shipping;
import desktop_fields.Start;
import desktop_fields.Street;
import desktop_fields.Tax;
import desktop_resources.GUI;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

import controller.BoardManagement;
//import java.io.FileNotFoundException;
import controller.CardManagement;
import java.awt.Color;

public class Board {


	private String[] squares;
	private Field[] guiField;
	private Square[] logicField;
	private Square[] backupField;


	/**
	 * This constructs the board.
	 */

	public Board(){
		squares =  new String[40];
		guiField = new Field[40];
		logicField = new Square[40];
	}

	/**
	 * @return returns the logicFields.
	 */

	public Square getLogicField(int id){
		return logicField[id];
	}
	
	/**
	 * Used to set a street to its default state if a player goes
	 * bankrupt and loses ownership of it.
	 * @param id the id for the field.
	 */
	
	public void replaceStreetField(int id) {
		this.logicField[id] = this.backupField[id];
	}
	
	/**
	 * Gets the array of the logical fields.
	 * @return returns the logical field array.
	 */
	
	public Square[] getLogicArr() {
		return logicField;
	}
	
	/**
	 * Sets the subtext of a field to display its owner when bought.
	 * @param owner the player buying the field.
	 * @param id the id of the field.
	 */
	
	public void setGuifieldOwner(String owner, int id){
		guiField[id].setSubText("Ejer: " + owner);
	}

	/**
	 * get the ownable squares.
	 * @param id id of the square id.
	 * @return returns the ligicField as ownable.
	 */

	public Ownable getOwnableSquare(int id){
		Ownable o = (Ownable) logicField[id];
		return o;
	}


	/**
	 * get the squares
	 * @param id id of the square.
	 * @return returns the logicField.
	 */

	public Square getSquare(int id) {
		return logicField[id];
	}


	/**
	 * creates the board.
	 * @param cm the controlling cardManagement.
	 * @param cup the diceCup.
	 * @param bm the controlling boardManagement.
	 */

	public void createBoard(CardManagement cm, Dicecup cup, BoardManagement bm) {
		FileReader file;
		try {
			file = new FileReader("Squares.txt");
			BufferedReader br = new BufferedReader(file);
			String str = br.readLine();
			int index = 0;

			for(int i = 0; i < squares.length ; i++){
				squares[i] = str;
				str = br.readLine();
			}
			br.close();

			for(int i = 0; i < squares.length; i++){
				String[] values = squares[i].split("--");

				switch(getValue("type", values)) {
				case "Start":
					createStart(values, index);
					index++;
					break;
				case "Street":
					createStreet(values, index, bm);
					index++;
					break;
				case "Brewery":
					createBrewery(values, index, cup, bm);
					index++;
					break;
				case "Fleet":
					createFleet(values, index, bm);
					index++;
					break;
				case "Parking":
					createParking(values, index, bm);
					index++;
					break;
				case "Jail":
					createJail(values, index, cup, cm, bm);
					index++;
					break;
				case "Chance":
					createChance(index, cm, bm);
					index++;
					break;
				case "Tax":
					createTax(values, index, bm);
					index++;
					break;
				default:
					break;
				}
				GUI.create(guiField);
			}

			//		} catch (FileNotFoundException e) { // Remember to uncomment the import as well
			//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		backupField = logicField;
	}

	/**
	 * creates the start.
	 * @param values the values.
	 * @param index the index.
	 */

	public void createStart(String[] values, int index){
		Color bgColor = getColor(getValue("backgroundColor", values));
		Color fgColor = getColor(getValue("foregroundColor", values));
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		guiField[index] = new Start.Builder()
				.setBgColor(bgColor)
				.setFgColor(fgColor)
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.build();

		logicField[index] = new entity.Start(index + 1, title, "Start");

	}

	/**
	 * creates the streets.
	 * @param values the values.
	 * @param index the index.
	 * @param bm the controlling boardManagement.
	 */

	public void createStreet(String[] values, int index, BoardManagement bm){
		String title = getValue("title", values);
		Color bgColor = getColor(getValue("backgroundColor", values));
		Color fgColor = getColor(getValue("foregroundColor", values));
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		String rent = getValue("rent", values);
		int housePrice = Integer.parseInt(getValue("housePrice", values));
		int house1Rent = Integer.parseInt(getValue("house1Rent", values));
		int house2Rent = Integer.parseInt(getValue("house2Rent", values));
		int house3Rent = Integer.parseInt(getValue("house3Rent", values));
		int house4Rent = Integer.parseInt(getValue("house4Rent", values));
		int hotelRent = Integer.parseInt(getValue("hotelRent", values));
		guiField[index] = new Street.Builder()
				.setTitle(title)
				.setBgColor(bgColor)
				.setFgColor(fgColor) 
				.setSubText(subText)
				.setDescription(description)
				.setRent(rent)
				.build();

		int price = Integer.parseInt(subText.split(":")[1].trim());
		int rentForLogic = Integer.parseInt(rent.split(":")[1].trim());
		switch (getValue("color", values)) {
		case "Blue":
			logicField[index] = new entity.StreetBlue(index + 1, title, price, rentForLogic, bm, "Blue", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "Green":
			logicField[index] = new entity.StreetGreen(index + 1, title, price, rentForLogic, bm, "Green", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "Grey":
			logicField[index] = new entity.StreetGrey(index + 1, title, price, rentForLogic, bm, "Grey", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "Pink":
			logicField[index] = new entity.StreetPink(index + 1, title, price, rentForLogic, bm, "Pink", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "Purple":
			logicField[index] = new entity.StreetPurple(index + 1, title, price, rentForLogic, bm, "Purple", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "Red":
			logicField[index] = new entity.StreetRed(index + 1, title, price, rentForLogic, bm, "Red", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "White":
			logicField[index] = new entity.StreetWhite(index + 1, title, price, rentForLogic, bm, "White", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "Yellow":
			logicField[index] = new entity.StreetYellow(index + 1, title, price, rentForLogic, bm, "Yellow", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		case "Orange":
			logicField[index] = new entity.StreetOrange(index + 1, title, price, rentForLogic, bm, "Orange", house1Rent, house2Rent, house3Rent, house4Rent, hotelRent, housePrice);
			break;
		default:
			break;
		}
		//		logicField[index] = new entity.Street(index + 1, title, price, rentForLogic, bm, "Street");
	}

	/**
	 * creates the Brewery.
	 * @param values the values.
	 * @param index the index.
	 * @param cup the diceCup.
	 * @param bm the controlling boardManagement.
	 */

	public void createBrewery(String[] values, int index, Dicecup cup, BoardManagement bm){
		String picture;
		String title = getValue("title", values);
		if(index == 28)
			picture = "cocacola.png";
		else
			picture = "tuborg.png";
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		String rent = getValue("rent", values);
		guiField[index] = new Brewery.Builder()
				.setPicture(picture)
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.setRent(rent)
				.build();

		int price = Integer.parseInt(subText.split(":")[1].trim());
		//		int rentForLogic = Integer.parseInt(rent.split(":")[1].trim());
		logicField[index] = new entity.Brewery(index + 1, title, price, bm, cup, "Brewery");


	}

	/**
	 * creates the Fleet.
	 * @param values the values.
	 * @param index the index.
	 * @param bm the controlling boardManagement.
	 */
	public void createFleet(String[] values, int index, BoardManagement bm){
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		String rent = getValue("rent", values);
		guiField[index] = new Shipping.Builder()
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.setRent(rent)
				.build();

		int price = Integer.parseInt(subText.split(":")[1].trim());
		int rentForLogic = Integer.parseInt(rent.split(":")[1].trim());
		logicField[index] = new entity.Fleet(index + 1, title, price, rentForLogic, bm, "Fleet");

	}

	/**
	 * creates the parking.
	 * @param values the values.
	 * @param index the index.
	 * @param bm the controlling boardManagement.
	 */

	public void createParking(String[] values, int index, BoardManagement bm){
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		guiField[index] = new Refuge.Builder()
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.build();

		logicField[index] = new entity.BankParking(index + 1, title, bm, "Parking");

	}

	/**
	 * creates the jail.
	 * @param values the values.
	 * @param index the inedx.
	 * @param cup the diceCup.
	 * @param cm the controlling cardManagement.
	 * @param bm the controlling boardManagement.
	 */

	public void createJail(String[] values, int index, Dicecup cup, CardManagement cm, BoardManagement bm){
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		guiField[index] = new Jail.Builder()
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.build();

		logicField[index] = new entity.Prison(index + 1, title, bm, cup, "Jail", cm);

	}

	/**
	 * creates the Chance.
	 * @param index the index.
	 * @param cm the controlling cardManagement.
	 * @param bm the controlling boardManagement.
	 */

	public void createChance(int index, CardManagement cm, BoardManagement bm){
		guiField[index] = new Chance.Builder().build();
		logicField[index] = new entity.Chance(index, cm, "Chance field", bm, "Chance");

	}

	/**
	 * creates the tax.
	 * @param values the values.
	 * @param index the inedx.
	 * @param bm the controlling boardManagement.
	 */
	public void createTax(String[] values, int index, BoardManagement bm){
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		guiField[index] = new Tax.Builder()
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.build();

		logicField[index] = new entity.Tax(index + 1, bm, "Tax field", "Tax");

	}

	/**
	 * gets the value
	 * @param reference the reference.
	 * @param values the values.
	 * @return returns after it splits.
	 */

	public String getValue(String reference, String[] values){
		for(String a : values){
			if(a.split("::")[0].equalsIgnoreCase(reference)){
				return a.split("::")[1];
			}
		}
		System.out.println("Can't find value for: " + reference);
		return null;
	}

	/**
	 * gets the color
	 * @param color the color.
	 * @return returns the color.
	 */

	public Color getColor(String color){
		int r = Integer.parseInt(color.split(",,")[0]);
		int g = Integer.parseInt(color.split(",,")[1]);
		int b = Integer.parseInt(color.split(",,")[2]);
		return new Color(r, g, b);
	}

}
