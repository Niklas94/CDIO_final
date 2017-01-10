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
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Board {

	public String[] squares = new String[40];
	public Field[] guiField = new Field[40];
	public Square[] logicField = new Square[40];

	public Board(){

	}

	public Square getOwnableSquare(int id){
		for(int i = 0; i < logicField.length; i++){
			if(logicField[i].getId() == id){
				if(logicField[i] instanceof Ownable){
					return logicField[i];
				}
			}
			
		}
		System.out.println("this square is not ownable.");
		return null;		
	}


	public void createBoard() {
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
					createStreet(values, index);
					index++;
					break;
				case "Brewery":
					createBrewery(values, index);
					index++;
					break;
				case "Fleet":
					createFleet(values, index);
					index++;
					break;
				case "Parking":
					createParking(values, index);
					index++;
					break;
				case "Jail":
					createJail(values, index);
					index++;
					break;
				case "Chance":
					createChance(index);
					index++;
					break;
				case "Tax":
					createTax(values, index);
					index++;
					break;
				default:
					break;
				}
				GUI.create(guiField);
			}

//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

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


	}

	public void createStreet(String[] values, int index){
		String title = getValue("title", values);
		Color bgColor = getColor(getValue("backgroundColor", values));
		Color fgColor = getColor(getValue("foregroundColor", values));
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		String rent = getValue("rent", values);
		guiField[index] = new Street.Builder()
				.setTitle(title)
				.setBgColor(bgColor)
				.setFgColor(fgColor) 
				.setSubText(subText)
				.setDescription(description)
				.setRent(rent)
				.build();
	}

	public void createBrewery(String[] values, int index){
		//String picture = getValue("picture", values);
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


	}

	public void createFleet(String[] values, int index){
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

	}

	public void createParking(String[] values, int index){
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		guiField[index] = new Refuge.Builder()
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.build();

	}

	public void createJail(String[] values, int index){
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		guiField[index] = new Jail.Builder()
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.build();
	}

	public void createChance(int index){
		guiField[index] = new Chance.Builder().build();

	}
	public void createTax(String[] values, int index){
		String title = getValue("title", values);
		String subText = getValue("subText", values);
		String description = getValue("description", values);
		guiField[index] = new Tax.Builder()
				.setTitle(title)
				.setSubText(subText)
				.setDescription(description)
				.build();
	}

	public String getValue(String refrence, String[] values){
		for(String a : values){
			if(a.split("::")[0].equalsIgnoreCase(refrence)){
				return a.split("::")[1];
			}
		}
		System.out.println("Can't find value for: " + refrence);
		return null;
	}

	public Color getColor(String color){
		int r = Integer.parseInt(color.split(",,")[0]);
		int g = Integer.parseInt(color.split(",,")[1]);
		int b = Integer.parseInt(color.split(",,")[2]);
		return new Color(r, g, b);
	}



}
