package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class SupremePizza extends AbstractPizza{


	public SupremePizza() {
		super();
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.TOMATO);
		this.toppingList.add(Toppings.BELL_PEPPER);
		this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
		this.toppingList.add(Toppings.PEPPERONI);
		this.toppingList.add(Toppings.BLACK_OLIVE);
		this.toppingList.add(Toppings.MUSHROOM);
		this.setPriceWithoutToppings(3.50);
		this.addToppingToPrice(this.getPriceWithoutToppings());
	}
	@Override
	protected double addToppingToPrice(double priceWithoutToppings) {

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
		return "SupremePizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";

}}
