package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaStoreHavingFactoryMethod;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.CheesePizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.ClamPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.PepperoniPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.VeggiePizza;

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
