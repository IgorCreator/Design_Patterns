package com.prog.pattern.example.correct.impl.v3.undo.prog;

import com.prog.pattern.example.correct.impl.v3.undo.prog.pojo.*;
import com.prog.pattern.example.correct.impl.v3.undo.prog.handlers.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHightOn =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowOn =
                new CeilingFanLowCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumOn =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, tvOn, hottubOn};
        Command[] partyOff = { livingRoomLightOff, stereoOff, tvOff, hottubOff};
        MixPartyCommand partyOnMacro = new MixPartyCommand(partyOn);
        MixPartyCommand partyOffMacro = new MixPartyCommand(partyOff);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHightOn, ceilingFanOff);
        remoteControl.setCommand(3, ceilingFanMediumOn, ceilingFanOff);
        remoteControl.setCommand(4, ceilingFanLowOn, ceilingFanOff);
        remoteControl.setCommand(5, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(6, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(7, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
