package edu.mu.pizza;

public class PizzaCookingFactory {
	// # TODO: make this method after the pizza classes are done
	public AbstractPizza createPizza(PizzaType pizzaType) {
		AbstractPizza pizza; // declaring abstract pizza
		switch(pizzaType) { //switch that creates the pizza based upon the passed in type
		case HAWAIIAN:
			pizza = new HawaiianPizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return pizza;

		case MARGHERITA:
			pizza = new MargheritaPizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return pizza;

		case SUPREME:
			pizza = new SupremePizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return pizza;

		case VEGETARIAN:
			pizza = new VegetarianPizza();
			AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter() + 1);
			pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return pizza;

			
		default:
				break;
		}
		return null;
	}
}
