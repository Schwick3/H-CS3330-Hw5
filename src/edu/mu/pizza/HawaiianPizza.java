package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class HawaiianPizza extends AbstractPizza{


	public HawaiianPizza() {
		super();
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.CANADIAN_BACON);
		this.toppingList.add(Toppings.PINEAPPLE);
		this.setPriceWithoutToppings(3.00);
		this.setTotalPrice(this.addToppingToPrice(this.getPriceWithoutToppings()));
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
		return "HawaiianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";

}}
