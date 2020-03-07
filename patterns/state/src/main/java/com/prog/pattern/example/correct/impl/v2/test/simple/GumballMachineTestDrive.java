package com.prog.pattern.example.correct.impl.v2.test.simple;
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumBallMachine gumballMachine = new GumBallMachine(2);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.refill(10);
	}
}
