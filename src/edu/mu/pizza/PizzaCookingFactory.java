package edu.mu.pizza;

public class PizzaCookingFactory {
	// # TODO: make this method after the pizza classes are done
	public AbstractPizza createPizza(PizzaType pizzaType) {
		switch(pizzaType) {
		case HAWAIIAN:
			HawaiianPizza pizza = new HawaiianPizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
		case MARGHERITA:
			MargheritaPizza pizza = new MargheritaPizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
		case SUPREME:
			SupremePizza pizza = new SupremePizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
		case VEGETARIAN:
			VegetarianPizza pizza = new VegetarianPizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			
		default:
				break;
		}
		return null;
	}
}
