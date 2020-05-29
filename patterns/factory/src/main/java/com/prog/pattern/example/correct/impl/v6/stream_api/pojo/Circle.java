package com.prog.pattern.example.correct.impl.v6.stream_api.pojo;

import java.awt.*;

public class Circle extends Shape {

    private Color color;


    public Circle() {
        this(Color.WHITE);
    }

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle []";
    }
}
