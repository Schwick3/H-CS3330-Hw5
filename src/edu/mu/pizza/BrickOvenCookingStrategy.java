package edu.mu.pizza;

public class BrickOvenCookingStrategy implements ICookingStrategy{
	private final double cPrice = 10;
	@Override
	public boolean cook(AbstractPizza pizza) {
		
		try {
			pizza.cookingPrice = cPrice;
			pizza.cookingStrategy = this;
			pizza.totalPrice += pizza.cookingPrice;
			return true;
		}
	
		
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
}
}
