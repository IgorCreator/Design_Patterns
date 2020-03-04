package com.prog.pattern.example.correct.impl.pojo;

import com.prog.pattern.example.correct.impl.pojo.behavior.fly.FlyWithWings;
import com.prog.pattern.example.correct.impl.pojo.behavior.sound.Quack;
import com.prog.pattern.example.correct.impl.pojo.behavior.swim.NormalWaySwim;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setSwimBehavior(new NormalWaySwim());
        setSoundBehavior(new Quack());
    }

    public void display() {
        System.out.println("Mallard Duck Is Here");
    }
}
