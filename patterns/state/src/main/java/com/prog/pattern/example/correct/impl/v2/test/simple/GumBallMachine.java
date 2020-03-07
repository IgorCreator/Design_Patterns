package com.prog.pattern.example.correct.impl.v2.test.simple;

public class GumBallMachine {
    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;

    private State currentState;
    int balls;

    public GumBallMachine() {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        currentState = noQuarterState;
        balls = 10;
    }

    public GumBallMachine(int qtyOfBalls) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        balls = qtyOfBalls;
        if (balls > 0) {
            currentState = noQuarterState;
        } else {
            currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (balls != 0) {
            balls = balls - 1;
        }
    }

    void refill(int qtyBalls){
        this.balls += qtyBalls;
        currentState.refill();
        System.out.println("Machine refilled. Balls quantity: " + balls);
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return currentState;
    }

    public void setState(State currentState) {
        this.currentState = currentState;
    }

    public int getQtyOfBalls() {
        return balls;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: ").append(getQtyOfBalls()).append(" gumball(s)");
        result.append("\nMachine is ").append(currentState.toString());
        result.append("\n");
        return result.toString();
    }
}
