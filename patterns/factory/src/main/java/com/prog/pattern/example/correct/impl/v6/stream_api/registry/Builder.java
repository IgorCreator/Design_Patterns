package com.prog.pattern.example.correct.impl.v6.stream_api.registry;

import com.prog.pattern.example.correct.impl.v6.stream_api.Factory;

public interface Builder<T> {
    void registry(String label, Factory<T> factory);
}
