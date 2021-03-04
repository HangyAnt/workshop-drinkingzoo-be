package com.codecool.drinkingzoo;

public class WaterBucket {

    private boolean isDirty;
    private int waterAmountInLiter;


    public WaterBucket(boolean isDirty, int waterAmountInLiter) {
        this.isDirty = isDirty;
        this.waterAmountInLiter = waterAmountInLiter;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public int getWaterAmountInLiter() {
        return waterAmountInLiter;
    }

    public void setWaterAmountInLiter(int newAmount) {
        waterAmountInLiter = newAmount;
    }

}
