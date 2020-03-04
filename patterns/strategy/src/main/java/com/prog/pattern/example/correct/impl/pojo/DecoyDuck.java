package com.prog.pattern.example.correct.impl.pojo;

import com.prog.pattern.example.correct.impl.pojo.behavior.fly.NoFly;
import com.prog.pattern.example.correct.impl.pojo.behavior.sound.Quack;
import com.prog.pattern.example.correct.impl.pojo.behavior.swim.NoSwim;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new NoFly());
        setSwimBehavior(new NoSwim());
        setSoundBehavior(new Quack());
    }

    public void display() {
        System.out.println("Decoy(fake) Duck Is Here");
    }
}
