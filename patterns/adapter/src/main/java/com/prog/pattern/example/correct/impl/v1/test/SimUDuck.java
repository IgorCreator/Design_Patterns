package com.prog.pattern.example.correct.impl.v1.test;

import com.prog.pattern.example.correct.impl.v1.test.adapters.TurkeyAdapter;
import com.prog.pattern.example.correct.impl.v1.test.pojo.Duck;
import com.prog.pattern.example.correct.impl.v1.test.pojo.MallardDuck;
import com.prog.pattern.example.correct.impl.v1.test.pojo.WildTurkey;

public class SimUDuck {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
