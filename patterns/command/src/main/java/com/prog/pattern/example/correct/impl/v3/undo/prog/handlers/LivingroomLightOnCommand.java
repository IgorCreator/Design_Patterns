package com.prog.pattern.example.correct.impl.v3.undo.prog.handlers;

import com.prog.pattern.example.correct.impl.v3.undo.prog.pojo.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
