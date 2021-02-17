package com.example.design.exampleB;

import java.util.HashMap;
import java.util.Map;

/**
 * SortAlgFactory.
 *
 * @author zhangteng 2/16/21
 */
public class SortAlgFactory {

    private static final Map<String, ISortAlg> algs = new HashMap<String, ISortAlg>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        // ...
        algs.put("ConcurrentExternalSort", null);
    }

    public static ISortAlg getSortAlg(String type){
        if(type == null) {
            return null;
        }
        return algs.get(type);
    }

}
