package com.example.design;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Demo
 * @author zhangteng 2/16/21
 */
public class Demo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        test1(names);
    }

    // 一个next后只能跟一个remove操作
    private static void test1(List<String> names) {
        Iterator<String> iterator = names.iterator();
        iterator.next();
        iterator.remove();
        iterator.remove(); // 抛错
    }

    // 迭代器1remove操作后，容器大小变更，迭代器2在进行检查时发现不一致，抛出ConcurrentModificationException
    private static void test2(List<String> names) {
        Iterator<String> iterator1 = names.iterator();
        Iterator<String> iterator2 = names.iterator();

        System.out.println("原大小 " + names.size());

        iterator1.next();
        iterator1.remove();

        System.out.println("新大小 " + names.size());

        iterator2.next();
    }

}
