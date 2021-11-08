package com.axelbrians.pizza;

import com.axelbrians.toppings.Topping;

import java.util.ArrayList;

public class Pizza {

    private ArrayList<Topping> toppings;

    public Pizza() {
        toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void removeAllTopping() {
        toppings = new ArrayList<>();
    }

    public String currentToppings() {
        if (toppings.isEmpty()) {
            return "No Topping yet";
        } else {
            return toppings.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder pizzaToPrint = new StringBuilder();
        pizzaToPrint.append("Pizza\n");
        if (toppings.isEmpty()) {
            return pizzaToPrint + "Without Toppings";
        }
        pizzaToPrint.append("Toppings:");

        for (int i = 0; i < toppings.size(); i++) {
            pizzaToPrint.append("\n").append("  ").append(i + 1).append(" ").append(toppings.get(i));
        }

        return pizzaToPrint.toString();
    }
}
