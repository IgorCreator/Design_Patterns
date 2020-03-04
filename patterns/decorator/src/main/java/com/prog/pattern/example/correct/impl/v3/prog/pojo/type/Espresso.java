package com.prog.pattern.example.correct.impl.v3.prog.pojo.type;

import com.prog.pattern.example.correct.impl.v3.prog.pojo.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
		setSize(Size.MEDIUM);
	}

	public Espresso(Size size) {
		description = "Espresso";
		setSize(size);
	}
  
	public double cost() {
		return 1.99;
	}
}

