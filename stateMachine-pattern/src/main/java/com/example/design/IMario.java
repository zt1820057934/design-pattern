package com.example.design;

/**
 * IMario.
 * 马里奥-所有状态类的接口
 * @author zhangteng 2/17/21
 */
public interface IMario {

    State getName();

    // 吃变大蘑菇
    void obtainMushRoom();

    // 吃斗篷蘑菇
    void obtainCape();

    // 吃火焰蘑菇
    void obtainFireFlower();

    // 碰到怪
    void meetMonster();

}
