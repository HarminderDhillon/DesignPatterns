package com.dhillon.factory.pizzaFactoryMethodPattern.concreteCreatorClass;

import com.dhillon.factory.pizzaFactoryMethodPattern.abstractProductClass.Pizza;
import com.dhillon.factory.pizzaFactoryMethodPattern.concreteProductClasses.*;

public class DependentPizzaStore {
 
	public Pizza createPizzaWithoutFactoryMethod(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
            pizza = switch (type) {
                case "cheese" -> new NYStyleCheesePizza();
                case "veggie" -> new NYStyleVeggiePizza();
                case "clam" -> new NYStyleClamPizza();
                case "pepperoni" -> new NYStylePepperoniPizza();
                default -> pizza;
            };
		} else if (style.equals("Chicago")) {
            pizza = switch (type) {
                case "cheese" -> new ChicagoStyleCheesePizza();
                case "veggie" -> new ChicagoStyleVeggiePizza();
                case "clam" -> new ChicagoStyleClamPizza();
                case "pepperoni" -> new ChicagoStylePepperoniPizza();
                default -> pizza;
            };
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
        assert pizza != null;
        pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
