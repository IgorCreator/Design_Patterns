package com.prog.pattern.example.correct.impl.v2.prog.pojo.type;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

