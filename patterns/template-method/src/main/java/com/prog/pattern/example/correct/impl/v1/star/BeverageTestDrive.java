package com.prog.pattern.example.correct.impl.v1.star;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareReciep();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareReciep();
	}
}
