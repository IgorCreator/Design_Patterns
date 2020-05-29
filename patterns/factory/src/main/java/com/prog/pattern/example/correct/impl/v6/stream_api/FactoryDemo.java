package com.prog.pattern.example.correct.impl.v6.stream_api;

import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Circle;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Rectangle;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Shape;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Triangle;
import com.prog.pattern.example.correct.impl.v6.stream_api.registry.Builder;
import com.prog.pattern.example.correct.impl.v6.stream_api.registry.Registry;

import java.awt.*;
import java.util.List;
import java.util.function.Consumer;

public class FactoryDemo {

    public static void main(String[] args) {
        Consumer<Builder<Shape>> rectang = builder -> builder.registry("Rectangle", Rectangle::new);
        Consumer<Builder<Shape>> triangle = builder -> builder.registry("Triangle", Triangle::new);

        Consumer<Builder<Shape>> consumer = rectang.andThen(triangle);
        Registry registry = Registry.createRegistry(consumer, s -> {throw new IllegalArgumentException("Unknown figure: " + s);});

        Factory<? extends Shape> rectangFactory = registry.buildShape("Rectangle");
        Shape rectangle = rectangFactory.newInstance();
        System.out.println("Rectangle = " + rectangle);

        Factory<? extends Shape> triangleFactory = registry.buildShape("Triangle");
        Shape triang = triangleFactory.newInstance();
        System.out.println("Triangle = " + triang);

        //Fail check
//        Factory<? extends Shape> squareFactory = registry.buildShape("Square");
//        Shape square = squareFactory.newInstance();
//        System.out.println("square = " + square);

    }

    private static void firstFactoryEx() {
        Factory<Circle> factory1 = Factory.createFactory(Circle::new, Color.RED);
        Factory<Circle> factory2 = Factory.createFactory(Circle::new);

        Circle circle = factory1.newInstance();
        System.out.println("Circle = " + circle);

        List<Circle> circ = factory1.create5();
        System.out.println(circ);
    }
}
