package com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.ny;

import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
