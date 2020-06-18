package com.prog.pattern.example.correct.impl.v2.lambda_impl;

import java.util.function.Function;

public interface VisitorBuilder<R> {
    <T> void register (Class<T> type, Function<T, R> function);

}
