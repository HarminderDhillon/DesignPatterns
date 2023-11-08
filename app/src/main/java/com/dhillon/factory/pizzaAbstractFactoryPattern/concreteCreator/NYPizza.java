package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractIngredients.*;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteIngradients.*;

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
