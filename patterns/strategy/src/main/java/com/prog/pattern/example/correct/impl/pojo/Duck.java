package com.prog.pattern.example.correct.impl.pojo;

import com.prog.pattern.example.correct.impl.pojo.behavior.fly.FlyBehavior;
import com.prog.pattern.example.correct.impl.pojo.behavior.sound.SoundBehavior;
import com.prog.pattern.example.correct.impl.pojo.behavior.swim.SwimBehavior;

public abstract class Duck implements Bird {

    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    SwimBehavior swimBehavior;

    public abstract void display();

    public void flyPerform() {
        System.out.print("Fly way: ");
        flyBehavior.fly();
    }

    public void soundPerform() {
        System.out.print("Sound: ");
        soundBehavior.makeSound();
    }

    public void swimPerform() {
        System.out.print("Swim way: ");
        swimBehavior.swim();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }


}
