package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.Pizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
