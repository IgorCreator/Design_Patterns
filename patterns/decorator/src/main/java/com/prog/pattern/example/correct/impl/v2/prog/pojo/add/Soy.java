package com.prog.pattern.example.correct.impl.v2.prog.pojo.add;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.Beverage;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
