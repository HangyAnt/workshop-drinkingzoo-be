package com.codecool.drinkingzoo;

public class Doctor extends Person{
    public Doctor(String name){
        super(name);
    }

    public void treatAnimal(Animal animal){
        if(!animal.isSick()){
            System.out.println(name+": "+animal.getName()+" is healthy.");
        } else {
            System.out.println(name+": "+animal.getName()+" was sick, but get treatment.");
            animal.setSick(!animal.isSick());
        }
    }
}
