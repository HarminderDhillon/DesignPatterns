package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractIngredients.*;

public interface PizzaIngredientAbstractFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
 
}
