package com.prog.pattern.example.correct.impl.v3.prog.pojo.add;

import com.prog.pattern.example.correct.impl.v3.prog.pojo.Beverage;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.SMALL) {
			cost += .10;
		} else if (beverage.getSize() == Size.MEDIUM) {
			cost += .15;
		} else if (beverage.getSize() == Size.TALL) {
			cost += .20;
		}
		return cost;
	}
}
