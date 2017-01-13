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

	public String[] squares = new String[40];
	public Field[] guiField = new Field[40];
	public Square[] logicField = new Square[40];
	private BoardManagement bm;

	public Board(BoardManagement bm){
		this.bm = bm;		
	}

	public Ownable getOwnableSquare(int id){
		Ownable o = (Ownable) logicField[id];
		return o;
	}

	public Square getSquare(int id) {
		return logicField[id];
	}

	public void createBoard(CardManagement cm, Dicecup cup) {
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
					createBrewery(values, index, cup);
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
					createChance(index, cm);
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

			//		} catch (FileNotFoundException e) { // Remember to uncomment the import as well
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

		logicField[index] = new entity.Start(index + 1, title, bm);

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

		int price = Integer.parseInt(subText.split(":")[1].trim());
		int rentForLogic = Integer.parseInt(rent.split(":")[1].trim());
		logicField[index] = new entity.Street(index + 1, title, price, rentForLogic, bm);

	}

	public void createBrewery(String[] values, int index, Dicecup cup){
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
		logicField[index] = new entity.Brewery(index + 1, title, price, bm, cup);


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

		int price = Integer.parseInt(subText.split(":")[1].trim());
		int rentForLogic = Integer.parseInt(rent.split(":")[1].trim());
		logicField[index] = new entity.Fleet(index + 1, title, price, rentForLogic, bm);

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

		logicField[index] = new entity.BankParking(index + 1, title, bm);

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

		logicField[index] = new entity.Prison(index + 1, title, bm);

	}

	public void createChance(int index, CardManagement cm){
		guiField[index] = new Chance.Builder().build();
		logicField[index] = new entity.Chance(index, cm, "Chance", bm);

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

		logicField[index] = new entity.Prison(index + 1, title, bm);

	}

	public String getValue(String reference, String[] values){
		for(String a : values){
			if(a.split("::")[0].equalsIgnoreCase(reference)){
				return a.split("::")[1];
			}
		}
		System.out.println("Can't find value for: " + reference);
		return null;
	}

	public Color getColor(String color){
		int r = Integer.parseInt(color.split(",,")[0]);
		int g = Integer.parseInt(color.split(",,")[1]);
		int b = Integer.parseInt(color.split(",,")[2]);
		return new Color(r, g, b);
	}

}
