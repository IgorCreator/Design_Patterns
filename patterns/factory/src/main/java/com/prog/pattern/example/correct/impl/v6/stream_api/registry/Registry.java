package com.prog.pattern.example.correct.impl.v6.stream_api.registry;

import com.prog.pattern.example.correct.impl.v6.stream_api.Factory;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Shape;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Registry {

    public Factory<? extends Shape> buildShape(String shape);

    public static Registry createRegistry(Consumer<Builder<Shape>> consumer){
        Map<String,  Factory<Shape>> map = new HashMap<>();
        Builder<Shape> builder = ((label, factory) -> map.put(label,factory));
        consumer.accept(builder);
        return shape -> map.getOrDefault(shape, () -> {throw new IllegalArgumentException("Unknown figure: " + shape);});
    }

    public static Registry createRegistry(Consumer<Builder<Shape>> consumer, Function<String, Factory<Shape>> errorFunction){
        Map<String,  Factory<Shape>> map = new HashMap<>();
        Builder<Shape> builder = (map::put);
        consumer.accept(builder);
        return shape -> map.computeIfAbsent(shape, errorFunction);
    }
}
