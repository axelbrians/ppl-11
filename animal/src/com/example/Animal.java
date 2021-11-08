package com.example;

public abstract class Animal implements IMakeSound, ICanMove {
    private double weight = -1;

    public String subClassName() {
        String name = this.getClass().getName();
        String [] parse = name.split("\\.");
        return parse[2];
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void sound();
    public abstract int move();
}
