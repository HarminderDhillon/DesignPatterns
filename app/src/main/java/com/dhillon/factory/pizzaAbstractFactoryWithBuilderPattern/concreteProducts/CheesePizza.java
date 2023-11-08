package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaIngredientAbstractFactory;

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
