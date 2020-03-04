package com.prog.pattern.example.correct.impl.v3.prog.pojo.add;

import com.prog.pattern.example.correct.impl.v3.prog.pojo.Beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
