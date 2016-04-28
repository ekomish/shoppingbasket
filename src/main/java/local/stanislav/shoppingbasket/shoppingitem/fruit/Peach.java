package local.stanislav.shoppingbasket.shoppingitem.fruit;

public class Peach extends AbstractFruit {
	
	Peach(String name, double price) {
		super(name, price);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}
		
		if(!(other instanceof Peach)) {
			return false;
		}
		
		Peach otherPeach = (Peach) other;
		
		return getName().equals(otherPeach.getPrice()) 
				&& getPrice() == otherPeach.getPrice();
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
