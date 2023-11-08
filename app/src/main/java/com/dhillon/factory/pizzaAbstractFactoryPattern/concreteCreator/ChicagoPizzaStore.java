package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.Pizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientFactory;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaStore;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.CheesePizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.ClamPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.PepperoniPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
        }
		return pizza;
	}
}
