package local.stanislav.shoppingbasket.shoppingitem.fruit;

public enum FruitType {
	
	APPLE("Apple", 5.5),
	BANANA("Banana", 6.6),
	LEMON("Lemon", 7.7),
	ORANGE("Orange", 8.8),
	PEACH("Peach", 9.9);
	
	private final String name;
	private final double price;
	
	FruitType(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
}
