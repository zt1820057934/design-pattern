package com.example.design.shallow;

import com.example.design.Student;

/**
 * ShallowClone.
 * 浅克隆
 * @author zhangteng 2/7/21
 */
public class ShallowClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student one = new Student();
        Student child = new Student();
        one.setId(1L);
        one.setName("AAA");
        child.setId(11L);
        child.setName("CHILD");
        one.setChild(child);

        Object clone = one.clone();
        System.out.println(clone);
        child.setId(22L);
        child.setName("22222");
        System.out.println(clone);
    }

}
