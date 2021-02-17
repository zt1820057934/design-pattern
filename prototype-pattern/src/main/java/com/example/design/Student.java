package com.example.design;

import java.io.Serializable;

import lombok.Data;

/**
 * Student.
 *
 * @author zhangteng 2/7/21
 */
@Data
public class Student implements Cloneable, Serializable {

    private Long id;

    private String name;

    private Student child;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
