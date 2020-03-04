package com.prog.pattern.example.correct.impl.v3.undo.prog.handlers;

public class MixPartyCommand implements Command {
    Command[] commands;

    public MixPartyCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo() {
        for (int i = commands.length -1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
