package com.prog.pattern.example.correct.impl.v2.shapes;

import com.prog.pattern.example.correct.impl.v2.color.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
