package com.kisan.CreationalDesignPatterns.Singleton.SingletonWithLazyInitialization;

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    // Private constructor
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}
