package entity;

import desktop_resources.GUI;

public class Bank {

	Player[] players;


	public Bank(Player[] players) {
		this.players = players;
	}

	public void buyField(Player player, int price) {
		
		
	}

	public void payRent(Player player, Ownable o, int sum) {
		int rent = o.getRent();
		if(player.getBalance() < rent) {
			rent = player.getBalance();
			//player.makeBankrupt(); //Needs to be implemented in player class
		}
		else if(o instanceof Brewery)
			rent = 100 * sum;
		else if(o instanceof Fleet){
			rent = (int) (o.getRent() / (8 / Math.pow(2, (-1) + player.getTotalFleetOwned())));   // Needs to be fixed
		}
		player.updateBalance(-rent);
		System.out.println(player.getName() + " you just payed " + rent + " in rent on square " + o.getId());
		String name = o.getOwner();
		for(int i = 0; i < players.length; i++){
			if(players[i].getName() == name){
				players[i].updateBalance(rent);
				System.out.println(players[i].getName() + "you just recieved " + rent + " payed for rent on square " + o.getId());
			}
		}

		
	}

}





