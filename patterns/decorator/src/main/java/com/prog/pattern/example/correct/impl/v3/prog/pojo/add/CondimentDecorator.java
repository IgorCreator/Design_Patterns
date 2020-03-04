package com.prog.pattern.example.correct.impl.v3.prog.pojo.add;

import com.prog.pattern.example.correct.impl.v3.prog.pojo.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
