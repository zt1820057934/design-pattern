package com.example.design.exampleA;

import com.example.design.ready.Order;

/**
 * DiscountStrategy.
 * 促销策略
 * @author zhangteng 2/16/21
 */
public interface DiscountStrategy {

    double calDiscount(Order order);

}
