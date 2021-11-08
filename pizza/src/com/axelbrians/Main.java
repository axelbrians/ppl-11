package com.axelbrians;

import com.axelbrians.pizza.PizzaImpl;
import com.axelbrians.toppings.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String ADD_PIZZA = "(1) Add Pizza";
    public static String MY_PIZZA = "(2) My Pizza";

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<PizzaImpl> pizzas = new ArrayList<>();

    public static void main(String[] args) {
        boolean loop = true;
        String dashboardHelp = "=== Welcome to Kosimp Pizza Factory ===\n" + ADD_PIZZA + "\n" + MY_PIZZA + "\n(exit) Close app\n(help) Show this list of command";

        System.out.println(dashboardHelp);

        while (loop) {
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    moveToAddPizza();
                    System.out.println(dashboardHelp);
                    break;
                case "2":
                    System.out.println("\n=== Your pizza collection === ");
                    for (int i = 0; i < pizzas.size(); i++) {
                        System.out.println((i + 1) + " " + pizzas.get(i) + "\n");
                    }
                    break;
                case "help":
                    System.out.println(dashboardHelp);
                    break;
                case "exit": loop = false;
                     break;

                default:
                    System.out.println("Invalid command, please enter (help) to show available commands");
            }
        }
    }

    private static void moveToAddPizza() {
        String addPizzaHelp = "Now you are creating pizza, choose your own toppings\n" + Topping.PEPPERONI + "\n" + Topping.MUSHROOM + "\n" + Topping.ONION + "\n" + Topping.BASIL + "\n" + Topping.SAUSAGE + "\n" +  Topping.TOPPINGS + "\n" + Topping.PRUNE + "\n" +  Topping.BAKE + "\n" + Topping.DUMP + "\n(help) Show this list of command";
        System.out.println(addPizzaHelp);

        boolean loop = true;
        PizzaImpl pizza = new PizzaImpl();

        while (loop) {
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    Topping pepperoni = new Pepperoni();
                    pizza.addTopping(pepperoni);
                    System.out.println("Added " + pepperoni + "\n");
                    break;
                case "2":
                    Topping mushroom = new Mushroom();
                    pizza.addTopping(mushroom);
                    System.out.println("Added " + mushroom + "\n");
                    break;
                case "3":
                    Topping onion = new Onion();
                    pizza.addTopping(onion);
                    System.out.println("Added " + onion + "\n");
                    break;
                case "4":
                    Topping basil = new Basil();
                    pizza.addTopping(basil);
                    System.out.println("Added " + basil + "\n");
                    break;
                case "5":
                    Topping sausage = new Sausage();
                    pizza.addTopping(sausage);
                    System.out.println("Added " + sausage + "\n");
                    break;

                case "toppings":
                    System.out.println("Your pizza toppings : " + pizza.currentToppings());
                    break;
                case "prune":
                    pizza.removeAllTopping();
                    System.out.println("All toppings removed\n");
                    break;
                case "bake":
                    System.out.println("\n=== Succesfully baked! ===\n");
                    pizzas.add(pizza);
                    return;
                case "dump":
                    System.out.println("Pizza dumped\n");
                    return;
                default:
                    System.out.println(addPizzaHelp);
            }
        }
    }

}
