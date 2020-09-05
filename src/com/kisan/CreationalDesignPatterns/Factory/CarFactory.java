package com.kisan.CreationalDesignPatterns.Factory;

public class CarFactory {

    public static Car buildCar(CarType type) {
        Car car = null;
        switch (type) {

            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                // throw some exception
                break;
        }
        return car;
    }
}
