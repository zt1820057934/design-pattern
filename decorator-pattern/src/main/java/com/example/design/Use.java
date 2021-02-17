package com.example.design;

/**
 * Use.
 *
 * @author zhangteng 2/8/21
 */
public class Use {

    public static void main(String[] args) {
        Wood wood = new Wood();
        wood.attack();

        Wood cutStick = new CutWoodStick(wood);
        cutStick.attack();

        Wood fireStick = new FireWoodStick(wood);
        fireStick.attack();

        Wood fireCutStick = new FireWoodStick(cutStick);
        fireCutStick.attack();
    }

}
