package com.codecool.drinkingzoo;

import java.util.Random;

public class Zoo implements WaterBucketProvider {
    public WaterBucket provideWaterBucket() {

        Random random = new Random();
        boolean isDirty = (random.nextInt(4) == 0);
        int waterAmountInLiter = random.nextInt(5) + 1;
        return new WaterBucket (isDirty, waterAmountInLiter);
    }
}
