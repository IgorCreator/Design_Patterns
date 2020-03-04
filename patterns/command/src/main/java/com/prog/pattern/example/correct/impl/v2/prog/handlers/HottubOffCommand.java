package com.prog.pattern.example.correct.impl.v2.prog.handlers;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
