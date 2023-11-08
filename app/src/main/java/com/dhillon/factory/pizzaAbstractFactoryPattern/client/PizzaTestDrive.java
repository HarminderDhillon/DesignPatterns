package com.dhillon.factory.pizzaAbstractFactoryPattern.client;

import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteCreator.ChicagoPizzaStore;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteCreator.NYPizzaStore;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaStoreHavingFactoryMethod;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStoreHavingFactoryMethod nyStore = new NYPizzaStore();
		PizzaStoreHavingFactoryMethod chicagoStore = new ChicagoPizzaStore();
 
		AbstractPizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
