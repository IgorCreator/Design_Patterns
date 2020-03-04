package com.prog.pattern.example.correct.impl.v2.prog.pojo.type;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

