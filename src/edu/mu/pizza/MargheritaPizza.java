package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class MargheritaPizza extends AbstractPizza {


	public MargheritaPizza() {
		super();
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.TOMATO);
		this.setPriceWithoutToppings(2.50);
		this.setTotalPrice(this.addToppingToPrice(this.getPriceWithoutToppings()));
	}
	@Override
	protected double addToppingToPrice(double priceWithoutToppings) {
		Iterator<Toppings>topIterator = toppingList.iterator(); //iterator for the toppings list
		double totalPrice = priceWithoutToppings; 
		while(topIterator.hasNext()) {
			Toppings top = topIterator.next();
			totalPrice += top.getToppingPrice(); //adds the price of each topping to the total price
			
		}
		return totalPrice; // returns the total price
	}
	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
	
	
	
	
	

}
