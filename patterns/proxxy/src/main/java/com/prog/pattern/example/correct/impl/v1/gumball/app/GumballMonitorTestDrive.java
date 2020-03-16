package com.prog.pattern.example.correct.impl.v1.gumball.app;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

    public static void main(String[] args) throws RemoteException {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://seattle.mightygumball.com/gumballmachine"};

        GumBallMonitor[] monitor = new GumBallMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumBallMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

		for (GumBallMonitor gumBallMonitor : monitor) {
			gumBallMonitor.report();
		}
    }

    public static void main_v1(String[] args) throws RemoteException {
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumBallMachine gumBallMachine = new GumBallMachine(args[0], count);
        GumBallMonitor monitor = new GumBallMonitor(gumBallMachine);

        monitor.report();
    }
}
