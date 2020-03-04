package com.prog.pattern.example.incorrect.impl.v1.pojo;

public abstract class Beverage {
    private String description;

    public String getDescription(){
        description = "Unknow beverage";
        return description;
    };

    public abstract double cost();
}
