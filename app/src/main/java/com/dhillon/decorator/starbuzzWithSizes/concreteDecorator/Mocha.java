package com.dhillon.decorator.starbuzzWithSizes.concreteDecorator;

import com.dhillon.decorator.starbuzzWithSizes.baseAbstract.Beverage;
import com.dhillon.decorator.starbuzzWithSizes.abstractDecorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return beverage.cost() + .20;
	}
}
