package com.example.design;

/**
 * FireWoodStick.
 * 点燃的木棍
 * @author zhangteng 2/8/21
 */
public class FireWoodStick extends Wood {

    private Wood wood;

    public FireWoodStick(Wood wood) {
        this.wood = wood;
    }

    @Override
    public void attack() {
        if(wood instanceof CutWoodStick) {
            System.out.println("用削尖了的着火木棍攻击");
        } else {
            System.out.println("用点燃的木棍攻击");
        }
    }
}
