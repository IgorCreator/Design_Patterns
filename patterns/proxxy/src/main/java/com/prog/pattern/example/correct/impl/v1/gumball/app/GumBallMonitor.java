package com.prog.pattern.example.correct.impl.v1.gumball.app;

import java.rmi.RemoteException;

public class GumBallMonitor {
    GumballMachineRemote machine;

    public GumBallMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() throws RemoteException {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getQtyOfBalls() + " gumball(s)");
        System.out.println("Current state: " + machine.getState());
    }
}
