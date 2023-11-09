package com.dhillon.decorator.starbuzzWithSizes.concreteDecorator;

import com.dhillon.decorator.starbuzzWithSizes.baseAbstract.Beverage;
import com.dhillon.decorator.starbuzzWithSizes.abstractDecorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
