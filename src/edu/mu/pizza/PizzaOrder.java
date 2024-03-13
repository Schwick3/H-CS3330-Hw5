package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		if(getPizzaByOrderID(orderID).getToppingList().contains(topping)){
				return false; //pizza already has topping
			} else {
				getPizzaByOrderID(orderID).getToppingList().add(topping); //add topping
				getPizzaByOrderID(orderID).updatePizzaPrice(); //updates price
				return true; //returns true with added topping
				
			}
		}
	public PizzaOrder (PizzaCookingFactory pizzaFactory, List<AbstractPizza> pizzaOrderList) { // variable constructor
		this.pizzaFactory = pizzaFactory;
		this.pizzaOrderList = pizzaOrderList;
	}
	public PizzaOrder() { //default constructor
		pizzaOrderList = new ArrayList<AbstractPizza>();
		pizzaFactory = new PizzaCookingFactory();
	}
	public void printPizzaOrderCart (int orderID) {
		
		for (AbstractPizza pizza: pizzaOrderList) { //iterates through the pizza and prints each. 
			System.out.println(pizza);
		}
	}
	
	public boolean addPizzaToCart (PizzaType pizzatype) {
			
	
		try { // tries to create a pizza of the given type and add it to the pizza order
			AbstractPizza pizza = pizzaFactory.createPizza(pizzatype);
			
			pizzaOrderList.add(pizza);
			
			return true;
		}
		catch (Exception e) { // catches the exception if thrown and returns failure.
			e.printStackTrace();
			return false;
		}
			
	}
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		//This for loop goes through looking for the correct pizzaID
		for (AbstractPizza pizza: pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderID) {
				List<Toppings> toppings = pizza.getToppingList();
				Iterator<Toppings> iterator = toppings.iterator();
				//iterates through the toppings on the desired pizza.
				while (iterator.hasNext()) {
					Toppings top = iterator.next();
					if (top == topping) { // if the right topping is found it is removed. 
						iterator.remove();
						pizza.updatePizzaPrice();
						return true;
					}
					else { // else it returns false to and nothing is changed on the pizza.
						return false;
						
						
					}
				}
			}
		}
		
		
		
		return false;
		
	}
	
	public double checkout() throws Exception{
		double total = 0;
		if (isThereAnyUncookedPizza()) { // checks for uncooked pizzas before checking out. 
			throw new Exception("There are still pizzas to be cooked");
		}
		else {
			
			for (AbstractPizza pizza: pizzaOrderList) {
				total += pizza.getTotalPrice();
				// if the whole order is cooked, then the total is calculated and the price returned. 
				
			}
		}
		
		return total;
	}
		


	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}