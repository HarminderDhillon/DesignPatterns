package com.dhillon.decorator.baseConcrete;

import com.dhillon.decorator.baseAbstract.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

