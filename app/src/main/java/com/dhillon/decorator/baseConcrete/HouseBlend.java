package com.dhillon.decorator.baseConcrete;

import com.dhillon.decorator.baseAbstract.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

