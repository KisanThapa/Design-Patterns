package com.kisan.CreationalDesignPatterns.Singleton.SingletonWithLazyInitialization;

public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance = null;

    // Private constructor
    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {

                // Double Check
                if (instance == null)
                    instance = new LazyDoubleCheckSingleton();

            }
        }
        return instance;
    }
}
