package com.codecool.drinkingzoo;

public abstract class Animal {

    protected String name;
    protected int drunkWater;
    private boolean isSick;

    public Animal(String name) {
        this.name = name;
    }

    public void drink(WaterBucket waterBucket) {
        if (isSick) {
            System.out.println("I don't drink water");
        }
        else {
            drunkWater += waterBucket.getWaterAmountInLiter();
            waterBucket.setWaterAmountInLiter(0);
            makeSound();
            if (waterBucket.isDirty()) {
                isSick = true;
            }
        }
    }

    public abstract void makeSound();

}
