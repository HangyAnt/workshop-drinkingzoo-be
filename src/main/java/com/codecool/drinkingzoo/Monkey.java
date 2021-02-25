package com.codecool.drinkingzoo;

public class Monkey extends Animal {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name)
                .append(": I drank ")
                .append(drunkWater)
                .append(" liters of water. Juhééé!\n");
        System.out.print(stringBuilder.toString());
    }

}
