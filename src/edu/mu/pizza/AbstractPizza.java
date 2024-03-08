package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractPizza {
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	
	//constructor
	public AbstractPizza(ArrayList<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID, int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice ) {
		this.toppingList = toppingList;
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = totalPrice;
		this.pizzaOrderID = pizzaOrderID;
		this.orderIDCounter = orderIDCounter;
		this.cookingStrategy = cookingStrategy;
		this.cookingPrice = cookingPrice;
		
	}

	
	
	//getters/setters
	public List<Toppings> getToppingList() {
		return toppingList;
	}
	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}
	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}
	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}
	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}
	public double getCookingPrice() {
		return cookingPrice;
	}
	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	protected double addToppingToPrice(double priceWithoutToppings) {
		Iterator<Toppings>topIterator = toppingList.iterator();
		double totalPrice = priceWithoutToppings;
		while(topIterator.hasNext()) {
			Toppings top = topIterator.next();
			totalPrice += top.getToppingPrice();
			
		}
		return totalPrice;
	}
	public double updatePizzaPrice() {
		Iterator<Toppings>topIterator = this.toppingList.iterator();
		double totalPrice = this.priceWithoutToppings;
		while(topIterator.hasNext()) {
			Toppings top = topIterator.next();
			totalPrice += top.getToppingPrice();
			
		}
		return totalPrice;
	}
	
	

}
