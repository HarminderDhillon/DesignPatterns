package com.dhillon.decorator.concreteDecorator;

import com.dhillon.decorator.abstractDecorator.CondimentDecorator;
import com.dhillon.decorator.baseAbstract.Beverage;

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
