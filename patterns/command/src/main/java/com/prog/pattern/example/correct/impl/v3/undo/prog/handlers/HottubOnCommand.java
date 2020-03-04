package com.prog.pattern.example.correct.impl.v3.undo.prog.handlers;

import com.prog.pattern.example.correct.impl.v3.undo.prog.pojo.Hottub;

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

	public void undo() {
		hottub.bubblesOff();
		hottub.cool();
		hottub.off();
	}
}
