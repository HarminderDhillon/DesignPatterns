package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaIngredientAbstractFactory;

public class ClamPizza extends AbstractPizza {
	PizzaIngredientAbstractFactory ingredientFactory;

	public static class Builder extends AbstractPizza.PizzaBuilder<ClamPizza.Builder> {

		public Builder(PizzaIngredientAbstractFactory ingredients, String name) {
			super(ingredients, name);
		}

		@Override
		protected ClamPizza.Builder self() {
			return this;
		}

		@Override
		public AbstractPizza build() {
			return new ClamPizza(this);
		}
	}

	private ClamPizza(ClamPizza.Builder builder) {
		super(builder);
		this.ingredientFactory = ingredients;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
