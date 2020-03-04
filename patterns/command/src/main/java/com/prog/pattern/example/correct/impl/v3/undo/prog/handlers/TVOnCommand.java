package com.prog.pattern.example.correct.impl.v3.undo.prog.handlers;

import com.prog.pattern.example.correct.impl.v3.undo.prog.pojo.TV;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
