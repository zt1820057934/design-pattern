package com.example.design;

/**
 * Iterator.
 *
 * @author zhangteng 2/16/21
 */
public interface Iterator<E> {

    boolean hasNext();

    void next(); // 游标后移

    E current();

}
