package com.prog.pattern.example.correct.impl.v1.test;

import com.prog.pattern.example.correct.impl.v1.test.pojo.GarageDoor;
import com.prog.pattern.example.correct.impl.v1.test.pojo.Light;
import com.prog.pattern.example.correct.impl.v1.test.pojo.GarageDoorUpCommand;
import com.prog.pattern.example.correct.impl.v1.test.pojo.LightOnCommand;

public class RemoteTest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorOpenCommand = new GarageDoorUpCommand(garageDoor);

        control.setCommand(lightOnCommand);
        control.buttonWasPressed();
        control.setCommand(garageDoorOpenCommand);
        control.buttonWasPressed();
    }
}
