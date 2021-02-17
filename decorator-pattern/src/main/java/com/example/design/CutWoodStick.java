package com.example.design;

/**
 * CutWoodStick.
 * 削尖的木棍
 * @author zhangteng 2/8/21
 */
public class CutWoodStick extends Wood {

    private Wood wood;

    public CutWoodStick(Wood wood) {
        this.wood = wood;
    }

    @Override
    public void attack() {
        if(wood instanceof FireWoodStick) {
            System.out.println("用削尖了的着火木棍攻击");
        } else {
            System.out.println("用削尖了的木棍攻击");
        }
    }
}
