package local.stanislav.shoppingbasket.shoppingitem.fruit;

public class Apple extends AbstractFruit {

	Apple(String name, double price) {
		super(name, price);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}
		
		if(!(other instanceof Apple)) {
			return false;
		}
		
		Apple otherApple = (Apple) other;
		
		return getName().equals(otherApple.getPrice()) 
				&& getPrice() == otherApple.getPrice();
	}
	
	@Override
	public int hashCode() {
		int hashCode = 1;
		int prime = 31;
		
		hashCode = hashCode + getName().hashCode() * prime;
		hashCode = hashCode + (int) getPrice() * prime;
		
		return hashCode;
	}
}
