package com.example.design;

/**
 * State.
 * 马里奥形态
 * @author zhangteng 2/17/21
 */
public enum State {

    SMALL(0),

    SUPER(1),

    FIRE(2),

    CAPE(3);

    int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
