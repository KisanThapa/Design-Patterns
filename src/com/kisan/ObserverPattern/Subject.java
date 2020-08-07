package com.kisan.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Observable: Object that can be observed
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (var observer : observers)
            observer.update();
    }
}
