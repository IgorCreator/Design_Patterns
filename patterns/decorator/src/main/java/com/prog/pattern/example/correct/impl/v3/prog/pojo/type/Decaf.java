package com.prog.pattern.example.correct.impl.v3.prog.pojo.type;

import com.prog.pattern.example.correct.impl.v3.prog.pojo.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

