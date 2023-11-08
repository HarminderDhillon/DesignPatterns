package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaStoreHavingFactoryMethod;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.CheesePizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.ClamPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.PepperoniPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStoreHavingFactoryMethod {

	protected AbstractPizza factoryMethodCreatePizza(String item) {
		AbstractPizza pizza = null;
		PizzaIngredientAbstractFactory ingredients =
		new ChicagoPizza();

        switch (item) {
            case "cheese" -> pizza = new CheesePizza
                    .Builder(ingredients, "Chicago Style Cheese Pizza")
                    .build();
            case "veggie" -> pizza = new VeggiePizza.Builder(ingredients, "Chicago Style Veggie Pizza")
                    .build();
            case "clam" -> pizza = new ClamPizza.Builder(ingredients, "Chicago Style Clam Pizza")
                    .build();
            case "pepperoni" -> pizza = new PepperoniPizza.Builder(ingredients, "Chicago Style Pepperoni Pizza")
                    .build();
        }
		return pizza;
	}
}
