package com.prog.pattern.example.correct.impl.v2.shapes;

import com.prog.pattern.example.correct.impl.v2.color.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
