package com.dhillon.factory.pizzaFactoryMethodPattern.abstractCreatorClass;

import com.dhillon.factory.pizzaFactoryMethodPattern.abstractProductClass.Pizza;

public abstract class PizzaStore {

	// Factory method
	protected abstract Pizza factoryMethodCreatePizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = factoryMethodCreatePizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
