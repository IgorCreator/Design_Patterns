package com.prog.pattern.example.correct.impl;

import com.prog.pattern.example.correct.impl.pojo.DecoyDuck;
import com.prog.pattern.example.correct.impl.pojo.Duck;
import com.prog.pattern.example.correct.impl.pojo.MallardDuck;

public class SimUDuck {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.soundPerform();
        mallardDuck.flyPerform();
        mallardDuck.swimPerform();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.soundPerform();
        decoyDuck.flyPerform();
        decoyDuck.swimPerform();
    }

}
