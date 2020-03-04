package com.prog.pattern.example.correct.impl.v2.prog.pojo.type;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

