package com.example.design.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.design.Student;

/**
 * DeepClone.
 * 两种办法:
 *      1. 递归拷贝对象，直到要拷贝的对象只包含基本数据类型数据，没有引用对象为止
 *      2. 先将对象序列化，然后再反序列化成新的对象
 *      3. 浅拷贝不会更新的数据，深拷贝会更新的数据 ----
 * @author zhangteng 2/7/21
 */
public class DeepClone {

    public static void main(String[] args) throws Exception{
        Student one = new Student();
        Student child = new Student();
        one.setId(1L);
        one.setName("AAA");
        child.setId(11L);
        child.setName("CHILD");
        one.setChild(child);

        Object clone = deepCopy(one);
        System.out.println(clone);
        child.setId(22L);
        child.setName("22222");
        System.out.println(clone);
    }

    static Object deepCopy(Object object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(object);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }

}
