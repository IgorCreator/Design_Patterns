package com.prog.pattern.example.correct.impl.v2.prog.handlers;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.Hottub;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
