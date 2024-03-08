package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class MargheritaPizza extends AbstractPizza {

	public MargheritaPizza(ArrayList<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID, int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, totalPrice, pizzaOrderID, orderIDCounter, orderIDCounter, cookingStrategy, cookingPrice);
		this.totalPrice = addToppingToPrice(this.priceWithoutToppings = 2.5);
		
		
		
	}
	@Override
	protected double addToppingToPrice(double priceWithoutToppings) {
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.TOMATO);
		Iterator<Toppings>topIterator = toppingList.iterator();
		double totalPrice = priceWithoutToppings;
		while(topIterator.hasNext()) {
			Toppings top = topIterator.next();
			totalPrice += top.getToppingPrice();
			
		}
		return totalPrice;
	}
	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
	
	
	
	
	

}
