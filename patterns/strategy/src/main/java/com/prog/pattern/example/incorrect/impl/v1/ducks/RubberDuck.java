package com.prog.pattern.example.incorrect.impl.v1.ducks;

import com.prog.pattern.example.incorrect.impl.v1.FlyBehavior;
import com.prog.pattern.example.incorrect.impl.v1.SoundBehavior;

public class RubberDuck extends Duck implements FlyBehavior, SoundBehavior {

    public void display() {
        System.out.println("\nRubber Duck Is Here");
    }

    public void fly() {
        System.out.println("No wings...");
    }

    public void sound() {
        System.out.println("Quack");
    }
}
