package com.prog.pattern.example.correct.impl.v1.test.pojo;


import com.prog.pattern.example.correct.impl.v1.test.Command;

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
