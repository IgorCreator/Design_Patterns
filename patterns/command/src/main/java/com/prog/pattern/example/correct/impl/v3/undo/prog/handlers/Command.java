package com.prog.pattern.example.correct.impl.v3.undo.prog.handlers;

public interface Command {
    public void execute();
    public void undo();
}
