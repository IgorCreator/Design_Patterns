package com.prog.pattern.example.correct.impl.v3.undo.prog.handlers;

import com.prog.pattern.example.correct.impl.v3.undo.prog.pojo.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
