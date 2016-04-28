package local.stanislav.shoppingbasket.shoppingitem.fruit;

public class Orange extends AbstractFruit {

	Orange(String name, double price) {
		super(name, price);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}
		
		if(!(other instanceof Orange)) {
			return false;
		}
		
		Orange otherOrange= (Orange) other;
		
		return getName().equals(otherOrange.getPrice()) 
				&& getPrice() == otherOrange.getPrice();
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
