package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractIngredients.*;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteIngradients.*;

public class NYPizza implements PizzaIngredientAbstractFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
