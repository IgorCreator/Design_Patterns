package com.prog.pattern.example.correct.impl.v2.prog.handlers;

import com.prog.pattern.example.correct.impl.v2.prog.pojo.GarageDoor;

public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

}
