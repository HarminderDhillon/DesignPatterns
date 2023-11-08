package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteCreator;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractIngredients.*;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteIngradients.*;

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
