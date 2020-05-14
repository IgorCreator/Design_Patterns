package com.prog.pattern.example.correct.impl.v5.lunch;

public class DecoratorSandwitchDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
