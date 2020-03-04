package com.prog.pattern.example.correct.impl.pojo;

import com.prog.pattern.example.correct.impl.pojo.behavior.fly.FlyWithWings;
import com.prog.pattern.example.correct.impl.pojo.behavior.sound.Quack;
import com.prog.pattern.example.correct.impl.pojo.behavior.swim.NormalWaySwim;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setSwimBehavior(new NormalWaySwim());
        setSoundBehavior(new Quack());
    }

    public void display() {
        System.out.println("Redhead Duck Is Here");
    }
}
