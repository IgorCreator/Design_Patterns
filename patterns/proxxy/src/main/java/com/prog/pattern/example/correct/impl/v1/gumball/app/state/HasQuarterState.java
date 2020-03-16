package com.prog.pattern.example.correct.impl.v1.gumball.app.state;

import com.prog.pattern.example.correct.impl.v1.gumball.app.GumBallMachine;

import java.util.Random;

public class HasQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient private GumBallMachine gumBallMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");

        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumBallMachine.getQtyOfBalls() > 1)) {
            gumBallMachine.setState(gumBallMachine.getWinnerState());
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }

}
