package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class SupremePizza extends AbstractPizza{

	public SupremePizza(ArrayList<Toppings> toppingList, double priceWithoutToppings, double totalPrice,
			int pizzaOrderID, int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, orderIDCounter, cookingStrategy, cookingPrice);
		
		this.totalPrice = addToppingToPrice(this.priceWithoutToppings = 3.5);

	}
	@Override
	protected double addToppingToPrice(double priceWithoutToppings) {
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.TOMATO);
		this.toppingList.add(Toppings.BELL_PEPPER);
		this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
		this.toppingList.add(Toppings.PEPPERONI);
		this.toppingList.add(Toppings.BLACK_OLIVE);
		this.toppingList.add(Toppings.MUSHROOM);
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
