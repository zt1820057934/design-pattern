package com.example.design;

import java.util.ArrayList;

/**
 * Use.
 *
 * @author zhangteng 2/16/21
 */
public class Use {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ZZZ");
        names.add("TTT");
        names.add("AAA");
        names.add("BBB");
        Iterator<String> iterator = new ArrayIterator<String>(names);
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }

}
