package com.example.design.ready;

import com.example.design.exampleB.ISortAlg;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * AlRange.
 *
 * @author zhangteng 2/16/21
 */
@Data
@AllArgsConstructor
public class AlRange {

    private long min;

    private long max;

    private ISortAlg alg;

    public boolean inRange(long size) {
        return size >= min && size < max;
    }

}
