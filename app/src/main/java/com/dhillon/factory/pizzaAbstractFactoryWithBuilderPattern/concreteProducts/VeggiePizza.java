package com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.concreteProducts;

import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractProducts.AbstractPizza;
import com.dhillon.factory.pizzaAbstractFactoryWithBuilderPattern.abstractCreators.PizzaIngredientAbstractFactory;

public class VeggiePizza extends AbstractPizza {
    PizzaIngredientAbstractFactory ingredientFactory;

    public static class Builder extends AbstractPizza.PizzaBuilder<VeggiePizza.Builder> {


        public Builder(PizzaIngredientAbstractFactory ingredients, String name) {
            super(ingredients, name);
        }

        @Override
        protected VeggiePizza.Builder self() {
            return this;
        }

        @Override
        public AbstractPizza build() {
            return new VeggiePizza(this);
        }
    }

    private VeggiePizza(VeggiePizza.Builder builder) {
        super(builder);
        this.ingredientFactory = ingredients;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
