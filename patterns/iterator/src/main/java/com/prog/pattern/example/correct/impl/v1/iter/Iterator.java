package com.prog.pattern.example.correct.impl.v1.iter;

public interface Iterator {
    public <T> T next();
    public boolean hasNext();
}
