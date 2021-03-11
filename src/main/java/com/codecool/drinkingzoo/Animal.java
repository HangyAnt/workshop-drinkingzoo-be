package com.codecool.drinkingzoo;

public abstract class Animal extends Person{


    protected int drunkWater;
    private boolean isSick;
    protected Continent homeContinent;

    public String getName() {
        return name;
    }

    public int getDrunkWater() {
        return drunkWater;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public boolean isSick() {
        return isSick;
    }

    public Animal(String name, Continent homeContinent) {
            super(name);
            this.homeContinent=homeContinent;

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
