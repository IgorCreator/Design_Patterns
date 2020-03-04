package com.prog.pattern.example.incorrect.impl.v1.ducks;

import com.prog.pattern.example.incorrect.impl.v1.FlyBehavior;
import com.prog.pattern.example.incorrect.impl.v1.SoundBehavior;

public class RedheadDuck extends Duck implements FlyBehavior, SoundBehavior {

    public void display() {
        System.out.println("Redhead Duck Is Here");
    }

    public void fly() {
        System.out.println("Clap-Clap");
    }

    public void sound() {
        System.out.println("Quack");
    }
}
