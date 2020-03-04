package com.prog.pattern.example.correct.impl.v3.prog.pojo;

public abstract class Beverage {

	public enum Size{
		TALL,
		MEDIUM,
		SMALL
	}

	Size size = Size.MEDIUM;

	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double cost();
}
