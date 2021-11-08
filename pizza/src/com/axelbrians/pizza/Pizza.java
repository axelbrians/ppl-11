package com.axelbrians.pizza;

import com.axelbrians.toppings.Topping;

public interface Pizza {

    void addTopping(Topping topping);

    void removeAllTopping();

    public String currentToppings();
}
