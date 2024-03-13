package edu.mu.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingstrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		for (int i = 0; i < pizzaOrderList.size();i++) {
			if(pizzaOrderList.get(i).pizzaOrderID==orderID) {
				return pizzaOrderList.get(i);
			}
		}
		return null;
	}

	public void printListOfToppingsByPizzaOrderID(int orderID) {
		for (int i = 0; i <pizzaOrderList.size(); i++) { //increments thru list to find matching id pizza
			if (pizzaOrderList.get(i).pizzaOrderID == orderID) { 
				System.out.println(pizzaOrderList.get(i).getToppingList()); //prints list of toppings
			}
		}
	}
	
	public boolean isThereAnyUncookedPizza() {
		for (int i = 0; i <pizzaOrderList.size(); i++) { //increments thru list
			if(pizzaOrderList.get(i).getCookingStrategy() == null){ //checking cook strat, return true if any are uncooked 
				return true; //pizza with unassigned strat found
			}
		}
		return false; //no pizzas without assigned strat
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}