package com.codecool.drinkingzoo;

import java.util.Random;

public class Fontain implements WaterBucketProvider {
    public WaterBucket provideWaterBucket() {
        Random random = new Random();
        boolean isDirty = (random.nextInt(4) == 0);
        random.nextInt(5) + 1;
    }
}
