package edu.mu.pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class HawaiianPizza extends AbstractPizza{

	public HawaiianPizza(ArrayList<Toppings> toppingList, double priceWithoutToppings, double totalPrice,
			int pizzaOrderID, int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, orderIDCounter, cookingStrategy, cookingPrice);
		this.totalPrice = addToppingToPrice(this.priceWithoutToppings = 3);
		
	}
	@Override
	protected double addToppingToPrice(double priceWithoutToppings) {
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.CANADIAN_BACON);
		this.toppingList.add(Toppings.PINEAPPLE);
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
