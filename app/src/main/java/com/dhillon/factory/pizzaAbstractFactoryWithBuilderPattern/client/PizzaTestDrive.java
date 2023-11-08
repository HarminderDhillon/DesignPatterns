package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.client;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteCreator.ChicagoPizzaStore;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteCreator.NYPizzaStore;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaStoreHavingFactoryMethod;

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
