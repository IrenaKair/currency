package com.irena.robertkaczmarek.exchangecurrency;

public class Currency1 {
    private  String name;
    private double rate;

    public Currency1(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }


    @Override
    public String toString() {
        return  name + "  : " + rate;
    }
}
