package com.dhillon.factory.pizzaFactoryMethodPattern.concreteCreatorClass;

import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.NYStyleCheesePizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.NYStyleClamPizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.NYStylePepperoniPizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.NYStyleVeggiePizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.abstractCreatorClass.PizzaStore;
import com.dhillon.factory.pizzaFactoryMethodPattern.abstractProductClass.Pizza;

public class NYPizzaStore extends PizzaStore {

	public Pizza factoryMethodCreatePizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
	}
}
