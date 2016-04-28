package local.stanislav.shoppingbasket.shoppingitem.fruit;

public class Lemon extends AbstractFruit {

	Lemon(String name, double price) {
		super(name, price);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}
		
		if(!(other instanceof Lemon)) {
			return false;
		}
		
		Lemon otherLemon= (Lemon) other;
		
		return getName().equals(otherLemon.getPrice()) 
				&& getPrice() == otherLemon.getPrice();
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
