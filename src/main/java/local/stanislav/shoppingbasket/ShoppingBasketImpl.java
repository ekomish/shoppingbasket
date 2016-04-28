package local.stanislav.shoppingbasket;

import java.util.HashMap;
import java.util.Map;

import local.stanislav.shoppingbasket.shoppingitem.ShoppingItem;

public class ShoppingBasketImpl implements ShoppingBasket {

	private final Map<ShoppingItem, Integer> map = new HashMap<>();
	
	@Override
	public synchronized Map<ShoppingItem, Integer> getItems() {
		return new HashMap<ShoppingItem, Integer>(map);
	}
	
	@Override
	public synchronized void addItem(ShoppingItem item) {
		checkNull(item);		
		
		Integer itemsInMap = map.get(item);
		if(itemsInMap == null){
			map.put(item, 1);
		}else{
			map.put(item, itemsInMap + 1);
		}
	}
	
	@Override
	public synchronized void removeItem(ShoppingItem item) {	
		checkNull(item);
		
		Integer itemsInMap = map.get(item);		
		if(itemsInMap > 1){
			map.put(item, itemsInMap - 1);			
		}else{
			map.remove(item);
		}
	}
	
	private void checkNull(ShoppingItem item){
		if(item == null){
			throw new NullPointerException("Item cannot be null");
		}
	}
	
	//Hidden iterator has to be protected by synchronization
	@Override
	public synchronized String toString() {
		return map.toString();
	}
	
}
