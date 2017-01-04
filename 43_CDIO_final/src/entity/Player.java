package entity;


import entity.Account;
import entity.Ownable;
import desktop_codebehind.Car;
import desktop_resources.GUI;


public class Player {

	//Variabler
	private String name; //Instans variabel
	private Account myAccount;
	private int BreweryOwned, fleetOwned, position;
	private boolean isAlive = true;
	private int sum;
	
	//Konstruktør
	public Player(String name) {

		this.name = name;
		myAccount = new Account();
		this.position = 0;
				
	}

	//Inkrementer antal fleet owned
	public void updateFleetOwned() {
		this.fleetOwned++;
	}

	//getter
	public int getFleetOwned(){ //Getter metode pÃ¥ fleetOwned, for at se hvor mange fleet en spiller har 
		return fleetOwned;
	}

	//Inkrementer antal brewery owned
	public void updateBreweryOwned() {
		BreweryOwned++;
	}
	
	public int getBreweryOwned() {
		return BreweryOwned++;
	}
	
	public void checkIfBankrupt() {
		if (this.myAccount.getMoney() <= 0)
			isAlive = false;
		else
			isAlive = true;
	}
	

	public String getName() {
		return name;
	}

	public void updateBalance(int money) {
		this.myAccount.updateBalance(money);
	}

	public void addField(int id) {

	}

	public Account getMyAccount() {
		return myAccount;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void removeOwnership(Board board) {
		for (int i = 1; i < board.getSize() + 1; i++) {
			if (board.getFelt(i) instanceof Ownable) {
				Ownable f = (Ownable)board.getFelt(i);
				if (f.getOwner() == this) {
					f.removeOwner();
				}
			}
		}
		
		
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public void setSum(int sum){
		this.sum = sum;
	}
	
	public int getSum(){
		return this.sum;
	}

}

