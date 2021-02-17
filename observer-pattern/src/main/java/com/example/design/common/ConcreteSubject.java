package com.example.design.common;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject.
 *
 * @author zhangteng 2/16/21
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
