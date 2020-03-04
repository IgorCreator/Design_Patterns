package com.prog.pattern.example.correct.impl.v3.undo.prog.handlers;

import com.prog.pattern.example.correct.impl.v3.undo.prog.pojo.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.bubblesOff();
		hottub.cool();
		hottub.off();
	}

	public void undo() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
