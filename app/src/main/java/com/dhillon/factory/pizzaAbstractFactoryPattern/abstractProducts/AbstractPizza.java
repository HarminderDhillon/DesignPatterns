package com.dhillon.factory.pizzaAbstractFactoryPattern.abstractProducts;

import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractCreators.PizzaIngredientAbstractFactory;
import com.dhillon.factory.pizzaAbstractFactoryPattern.abstractIngredients.*;

public abstract class AbstractPizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    protected final PizzaIngredientAbstractFactory ingredients;

    protected AbstractPizza(PizzaBuilder<?> pizzaBuilder) {
        this.name = pizzaBuilder.name;
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.veggies = pizzaBuilder.veggies;
        this.cheese = pizzaBuilder.cheese;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.clam = pizzaBuilder.clam;
        this.ingredients = pizzaBuilder.ingredients;
    }

    protected abstract static class PizzaBuilder<T extends PizzaBuilder<T>> {
        private final String name;
        private Dough dough;
        private Sauce sauce;
        private Veggies[] veggies;
        private Cheese cheese;
        private Pepperoni pepperoni;
        private Clams clam;

        private final PizzaIngredientAbstractFactory ingredients;

        protected PizzaBuilder(PizzaIngredientAbstractFactory ingredients, String name) {
            this.ingredients = ingredients;
            this.name = name;
        }

        protected abstract T self();

        protected abstract AbstractPizza build();

        public T dough(Dough dough) {
            this.dough = dough;
            return self();
        }

        public T sauce(Sauce sauce) {
            this.sauce = sauce;
            return self();
        }

        public T veggies(Veggies[] veggies) {
            this.veggies = veggies;
            return self();
        }

        public T cheese(Cheese cheese) {
            this.cheese = cheese;
            return self();
        }

        public T pepperoni(Pepperoni pepperoni) {
            this.pepperoni = pepperoni;
            return self();
        }

        public T clam(Clams clam) {
            this.clam = clam;
            return self();
        }

        public String getName() {
            return name;
        }

        public Dough getDough() {
            return dough;
        }

        public Sauce getSauce() {
            return sauce;
        }

        public Veggies[] getVeggies() {
            return veggies;
        }

        public Cheese getCheese() {
            return cheese;
        }

        public Pepperoni getPepperoni() {
            return pepperoni;
        }

        public Clams getClam() {
            return clam;
        }
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }


    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
