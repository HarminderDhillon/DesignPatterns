package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientAbstractFactory;

public class PepperoniPizza extends AbstractPizza {
	PizzaIngredientAbstractFactory ingredientFactory;

	public static class Builder extends AbstractPizza.PizzaBuilder<PepperoniPizza.Builder> {

		public Builder(PizzaIngredientAbstractFactory ingredients, String name) {
			super(ingredients, name);
		}

		@Override
		protected PepperoniPizza.Builder self() {
			return this;
		}

		@Override
		public AbstractPizza build() {
			return new PepperoniPizza(this);
		}
	}

	private PepperoniPizza(PepperoniPizza.Builder builder) {
		super(builder);
		this.ingredientFactory = ingredients;
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
