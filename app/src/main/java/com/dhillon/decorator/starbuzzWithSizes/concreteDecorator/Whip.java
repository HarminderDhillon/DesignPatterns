package com.dhillon.decorator.starbuzzWithSizes.concreteDecorator;

import com.dhillon.decorator.starbuzzWithSizes.baseAbstract.Beverage;
import com.dhillon.decorator.starbuzzWithSizes.abstractDecorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return beverage.cost() + .10;
	}
}
