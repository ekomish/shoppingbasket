package local.stanislav.shoppingbasket;
 
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import local.stanislav.shoppingbasket.shoppingitem.fruit.Apple;
import local.stanislav.shoppingbasket.shoppingitem.fruit.Banana;
import local.stanislav.shoppingbasket.shoppingitem.fruit.Lemon;
import local.stanislav.shoppingbasket.shoppingitem.fruit.Orange;
import local.stanislav.shoppingbasket.shoppingitem.fruit.Peach;

public class ShoppingBasketImplTest {

	private ShoppingBasket basket;
	
	@Before
	public void setup() {
		basket = new ShoppingBasketImpl();
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerExceptionWhenRemovingNullItem() {
		//given basket
		
		//When
		basket.removeItem(null);
		
		//then should throw NullPointerException
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerExceptionWhenAddingNullItem() {
		//given basket
		
		//When
		basket.removeItem(null);
		
		//then should throw NullPointerException
	}
	
	@Test
	public void shouldAddItem() {
		//given		
		Apple apple = mock(Apple.class);
				
		//When
		basket.addItem(apple);
		
		//then
		assertEquals(Integer.valueOf(1), basket.getItems().get(apple));
	}
	
	@Test
	public void shouldRemoveItem() {
		//given
		Apple apple = mock(Apple.class);
		
		//When
		basket.addItem(apple);
		basket.addItem(apple);
		basket.removeItem(apple);
		
		//then
		assertEquals(Integer.valueOf(1), basket.getItems().get(apple));
	}
	
	@Test
	public void shouldRemoveLastItem() {
		//given	
		Apple apple = mock(Apple.class);
		
		//When
		basket.addItem(apple);
		basket.removeItem(apple);
		
		//then
		assertEquals(null, basket.getItems().get(apple));
	}
	
	@Test
	public void shouldReturnAddedItems(){
		//given	
		Apple apple = mock(Apple.class);
		Banana banana = mock(Banana.class);
		Lemon lemon = mock(Lemon.class);
		Orange orange = mock(Orange.class);
		Peach peach = mock(Peach.class);
		
		//When
		basket.addItem(apple);
		basket.addItem(apple);
		basket.addItem(banana);
		basket.addItem(lemon);
		basket.addItem(orange);
		basket.addItem(peach);
		basket.addItem(peach);
		basket.addItem(peach);
		
		//then
		assertEquals(Integer.valueOf(2), basket.getItems().get(apple));
		assertEquals(Integer.valueOf(1), basket.getItems().get(banana));
		assertEquals(Integer.valueOf(1), basket.getItems().get(lemon));
		assertEquals(Integer.valueOf(1), basket.getItems().get(orange));
		assertEquals(Integer.valueOf(3), basket.getItems().get(peach));
	}
}
