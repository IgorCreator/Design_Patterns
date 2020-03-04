package com.prog.pattern.example.correct.impl.v2.prog.handlers;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.GarageDoor;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
