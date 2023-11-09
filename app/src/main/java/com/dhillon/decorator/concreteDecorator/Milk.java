package com.dhillon.decorator.concreteDecorator;

import com.dhillon.decorator.abstractDecorator.CondimentDecorator;
import com.dhillon.decorator.baseAbstract.Beverage;

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
