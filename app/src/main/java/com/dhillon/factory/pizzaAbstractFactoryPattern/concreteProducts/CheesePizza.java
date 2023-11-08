package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientAbstractFactory;

public class CheesePizza extends AbstractPizza {
	private final PizzaIngredientAbstractFactory ingredientFactory;

	public static class Builder extends AbstractPizza.PizzaBuilder<Builder> {

		public Builder(PizzaIngredientAbstractFactory ingredients, String name) {
			super(ingredients, name);
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public AbstractPizza build() {
			return new CheesePizza(this);
		}
	}
 
	private CheesePizza(Builder builder) {
		super(builder);
		this.ingredientFactory = ingredients;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
