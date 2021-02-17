package com.example.design.exampleB;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.design.ready.AlRange;

/**
 * Sorter.
 *
 * @author zhangteng 2/16/21
 */
public class Sorter {

    private static final long GB = 1000 * 1000 * 1000;

    private static final List<AlRange> algs = new ArrayList<AlRange>();

    static {
        algs.add(new AlRange(0, 6 * GB, SortAlgFactory.getSortAlg("QuickStart")));
        // ...
    }

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        for (AlRange alg : algs) {
            if(alg.inRange(fileSize)) {
                sortAlg = alg.getAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }

}
