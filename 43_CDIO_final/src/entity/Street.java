package entity;

public class Street extends Ownable {

	public Street(String name, int price) {
		super(name,price);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return basevalue;
	}


}

