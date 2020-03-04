package com.prog.pattern.example.correct.impl.v2.prog.handlers;


import com.prog.pattern.example.correct.impl.v2.prog.pojo.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
