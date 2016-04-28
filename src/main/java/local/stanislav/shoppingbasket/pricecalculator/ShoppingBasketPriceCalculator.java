package local.stanislav.shoppingbasket.pricecalculator;

import local.stanislav.shoppingbasket.ShoppingBasket;

public interface ShoppingBasketPriceCalculator {

	double calculateTotalPrice(ShoppingBasket basket);
	
}
