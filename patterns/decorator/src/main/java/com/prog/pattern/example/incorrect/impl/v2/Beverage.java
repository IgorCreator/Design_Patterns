package com.prog.pattern.example.incorrect.impl.v2;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Beverage {
    private String description;

    private Boolean milk;
    private Boolean whip;
    private Boolean soy;
    private Boolean mocha;

    public String getDescription() {
        description = "Unknow beverage";
        return description;
    };

    public double cost(){
        double rez = 0;

        if(hasMilk()) rez += 0.2;
        if(hasWhip()) rez += 0.5;
        if(hasSoy()) rez += 0.7;
        if(hasMocha()) rez += 0.6;

        return rez;
    };

    public String hasDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean hasMilk() {
        return milk;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public Boolean hasWhip() {
        return whip;
    }

    public void setWhip(Boolean whip) {
        this.whip = whip;
    }

    public Boolean hasSoy() {
        return soy;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public Boolean hasMocha() {
        return mocha;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }
}

