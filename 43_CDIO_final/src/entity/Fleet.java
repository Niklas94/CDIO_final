package entity;

public class Fleet extends Ownable {

	public Fleet(String name, int price) {
		super(name, price);
	
	}
@Override
public int getPrice() {
	
	return price*5;
}

@Override
public int getValue() {
	int count_of_fleet_owned_by_owner = 3; //Get value from bank in reality
	return basevalue*count_of_fleet_owned_by_owner;
}
		
}
