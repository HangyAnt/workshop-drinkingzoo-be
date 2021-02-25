package com.codecool.drinkingzoo;

public class Snake extends Animal {

    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s: I drank %d liters of water. Ssssssz!\n", name, drunkWater);
    }

}
