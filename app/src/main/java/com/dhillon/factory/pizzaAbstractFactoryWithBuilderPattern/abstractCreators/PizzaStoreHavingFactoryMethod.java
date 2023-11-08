package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractProducts.AbstractPizza;

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
