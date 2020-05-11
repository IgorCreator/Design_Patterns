package com.prog.pattern.example.incorrect.impl.v1.shapes;

import com.prog.pattern.example.incorrect.impl.v1.shapes.color.BlueCircle;
import com.prog.pattern.example.incorrect.impl.v1.shapes.color.GreenSquare;
import com.prog.pattern.example.incorrect.impl.v1.shapes.color.RedSquare;

public class Shape1BridgeDemo {

	public static void main(String args[]) {

		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		
		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
		// but what if we want create Rectangle and add yellow color
		// then create all classes
		// using inheritance we have - orthogonal problem
	}

}
