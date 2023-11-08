package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractIngredients.*;
import com.dhillon.factory.pizzaAbstractFactoryPattern.concreteIngradients.*;

public class ChicagoPizza
	implements PizzaIngredientAbstractFactory
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
        return new Veggies[]{ new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
