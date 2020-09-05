package com.kisan.CreationalDesignPatterns.Factory;

public abstract class Car {
    private CarType type = null;

    public Car(CarType type) {
        this.type = type;
        arrangeParts();
    }

    private void arrangeParts() {
        // Do one time processing here
    }

    protected abstract void construct();

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
