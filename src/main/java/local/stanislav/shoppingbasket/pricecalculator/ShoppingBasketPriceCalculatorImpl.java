package local.stanislav.shoppingbasket.pricecalculator;

import java.util.Map.Entry;

import local.stanislav.shoppingbasket.ShoppingBasket;
import local.stanislav.shoppingbasket.shoppingitem.ShoppingItem;

public class ShoppingBasketPriceCalculatorImpl implements ShoppingBasketPriceCalculator {

	@Override
	public double calculateTotalPrice(ShoppingBasket basket) {
		if(basket == null){
			throw new NullPointerException("Basket cannot be null");
		}
		
		double totalPrice = 0;
		for(Entry<ShoppingItem, Integer> entry : basket.getItems().entrySet()) {
			totalPrice += entry.getKey().getPrice() * entry.getValue();
		}
		
		return totalPrice;
	}
}
