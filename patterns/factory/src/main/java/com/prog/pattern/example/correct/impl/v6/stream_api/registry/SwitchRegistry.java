package com.prog.pattern.example.correct.impl.v6.stream_api.registry;

import com.prog.pattern.example.correct.impl.v6.stream_api.Factory;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Circle;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Rectangle;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Shape;
import com.prog.pattern.example.correct.impl.v6.stream_api.pojo.Triangle;

public class SwitchRegistry implements Registry {

    @Override
    public Factory<? extends Shape> buildShape(String shape){
        switch(shape){
            case "Circle" : return Circle::new;
            case "Triangle" : return Triangle::new;
            case "Rectangle" : return Rectangle::new;
            default:
                throw new IllegalArgumentException("Unknown figure: " + shape);
        }
    }


}
