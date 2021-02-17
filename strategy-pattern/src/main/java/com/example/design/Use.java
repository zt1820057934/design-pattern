package com.example.design;

import com.example.design.exampleA.DiscountStrategy;
import com.example.design.exampleA.DiscountStrategyFactory;
import com.example.design.ready.Order;
import com.example.design.ready.OrderType;

/**
 * Use.
 *
 * @author zhangteng 2/16/21
 */
public class Use {

    public static void main(String[] args) {
        Order order = new Order();
        OrderType orderType = order.getOrderType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(orderType);
        discountStrategy.calDiscount(order);
    }

}
