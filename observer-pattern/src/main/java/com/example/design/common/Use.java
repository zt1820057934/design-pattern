package com.example.design.common;

/**
 * Use.
 *
 * @author zhangteng 2/16/21
 */
public class Use {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer demoObserver = new DemoObserver();
        concreteSubject.registerObserver(demoObserver);
        concreteSubject.notifyObserver(new Message("Hello~~~"));
        concreteSubject.removeObserver(demoObserver);
        concreteSubject.notifyObserver(new Message("Hi~~~~"));
    }

}
