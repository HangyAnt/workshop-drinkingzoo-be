package com.codecool.drinkingzoo;

import java.util.Random;

public class Fontain implements WaterBucketProvider {
    public WaterBucket provideWaterBucket() {
        Random random = new Random();
        boolean isDirty = (random.nextInt(2) == 0);
        int waterAmountInLiter = random.nextInt(3) + 1;
        return new WaterBucket (isDirty, waterAmountInLiter);
    }
}
