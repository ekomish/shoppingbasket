package local.stanislav.shoppingbasket;

import java.util.Map;

import local.stanislav.shoppingbasket.shoppingitem.ShoppingItem;

public interface ShoppingBasket {

	Map<ShoppingItem, Integer> getItems();

	void addItem(ShoppingItem item);

	void removeItem(ShoppingItem item);

}