package com.dhillon.decorator.concreteDecorator;

import com.dhillon.decorator.abstractDecorator.CondimentDecorator;
import com.dhillon.decorator.baseAbstract.Beverage;

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
