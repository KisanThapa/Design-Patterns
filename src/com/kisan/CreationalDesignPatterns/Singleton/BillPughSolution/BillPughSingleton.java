package com.kisan.CreationalDesignPatterns.Singleton.BillPughSolution;

public class BillPughSingleton {

    // Private constructor
    private BillPughSingleton() {
    }

    private static class LazyHolder {
        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
