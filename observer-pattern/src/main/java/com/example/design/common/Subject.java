package com.example.design.common;

/**
 * Subject.
 *
 * @author zhangteng 2/16/21
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(Message message);

}
