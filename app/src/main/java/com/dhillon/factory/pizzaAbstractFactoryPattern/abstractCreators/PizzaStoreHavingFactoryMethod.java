package com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.AbstractPizza;

public abstract class PizzaStoreHavingFactoryMethod {
 
	protected abstract AbstractPizza factoryMethodCreatePizza(String item);
 
	public AbstractPizza orderPizza(String type) {
		AbstractPizza pizza = factoryMethodCreatePizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
