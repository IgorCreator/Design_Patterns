package com.prog.pattern.example.correct.impl.pojo;

import com.prog.pattern.example.correct.impl.pojo.behavior.fly.NoFly;
import com.prog.pattern.example.correct.impl.pojo.behavior.sound.Squeak;
import com.prog.pattern.example.correct.impl.pojo.behavior.swim.NormalWaySwim;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new NoFly());
        setSwimBehavior(new NormalWaySwim());
        setSoundBehavior(new Squeak());
    }

    public void display() {
        System.out.println("Rubber Duck Is Here");
    }
}
