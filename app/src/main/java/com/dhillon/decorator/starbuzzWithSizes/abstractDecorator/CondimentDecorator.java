package com.dhillon.decorator.starbuzzWithSizes.abstractDecorator;

import com.dhillon.decorator.starbuzzWithSizes.baseAbstract.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
