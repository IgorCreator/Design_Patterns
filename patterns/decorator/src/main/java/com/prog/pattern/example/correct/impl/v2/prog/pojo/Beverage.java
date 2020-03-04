package com.prog.pattern.example.correct.impl.v2.prog.pojo;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
