package com.dhillon.factory.pizzaFactoryMethodPattern.concreteCreatorClass;

import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.ChicagoStyleCheesePizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.ChicagoStyleClamPizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.ChicagoStylePepperoniPizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.ChicagoStyleVeggiePizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.abstractCreatorClass.PizzaStore;
import com.dhillon.factory.pizzaFactoryMethodPattern.abstractProductClass.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza factoryMethodCreatePizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
	}
}
