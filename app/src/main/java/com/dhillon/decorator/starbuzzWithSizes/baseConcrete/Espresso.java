package com.dhillon.decorator.starbuzzWithSizes.baseConcrete;

import com.dhillon.decorator.starbuzzWithSizes.baseAbstract.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

