package com.prog.pattern.example.incorrect.impl.v1;

import com.prog.pattern.example.incorrect.impl.v1.ducks.DecoyDuck;
import com.prog.pattern.example.incorrect.impl.v1.ducks.MallardDuck;
import com.prog.pattern.example.incorrect.impl.v1.ducks.RubberDuck;

public class SimUDuck {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.sound();
        mallardDuck.fly();
        mallardDuck.swim();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.sound();
        rubberDuck.fly();
        rubberDuck.swim();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
    }

}
