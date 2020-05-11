package com.prog.pattern.example.correct.impl.v2;

import com.prog.pattern.example.correct.impl.v2.color.*;
import com.prog.pattern.example.correct.impl.v2.shapes.Circle;
import com.prog.pattern.example.correct.impl.v2.shapes.Shape;
import com.prog.pattern.example.correct.impl.v2.shapes.Square;

public class Shape2BridgeDemo {

	public static void main(String[] args) {
		Color blue = new Blue();
		Color red = new Red();
		Color green = new Green();
		Yellow yellow = new Yellow();

		Shape blueSquare = new Square(blue);
		Shape redCircle = new Circle(red);
		Shape greenCircle = new Circle(green);
		Shape greenSquare = new Square(green);
		Shape yellowSquare = new Square(yellow);

		blueSquare.applyColor();
		redCircle.applyColor();
		greenCircle.applyColor();
		greenSquare.applyColor();
		yellowSquare.applyColor();
	}
}
