package local.stanislav.shoppingbasket.shoppingitem.fruit;

public class Banana extends AbstractFruit {

	Banana(String name, double price) {
		super(name, price);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}
		
		if(!(other instanceof Banana)) {
			return false;
		}
		
		Banana otherBanana = (Banana) other;
		
		return getName().equals(otherBanana.getPrice()) 
				&& getPrice() == otherBanana.getPrice();
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
