package com.codecool.drinkingzoo;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": I drank " + drunkWater + " liters of water. Csip-csirip!");
    }

}
