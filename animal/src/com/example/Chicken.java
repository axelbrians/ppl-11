package com.example;

public class Chicken extends Animal implements ILayingEgg{
    private int layingEgg;

    public Chicken() {
        layingEgg = 0;
    }

    @Override
    public void sound() {
    System.out.println("Cuckoo");
    }

    @Override
    public int move() {
        return 2;
    }

    @Override
    public int getLayingEgg() {
        return layingEgg;
    }

    @Override
    public void setLayingEgg(int layingEgg) {
        this.layingEgg = layingEgg;
    }

    @Override
    public String toString() {
        String layingEgg;
        if(this.layingEgg == 1) layingEgg = "Yes";
        else layingEgg = "No";
        return "Chicken {" +
                "\n\tlayingEgg=" + layingEgg + "\n\tWeight=" + getWeight() +
                "\n}";
    }
}
