package com.prog.pattern.example.correct.impl.v1.test.pojo;

import com.prog.pattern.example.correct.impl.v1.test.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
