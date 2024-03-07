package edu.mu.pizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy{
	private final double cPrice = 8;
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
