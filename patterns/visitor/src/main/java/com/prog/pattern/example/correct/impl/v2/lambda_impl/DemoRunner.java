package com.prog.pattern.example.correct.impl.v2.lambda_impl;

import com.prog.pattern.example.correct.impl.v2.lambda_impl.pojo.Body;
import com.prog.pattern.example.correct.impl.v2.lambda_impl.pojo.Car;
import com.prog.pattern.example.correct.impl.v2.lambda_impl.pojo.Engine;

import java.util.function.Consumer;

public class DemoRunner {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        Body body = new Body();

        Consumer<VisitorBuilder<String>> consumer =
                Visitor.<Car, String>forType(Car.class).execute( (Car o) -> "Visiting car: " + o)
                        .forType(Engine.class).execute((Engine o) -> "Visiting engine: " + o)
                        .forType(Body.class).execute((Body o) -> "Visiting body: " + o);

        Visitor<String> visitor = Visitor.of(consumer);

        System.out.println(visitor.visit(car));
        System.out.println(visitor.visit(engine));
        System.out.println(visitor.visit(body));
    }
}
