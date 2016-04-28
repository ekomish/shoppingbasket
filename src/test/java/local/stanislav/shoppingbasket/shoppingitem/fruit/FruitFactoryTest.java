package local.stanislav.shoppingbasket.shoppingitem.fruit;

import org.junit.Test;
import static org.junit.Assert.*;

import local.stanislav.shoppingbasket.shoppingitem.ShoppingItem;

public class FruitFactoryTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentException() {
		//given FruitFactory
		
		//when
		FruitFactory.createFruit(null);
		
		//then should throw IllegalArgumentException
	}
	
	@Test
	public void shouldCreateApple() {
		//given FruitFactory
		
		//when
		ShoppingItem item = FruitFactory.createFruit(FruitType.APPLE);
		
		//then
		assertTrue(item instanceof Apple);
	}
	
	@Test
	public void shouldCreateBanana() {
		//given FruitFactory
		
		//when
		ShoppingItem item = FruitFactory.createFruit(FruitType.BANANA);
		
		//then
		assertTrue(item instanceof Banana);
	}
	
	@Test
	public void shouldCreateLemon() {
		//given FruitFactory
		
		//when
		ShoppingItem item = FruitFactory.createFruit(FruitType.LEMON);
		
		//then
		assertTrue(item instanceof Lemon);
	}
	
	@Test
	public void shouldCreateOrange() {
		//given FruitFactory
		
		//when
		ShoppingItem item = FruitFactory.createFruit(FruitType.ORANGE);
		
		//then
		assertTrue(item instanceof Orange);
	}
	
	@Test
	public void shouldCreatePeach() {
		//given FruitFactory
		
		//when
		ShoppingItem item = FruitFactory.createFruit(FruitType.PEACH);
		
		//then
		assertTrue(item instanceof Peach);
	}

}
