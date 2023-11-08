package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaStoreHavingFactoryMethod;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.CheesePizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.ClamPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.PepperoniPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts.VeggiePizza;

public class NYPizzaStore extends PizzaStoreHavingFactoryMethod {
 
	protected AbstractPizza factoryMethodCreatePizza(String item) {
		AbstractPizza pizza = null;
		PizzaIngredientAbstractFactory ingredientFactory =
			new NYPizza();

        switch (item) {
            case "cheese" -> pizza = new CheesePizza
                    .Builder(ingredientFactory, "New York Style Cheese Pizza")
                    .build();
            case "veggie" -> pizza = new VeggiePizza
                    .Builder(ingredientFactory, "New York Style veggie Pizza")
                    .build();
            case "clam" -> pizza = new ClamPizza
                    .Builder(ingredientFactory, "New York Style clam Pizza")
                    .build();
            case "pepperoni" -> pizza = new PepperoniPizza
                    .Builder(ingredientFactory, "New York Style pepperoni Pizza")
                    .build();
        }
		return pizza;
	}
}
