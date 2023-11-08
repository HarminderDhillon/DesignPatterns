package com.dhillon.factory.pizzaAbstractFactoryPattern.concreteProducts;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientAbstractFactory;

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
