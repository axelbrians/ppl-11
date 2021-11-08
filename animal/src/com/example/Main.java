package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(true) {
            menu();
            int choice = in.nextInt();
            if(choice == 1) {
                animalMenu();
                choice = in.nextInt();
                if(choice == 1) {
                    Chicken chicken = new Chicken();
                    System.out.print("Enter chicken weight(kg): ");
                    int reply = in.nextInt();
                    chicken.setWeight(reply);
                    System.out.print("Is the chicken ready to laying an egg? (Y/N): ");
                    String egg = in.next();
                    if(egg.toUpperCase().equals("Y")) {
                        chicken.setLayingEgg(1);
                    } else if(egg.toUpperCase().equals("N")) {
                        chicken.setLayingEgg(0);
                    } else {
                        System.out.println("Invalid input, Assigning to N as default");
                        chicken.setLayingEgg(0);
                    }
                    animals.add(chicken);
                }
                else if(choice == 2) {
                    Sheep sheep = new Sheep();
                    System.out.print("Enter Sheep weight(kg): ");
                    int reply = in.nextInt();
                    sheep.setWeight(reply);
                    System.out.print("Is the Sheep ready to be shaved? (Y/N): ");
                    String shaved = in.next();
                    if(shaved.toUpperCase().equals("Y")) {
                        sheep.setShaved(true);
                    } else if(shaved.toUpperCase().equals("N")) {
                        sheep.setShaved(false);
                    } else {
                        System.out.println("Invalid input, Assigning to N as default");
                        sheep.setShaved(false);
                    }
                    animals.add(sheep);
                }
                else if(choice == 3) {
                    Cow cow = new Cow();
                    System.out.print("Enter Cow weight(kg): ");
                    int reply = in.nextInt();
                    cow.setWeight(reply);
                    System.out.print("Is the Cow ready to be Milked? (Y/N): ");
                    String milking = in.next();
                    if(milking.toUpperCase().equals("Y")) {
                        cow.setMilkingStatus(true);
                    } else if(milking.toUpperCase().equals("N")) {
                        cow.setMilkingStatus(false);
                    } else {
                        System.out.println("Invalid input, Assigning to N as default");
                        cow.setMilkingStatus(false);
                    }
                    animals.add(cow);
                }
                else {
                    System.out.println("Invalid Choice");
                }
            }
            else if(choice == 2) {
                for(int i=0; i<animals.size(); i++) {
                    System.out.println("1. " + animals.get(i).toString());
                }
            }
            else {
                System.out.println("Invalid Choice");
            }
        }
    }

    public static void menu() {
        System.out.println("=====Animal Farm=====");
        System.out.println("1. Add Animal");
        System.out.println("2. See Animal List");
    }

    public static void animalMenu() {
        System.out.println("=====================");
        System.out.println("1. Chicken");
        System.out.println("2. Sheep");
        System.out.println("3. Cow");
    }
}
