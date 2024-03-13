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
	}

	public void printListOfToppingsByPizzaOrderID(int orderID) {
		for (int i = 0; i <pizzaOrderList.size(); i++) { //increments thru list to find matching id pizza
			if (pizzaOrderList.get(i).pizzaOrderID == orderID) { 
				System.out.println(pizzaOrderList.get(i).getToppingList()); //prints list of toppings
			}
		}
	}
	
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		pizzaOrderList.
		//increment thru list till toppings match (returns false) or list ends
		//list ends, adds topping and updates price before returning true
	}
	
	public boolean isThereAnyUncookedPizza() {
		//increment thru pizza order list checking cook strat, return true if any are uncooked 
		//false if all cooked
	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		
	}

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}