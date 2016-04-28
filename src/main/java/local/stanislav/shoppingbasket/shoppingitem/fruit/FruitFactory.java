package local.stanislav.shoppingbasket.shoppingitem.fruit;

import local.stanislav.shoppingbasket.shoppingitem.ShoppingItem;

public class FruitFactory {

	public static ShoppingItem createFruit(FruitType type) {		
			
		if(FruitType.APPLE == type){		
			return new Apple(type.getName(), type.getPrice());
			
		}else if(FruitType.BANANA == type){
			return new Banana(type.getName(), type.getPrice());
			
		}else if(FruitType.LEMON == type){
			return new Lemon(type.getName(), type.getPrice());
			
		}else if(FruitType.ORANGE == type){
			return new Orange(type.getName(), type.getPrice());
			
		}else if(FruitType.PEACH == type){
			return new Peach(type.getName(), type.getPrice());
			
		}else{
			throw new IllegalArgumentException("Fruit "+type+" cannot be created.");
		}
	}
	
}
