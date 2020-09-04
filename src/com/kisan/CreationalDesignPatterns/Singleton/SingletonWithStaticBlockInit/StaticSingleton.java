package com.kisan.CreationalDesignPatterns.Singleton.SingletonWithStaticBlockInit;

public class StaticSingleton {

    private static StaticSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticSingleton();
        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }

    // Private constructor
    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return INSTANCE;
    }
}
