package com.example;

abstract class Mammal extends Animal {
    private boolean milkingStatus;

    public abstract void sound();
    public abstract int move();

    public boolean isMilking() {
        return milkingStatus;
    }

    public void setMilkingStatus(boolean milkingStatus) {
        this.milkingStatus = milkingStatus;
    }
}
