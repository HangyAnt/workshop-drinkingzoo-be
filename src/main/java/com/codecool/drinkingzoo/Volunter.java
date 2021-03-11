package com.codecool.drinkingzoo;

public class Volunter extends Person{

    public Volunter(String name){
        super(name);
    }

    public void giveWaterToAnimal(WaterBucketProvider waterBucketProvider, Animal animal){
        System.out.println(name+" I'm bringing water to "+animal.getName()
                +" from "+waterBucketProvider.getClass()+".");
        animal.drink(waterBucketProvider.provideWaterBucket());
    }
}
