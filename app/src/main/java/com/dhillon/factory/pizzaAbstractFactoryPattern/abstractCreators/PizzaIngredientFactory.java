package com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractIngredients.*;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
 
}
