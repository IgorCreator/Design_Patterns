package com.prog.pattern.example.correct.impl.v2.shapes;

import com.prog.pattern.example.correct.impl.v2.color.Color;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
