package com.example;

public class Sheep extends Mammal{

    private boolean shaved;

    @Override
    public void sound() {
        System.out.println("");
    }

    @Override
    public int move() {
        return 1;
    }

    public void setShaved(boolean shaved) {
        this.shaved = shaved;
    }

    public boolean isShaved() {
        return shaved;
    }

    @Override
    public String toString() {
        String sShaved;
        if(shaved) sShaved = "Yes";
        else sShaved = "No";
        return "Sheep {" +
                "Ready to be shaved=" + sShaved + "\n\tWeight=" + getWeight() +
                "\n}";
    }
}
