package com.prog.pattern.example.correct.impl.v2.prog.handlers;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
