package local.stanislav.shoppingbasket.shoppingitem.fruit;

import local.stanislav.shoppingbasket.shoppingitem.ShoppingItem;

public abstract class AbstractFruit implements ShoppingItem {

	private final String name;
	private final double price;
	
	public AbstractFruit(String name, double price) {
		if(name == null || price < 0){
			throw new IllegalArgumentException(String.format("Illegal name(%s) or price(%f)", name, price));
		}
		
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name+":"+price;
	}
	
}
