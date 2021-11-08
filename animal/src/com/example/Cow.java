package com.example;

public class Cow extends Mammal{
    @Override
    public void sound() {
        System.out.println("Moo");
    }

    @Override
    public int move() {
        return 1;
    }

    @Override
    public String toString() {
        String isMilking;
        if(isMilking()) isMilking = "Yes";
        else isMilking = "No";
        return "Cow {" +
                "\n\tisMilking=" + isMilking + "\n\tWeight=" + getWeight() +
                "\n}";
    }
}
