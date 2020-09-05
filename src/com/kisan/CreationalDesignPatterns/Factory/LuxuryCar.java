package com.kisan.CreationalDesignPatterns.Factory;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
