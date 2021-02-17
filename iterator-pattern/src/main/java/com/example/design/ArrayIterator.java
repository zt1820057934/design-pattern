package com.example.design;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * ArrayIterator.
 *
 * @author zhangteng 2/16/21
 */
public class ArrayIterator<E> implements Iterator<E> {

    private int cursor;

    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    public void next() {
        cursor++;
    }

    public E current() {
        if(cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }

}
