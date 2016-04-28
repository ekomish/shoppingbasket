package local.stanislav.shoppingbasket.pricecalculator;

import org.junit.Before;
import org.junit.Test;

import local.stanislav.shoppingbasket.ShoppingBasket;
import local.stanislav.shoppingbasket.shoppingitem.ShoppingItem;
import local.stanislav.shoppingbasket.shoppingitem.fruit.FruitFactory;
import local.stanislav.shoppingbasket.shoppingitem.fruit.FruitType;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map; 

public class ShoppingBasketPriceCalculatorTest {
	
	private ShoppingBasketPriceCalculator priceCalculator;
	private static final double DELTA = 0.001;
	
	@Before
	public void setup() {
		priceCalculator = new ShoppingBasketPriceCalculatorImpl();
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerException() {
		//given
		ShoppingBasket basket = null;
		
		//when
		priceCalculator.calculateTotalPrice(basket);
		
		//then should throw exception
	}
	
	@Test
	public void shouldReturn0IfBasketIsEmpty() {
		//given
		ShoppingBasket basket = mock(ShoppingBasket.class);
		when(basket.getItems()).thenReturn(new HashMap<ShoppingItem, Integer>());
		
		//when
		double price = priceCalculator.calculateTotalPrice(basket);
		
		//then
		assertEquals(0, price, DELTA);
	}
	
	@Test
	public void shouldCalculateTotalPrice() {
		//given
		ShoppingBasket basket = mock(ShoppingBasket.class);
		ShoppingItem apple = FruitFactory.createFruit(FruitType.APPLE);
		ShoppingItem banana = FruitFactory.createFruit(FruitType.BANANA);
		ShoppingItem lemon = FruitFactory.createFruit(FruitType.LEMON);	
		ShoppingItem orange = FruitFactory.createFruit(FruitType.ORANGE);
		ShoppingItem peach = FruitFactory.createFruit(FruitType.PEACH);
		
		Map<ShoppingItem, Integer> map = new HashMap<>();
		map.put(apple, 1);
		map.put(banana, 2);
		map.put(lemon, 3);
		map.put(orange, 4);
		map.put(peach, 5);
		
		double expectedSum = FruitType.APPLE.getPrice() 
				+ FruitType.BANANA.getPrice() * 2
				+ FruitType.LEMON.getPrice() * 3
				+ FruitType.ORANGE.getPrice() * 4
				+ FruitType.PEACH.getPrice() * 5;
		
		when(basket.getItems()).thenReturn(map);
		
		//when
		double price = priceCalculator.calculateTotalPrice(basket);
		
		//then
		assertEquals(expectedSum, price, DELTA);
	}

}
