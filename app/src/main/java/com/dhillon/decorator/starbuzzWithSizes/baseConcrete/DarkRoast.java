package com.dhillon.decorator.starbuzzWithSizes.baseConcrete;

import com.dhillon.decorator.starbuzzWithSizes.baseAbstract.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

