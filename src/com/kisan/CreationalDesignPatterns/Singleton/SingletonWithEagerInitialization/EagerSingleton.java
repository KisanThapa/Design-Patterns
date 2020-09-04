package com.kisan.CreationalDesignPatterns.Singleton.SingletonWithEagerInitialization;

class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
