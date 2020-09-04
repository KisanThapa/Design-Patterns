package com.kisan.CreationalDesignPatterns.Singleton.SingletonWithLazyInitialization;

/**
 * This initialization in not Thread safe
 */
public class NaiveLazySingleton {

    private static volatile NaiveLazySingleton instance = null;

    private NaiveLazySingleton() {
    }

    public static NaiveLazySingleton getInstance() {
        if (instance == null)
            instance = new NaiveLazySingleton();
        return instance;
    }

}
