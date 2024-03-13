package edu.mu;

import java.util.ArrayList;
import java.util.List;

import edu.mu.pizza.*;

public class Main {

	public static void main(String[] args) {
		PizzaOrder order = new PizzaOrder();
		
		order.addPizzaToCart(PizzaType.VEGETARIAN); // adds new veggie pizza to cart
		order.addNewToppingToPizza(1, Toppings.PEPPERONI); //adds pepperoni to the first pizza for some reason
		order.printListOfToppingsByPizzaOrderID(1); //prints the toppings on the first pizza
		
		order.removeToppingFromPizza(1, Toppings.PEPPERONI); //removes the pepperoni from the veggie pizza, it doesnt belong there
		order.printListOfToppingsByPizzaOrderID(1); //prints the toppings of the first pizza again

		order.selectCookingStrategyByPizzaOrderId(1, new MicrowaveCookingStrategy()); //mm microwave pizza
		
		order.printPizzaOrderCart(); //prints the current cart
		
		System.out.println("Price of pizzas: " + order.checkout()); //checks the price of the current pizzas
		
		order.addPizzaToCart(PizzaType.MARGHERITA); //adds a new Margherita pizza
		order.selectCookingStrategyByPizzaOrderId(2, new BrickOvenCookingStrategy()); //nice, a brick oven
		
		order.printPizzaOrderCart(); //prints the cart again
		
		System.out.println("Price of pizzas: " + order.checkout()); //checks out with both pizzas



	}

}
